package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0962Qd {
    A04(A01(37, 3, 86)),
    A05(A01(40, 7, 117));

    public static byte[] A01;
    public static String[] A02;
    public String A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 102);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MILLIS_OF_SECOND, 31, -34, 3, 11, -10, 1, -2, -7, -75, 8, -6, 7, 11, -6, 7, -75, 7, -6, 8, 5, 4, 3, 8, -6, -49, -75, -70, 8, -6, -13, -16, -13, -12, -4, -13, 29, 31, 39, 80, 73, 70, 73, 74, 82, 73};
    }

    public static void A03() {
        A02 = new String[]{"kIaQKGqX2ZTqEjvfJkZOl1WwOBoH9uFY", "x", "Fa9eXDyIy4elyWfec912IKE0nqoR5HQV", BuildConfig.FLAVOR, "DfNaQJeOEpNPwVx", "9", "0vF5Kqqkw0y14nBhXHX4F0aBgr7OScbz", BuildConfig.FLAVOR};
    }

    static {
        A03();
        A02();
    }

    EnumC0962Qd(String str) {
        this.A00 = str;
    }

    public static EnumC0962Qd A00(String str) {
        for (EnumC0962Qd enumC0962Qd : valuesCustom()) {
            if (enumC0962Qd.A00.equals(str)) {
                return enumC0962Qd;
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, A01(3, 27, 47), str));
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static EnumC0962Qd[] valuesCustom() {
        EnumC0962Qd[] enumC0962QdArr = (EnumC0962Qd[]) values().clone();
        String[] strArr = A02;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[7] = BuildConfig.FLAVOR;
        strArr2[3] = BuildConfig.FLAVOR;
        return enumC0962QdArr;
    }
}
