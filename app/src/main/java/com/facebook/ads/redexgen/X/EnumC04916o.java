package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC04916o {
    A08(0),
    A06(1),
    A07(2),
    A05(3),
    A04(4);

    public static byte[] A01;
    public static String[] A02;
    public int A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[6].charAt(17) == 'X') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[4] = "pgudaYbRqTPjGMZ4ZZfMqbLkPBqXKu6s";
        strArr[4] = "pgudaYbRqTPjGMZ4ZZfMqbLkPBqXKu6s";
        A01 = new byte[]{-79, -78, -73, -62, -84, -80, -77, -81, -88, -80, -88, -79, -73, -88, -89, -42, -41, -36, -25, -37, -35, -40, -40, -41, -38, -36, -51, -52, DateTimeFieldType.MILLIS_OF_SECOND, 24, 40, 25, DateTimeFieldType.HOUR_OF_HALFDAY, 27, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 28, 28, DateTimeFieldType.MINUTE_OF_DAY, 24, DateTimeFieldType.MILLIS_OF_SECOND, -70, -63, -72, -72, -67, -74, -77, -74, -73, -65, -74};
    }

    public static void A02() {
        A02 = new String[]{"hSeSDY0of3XMKYBSawTW6", "sohFiklnBFgr2LMW5unaYXIdoh7LpqJ4", "J1GkrQhOQSKZr22Vk671BdQ9PLpp91zg", "xQM0SIi3n9Poy2F", "WAUXlS76Mh78MuMCacZeL0Bf36KHKL6J", "Ow19vI2XbPOH", "viGaH6ErnKztM5tSpUcz87FTndzVVCSd", "WNqW8CjWCVSKFZCXl6PMQeKqqDuJb9Ju"};
    }

    static {
        A02();
        A01();
    }

    EnumC04916o(int i2) {
        this.A00 = i2;
    }

    public final int A03() {
        return this.A00;
    }
}
