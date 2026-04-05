package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC03280d {
    A08(A00(83, 5, 74)),
    A06(A00(70, 5, 56)),
    A03(A00(44, 8, 56)),
    A07(A00(75, 8, 102)),
    A05(A00(61, 9, 107)),
    A04(A00(52, 9, 22));

    public static byte[] A01;
    public final String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 50);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 2, 31, 5, 3, DateTimeFieldType.SECOND_OF_MINUTE, 28, DateTimeFieldType.MILLIS_OF_SECOND, 0, 31, 12, 26, 30, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, 116, 99, 124, 111, 102, 121, 116, 117, 127, 27, 31, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_SECOND, 124, 96, 109, 117, 109, 110, 96, 105, 72, 87, 90, 91, 81, 105, 107, 120, 101, 127, 121, 111, 102, 64, 87, 72, 123, 77, 73, 69, 67, 65, 61, 42, 53, 6, 47, 48, 61, 60, 54, 99, 103, 107, 109, 111, 36, 56, 53, 45, 53, 54, 56, 49, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_DAY, 28, 29, DateTimeFieldType.MILLIS_OF_SECOND};
    }

    static {
        A01();
    }

    EnumC03280d(String str) {
        this.A00 = str;
    }

    public final String A02() {
        return this.A00;
    }
}
