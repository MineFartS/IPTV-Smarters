package com.google.android.gms.cast.framework.media;

import a.i.h.j;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import c.f.a.c.d.u.u.c;
import c.f.a.c.d.u.u.f;
import c.f.a.c.d.u.u.h;
import c.f.a.c.d.u.u.m0;
import c.f.a.c.d.u.u.t0;
import c.f.a.c.f.t.l;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MediaNotificationService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.a.c.d.v.b f24166b = new c.f.a.c.d.v.b("MediaNotificationService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Runnable f24167c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f24168d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f24169e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f24170f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ComponentName f24171g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f24173i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f24174j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.f.a.c.d.u.u.k.b f24175k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.f.a.c.d.u.u.b f24176l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Resources f24177m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b f24178n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f24179o;
    public NotificationManager p;
    public Notification q;
    public c.f.a.c.d.u.b r;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List<j.a> f24172h = new ArrayList();
    public final BroadcastReceiver s = new t0(this);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f24180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Bitmap f24181b;

        public a(c.f.a.c.f.p.a aVar) {
            this.f24180a = aVar == null ? null : aVar.J();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSessionCompat.Token f24182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f24183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f24184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f24185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f24186e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f24187f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f24188g;

        public b(boolean z, int i2, String str, String str2, MediaSessionCompat.Token token, boolean z2, boolean z3) {
            this.f24183b = z;
            this.f24184c = i2;
            this.f24185d = str;
            this.f24186e = str2;
            this.f24182a = token;
            this.f24187f = z2;
            this.f24188g = z3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(c.f.a.c.d.u.c r7) {
        /*
            java.lang.Class<c.f.a.c.d.u.u.g> r0 = c.f.a.c.d.u.u.g.class
            c.f.a.c.d.u.u.a r1 = r7.I()
            c.f.a.c.d.u.u.h r1 = r1.M()
            r2 = 0
            if (r1 != 0) goto Le
            return r2
        Le:
            c.f.a.c.d.u.u.a r7 = r7.I()
            c.f.a.c.d.u.u.h r7 = r7.M()
            c.f.a.c.d.u.u.m0 r7 = r7.n0()
            r1 = 1
            if (r7 != 0) goto L1e
            return r1
        L1e:
            java.util.List r3 = e(r7)
            int[] r7 = g(r7)
            if (r3 == 0) goto L4a
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L2f
            goto L4a
        L2f:
            int r4 = r3.size()
            r5 = 5
            if (r4 <= r5) goto L48
            c.f.a.c.d.v.b r4 = com.google.android.gms.cast.framework.media.MediaNotificationService.f24166b
            java.lang.String r5 = r0.getSimpleName()
            java.lang.String r6 = " provides more than 5 actions."
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r4.c(r5, r6)
            goto L5b
        L48:
            r4 = 1
            goto L5c
        L4a:
            c.f.a.c.d.v.b r4 = com.google.android.gms.cast.framework.media.MediaNotificationService.f24166b
            java.lang.String r5 = r0.getSimpleName()
            java.lang.String r6 = " doesn't provide any action."
            java.lang.String r5 = r5.concat(r6)
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r4.c(r5, r6)
        L5b:
            r4 = 0
        L5c:
            if (r4 == 0) goto L9f
            int r3 = r3.size()
            if (r7 == 0) goto L8a
            int r4 = r7.length
            if (r4 != 0) goto L68
            goto L8a
        L68:
            int r4 = r7.length
            r5 = 0
        L6a:
            if (r5 >= r4) goto L88
            r6 = r7[r5]
            if (r6 < 0) goto L76
            if (r6 < r3) goto L73
            goto L76
        L73:
            int r5 = r5 + 1
            goto L6a
        L76:
            c.f.a.c.d.v.b r7 = com.google.android.gms.cast.framework.media.MediaNotificationService.f24166b
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r3 = "provides a compact view action whose index is out of bounds."
            java.lang.String r0 = r0.concat(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r7.c(r0, r3)
            goto L9b
        L88:
            r7 = 1
            goto L9c
        L8a:
            c.f.a.c.d.v.b r7 = com.google.android.gms.cast.framework.media.MediaNotificationService.f24166b
            java.lang.String r0 = r0.getSimpleName()
            java.lang.String r3 = " doesn't provide any actions for compact view."
            java.lang.String r0 = r0.concat(r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r7.c(r0, r3)
        L9b:
            r7 = 0
        L9c:
            if (r7 == 0) goto L9f
            return r1
        L9f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.a(c.f.a.c.d.u.c):boolean");
    }

    public static void b() {
        Runnable runnable = f24167c;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static List<f> e(m0 m0Var) {
        try {
            return m0Var.F();
        } catch (RemoteException e2) {
            f24166b.d(e2, "Unable to call %s on %s.", "getNotificationActions", m0.class.getSimpleName());
            return null;
        }
    }

    public static int[] g(m0 m0Var) {
        try {
            return m0Var.k1();
        } catch (RemoteException e2) {
            f24166b.d(e2, "Unable to call %s on %s.", "getCompactViewActionIndices", m0.class.getSimpleName());
            return null;
        }
    }

    public final void h() {
        j.a aVarA;
        if (this.f24178n == null) {
            return;
        }
        a aVar = this.f24179o;
        PendingIntent broadcast = null;
        j.e eVarF = new j.e(this, "cast_media_notification").s(aVar == null ? null : aVar.f24181b).A(this.f24168d.X()).o(this.f24178n.f24185d).n(this.f24177m.getString(this.f24168d.J(), this.f24178n.f24186e)).w(true).z(false).F(1);
        if (this.f24171g != null) {
            Intent intent = new Intent();
            intent.putExtra("targetActivity", this.f24171g);
            intent.setAction(this.f24171g.flattenToString());
            broadcast = PendingIntent.getBroadcast(this, 1, intent, 134217728);
        }
        if (broadcast != null) {
            eVarF.m(broadcast);
        }
        m0 m0VarN0 = this.f24168d.n0();
        if (m0VarN0 != null) {
            f24166b.e("actionsProvider != null", new Object[0]);
            this.f24173i = (int[]) g(m0VarN0).clone();
            List<f> listE = e(m0VarN0);
            this.f24172h = new ArrayList();
            for (f fVar : listE) {
                String strI = fVar.I();
                if (strI.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK) || strI.equals(MediaIntentReceiver.ACTION_SKIP_NEXT) || strI.equals(MediaIntentReceiver.ACTION_SKIP_PREV) || strI.equals(MediaIntentReceiver.ACTION_FORWARD) || strI.equals(MediaIntentReceiver.ACTION_REWIND) || strI.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    aVarA = j(fVar.I());
                } else {
                    Intent intent2 = new Intent(fVar.I());
                    intent2.setComponent(this.f24170f);
                    aVarA = new j.a.C0029a(fVar.K(), fVar.J(), PendingIntent.getBroadcast(this, 0, intent2, 0)).a();
                }
                this.f24172h.add(aVarA);
            }
        } else {
            f24166b.e("actionsProvider == null", new Object[0]);
            this.f24172h = new ArrayList();
            Iterator<String> it = this.f24168d.I().iterator();
            while (it.hasNext()) {
                this.f24172h.add(j(it.next()));
            }
            this.f24173i = (int[]) this.f24168d.K().clone();
        }
        Iterator<j.a> it2 = this.f24172h.iterator();
        while (it2.hasNext()) {
            eVarF.b(it2.next());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            eVarF.C(new a.s.j.a().t(this.f24173i).s(this.f24178n.f24182a));
        }
        Notification notificationC = eVarF.c();
        this.q = notificationC;
        startForeground(1, notificationC);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final j.a j(String str) {
        int iP;
        int iC0;
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case -1699820260:
                if (str.equals(MediaIntentReceiver.ACTION_REWIND)) {
                    b2 = 0;
                }
                break;
            case -945151566:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_NEXT)) {
                    b2 = 1;
                }
                break;
            case -945080078:
                if (str.equals(MediaIntentReceiver.ACTION_SKIP_PREV)) {
                    b2 = 2;
                }
                break;
            case -668151673:
                if (str.equals(MediaIntentReceiver.ACTION_STOP_CASTING)) {
                    b2 = 3;
                }
                break;
            case -124479363:
                if (str.equals(MediaIntentReceiver.ACTION_DISCONNECT)) {
                    b2 = 4;
                }
                break;
            case 235550565:
                if (str.equals(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK)) {
                    b2 = 5;
                }
                break;
            case 1362116196:
                if (str.equals(MediaIntentReceiver.ACTION_FORWARD)) {
                    b2 = 6;
                }
                break;
        }
        PendingIntent broadcast = null;
        switch (b2) {
            case 0:
                long j2 = this.f24174j;
                Intent intent = new Intent(MediaIntentReceiver.ACTION_REWIND);
                intent.setComponent(this.f24170f);
                intent.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j2);
                PendingIntent broadcast2 = PendingIntent.getBroadcast(this, 0, intent, 134217728);
                int iT = this.f24168d.T();
                int iJ0 = this.f24168d.j0();
                if (j2 == 10000) {
                    iT = this.f24168d.R();
                    iJ0 = this.f24168d.k0();
                } else if (j2 == 30000) {
                    iT = this.f24168d.S();
                    iJ0 = this.f24168d.l0();
                }
                return new j.a.C0029a(iT, this.f24177m.getString(iJ0), broadcast2).a();
            case 1:
                if (this.f24178n.f24187f) {
                    Intent intent2 = new Intent(MediaIntentReceiver.ACTION_SKIP_NEXT);
                    intent2.setComponent(this.f24170f);
                    broadcast = PendingIntent.getBroadcast(this, 0, intent2, 0);
                }
                return new j.a.C0029a(this.f24168d.U(), this.f24177m.getString(this.f24168d.e0()), broadcast).a();
            case 2:
                if (this.f24178n.f24188g) {
                    Intent intent3 = new Intent(MediaIntentReceiver.ACTION_SKIP_PREV);
                    intent3.setComponent(this.f24170f);
                    broadcast = PendingIntent.getBroadcast(this, 0, intent3, 0);
                }
                return new j.a.C0029a(this.f24168d.V(), this.f24177m.getString(this.f24168d.f0()), broadcast).a();
            case 3:
            case 4:
                Intent intent4 = new Intent(MediaIntentReceiver.ACTION_STOP_CASTING);
                intent4.setComponent(this.f24170f);
                return new j.a.C0029a(this.f24168d.L(), this.f24177m.getString(this.f24168d.m0()), PendingIntent.getBroadcast(this, 0, intent4, 0)).a();
            case 5:
                b bVar = this.f24178n;
                int i2 = bVar.f24184c;
                boolean z = bVar.f24183b;
                if (i2 == 2) {
                    iP = this.f24168d.Y();
                    iC0 = this.f24168d.Z();
                } else {
                    iP = this.f24168d.P();
                    iC0 = this.f24168d.c0();
                }
                if (!z) {
                    iP = this.f24168d.Q();
                }
                if (!z) {
                    iC0 = this.f24168d.d0();
                }
                Intent intent5 = new Intent(MediaIntentReceiver.ACTION_TOGGLE_PLAYBACK);
                intent5.setComponent(this.f24170f);
                return new j.a.C0029a(iP, this.f24177m.getString(iC0), PendingIntent.getBroadcast(this, 0, intent5, 0)).a();
            case 6:
                long j3 = this.f24174j;
                Intent intent6 = new Intent(MediaIntentReceiver.ACTION_FORWARD);
                intent6.setComponent(this.f24170f);
                intent6.putExtra(MediaIntentReceiver.EXTRA_SKIP_STEP_MS, j3);
                PendingIntent broadcast3 = PendingIntent.getBroadcast(this, 0, intent6, 134217728);
                int iO = this.f24168d.O();
                int iG0 = this.f24168d.g0();
                if (j3 == 10000) {
                    iO = this.f24168d.M();
                    iG0 = this.f24168d.h0();
                } else if (j3 == 30000) {
                    iO = this.f24168d.N();
                    iG0 = this.f24168d.i0();
                }
                return new j.a.C0029a(iO, this.f24177m.getString(iG0), broadcast3).a();
            default:
                f24166b.c("Action: %s is not a pre-defined action.", str);
                return null;
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.p = (NotificationManager) getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
        c.f.a.c.d.u.b bVarE = c.f.a.c.d.u.b.e(this);
        this.r = bVarE;
        c.f.a.c.d.u.u.a aVarI = bVarE.a().I();
        this.f24168d = aVarI.M();
        this.f24169e = aVarI.J();
        this.f24177m = getResources();
        this.f24170f = new ComponentName(getApplicationContext(), aVarI.K());
        this.f24171g = !TextUtils.isEmpty(this.f24168d.a0()) ? new ComponentName(getApplicationContext(), this.f24168d.a0()) : null;
        this.f24174j = this.f24168d.W();
        int dimensionPixelSize = this.f24177m.getDimensionPixelSize(this.f24168d.b0());
        this.f24176l = new c.f.a.c.d.u.u.b(1, dimensionPixelSize, dimensionPixelSize);
        this.f24175k = new c.f.a.c.d.u.u.k.b(getApplicationContext(), this.f24176l);
        if (this.f24171g != null) {
            registerReceiver(this.s, new IntentFilter(this.f24171g.flattenToString()));
        }
        if (l.j()) {
            NotificationChannel notificationChannel = new NotificationChannel("cast_media_notification", "Cast", 2);
            notificationChannel.setShowBadge(false);
            this.p.createNotificationChannel(notificationChannel);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        c.f.a.c.d.u.u.k.b bVar = this.f24175k;
        if (bVar != null) {
            bVar.b();
        }
        if (this.f24171g != null) {
            try {
                unregisterReceiver(this.s);
            } catch (IllegalArgumentException e2) {
                f24166b.d(e2, "Unregistering trampoline BroadcastReceiver failed", new Object[0]);
            }
        }
        f24167c = null;
        this.p.cancel(1);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    @Override // android.app.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int onStartCommand(android.content.Intent r17, int r18, final int r19) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.cast.framework.media.MediaNotificationService.onStartCommand(android.content.Intent, int, int):int");
    }
}
