package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0784Jb {
    A0N(A01(514, 4, 97)),
    A06(A01(333, 15, 101)),
    A08(A01(359, 5, 65)),
    A0K(A01(484, 14, 57)),
    A0D(A01(392, 10, 117)),
    A0E(A01(402, 12, 118)),
    A0L(A01(498, 5, 57)),
    A0G(A01(425, 16, 24)),
    A0H(A01(441, 9, 54)),
    A0F(A01(414, 11, 6)),
    A0R(A01(568, 5, 113)),
    A0Q(A01(548, 11, 96)),
    A04(A01(594, 5, 112)),
    A0J(A01(466, 18, 14)),
    A05(A01(303, 12, 92)),
    A07(A01(348, 11, 62)),
    A0O(A01(533, 15, 70)),
    A0P(A01(518, 15, 59)),
    A0M(A01(503, 11, 33)),
    A09(A01(315, 18, 48)),
    A0S(A01(573, 21, 107)),
    A0C(A01(559, 9, 15)),
    A0I(A01(450, 16, 22)),
    A0B(A01(369, 23, 110)),
    A0A(A01(364, 5, 106));

    public static byte[] A01;
    public static String[] A02;
    public String A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{36, 33, 58, 55, 32, 53, 42, 55, 49, 44, 43, 34, 108, 105, 114, 126, 104, 97, 104, 110, 121, 100, 98, 99, 43, 59, 38, 62, 58, 44, 59, 54, 58, 44, 58, 58, 32, 38, 39, 53, 58, 63, 53, 61, 41, 49, 35, 55, 36, 50, 26, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_DAY, 10, 28, 8, 7, 4, 24, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, 9, 25, 4, 28, 24, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, 29, 2, DateTimeFieldType.HOUR_OF_HALFDAY, 28, 100, 101, 98, 117, 103, 41, 52, 35, 44, 32, 36, 46, 50, 62, 41, 38, 50, 33, 44, 52, 40, 63, 50, 40, 59, 40, 35, 57, DateTimeFieldType.SECOND_OF_MINUTE, 6, 29, 29, DateTimeFieldType.MILLIS_OF_DAY, 31, 12, 31, 28, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 26, 29, DateTimeFieldType.SECOND_OF_DAY, 41, 45, 48, 50, 37, 51, 51, 41, 47, 46, 73, 78, 86, 65, 76, 73, 68, 65, 84, 73, 79, 78, 105, 102, 115, 110, 113, 98, 120, 113, 110, 98, 112, 99, 106, 106, 115, 120, 109, 126, 107, 105, 120, 115, 111, 96, 101, 111, 103, 48, 47, 58, 49, 32, 51, 54, 49, 52, 26, 6, 11, DateTimeFieldType.MINUTE_OF_HOUR, 11, 8, 6, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 7, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 30, 24, 3, 9, 25, 105, 107, 124, 111, 112, 124, 110, 102, 112, 116, 105, 107, 124, 106, 106, 112, 118, 119, 1, 26, 29, 5, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 30, 30, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 66, 70, 88, 65, 84, 78, 69, 94, 78, 82, 93, 88, 82, 90, 12, 29, 11, 12, 47, 44, 52, 36, 40, 47, 62, 43, 51, 48, 40, 56, 52, 51, 34, 55, 56, 36, 38, 41, 36, 34, 43, 89, 95, 73, 94, 83, 94, 73, 88, 89, 94, 66, 104, 119, 122, 123, 113, 96, 118, 99, 116, 127, 104, 118, 121, 115, 104, 111, 104, 122, 126, 121, 126, 122, 126, 109, 114, 115, 33, 36, 31, 51, 37, 44, 37, 35, 52, 41, 47, 46, 78, 94, 67, 91, 95, 73, 115, 90, 69, 73, 91, 115, 79, 64, 67, 95, 73, 72, 27, 11, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 10, 28, 11, 38, 10, 28, 10, 10, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 65, 78, 75, 65, 73, 125, 69, 87, 67, 80, 70, 62, 49, 50, 46, 56, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 3, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 11, 28, DateTimeFieldType.MINUTE_OF_HOUR, 31, 27, DateTimeFieldType.HOUR_OF_DAY, 45, 1, DateTimeFieldType.MILLIS_OF_DAY, 25, 45, 30, DateTimeFieldType.MINUTE_OF_HOUR, 11, DateTimeFieldType.MILLIS_OF_SECOND, 0, 45, DateTimeFieldType.MILLIS_OF_SECOND, 4, DateTimeFieldType.MILLIS_OF_SECOND, 28, 6, 0, 4, 25, 27, 12, 26, 26, 0, 6, 7, 3, 4, 28, 11, 6, 3, DateTimeFieldType.HOUR_OF_HALFDAY, 11, 30, 3, 5, 4, 116, 123, 110, 115, 108, 127, 69, 108, 115, 127, 109, 107, 98, 98, 91, 112, 101, 118, 99, 97, 112, 91, 103, 104, 109, 103, 111, 69, 90, 79, 68, 117, 70, 67, 68, 65, 122, 102, 107, 115, 107, 104, 102, 111, 85, 103, 111, 126, 120, 99, 105, 121, 98, 96, 119, 100, 123, 119, 101, 77, 123, 127, 98, 96, 119, 97, 97, 123, 125, 124, 86, 77, 74, 82, 122, 68, 65, 122, 70, 68, 73, 73, 64, 65, 86, 81, 74, 87, 64, 78, 74, 84, 77, 88, 98, 94, 81, 84, 94, 86, 9, 24, DateTimeFieldType.HOUR_OF_HALFDAY, 9, 83, 80, 72, 120, 84, 83, 66, 87, 120, 68, 70, 73, 68, 66, 75, 46, 45, 53, 5, 41, 46, 63, 42, 5, 62, 51, 59, 54, 53, 61, 9, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 35, DateTimeFieldType.HOUR_OF_HALFDAY, 25, 8, 9, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, 102, 107, 76, 117, 102, 125, 125, 118, 127, 27, 4, 9, 8, 2, 0, DateTimeFieldType.MILLIS_OF_DAY, 3, DateTimeFieldType.SECOND_OF_DAY, 31, 40, DateTimeFieldType.MILLIS_OF_DAY, 25, DateTimeFieldType.MINUTE_OF_HOUR, 40, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 40, 26, 30, 25, 30, 26, 30, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 51, 3, 25, 24};
    }

    public static void A03() {
        A02 = new String[]{"pTWsWF2qz8Xr2QvNaoeX4WQy7B5K1AFD", "7iAt0ZQxlGPQ5tCLEuhHxDXKOxsROBn5", "RGBijebKMO9pnGzWLafy", "8GKiNnUVprvv3BQA7RRGlTYk7sqsrZd2", "dbszNjxVwRAY2WZF", "mcSvbra1TWloRdhWTFL80td7BovB7Z6D", "FcsNCE2HBJuao8xA2rTiJTUxq38jGWif", "poMRnmB7rAFaE3bMUxI6O2dxmVQ0Moe"};
    }

    static {
        A03();
        A02();
    }

    EnumC0784Jb(String str) {
        this.A00 = str;
    }

    public static EnumC0784Jb A00(String str) {
        for (EnumC0784Jb enumC0784Jb : values()) {
            if (enumC0784Jb.A00.equalsIgnoreCase(str)) {
                return enumC0784Jb;
            }
        }
        String[] strArr = A02;
        if (strArr[3].charAt(21) != strArr[6].charAt(21)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = "xhmlKR2vVr43obLaG";
        strArr2[7] = "xhmlKR2vVr43obLaG";
        return null;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.A00;
    }
}
