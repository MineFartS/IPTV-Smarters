package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class KW {
    public static Map<String, Long> A00;
    public static Map<String, Long> A01;
    public static Map<String, String> A02;
    public static byte[] A03;
    public static String[] A04;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{-35, 43, -14, -35, 43, -14, -35, 43, -14, -35, 28, -14, -35, 28, -14, -35, 28, -24, -25, -26, 24, -21, -23, -21, -20, -20, 10, 0, 5, -2, -73, 3, -8, 10, 11, -73, -8, -5, -73, 9, -4, 10, 7, 6, 5, 10, -4, 5, 3, DateTimeFieldType.MINUTE_OF_DAY, -22, -1, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, -16, 3, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 12, DateTimeFieldType.HOUR_OF_DAY, 3};
    }

    public static void A05() {
        A04 = new String[]{"WcKxqk7L6BbuUQ1o7qmtmX6WSmYBceUW", "BgR1wHMut0LLHWxcn1vNnqjOmnDpA7yk", "nofrFHfyJT7pmG0QketyEOeNZ4PDBNqx", "tJ6rTzDc1vJYhzSuFM6hiX1fKi0tAXSV", "zeDIr51bIn8XcOdXOM6dVjfvh9EOKJZZ", "x4ZdmXYSSnH60B6WOaypztUTceO04NF4", "XXJyOaEVU", "eLFDRkAKNxNhqN4Dib4JBju5Hz9f2MYZ"};
    }

    static {
        A05();
        A04();
        A01 = new ConcurrentHashMap();
        A00 = new ConcurrentHashMap();
        A02 = new ConcurrentHashMap();
    }

    public static long A00(String str, KA ka) {
        if (A01.containsKey(str)) {
            return A01.get(str).longValue();
        }
        int i2 = KV.A00[ka.ordinal()];
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3) ? -1000L : -1000L;
        }
        if (A04[6].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A04;
        strArr[4] = "PcZmlfQcdFNZlzEkEhUxMjsAcGnkg3Oc";
        strArr[7] = "bp21WTLlcRSzBiFixYai9jfTwoum3UGv";
        return 15000L;
    }

    public static String A02(KX kx) {
        KL.A05(A01(47, 15, 94), A01(25, 22, 87), A01(17, 8, 116));
        return A02.get(A03(kx));
    }

    public static String A03(KX kx) {
        Locale locale = Locale.US;
        Object[] objArr = new Object[6];
        objArr[0] = kx.A08();
        objArr[1] = kx.A05();
        objArr[2] = kx.A06();
        objArr[3] = Integer.valueOf(kx.A07() == null ? 0 : kx.A07().A00());
        objArr[4] = Integer.valueOf(kx.A07() != null ? kx.A07().A01() : 0);
        objArr[5] = Integer.valueOf(kx.A04());
        return String.format(locale, A01(0, 17, 120), objArr);
    }

    public static void A06(long j2, KX kx) {
        A01.put(A03(kx), Long.valueOf(j2));
    }

    public static void A07(KX kx) {
        A00.put(A03(kx), Long.valueOf(System.currentTimeMillis()));
    }

    public static void A08(String str, KX kx) {
        A02.put(A03(kx), str);
    }

    public static boolean A09(KX kx) {
        String strA03 = A03(kx);
        if (A00.containsKey(strA03)) {
            return System.currentTimeMillis() - A00.get(strA03).longValue() < A00(strA03, kx.A05());
        }
        return false;
    }
}
