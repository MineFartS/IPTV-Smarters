package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ry implements sc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f22925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f22926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f22927c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f22928d;

    public ry(long[] jArr, long[] jArr2, long j2) {
        int length = jArr.length;
        int length2 = jArr2.length;
        ajr.d(length == length2);
        boolean z = length2 > 0;
        this.f22928d = z;
        if (!z || jArr2[0] <= 0) {
            this.f22925a = jArr;
            this.f22926b = jArr2;
        } else {
            int i2 = length2 + 1;
            long[] jArr3 = new long[i2];
            this.f22925a = jArr3;
            long[] jArr4 = new long[i2];
            this.f22926b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f22927c = j2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final long e() {
        return this.f22927c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final sa g(long j2) {
        if (!this.f22928d) {
            sd sdVar = sd.f22934a;
            return new sa(sdVar, sdVar);
        }
        int iAk = amn.ak(this.f22926b, j2, true);
        sd sdVar2 = new sd(this.f22926b[iAk], this.f22925a[iAk]);
        if (sdVar2.f22935b != j2) {
            long[] jArr = this.f22926b;
            if (iAk != jArr.length - 1) {
                int i2 = iAk + 1;
                return new sa(sdVar2, new sd(jArr[i2], this.f22925a[i2]));
            }
        }
        return new sa(sdVar2, sdVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.sc
    public final boolean h() {
        return this.f22928d;
    }
}
