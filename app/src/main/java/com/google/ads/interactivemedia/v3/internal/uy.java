package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class uy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uv f23275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f23277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f23278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f23280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f23281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f23282h;

    public uy(uv uvVar, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
        int length = iArr.length;
        int length2 = jArr2.length;
        ajr.d(length == length2);
        int length3 = jArr.length;
        ajr.d(length3 == length2);
        int length4 = iArr2.length;
        ajr.d(length4 == length2);
        this.f23275a = uvVar;
        this.f23277c = jArr;
        this.f23278d = iArr;
        this.f23279e = i2;
        this.f23280f = jArr2;
        this.f23281g = iArr2;
        this.f23282h = j2;
        this.f23276b = length3;
        if (length4 > 0) {
            int i3 = length4 - 1;
            iArr2[i3] = iArr2[i3] | 536870912;
        }
    }

    public final int a(long j2) {
        for (int iAk = amn.ak(this.f23280f, j2, false); iAk >= 0; iAk--) {
            if ((this.f23281g[iAk] & 1) != 0) {
                return iAk;
            }
        }
        return -1;
    }

    public final int b(long j2) {
        for (int iAh = amn.ah(this.f23280f, j2, true); iAh < this.f23280f.length; iAh++) {
            if ((this.f23281g[iAh] & 1) != 0) {
                return iAh;
            }
        }
        return -1;
    }
}
