package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class ano {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f20259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final anp f20260b;

    public ano(Handler handler, anp anpVar) {
        this.f20259a = anpVar == null ? null : handler;
        this.f20260b = anpVar;
    }

    public final void a(final String str, final long j2, final long j3) {
        Handler handler = this.f20259a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ann
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20255a.g(str, j2, j3);
                }
            });
        }
    }

    public final void b(final String str) {
        Handler handler = this.f20259a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.anm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20253a.h(str);
                }
            });
        }
    }

    public final void c(pw pwVar) {
        pwVar.a();
        Handler handler = this.f20259a;
        if (handler != null) {
            handler.post(new ani(this, pwVar, 1));
        }
    }

    public final void d(int i2, long j2) {
        Handler handler = this.f20259a;
        if (handler != null) {
            handler.post(new ang(this, i2, j2, 1));
        }
    }

    public final void e(pw pwVar) {
        Handler handler = this.f20259a;
        if (handler != null) {
            handler.post(new ani(this, pwVar));
        }
    }

    public final void f(final ke keVar, final qa qaVar) {
        Handler handler = this.f20259a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.anh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20240a.l(keVar, qaVar);
                }
            });
        }
    }

    public final /* synthetic */ void g(String str, long j2, long j3) {
        anp anpVar = this.f20260b;
        int i2 = amn.f20135a;
        anpVar.J(str, j2, j3);
    }

    public final /* synthetic */ void h(String str) {
        anp anpVar = this.f20260b;
        int i2 = amn.f20135a;
        anpVar.K(str);
    }

    public final /* synthetic */ void i(pw pwVar) {
        pwVar.a();
        anp anpVar = this.f20260b;
        int i2 = amn.f20135a;
        anpVar.L(pwVar);
    }

    public final /* synthetic */ void j(int i2, long j2) {
        anp anpVar = this.f20260b;
        int i3 = amn.f20135a;
        anpVar.F(i2, j2);
    }

    public final /* synthetic */ void k(pw pwVar) {
        anp anpVar = this.f20260b;
        int i2 = amn.f20135a;
        anpVar.M(pwVar);
    }

    public final /* synthetic */ void l(ke keVar, qa qaVar) {
        int i2 = amn.f20135a;
        this.f20260b.O(keVar, qaVar);
    }

    public final /* synthetic */ void m(Object obj, long j2) {
        anp anpVar = this.f20260b;
        int i2 = amn.f20135a;
        anpVar.G(obj, j2);
    }

    public final /* synthetic */ void n(long j2, int i2) {
        anp anpVar = this.f20260b;
        int i3 = amn.f20135a;
        anpVar.N(j2, i2);
    }

    public final /* synthetic */ void o(Exception exc) {
        anp anpVar = this.f20260b;
        int i2 = amn.f20135a;
        anpVar.I(exc);
    }

    public final /* synthetic */ void p(anq anqVar) {
        anp anpVar = this.f20260b;
        int i2 = amn.f20135a;
        anpVar.al(anqVar);
    }

    public final void q(final Object obj) {
        if (this.f20259a != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f20259a.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.anl
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20250a.m(obj, jElapsedRealtime);
                }
            });
        }
    }

    public final void r(long j2, int i2) {
        Handler handler = this.f20259a;
        if (handler != null) {
            handler.post(new ang(this, j2, i2));
        }
    }

    public final void s(final Exception exc) {
        Handler handler = this.f20259a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.ank
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20248a.o(exc);
                }
            });
        }
    }

    public final void t(final anq anqVar) {
        Handler handler = this.f20259a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.anj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20246a.p(anqVar);
                }
            });
        }
    }
}
