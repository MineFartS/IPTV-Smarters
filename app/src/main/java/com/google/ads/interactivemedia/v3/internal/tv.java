package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class tv implements tu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f23123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f23124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f23125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f23126d;

    private tv(long[] jArr, long[] jArr2, long j2, long j3) {
        this.f23123a = jArr;
        this.f23124b = jArr2;
        this.f23125c = j2;
        this.f23126d = j3;
    }

    public static tv c(long j2, long j3, pl plVar, alx alxVar) {
        int iK;
        alxVar.J(10);
        int iE = alxVar.e();
        if (iE <= 0) {
            return null;
        }
        int i2 = plVar.f22725d;
        long jQ = amn.q(iE, ((long) (i2 >= 32000 ? 1152 : 576)) * 1000000, i2);
        int iO = alxVar.o();
        int iO2 = alxVar.o();
        int iO3 = alxVar.o();
        alxVar.J(2);
        long j4 = j3 + ((long) plVar.f22724c);
        long[] jArr = new long[iO];
        long[] jArr2 = new long[iO];
        int i3 = 0;
        long j5 = j3;
        while (i3 < iO) {
            int i4 = iO2;
            long j6 = j4;
            jArr[i3] = (((long) i3) * jQ) / ((long) iO);
            jArr2[i3] = Math.max(j5, j6);
            if (iO3 == 1) {
                iK = alxVar.k();
            } else if (iO3 == 2) {
                iK = alxVar.o();
            } else if (iO3 == 3) {
                iK = alxVar.m();
            } else {
                if (iO3 != 4) {
                    return null;
                }
                iK = alxVar.n();
            }
            j5 += (long) (iK * i4);
            i3++;
            j4 = j6;
            iO2 = i4;
        }
        if (j2 != -1 && j2 != j5) {
            StringBuilder sb = new StringBuilder(67);
            sb.append("VBRI data size mismatch: ");
            sb.append(j2);
            sb.append(", ");
            sb.append(j5);
            Log.w("VbriSeeker", sb.toString());
        }
        return new tv(jArr, jArr2, jQ, j5);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tu
    public final long a() {
        return this.f23126d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tu
    public final long b(long j2) {
        return this.f23123a[amn.ak(this.f23124b, j2, true)];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f23125c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        int iAk = amn.ak(this.f23123a, j2, true);
        sd sdVar = new sd(this.f23123a[iAk], this.f23124b[iAk]);
        if (sdVar.f22935b < j2) {
            long[] jArr = this.f23123a;
            if (iAk != jArr.length - 1) {
                int i2 = iAk + 1;
                return new sa(sdVar, new sd(jArr[i2], this.f23124b[i2]));
            }
        }
        return new sa(sdVar, sdVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return true;
    }
}
