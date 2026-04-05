package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f22616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oj f22617b;

    public oi(Handler handler, oj ojVar) {
        this.f22616a = ojVar == null ? null : handler;
        this.f22617b = ojVar;
    }

    public final void a(Exception exc) {
        Handler handler = this.f22616a;
        if (handler != null) {
            handler.post(new oe(this, exc, 1));
        }
    }

    public final void b(Exception exc) {
        Handler handler = this.f22616a;
        if (handler != null) {
            handler.post(new oe(this, exc));
        }
    }

    public final void c(final String str, final long j2, final long j3) {
        Handler handler = this.f22616a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.og
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22610a.j(str, j2, j3);
                }
            });
        }
    }

    public final void d(final String str) {
        Handler handler = this.f22616a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.of
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22608a.k(str);
                }
            });
        }
    }

    public final void e(pw pwVar) {
        pwVar.a();
        Handler handler = this.f22616a;
        if (handler != null) {
            handler.post(new od(this, pwVar, 1));
        }
    }

    public final void f(pw pwVar) {
        Handler handler = this.f22616a;
        if (handler != null) {
            handler.post(new od(this, pwVar));
        }
    }

    public final void g(final ke keVar, final qa qaVar) {
        Handler handler = this.f22616a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.oc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22599a.n(keVar, qaVar);
                }
            });
        }
    }

    public final /* synthetic */ void h(Exception exc) {
        oj ojVar = this.f22617b;
        int i2 = amn.f20135a;
        ojVar.d(exc);
    }

    public final /* synthetic */ void i(Exception exc) {
        oj ojVar = this.f22617b;
        int i2 = amn.f20135a;
        ojVar.D(exc);
    }

    public final /* synthetic */ void j(String str, long j2, long j3) {
        oj ojVar = this.f22617b;
        int i2 = amn.f20135a;
        ojVar.e(str, j2, j3);
    }

    public final /* synthetic */ void k(String str) {
        oj ojVar = this.f22617b;
        int i2 = amn.f20135a;
        ojVar.f(str);
    }

    public final /* synthetic */ void l(pw pwVar) {
        pwVar.a();
        oj ojVar = this.f22617b;
        int i2 = amn.f20135a;
        ojVar.z(pwVar);
    }

    public final /* synthetic */ void m(pw pwVar) {
        oj ojVar = this.f22617b;
        int i2 = amn.f20135a;
        ojVar.A(pwVar);
    }

    public final /* synthetic */ void n(ke keVar, qa qaVar) {
        int i2 = amn.f20135a;
        this.f22617b.B(keVar, qaVar);
    }

    public final /* synthetic */ void o(long j2) {
        oj ojVar = this.f22617b;
        int i2 = amn.f20135a;
        ojVar.C(j2);
    }

    public final /* synthetic */ void p(boolean z) {
        oj ojVar = this.f22617b;
        int i2 = amn.f20135a;
        ojVar.H(z);
    }

    public final /* synthetic */ void q(int i2, long j2, long j3) {
        oj ojVar = this.f22617b;
        int i3 = amn.f20135a;
        ojVar.E(i2, j2, j3);
    }

    public final void r(final long j2) {
        Handler handler = this.f22616a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ob
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22597a.o(j2);
                }
            });
        }
    }

    public final void s(final boolean z) {
        Handler handler = this.f22616a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.oh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22614a.p(z);
                }
            });
        }
    }

    public final void t(final int i2, final long j2, final long j3) {
        Handler handler = this.f22616a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.oa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22593a.q(i2, j2, j3);
                }
            });
        }
    }
}
