package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC04946r {
    A06,
    A09,
    A05,
    A0C,
    A02,
    A03,
    A07,
    A0D,
    A0A,
    A08,
    A0B,
    A04;

    public static byte[] A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 40);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{66, 79, 79, 76, 69, 65, 78, 91, 77, 75, 76, 87, 85, 71, 87, 90, 82, 93, 91, 76, 102, 113, 113, 108, 113, 54, 60, 63, 49, 36, 47, 40, 50, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, DateTimeFieldType.MINUTE_OF_DAY, 25, 7, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 7, 31, 25, 28, 6, 1, 46, 45, 44, 37, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 3, DateTimeFieldType.MINUTE_OF_DAY, 26, 12, 7, 26, 6, 27, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 9, DateTimeFieldType.HOUR_OF_HALFDAY, 7, 71, 92, 70, 80, 91};
    }

    static {
        A01();
    }
}
