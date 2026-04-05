package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0843Lm {
    A03,
    A04;

    public static byte[] A00;
    public static String[] A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[1].charAt(25) == strArr[6].charAt(25)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "hPRl6mewzDLtDRePFgVGGzDpOousDsET";
            strArr2[7] = "1PTlaN9o47ZvO5QWBq3tjVop340dHI6h";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 123);
            i5++;
        }
    }

    public static void A01() {
        A00 = new byte[]{81, 80, 83, 84, 64, 89, 65, DateTimeFieldType.SECOND_OF_DAY, 7, 30, 30, DateTimeFieldType.HALFDAY_OF_DAY, 1, DateTimeFieldType.HOUR_OF_DAY, 0, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_SECOND, 28};
    }

    public static void A02() {
        A01 = new String[]{"hc6LTHWh34", "SocWGKvTrb27mU7I6HYZWtCOqe8vN7We", "SUbP7E1EvcCOTKHRfbpGBIuCA1WKWIWl", "9BnvDMswfYYU8yfKe5BUnKeiNTL", "L0vmRAARTPtPdmY", "U1b0Njqb3LWazyJmLiNcKHMDagE8OpYs", "PuJNFUDLlE3IV59JGDcXhgchNVuNoa4b", "exdb2ky9NstGP6elq11NgBzvOAGjRaxw"};
    }

    static {
        A02();
        A01();
    }
}
