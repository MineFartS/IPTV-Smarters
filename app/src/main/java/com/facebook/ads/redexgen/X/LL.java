package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum LL {
    A04,
    A03,
    A02;

    public static byte[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 107);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-68, -63, -68, -57, -68, -76, -65, -68, -51, -72, -73, -13, -8, -13, -2, -13, -21, -10, -13, 4, -13, -8, -15, 24, 25, 30, 41, DateTimeFieldType.MINUTE_OF_HOUR, 24, DateTimeFieldType.MINUTE_OF_HOUR, 30, DateTimeFieldType.MINUTE_OF_HOUR, 11, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 36, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY};
    }

    static {
        A01();
    }
}
