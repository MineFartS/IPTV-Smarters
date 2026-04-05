package com.google.android.gms.cast.framework.media;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import androidx.annotation.Keep;
import c.f.a.c.d.u.b;
import c.f.a.c.d.u.d;
import c.f.a.c.d.u.q;
import c.f.a.c.d.u.r;
import c.f.a.c.d.u.u.i;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class MediaIntentReceiver extends BroadcastReceiver {
    public static final String ACTION_DISCONNECT = "com.google.android.gms.cast.framework.action.DISCONNECT";
    public static final String ACTION_FORWARD = "com.google.android.gms.cast.framework.action.FORWARD";
    public static final String ACTION_REWIND = "com.google.android.gms.cast.framework.action.REWIND";
    public static final String ACTION_SKIP_NEXT = "com.google.android.gms.cast.framework.action.SKIP_NEXT";
    public static final String ACTION_SKIP_PREV = "com.google.android.gms.cast.framework.action.SKIP_PREV";
    public static final String ACTION_STOP_CASTING = "com.google.android.gms.cast.framework.action.STOP_CASTING";
    public static final String ACTION_TOGGLE_PLAYBACK = "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK";
    public static final String EXTRA_SKIP_STEP_MS = "googlecast-extra_skip_step_ms";

    private static void zza(d dVar, long j2) {
        i iVarZzi;
        if (j2 == 0 || (iVarZzi = zzi(dVar)) == null || iVarZzi.r() || iVarZzi.v()) {
            return;
        }
        iVarZzi.R(iVarZzi.g() + j2);
    }

    private static void zzh(d dVar) {
        i iVarZzi = zzi(dVar);
        if (iVarZzi == null) {
            return;
        }
        iVarZzi.W();
    }

    private static i zzi(d dVar) {
        if (dVar == null || !dVar.c()) {
            return null;
        }
        return dVar.p();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        r rVarC;
        String action = intent.getAction();
        if (action == null) {
        }
        rVarC = b.e(context).c();
        switch (action) {
            case "com.google.android.gms.cast.framework.action.REWIND":
                onReceiveActionRewind(rVarC.d(), intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_NEXT":
                onReceiveActionSkipNext(rVarC.d());
                break;
            case "com.google.android.gms.cast.framework.action.SKIP_PREV":
                onReceiveActionSkipPrev(rVarC.d());
                break;
            case "com.google.android.gms.cast.framework.action.STOP_CASTING":
                rVarC.b(true);
                break;
            case "com.google.android.gms.cast.framework.action.DISCONNECT":
                rVarC.b(false);
                break;
            case "com.google.android.gms.cast.framework.action.TOGGLE_PLAYBACK":
                onReceiveActionTogglePlayback(rVarC.d());
                break;
            case "com.google.android.gms.cast.framework.action.FORWARD":
                onReceiveActionForward(rVarC.d(), intent.getLongExtra(EXTRA_SKIP_STEP_MS, 0L));
                break;
            case "android.intent.action.MEDIA_BUTTON":
                onReceiveActionMediaButton(rVarC.d(), intent);
                break;
            default:
                onReceiveOtherAction(context, action, intent);
                break;
        }
    }

    public void onReceiveActionForward(q qVar, long j2) {
        if (qVar instanceof d) {
            zza((d) qVar, j2);
        }
    }

    public void onReceiveActionMediaButton(q qVar, Intent intent) {
        KeyEvent keyEvent;
        if ((qVar instanceof d) && intent.hasExtra("android.intent.extra.KEY_EVENT") && (keyEvent = (KeyEvent) intent.getExtras().get("android.intent.extra.KEY_EVENT")) != null && keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 85) {
            zzh((d) qVar);
        }
    }

    public void onReceiveActionRewind(q qVar, long j2) {
        if (qVar instanceof d) {
            zza((d) qVar, -j2);
        }
    }

    public void onReceiveActionSkipNext(q qVar) {
        i iVarZzi;
        if (!(qVar instanceof d) || (iVarZzi = zzi((d) qVar)) == null || iVarZzi.v()) {
            return;
        }
        iVarZzi.J(null);
    }

    public void onReceiveActionSkipPrev(q qVar) {
        i iVarZzi;
        if (!(qVar instanceof d) || (iVarZzi = zzi((d) qVar)) == null || iVarZzi.v()) {
            return;
        }
        iVarZzi.K(null);
    }

    public void onReceiveActionTogglePlayback(q qVar) {
        if (qVar instanceof d) {
            zzh((d) qVar);
        }
    }

    public void onReceiveOtherAction(Context context, String str, Intent intent) {
    }

    @Deprecated
    public void onReceiveOtherAction(String str, Intent intent) {
        onReceiveOtherAction(null, str, intent);
    }
}
