package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class tw implements tu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f23127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23129c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23130d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f23131e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long[] f23132f;

    private tw(long j2, int i2, long j3, long j4, long[] jArr) {
        this.f23127a = j2;
        this.f23128b = i2;
        this.f23129c = j3;
        this.f23132f = jArr;
        this.f23130d = j4;
        this.f23131e = j4 != -1 ? j2 + j4 : -1L;
    }

    public static tw c(long j2, long j3, pl plVar, alx alxVar) {
        int iN;
        int i2 = plVar.f22728g;
        int i3 = plVar.f22725d;
        int iE = alxVar.e();
        if ((iE & 1) != 1 || (iN = alxVar.n()) == 0) {
            return null;
        }
        long jQ = amn.q(iN, ((long) i2) * 1000000, i3);
        if ((iE & 6) != 6) {
            return new tw(j3, plVar.f22724c, jQ, -1L, null);
        }
        long jS = alxVar.s();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = alxVar.k();
        }
        if (j2 != -1) {
            long j4 = j3 + jS;
            if (j2 != j4) {
                StringBuilder sb = new StringBuilder(67);
                sb.append("XING data size mismatch: ");
                sb.append(j2);
                sb.append(", ");
                sb.append(j4);
                Log.w("XingSeeker", sb.toString());
            }
        }
        return new tw(j3, plVar.f22724c, jQ, jS, jArr);
    }

    private final long d(int i2) {
        return (this.f23129c * ((long) i2)) / 100;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tu
    public final long a() {
        return this.f23131e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tu
    public final long b(long j2) {
        double d2;
        long j3 = j2 - this.f23127a;
        if (!h() || j3 <= this.f23128b) {
            return 0L;
        }
        long[] jArr = (long[]) ajr.c(this.f23132f);
        double d3 = j3;
        Double.isNaN(d3);
        double d4 = this.f23130d;
        Double.isNaN(d4);
        double d5 = (d3 * 256.0d) / d4;
        int iAk = amn.ak(jArr, (long) d5, true);
        long jD = d(iAk);
        long j4 = jArr[iAk];
        int i2 = iAk + 1;
        long jD2 = d(i2);
        long j5 = iAk == 99 ? 256L : jArr[i2];
        if (j4 == j5) {
            d2 = 0.0d;
        } else {
            double d6 = j4;
            Double.isNaN(d6);
            double d7 = j5 - j4;
            Double.isNaN(d7);
            d2 = (d5 - d6) / d7;
        }
        double d8 = jD2 - jD;
        Double.isNaN(d8);
        return jD + Math.round(d2 * d8);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f23129c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        if (!h()) {
            sd sdVar = new sd(0L, this.f23127a + ((long) this.f23128b));
            return new sa(sdVar, sdVar);
        }
        long jK = amn.k(j2, 0L, this.f23129c);
        double d2 = jK;
        Double.isNaN(d2);
        double d3 = this.f23129c;
        Double.isNaN(d3);
        double d4 = (d2 * 100.0d) / d3;
        double d5 = 0.0d;
        if (d4 > 0.0d) {
            if (d4 >= 100.0d) {
                d5 = 256.0d;
            } else {
                int i2 = (int) d4;
                double d6 = ((long[]) ajr.c(this.f23132f))[i2];
                double d7 = i2 == 99 ? 256.0d : r3[i2 + 1];
                double d8 = i2;
                Double.isNaN(d8);
                Double.isNaN(d6);
                Double.isNaN(d6);
                d5 = d6 + ((d4 - d8) * (d7 - d6));
            }
        }
        double d9 = this.f23130d;
        Double.isNaN(d9);
        sd sdVar2 = new sd(jK, this.f23127a + amn.k(Math.round((d5 / 256.0d) * d9), this.f23128b, this.f23130d - 1));
        return new sa(sdVar2, sdVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return this.f23132f != null;
    }
}
