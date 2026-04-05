package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0975Qq {
    A03(A01(35, 4, 104)),
    A04(A01(39, 4, 113));

    public static byte[] A01;
    public String A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 86);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-99, -84, -93, -93, -22, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.MILLIS_OF_SECOND, 2, DateTimeFieldType.HALFDAY_OF_DAY, 10, 5, -63, DateTimeFieldType.SECOND_OF_DAY, 6, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_SECOND, 6, DateTimeFieldType.MINUTE_OF_HOUR, -63, DateTimeFieldType.MINUTE_OF_HOUR, 6, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.SECOND_OF_DAY, 6, -37, -63, -58, DateTimeFieldType.SECOND_OF_DAY, -34, -40, -40, -29, 36, 51, 42, 42, 50, 44, 44, 55};
    }

    static {
        A02();
    }

    EnumC0975Qq(String str) {
        this.A00 = str;
    }

    public static EnumC0975Qq A00(String str) {
        for (EnumC0975Qq enumC0975Qq : values()) {
            if (enumC0975Qq.A00.equals(str)) {
                return enumC0975Qq;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(4, 27, 75), str));
    }
}
