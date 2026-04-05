package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Dm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0647Dm extends Exception {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 101);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{36, 63, 71, 74, 67, 66, -2, 82, 77, -2, 79, 83, 67, 80, 87, -2, 83, 76, 66, 67, 80, 74, 87, 71, 76, 69, -2, 75, 67, 66, 71, 63, -2, 65, 77, 66, 67, 65, 81};
    }

    public C0647Dm(Throwable th) {
        super(A00(0, 39, 121), th);
    }
}
