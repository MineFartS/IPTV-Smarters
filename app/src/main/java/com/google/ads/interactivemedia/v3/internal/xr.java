package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class xr implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xo f23743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f23747e;

    public xr(xo xoVar, int i2, long j2, long j3) {
        this.f23743a = xoVar;
        this.f23744b = i2;
        this.f23745c = j2;
        long j4 = (j3 - j2) / ((long) xoVar.f23738d);
        this.f23746d = j4;
        this.f23747e = a(j4);
    }

    private final long a(long j2) {
        return amn.q(j2 * ((long) this.f23744b), 1000000L, this.f23743a.f23737c);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f23747e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        long jK = amn.k((((long) this.f23743a.f23737c) * j2) / (((long) this.f23744b) * 1000000), 0L, this.f23746d - 1);
        long j3 = this.f23745c;
        int i2 = this.f23743a.f23738d;
        long jA = a(jK);
        sd sdVar = new sd(jA, j3 + (((long) i2) * jK));
        if (jA >= j2 || jK == this.f23746d - 1) {
            return new sa(sdVar, sdVar);
        }
        long j4 = jK + 1;
        return new sa(sdVar, new sd(a(j4), this.f23745c + (j4 * ((long) this.f23743a.f23738d))));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return true;
    }
}
