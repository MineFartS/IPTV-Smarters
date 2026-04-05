package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ax, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0592Ax extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 24);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{95, 55, 5, 83, 95, 111, 44, 39, 46, 33, 33, 42, 35, 60, 111, 38, 33, 111, 42, 33, 44, 32, 43, 38, 33, 40, 111, 65, 122, 124, 117, 122, 112, 120, 113, 112, 52, 114, 123, 102, 121, 117, 96, 46, 52};
    }

    public C0592Ax(int i2, int i3, int i4) {
        super(A00(27, 18, 12) + i2 + A00(0, 5, 103) + i3 + A00(5, 22, 87) + i4);
    }
}
