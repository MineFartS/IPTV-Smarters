package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GU {
    public static byte[] A02;
    public final String A00;
    public final String A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 62);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-61, -73};
    }

    public GU(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final String toString() {
        return this.A00 + A00(0, 2, 89) + this.A01;
    }
}
