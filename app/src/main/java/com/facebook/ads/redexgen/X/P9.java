package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum P9 {
    A04(101),
    A07(102),
    A08(103),
    A05(104),
    A06(105),
    A03(106);

    public static byte[] A01;
    public final int A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 79);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{11, 24, 1, 1, 30, DateTimeFieldType.HOUR_OF_HALFDAY, 31, 8, 8, 3, DateTimeFieldType.MINUTE_OF_DAY, 27, 4, 9, 8, 2, DateTimeFieldType.MINUTE_OF_DAY, 27, 4, 8, 26, DateTimeFieldType.MINUTE_OF_DAY, 2, 3, DateTimeFieldType.MINUTE_OF_DAY, 9, 8, 30, 25, 31, 2, DateTimeFieldType.SECOND_OF_DAY, 5, 2, 24, 9, 30, 31, 24, 5, 24, 5, DateTimeFieldType.HALFDAY_OF_DAY, 0, DateTimeFieldType.MINUTE_OF_HOUR, 26, 5, 8, 9, 3, DateTimeFieldType.MINUTE_OF_HOUR, 26, 5, 9, 27, DateTimeFieldType.MINUTE_OF_HOUR, 8, 9, 31, 24, 30, 3, DateTimeFieldType.SECOND_OF_MINUTE, 46, 37, 55, 63, 54, 41, 36, 37, 47, 63, 41, 46, 52, 37, 50, 51, 52, 41, 52, 41, 33, 44, 63, 46, 39, 52, 63, 34, 53, 52, 52, 47, 46, 94, 85, 71, 79, 70, 89, 84, 85, 95, 79, 89, 94, 68, 85, 66, 67, 68, 89, 68, 89, 81, 92, 79, 68, 95, 95, 92, 82, 81, 66, 79, 83, 92, 95, 67, 85, 79, 83, 92, 89, 83, 91, 85, 84, 11, 28, DateTimeFieldType.HOUR_OF_HALFDAY, 24, 11, 29, 28, 29, 6, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 29, 28, DateTimeFieldType.MILLIS_OF_DAY, 6, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 27, 24, 11, 6, 26, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_DAY, 10, 28, 6, 26, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_DAY, 26, DateTimeFieldType.MINUTE_OF_DAY, 28, 29, 77, 85, 87, 78, 65, 78, 82, 75, 89, 87, 80};
    }

    static {
        A01();
    }

    P9(int i2) {
        this.A00 = i2;
    }

    public final int A02() {
        return this.A00;
    }
}
