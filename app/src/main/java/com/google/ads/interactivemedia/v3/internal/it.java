package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class it {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AudioManager f21975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ir f21976b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private is f21977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private nu f21978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f21981g = 1.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AudioFocusRequest f21982h;

    public it(Context context, Handler handler, is isVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        ajr.b(audioManager);
        this.f21975a = audioManager;
        this.f21977c = isVar;
        this.f21976b = new ir(this, handler);
        this.f21979e = 0;
    }

    public static /* synthetic */ void c(it itVar, int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 != -2) {
                itVar.h(3);
                return;
            } else {
                itVar.g(0);
                itVar.h(2);
                return;
            }
        }
        if (i2 == -1) {
            itVar.g(-1);
            itVar.f();
        } else if (i2 == 1) {
            itVar.h(1);
            itVar.g(1);
        } else {
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown focus change type: ");
            sb.append(i2);
            Log.w("AudioFocusManager", sb.toString());
        }
    }

    private final void f() {
        if (this.f21979e == 0) {
            return;
        }
        if (amn.f20135a >= 26) {
            AudioFocusRequest audioFocusRequest = this.f21982h;
            if (audioFocusRequest != null) {
                this.f21975a.abandonAudioFocusRequest(audioFocusRequest);
            }
        } else {
            this.f21975a.abandonAudioFocus(this.f21976b);
        }
        h(0);
    }

    private final void g(int i2) {
        is isVar = this.f21977c;
        if (isVar != null) {
            lv lvVar = (lv) isVar;
            boolean zS = lvVar.f22362a.S();
            lvVar.f22362a.ac(zS, i2, lx.W(zS, i2));
        }
    }

    private final void h(int i2) {
        if (this.f21979e == i2) {
            return;
        }
        this.f21979e = i2;
        float f2 = i2 == 3 ? 0.2f : 1.0f;
        if (this.f21981g == f2) {
            return;
        }
        this.f21981g = f2;
        is isVar = this.f21977c;
        if (isVar != null) {
            lx lxVar = ((lv) isVar).f22362a;
            lxVar.aa(1, 2, Float.valueOf(lxVar.B * lxVar.f22375m.a()));
        }
    }

    public final float a() {
        return this.f21981g;
    }

    public final int b(boolean z, int i2) {
        int iRequestAudioFocus;
        if (i2 == 1 || this.f21980f != 1) {
            f();
            return z ? 1 : -1;
        }
        if (!z) {
            return -1;
        }
        if (this.f21979e != 1) {
            if (amn.f20135a >= 26) {
                AudioFocusRequest audioFocusRequest = this.f21982h;
                if (audioFocusRequest == null) {
                    new AudioFocusRequest.Builder(this.f21980f);
                    ajr.b(null);
                    throw null;
                }
                iRequestAudioFocus = this.f21975a.requestAudioFocus(audioFocusRequest);
            } else {
                AudioManager audioManager = this.f21975a;
                ir irVar = this.f21976b;
                ajr.b(null);
                iRequestAudioFocus = audioManager.requestAudioFocus(irVar, 3, this.f21980f);
            }
            if (iRequestAudioFocus != 1) {
                h(0);
                return -1;
            }
            h(1);
        }
        return 1;
    }

    public final void d() {
        this.f21977c = null;
        f();
    }

    public final void e(nu nuVar) {
        if (amn.O(null, null)) {
            return;
        }
        this.f21978d = null;
        this.f21980f = 0;
        ajr.e(true, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }
}
