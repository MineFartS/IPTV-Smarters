package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum PF {
    A06(A00(425, 41, 50)),
    A07(A00(466, 56, 61)),
    A08(A00(522, 44, 29)),
    A09(A00(566, 37, 13)),
    A04(A00(302, 40, 62)),
    A0A(A00(342, 45, 88)),
    A05(A00(387, 38, 60)),
    A0C(A00(655, 53, 121)),
    A0B(A00(603, 52, 10)),
    A03(A00(252, 50, 8));

    public static byte[] A01;
    public String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 119);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{44, -4, -17, 1, -21, -4, -18, -17, -18, 9, 0, -13, -18, -17, -7, 9, -21, -19, -2, -13, 0, -13, -2, 3, 9, -18, -17, -3, -2, -4, -7, 3, -17, -18, 25, 12, 30, 8, 25, 11, 12, 11, 38, 29, DateTimeFieldType.CLOCKHOUR_OF_DAY, 11, 12, DateTimeFieldType.MILLIS_OF_DAY, 38, 8, 11, 38, 10, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.CLOCKHOUR_OF_DAY, 10, DateTimeFieldType.MINUTE_OF_DAY, 10, -3, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, -7, 10, -4, -3, -4, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_HALFDAY, 1, -4, -3, 7, DateTimeFieldType.MILLIS_OF_SECOND, -5, 4, 7, 11, -3, -4, 44, 31, 49, 27, 44, 30, 31, 30, 57, 48, 35, 30, 31, 41, 57, 29, 41, 39, 42, 38, 31, 46, 31, 39, 26, 44, DateTimeFieldType.MILLIS_OF_DAY, 39, 25, 26, 25, 52, 43, 30, 25, 26, 36, 52, 24, 36, 34, 37, 33, 26, 41, 26, 52, 44, 30, 41, 29, 36, 42, 41, 52, 39, 26, 44, DateTimeFieldType.MILLIS_OF_DAY, 39, 25, 28, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 33, 11, 28, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 41, 32, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 25, 41, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 24, DateTimeFieldType.HOUR_OF_HALFDAY, 41, 11, DateTimeFieldType.HALFDAY_OF_DAY, 30, DateTimeFieldType.MINUTE_OF_HOUR, 32, DateTimeFieldType.MINUTE_OF_HOUR, 30, 35, 4, -9, 9, -13, 4, -10, -9, -10, DateTimeFieldType.HOUR_OF_DAY, 8, -5, -10, -9, 1, DateTimeFieldType.HOUR_OF_DAY, -9, 4, 4, 1, 4, 60, 47, 65, 43, 60, 46, 47, 46, 73, 64, 51, 46, 47, 57, 73, 51, 55, 58, 60, 47, 61, 61, 51, 57, 56, 45, 32, 50, 28, 45, 31, 58, 46, 32, 45, 49, 32, 45, 58, 33, 28, 36, 39, 32, 31, 33, DateTimeFieldType.SECOND_OF_DAY, 38, DateTimeFieldType.CLOCKHOUR_OF_DAY, 33, DateTimeFieldType.MINUTE_OF_HOUR, 46, 34, DateTimeFieldType.SECOND_OF_DAY, 33, 37, DateTimeFieldType.SECOND_OF_DAY, 33, 46, 34, 36, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 34, 34, -30, -18, -20, -83, -27, -32, -30, -28, -31, -18, -18, -22, -83, -32, -29, -14, -83, -15, -28, -10, -32, -15, -29, -28, -29, -34, -11, -24, -29, -28, -18, -83, -32, -30, -13, -24, -11, -24, -13, -8, -34, -29, -28, -14, -13, -15, -18, -8, -28, -29, 24, 36, 34, -29, 27, DateTimeFieldType.MILLIS_OF_DAY, 24, 26, DateTimeFieldType.MILLIS_OF_SECOND, 36, 36, 32, -29, DateTimeFieldType.MILLIS_OF_DAY, 25, 40, -29, 39, 26, 44, DateTimeFieldType.MILLIS_OF_DAY, 39, 25, 26, 25, DateTimeFieldType.SECOND_OF_DAY, 43, 30, 25, 26, 36, -29, DateTimeFieldType.MILLIS_OF_DAY, 25, DateTimeFieldType.SECOND_OF_DAY, 24, 33, 30, 24, 32, 50, 62, 60, -3, 53, 48, 50, 52, 49, 62, 62, 58, -3, 48, 51, 66, -3, 65, 52, 70, 48, 65, 51, 52, 51, 46, 69, 56, 51, 52, 62, -3, 48, 51, 46, 56, 60, 63, 65, 52, 66, 66, 56, 62, 61, DateTimeFieldType.MILLIS_OF_DAY, 34, 32, -31, 25, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 24, DateTimeFieldType.SECOND_OF_MINUTE, 34, 34, 30, -31, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 38, -31, 37, 24, 42, DateTimeFieldType.SECOND_OF_DAY, 37, DateTimeFieldType.MILLIS_OF_SECOND, 24, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MINUTE_OF_DAY, 41, 28, DateTimeFieldType.MILLIS_OF_SECOND, 24, 34, -31, DateTimeFieldType.MILLIS_OF_DAY, 31, 34, 38, 24, DateTimeFieldType.MILLIS_OF_SECOND, 12, 24, DateTimeFieldType.MILLIS_OF_DAY, -41, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 10, 12, DateTimeFieldType.HOUR_OF_HALFDAY, 11, 24, 24, DateTimeFieldType.SECOND_OF_DAY, -41, 10, DateTimeFieldType.HALFDAY_OF_DAY, 28, -41, 27, DateTimeFieldType.HOUR_OF_HALFDAY, 32, 10, 27, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 8, 31, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 24, -41, 12, 24, DateTimeFieldType.MILLIS_OF_DAY, 25, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_HALFDAY, 29, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 35, 33, -30, 26, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_SECOND, 25, DateTimeFieldType.MILLIS_OF_DAY, 35, 35, 31, -30, DateTimeFieldType.SECOND_OF_MINUTE, 24, 39, -30, 38, 25, 43, DateTimeFieldType.SECOND_OF_MINUTE, 38, 24, 25, 24, DateTimeFieldType.MINUTE_OF_HOUR, 42, 29, 24, 25, 35, -30, DateTimeFieldType.MILLIS_OF_SECOND, 35, 33, 36, 32, 25, 40, 25, 24, -30, 43, 29, 40, 28, 35, 41, 40, -30, 38, 25, 43, DateTimeFieldType.SECOND_OF_MINUTE, 38, 24, -9, 3, 1, -62, -6, -11, -9, -7, -10, 3, 3, -1, -62, -11, -8, 7, -62, 6, -7, 11, -11, 6, -8, -7, -8, -13, 10, -3, -8, -7, 3, -62, -7, 2, -8, -13, -11, -9, 8, -3, 10, -3, 8, DateTimeFieldType.HALFDAY_OF_DAY, -25, -13, -15, -78, -22, -27, -25, -23, -26, -13, -13, -17, -78, -27, -24, -9, -78, -10, -23, -5, -27, -10, -24, -23, -24, -29, -6, -19, -24, -23, -13, -78, -23, -10, -10, -13, -10, -28, -16, -18, -81, -25, -30, -28, -26, -29, -16, -16, -20, -81, -30, -27, -12, -81, -13, -26, -8, -30, -13, -27, -26, -27, -32, -9, -22, -27, -26, -16, -81, -12, -26, -13, -9, -26, -13, -32, -13, -26, -8, -30, -13, -27, -32, -25, -30, -22, -19, -26, -27, 83, 95, 93, 30, 86, 81, 83, 85, 82, 95, 95, 91, 30, 81, 84, 99, 30, 98, 85, 103, 81, 98, 84, 85, 84, 79, 102, 89, 84, 85, 95, 30, 99, 85, 98, 102, 85, 98, 79, 98, 85, 103, 81, 98, 84, 79, 99, 101, 83, 83, 85, 99, 99};
    }

    static {
        A01();
    }

    PF(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }

    public final String A03(String str) {
        return this.A00 + A00(0, 1, 123) + str;
    }
}
