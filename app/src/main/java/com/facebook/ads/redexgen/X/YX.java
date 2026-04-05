package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class YX implements CO {
    public static byte[] A06;
    public final int A00;
    public final int[] A01;
    public final long[] A02;
    public final long[] A03;
    public final long[] A04;
    public final long A05;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 65);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{110, 112, 100, -88, -71, -74, -91, -72, -83, -77, -78, -73, -103, -73, -127, 113, 101, -76, -85, -85, -72, -86, -71, -72, -126, -96, -108, -25, -35, -18, -39, -25, -79, 126, 114, -58, -69, -65, -73, -89, -59, -113, -102, -65, -52, -59, -62, -96, -59, -69, -68, -49, 127, -61, -68, -59, -66, -53, -65, -108};
    }

    public YX(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.A01 = iArr;
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A04 = jArr3;
        this.A00 = iArr.length;
        int i2 = this.A00;
        if (i2 > 0) {
            this.A05 = jArr2[i2 - 1] + jArr3[i2 - 1];
        } else {
            this.A05 = 0L;
        }
    }

    public final int A02(long j2) {
        return J1.A0B(this.A04, j2, true, true);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long A67() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final CN A6v(long j2) {
        int iA02 = A02(j2);
        CP cp = new CP(this.A04[iA02], this.A03[iA02]);
        if (cp.A01 >= j2 || iA02 == this.A00 - 1) {
            return new CN(cp);
        }
        return new CN(cp, new CP(this.A04[iA02 + 1], this.A03[iA02 + 1]));
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final boolean A7q() {
        return true;
    }

    public final String toString() {
        return A00(42, 18, 22) + this.A00 + A00(25, 8, 51) + Arrays.toString(this.A01) + A00(15, 10, 4) + Arrays.toString(this.A03) + A00(33, 9, 17) + Arrays.toString(this.A04) + A00(1, 14, 3) + Arrays.toString(this.A02) + A00(0, 1, 4);
    }
}
