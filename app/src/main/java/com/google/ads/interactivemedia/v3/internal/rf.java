package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public class rf implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f22879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f22880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f22882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f22883e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f22884f;

    public rf(long j2, long j3, int i2, int i3) {
        long jB;
        this.f22879a = j2;
        this.f22880b = j3;
        this.f22881c = i3 == -1 ? 1 : i3;
        this.f22883e = i2;
        if (j2 == -1) {
            this.f22882d = -1L;
            jB = -9223372036854775807L;
        } else {
            this.f22882d = j2 - j3;
            jB = b(j2, j3, i2);
        }
        this.f22884f = jB;
    }

    private static long b(long j2, long j3, int i2) {
        return (Math.max(0L, j2 - j3) * 8000000) / ((long) i2);
    }

    public final long C(long j2) {
        return b(j2, this.f22880b, this.f22883e);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f22884f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        long j3 = this.f22882d;
        if (j3 == -1) {
            sd sdVar = new sd(0L, this.f22880b);
            return new sa(sdVar, sdVar);
        }
        int i2 = this.f22883e;
        long j4 = this.f22881c;
        long jK = this.f22880b + amn.k((((((long) i2) * j2) / 8000000) / j4) * j4, 0L, j3 - j4);
        long jC = C(jK);
        sd sdVar2 = new sd(jC, jK);
        if (jC < j2) {
            long j5 = jK + ((long) this.f22881c);
            if (j5 < this.f22879a) {
                return new sa(sdVar2, new sd(C(j5), j5));
            }
        }
        return new sa(sdVar2, sdVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return this.f22882d != -1;
    }
}
