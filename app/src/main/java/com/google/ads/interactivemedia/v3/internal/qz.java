package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class qz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f22848d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f22849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f22850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f22851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22852h;

    public qz(long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f22845a = j2;
        this.f22846b = j3;
        this.f22849e = j4;
        this.f22850f = j5;
        this.f22851g = j6;
        this.f22847c = j7;
        this.f22852h = f(j3, 0L, j4, j5, j6, j7);
    }

    public static long f(long j2, long j3, long j4, long j5, long j6, long j7) {
        if (j5 + 1 >= j6 || 1 + j3 >= j4) {
            return j5;
        }
        long j8 = (long) ((j2 - j3) * ((j6 - j5) / (j4 - j3)));
        return amn.k(((j5 + j8) - j7) - (j8 / 20), j5, (-1) + j6);
    }

    public static /* synthetic */ void g(qz qzVar, long j2, long j3) {
        qzVar.f22849e = j2;
        qzVar.f22851g = j3;
        qzVar.i();
    }

    public static /* synthetic */ void h(qz qzVar, long j2, long j3) {
        qzVar.f22848d = j2;
        qzVar.f22850f = j3;
        qzVar.i();
    }

    private final void i() {
        this.f22852h = f(this.f22846b, this.f22848d, this.f22849e, this.f22850f, this.f22851g, this.f22847c);
    }
}
