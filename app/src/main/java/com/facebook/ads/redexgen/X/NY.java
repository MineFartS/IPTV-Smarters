package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class NY {
    public static byte[] A08;
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final String A07;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 17);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{5, DateTimeFieldType.HOUR_OF_HALFDAY, 12, 62, 2, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_MINUTE, 62, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 0, 5, 4, 5, 62, 12, DateTimeFieldType.MINUTE_OF_DAY, 56, 49, 62, 52, 60, 53, 34, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 36, 57, 61, 53, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 61, 35, 24, 31, 24, 5, 24, DateTimeFieldType.CLOCKHOUR_OF_DAY, 29, 46, 4, 3, 29, 71, 68, 74, 79, 116, 77, 66, 69, 66, 88, 67, 116, 70, 88, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 29, 24, 35, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 29, DateTimeFieldType.HOUR_OF_HALFDAY, 8, 35, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 66, 85, 67, 64, 95, 94, 67, 85, 111, 85, 94, 84, 111, 93, 67, 59, 43, 58, 39, 36, 36, DateTimeFieldType.MILLIS_OF_SECOND, 58, 45, 41, 44, 49, DateTimeFieldType.MILLIS_OF_SECOND, 37, 59, 40, 62, 40, 40, 50, 52, 53, 4, 61, 50, 53, 50, 40, 51, 4, 54, 40};
    }

    public NY(String str, long j2, long j3, long j4, long j5, long j6, long j7, long j8) {
        this.A07 = str;
        this.A01 = j2;
        this.A03 = j3;
        this.A04 = j4;
        this.A00 = j5;
        this.A05 = j6;
        this.A02 = j7;
        this.A06 = j8;
    }

    public final Map<String, String> A02() {
        HashMap map = new HashMap(7);
        map.put(A00(36, 11, 96), this.A07);
        map.put(A00(21, 15, 65), String.valueOf(this.A01));
        map.put(A00(61, 13, 109), String.valueOf(this.A03));
        map.put(A00(74, 15, 33), String.valueOf(this.A04));
        map.put(A00(0, 21, 112), String.valueOf(this.A00));
        map.put(A00(89, 15, 89), String.valueOf(this.A05));
        map.put(A00(47, 14, 58), String.valueOf(this.A02));
        map.put(A00(104, 17, 74), String.valueOf(this.A06));
        return map;
    }
}
