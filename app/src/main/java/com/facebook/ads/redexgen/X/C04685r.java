package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04685r {
    public static byte[] A00;
    public static String[] A01;

    static {
        A0P();
        A0O();
    }

    public static String A0C(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            int i6 = bArrCopyOfRange[i5] ^ i4;
            if (A01[0].length() != 16) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "REysSn8h8uGvW44FsW7tFN1ShWtMejXq";
            strArr[7] = "REysSn8h8uGvW44FsW7tFN1ShWtMejXq";
            bArrCopyOfRange[i5] = (byte) (i6 ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0O() {
        A00 = new byte[]{97, 103, 92, 98, 96, 92, 96, 97, 3, 5, 62, 3, 8, DateTimeFieldType.HOUR_OF_HALFDAY, 12, 4, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 8, 2, 62, DateTimeFieldType.MINUTE_OF_DAY, 8, 6, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 0, DateTimeFieldType.HALFDAY_OF_DAY, 62, 2, 8, DateTimeFieldType.MINUTE_OF_HOUR, 2, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 0, DateTimeFieldType.MINUTE_OF_HOUR, 62, 3, DateTimeFieldType.SECOND_OF_DAY, 7, 7, 4, DateTimeFieldType.MINUTE_OF_HOUR, 62, DateTimeFieldType.HALFDAY_OF_DAY, 4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 6, DateTimeFieldType.SECOND_OF_MINUTE, 9, 63, 57, 2, 63, 48, 2, 41, 52, 48, 56, 2, 56, 45, 46, 52, 49, 50, 51, 98, 100, 95, 100, 121, 110, 97, 109, 105, 99, 95, 115, 105, 103, 110, 97, 108, 95, 99, 105, 114, 99, 117, 108, 97, 114, 95, 98, 117, 102, 102, 101, 114, 95, 108, 101, 110, 103, 116, 104, 28, 26, 33, 27, 12, 12, DateTimeFieldType.HOUR_OF_DAY, 12, 33, 12, 27, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_DAY, 12, 10, 33, DateTimeFieldType.HALFDAY_OF_DAY, 31, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 33, 12, 31, 10, 27, 80, 86, 109, 84, 94, 93, 83, 70, 109, 87, 66, 65, 91, 94, 93, 92, 41, 47, DateTimeFieldType.SECOND_OF_DAY, 34, 37, 63, 46, 57, 61, 42, 39, DateTimeFieldType.SECOND_OF_DAY, 47, 62, 57, 42, 63, 34, 36, 37, DateTimeFieldType.SECOND_OF_DAY, 56, 8, DateTimeFieldType.HOUR_OF_HALFDAY, 53, 3, 25, 53, 3, 4, 30, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 24, 28, 11, 6, 53, 7, 5, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 53, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 4, 11, 8, 6, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_HALFDAY, 46, 40, DateTimeFieldType.MINUTE_OF_HOUR, 34, 46, 33, DateTimeFieldType.MINUTE_OF_HOUR, 56, 37, 33, 41, DateTimeFieldType.MINUTE_OF_HOUR, 41, 60, 63, 37, 32, 35, 34, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 9, 50, 2, 29, 8, 31, 12, 25, 4, 2, 3, 12, 1, 50, 1, 2, 10, 10, 4, 3, 10, 50, 30, 12, 0, 29, 1, 4, 3, 10, 50, 31, 12, 25, 8, 73, 79, 116, 91, 70, 116, 91, 89, 68, 91, 116, 93, 74, 71, 116, 72, 68, 94, 69, 95, 115, 117, 78, 99, 101, 75, 77, 118, 90, 64, 78, 71, 72, 69, 118, 74, 70, 71, 79, 64, 78, 118, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 44, 0, 26, DateTimeFieldType.SECOND_OF_DAY, 29, DateTimeFieldType.MINUTE_OF_DAY, 31, 0, 44, DateTimeFieldType.CLOCKHOUR_OF_DAY, 28, 29, DateTimeFieldType.SECOND_OF_MINUTE, 26, DateTimeFieldType.SECOND_OF_DAY, 94, 88, 99, 79, 72, 93, 72, 85, 95, 99, 79, 85, 91, 82, 93, 80, 99, 95, 85, 78, 95, 73, 80, 93, 78, 99, 94, 73, 90, 90, 89, 78, 99, 80, 89, 82, 91, 72, 84, 92, 90};
    }

    public static void A0P() {
        A01 = new String[]{"sGwMbgPEVh4FwXWa", "9MCcaPs0cGd03qEkyl2X69dbSrrSW7Zr", "87eAjjgYTnizuEo7xhBpFeLb40Hm6wuS", "lReHfqhewEavArrd", "ewvVStI6GxGms8C3aQphiMoMwaYMXO3K", "xvalPSKIlI5sW7TQ", "zMwpaK24Vgrta9nCJMzGQdczaD8NI08n", "2D5lQzNrtBbYQ5DHntvZJtwThsuyUgKB"};
    }

    public static double A00(Context context) {
        return JT.A0L(context).A1g(A0C(108, 29, 13), 0.0d);
    }

    public static double A01(Context context) {
        return JT.A0L(context).A1g(A0C(221, 36, 30), 0.0d);
    }

    public static float A02(Context context) {
        return JT.A0L(context).A1h(A0C(137, 16, 65), 0.0f);
    }

    public static int A03(Context context) {
        return JT.A0L(context).A1i(A0C(8, 42, 18), 0);
    }

    public static int A04(Context context) {
        return JT.A0L(context).A1i(A0C(68, 40, 115), 0);
    }

    public static int A05(Context context) {
        return JT.A0L(context).A1i(A0C(153, 22, 56), 0);
    }

    public static int A06(Context context) {
        return JT.A0L(context).A1i(A0C(257, 20, 88), 0);
    }

    public static int A07(Context context) {
        return JT.A0L(context).A1i(A0C(316, 39, 79), 0);
    }

    public static long A08(Context context) {
        return JT.A0L(context).A1j(A0C(50, 18, 46), 0L);
    }

    public static long A09(Context context) {
        return JT.A0L(context).A1j(A0C(202, 19, 63), 0L);
    }

    public static EnumC04816e A0A(Context context) {
        return EnumC04816e.A00(JT.A0L(context).A1i(A0C(277, 5, 98), 0));
    }

    public static String A0B(int i2) {
        return A0C(282, 17, 90) + i2;
    }

    public static String A0D(Context context) {
        JT jtA0L = JT.A0L(context);
        String strA0C = A0C(355, 2, 84);
        String strA1k = jtA0L.A1k(A0C(299, 17, 0), strA0C);
        return strA1k == null ? strA0C : strA1k;
    }

    public static String A0E(Context context) {
        return A0L(context, 10920);
    }

    public static String A0F(Context context) {
        return A0L(context, 10300);
    }

    public static String A0G(Context context) {
        return A0L(context, 10941);
    }

    public static String A0H(Context context) {
        return A0L(context, 10943);
    }

    public static String A0I(Context context) {
        return A0L(context, 10944);
    }

    public static String A0J(Context context) {
        return A0L(context, 10945);
    }

    public static String A0K(Context context) {
        return A0L(context, 10940);
    }

    public static String A0L(Context context, int i2) {
        JT jtA0L = JT.A0L(context);
        String strA0B = A0B(i2);
        String strA0C = A0C(355, 2, 84);
        String strA1k = jtA0L.A1k(strA0B, strA0C);
        return strA1k == null ? strA0C : strA1k;
    }

    public static HashMap<Integer, Integer> A0M() {
        return new HashMap<>();
    }

    public static Map<Integer, String> A0N(Context context) {
        HashMap map = new HashMap();
        map.put(10920, A0E(context));
        map.put(10941, A0G(context));
        map.put(10300, A0F(context));
        map.put(10940, A0K(context));
        map.put(10943, A0H(context));
        map.put(10944, A0I(context));
        map.put(10945, A0J(context));
        return Collections.unmodifiableMap(map);
    }

    public static boolean A0Q(Context context) {
        return JT.A0L(context).A1m(A0C(175, 27, 25), false);
    }

    public static boolean A0R(Context context) {
        return JT.A0L(context).A1m(A0C(0, 8, 112), false);
    }
}
