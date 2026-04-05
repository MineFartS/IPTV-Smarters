package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.24, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum AnonymousClass24 {
    A05(A00(22, 6, 6)),
    A03(A00(14, 4, 124)),
    A04(A00(18, 4, 24));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{66, 67, 78, 79, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, 91, 76, 89, 70, 91, 93, 119, 118, 123, 122, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 30, DateTimeFieldType.MILLIS_OF_SECOND, 0, DateTimeFieldType.SECOND_OF_MINUTE, 10, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_DAY};
    }

    static {
        A01();
    }

    AnonymousClass24(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
