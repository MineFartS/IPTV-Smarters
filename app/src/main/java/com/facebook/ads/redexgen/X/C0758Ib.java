package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ib, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0758Ib {
    public static byte[] A02;
    public int A00;
    public long[] A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 45);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{61, 49, 98, 120, 107, 116, 49, 120, 98, 49, 89, 126, 102, 113, 124, 121, 116, 48, 121, 126, 116, 117, 104, 48};
    }

    public C0758Ib() {
        this(32);
    }

    public C0758Ib(int i2) {
        this.A01 = new long[i2];
    }

    public final int A02() {
        return this.A00;
    }

    public final long A03(int i2) {
        if (i2 >= 0 && i2 < this.A00) {
            return this.A01[i2];
        }
        throw new IndexOutOfBoundsException(A00(10, 14, 61) + i2 + A00(0, 10, 60) + this.A00);
    }

    public final void A04(long j2) {
        int i2 = this.A00;
        long[] jArr = this.A01;
        if (i2 == jArr.length) {
            this.A01 = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.A01;
        int i3 = this.A00;
        this.A00 = i3 + 1;
        jArr2[i3] = j2;
    }

    public final long[] A05() {
        return Arrays.copyOf(this.A01, this.A00);
    }
}
