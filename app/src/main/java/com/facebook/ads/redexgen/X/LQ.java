package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum LQ {
    A05(0),
    A06(1),
    A04(2);

    public static byte[] A01;
    public static String[] A02;
    public final int A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[2].length() == 27) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[1] = "i";
        strArr[0] = "v";
        A01 = new byte[]{117, 104, 104, 115, 98, 99, 122, 97, 100, 97, 96, 120, 97, 68, 95, 67, 94, 94, 69, 84, 85};
    }

    public static void A02() {
        A02 = new String[]{"D", "C", "8vWlkexf09f1piT", "bgKjpA4PjvHZdywoorD", "7PPvca8DkKgRdh14PD5p9M98ffpM", "UMv18", "Efwwh", "kVnW00famwT2UvCG2iLw1Nw0GuoWmmQs"};
    }

    static {
        A02();
        A01();
    }

    LQ(int i2) {
        this.A00 = i2;
    }
}
