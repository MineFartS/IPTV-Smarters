package com.facebook.ads.redexgen.X;

import java.io.IOException;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Io, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0771Io extends IOException {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{33, 45, 101, 100, 106, 101, 104, 126, 121, 48, 61, 31, 4, 2, 31, 4, 25, DateTimeFieldType.SECOND_OF_DAY, 77, 25, 2, 2, 77, 1, 2, 26, 77, 54, 29, 31, 4, 2, 31, 4, 25, DateTimeFieldType.SECOND_OF_DAY, 80, 65};
    }

    public C0771Io(int i2, int i3) {
        super(A00(10, 27, 94) + i2 + A00(0, 10, 62) + i3 + A00(37, 1, 47));
    }
}
