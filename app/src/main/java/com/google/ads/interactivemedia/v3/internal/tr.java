package com.google.ads.interactivemedia.v3.internal;

import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class tr implements tu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f23104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f23105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23106c;

    private tr(long[] jArr, long[] jArr2, long j2) {
        this.f23104a = jArr;
        this.f23105b = jArr2;
        this.f23106c = j2 == -9223372036854775807L ? iw.b(jArr2[jArr2.length - 1]) : j2;
    }

    public static tr c(long j2, zq zqVar, long j3) {
        int length = zqVar.f23877d.length;
        int i2 = length + 1;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        jArr[0] = j2;
        long j4 = 0;
        jArr2[0] = 0;
        for (int i3 = 1; i3 <= length; i3++) {
            int i4 = i3 - 1;
            j2 += (long) (zqVar.f23875b + zqVar.f23877d[i4]);
            j4 += (long) (zqVar.f23876c + zqVar.f23878e[i4]);
            jArr[i3] = j2;
            jArr2[i3] = j4;
        }
        return new tr(jArr, jArr2, j3);
    }

    private static Pair<Long, Long> d(long j2, long[] jArr, long[] jArr2) {
        double d2;
        Long lValueOf;
        Long lValueOf2;
        int iAk = amn.ak(jArr, j2, true);
        long j3 = jArr[iAk];
        long j4 = jArr2[iAk];
        int i2 = iAk + 1;
        if (i2 == jArr.length) {
            lValueOf = Long.valueOf(j3);
            lValueOf2 = Long.valueOf(j4);
        } else {
            long j5 = jArr[i2];
            long j6 = jArr2[i2];
            if (j5 == j3) {
                d2 = 0.0d;
            } else {
                double d3 = j2;
                double d4 = j3;
                Double.isNaN(d3);
                Double.isNaN(d4);
                double d5 = j5 - j3;
                Double.isNaN(d5);
                d2 = (d3 - d4) / d5;
            }
            lValueOf = Long.valueOf(j2);
            double d6 = j6 - j4;
            Double.isNaN(d6);
            lValueOf2 = Long.valueOf(((long) (d2 * d6)) + j4);
        }
        return Pair.create(lValueOf, lValueOf2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tu
    public final long a() {
        return -1L;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tu
    public final long b(long j2) {
        return iw.b(((Long) d(j2, this.f23104a, this.f23105b).second).longValue());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f23106c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        Pair<Long, Long> pairD = d(iw.c(amn.k(j2, 0L, this.f23106c)), this.f23105b, this.f23104a);
        long jLongValue = ((Long) pairD.first).longValue();
        sd sdVar = new sd(iw.b(jLongValue), ((Long) pairD.second).longValue());
        return new sa(sdVar, sdVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return true;
    }
}
