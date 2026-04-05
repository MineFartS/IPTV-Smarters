package com.google.ads.interactivemedia.v3.internal;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class ix {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f22004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22005f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f22000a = 0.97f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f22001b = 1.03f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22002c = 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f22003d = 1.0E-7f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float f22006g = 0.999f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22007h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f22008i = -9223372036854775807L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f22010k = -9223372036854775807L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f22011l = -9223372036854775807L;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f22014o = 0.97f;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f22013n = 1.03f;
    private float p = 1.0f;
    private long q = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f22009j = -9223372036854775807L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f22012m = -9223372036854775807L;
    private long r = -9223372036854775807L;
    private long s = -9223372036854775807L;

    public /* synthetic */ ix(float f2, float f3, long j2, float f4, long j3, long j4, float f5) {
        this.f22004e = j3;
        this.f22005f = j4;
    }

    private static long f(long j2, long j3, float f2) {
        return (long) ((j2 * 0.999f) + (j3 * 9.999871E-4f));
    }

    private final void g() {
        long j2 = this.f22007h;
        if (j2 != -9223372036854775807L) {
            long j3 = this.f22008i;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            long j4 = this.f22010k;
            if (j4 != -9223372036854775807L && j2 < j4) {
                j2 = j4;
            }
            long j5 = this.f22011l;
            if (j5 != -9223372036854775807L && j2 > j5) {
                j2 = j5;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.f22009j == j2) {
            return;
        }
        this.f22009j = j2;
        this.f22012m = j2;
        this.r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    public final float a(long j2, long j3) {
        long jF;
        long jK;
        if (this.f22007h == -9223372036854775807L) {
            return 1.0f;
        }
        long j4 = j2 - j3;
        long j5 = this.r;
        if (j5 == -9223372036854775807L) {
            this.r = j4;
            jF = 0;
        } else {
            long jMax = Math.max(j4, f(j5, j4, 0.999f));
            this.r = jMax;
            jF = f(this.s, Math.abs(j4 - jMax), 0.999f);
        }
        this.s = jF;
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < 1000) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        long j6 = this.r + (this.s * 3);
        if (this.f22012m > j6) {
            float fB = iw.b(1000L);
            long[] jArr = {j6, this.f22009j, this.f22012m - (((long) ((this.p - 1.0f) * fB)) + ((long) ((this.f22013n - 1.0f) * fB)))};
            ars.a(true);
            jK = jArr[0];
            for (int i2 = 1; i2 < 3; i2++) {
                long j7 = jArr[i2];
                if (j7 > jK) {
                    jK = j7;
                }
            }
            this.f22012m = jK;
        } else {
            jK = amn.k(j2 - ((long) (Math.max(0.0f, this.p - 1.0f) / 1.0E-7f)), this.f22012m, j6);
            this.f22012m = jK;
            long j8 = this.f22011l;
            if (j8 != -9223372036854775807L && jK > j8) {
                this.f22012m = j8;
                jK = j8;
            }
        }
        long j9 = j2 - jK;
        float fA = Math.abs(j9) >= this.f22004e ? amn.a((j9 * 1.0E-7f) + 1.0f, this.f22014o, this.f22013n) : 1.0f;
        this.p = fA;
        return fA;
    }

    public final long b() {
        return this.f22012m;
    }

    public final void c() {
        long j2 = this.f22012m;
        if (j2 == -9223372036854775807L) {
            return;
        }
        long j3 = j2 + this.f22005f;
        this.f22012m = j3;
        long j4 = this.f22011l;
        if (j4 != -9223372036854775807L && j3 > j4) {
            this.f22012m = j4;
        }
        this.q = -9223372036854775807L;
    }

    public final void d(kl klVar) {
        this.f22007h = iw.b(klVar.f22179a);
        this.f22010k = iw.b(klVar.f22180b);
        this.f22011l = iw.b(klVar.f22181c);
        float f2 = klVar.f22182d;
        if (f2 == -3.4028235E38f) {
            f2 = 0.97f;
        }
        this.f22014o = f2;
        float f3 = klVar.f22183e;
        if (f3 == -3.4028235E38f) {
            f3 = 1.03f;
        }
        this.f22013n = f3;
        g();
    }

    public final void e(long j2) {
        this.f22008i = j2;
        g();
    }
}
