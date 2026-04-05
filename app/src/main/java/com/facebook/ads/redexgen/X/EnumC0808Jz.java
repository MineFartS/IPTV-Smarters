package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoAutoplayBehavior;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0808Jz {
    A03,
    A05,
    A04;

    public static byte[] A00;
    public static String[] A01;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{-57, -56, -55, -60, -40, -49, -41, -11, -20, -20, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE};
    }

    public static void A03() {
        A01 = new String[]{"Gjwy6cOcQ9K2s9TECvKSb1UBI6p92tWs", "MkJKTqDYMAzsSL3ogCclj8aQMOEn3Zaf", "eTpSOjZOB", "ux", "6lFNHDDwy35cZQ5ctUwn46ZPa5FkYtAF", "2ZxEJa2ax0wS4G", "Utm", "f4eG1TG9uZ10lRPR3hza"};
    }

    static {
        A03();
        A02();
    }

    public static VideoAutoplayBehavior A00(EnumC0808Jz enumC0808Jz) {
        if (enumC0808Jz == null) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        int i2 = C0807Jy.A00[enumC0808Jz.ordinal()];
        if (i2 == 1) {
            return VideoAutoplayBehavior.DEFAULT;
        }
        if (A01[1].charAt(9) == 'M') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "KWBYg9gUO";
        strArr[5] = "KWBYg9gUO";
        if (i2 == 2) {
            return VideoAutoplayBehavior.ON;
        }
        if (i2 != 3) {
            VideoAutoplayBehavior videoAutoplayBehavior = VideoAutoplayBehavior.DEFAULT;
            String[] strArr2 = A01;
            if (strArr2[0].charAt(5) != strArr2[4].charAt(5)) {
                String[] strArr3 = A01;
                strArr3[0] = "jNXTJSXFaHaCK7i5lqJo4GmnkgAhCocQ";
                strArr3[4] = "apiAoBnIaWOp8nG5E1dZaMbzfZqR1u59";
                return videoAutoplayBehavior;
            }
            String[] strArr4 = A01;
            strArr4[2] = "D4DDJWMfk";
            strArr4[2] = "D4DDJWMfk";
            return videoAutoplayBehavior;
        }
        return VideoAutoplayBehavior.OFF;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0808Jz[] valuesCustom() {
        EnumC0808Jz[] enumC0808JzArrValuesCustom = values();
        if (A01[1].charAt(9) == 'M') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "qrA";
        strArr[3] = "mB";
        return (EnumC0808Jz[]) enumC0808JzArrValuesCustom.clone();
    }
}
