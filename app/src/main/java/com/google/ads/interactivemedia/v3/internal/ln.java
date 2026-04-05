package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class ln {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lm f22321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ll f22322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final akt f22323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mg f22324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Object f22326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Looper f22327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f22328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final long f22329i = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f22330j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f22331k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f22332l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f22333m;

    public ln(ll llVar, lm lmVar, mg mgVar, int i2, akt aktVar, Looper looper) {
        this.f22322b = llVar;
        this.f22321a = lmVar;
        this.f22324d = mgVar;
        this.f22327g = looper;
        this.f22323c = aktVar;
        this.f22328h = i2;
    }

    public final int a() {
        return this.f22325e;
    }

    public final int b() {
        return this.f22328h;
    }

    public final long c() {
        return -9223372036854775807L;
    }

    public final Looper d() {
        return this.f22327g;
    }

    public final lm e() {
        return this.f22321a;
    }

    public final mg f() {
        return this.f22324d;
    }

    public final Object g() {
        return this.f22326f;
    }

    public final synchronized void h(boolean z) {
        this.f22332l = z | this.f22332l;
        this.f22333m = true;
        notifyAll();
    }

    public final boolean i() {
        return true;
    }

    public final synchronized void j(long j2) {
        ajr.f(this.f22331k);
        ajr.f(this.f22327g.getThread() != Thread.currentThread());
        long jElapsedRealtime = 2000;
        long jElapsedRealtime2 = SystemClock.elapsedRealtime() + 2000;
        while (!this.f22333m) {
            if (jElapsedRealtime <= 0) {
                throw new TimeoutException("Message delivery timed out.");
            }
            wait(jElapsedRealtime);
            jElapsedRealtime = jElapsedRealtime2 - SystemClock.elapsedRealtime();
        }
    }

    public final synchronized void k() {
    }

    public final void l() {
        ajr.f(!this.f22331k);
        ajr.d(true);
        this.f22331k = true;
        this.f22322b.l(this);
    }

    public final void m(Object obj) {
        ajr.f(!this.f22331k);
        this.f22326f = obj;
    }

    public final void n(int i2) {
        ajr.f(!this.f22331k);
        this.f22325e = i2;
    }
}
