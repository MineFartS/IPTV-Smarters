package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class B8 extends Exception {
    public static byte[] A01;
    public final int A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 96);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{41, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 3, 124, 112, DateTimeFieldType.MINUTE_OF_HOUR, 63, 62, 54, 57, 55, 120, 110, 90, 75, 70, 64, 123, 93, 78, 76, 68, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 70, 65, 70, 91, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 73, 78, 70, 67, 74, 75, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY};
    }

    public B8(int i2, int i3, int i4, int i5) {
        StringBuilder sb = new StringBuilder();
        sb.append(A00(12, 24, 79));
        sb.append(i2);
        sb.append(A00(3, 9, 48));
        sb.append(i3);
        String strA00 = A00(1, 2, 67);
        sb.append(strA00);
        sb.append(i4);
        sb.append(strA00);
        sb.append(i5);
        sb.append(A00(0, 1, 96));
        super(sb.toString());
        this.A00 = i2;
    }
}
