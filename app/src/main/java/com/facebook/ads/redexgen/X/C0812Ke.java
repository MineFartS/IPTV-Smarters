package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ke, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0812Ke {
    public static byte[] A00;
    public static final AtomicReference<String> A01;
    public static final AtomicReference<String> A02;

    public static String A03(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 88);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{118, 98, 123, 116, 126, 116, 120, 126, 116, 121, 125, 116, 116, 122, 116, 125, 124, 98, 47, 56, 42, 62, 72, 6, 3, 9, DateTimeFieldType.CLOCKHOUR_OF_DAY, 56, 11, 8, 0, 0, DateTimeFieldType.HOUR_OF_HALFDAY, 9, 0, 72, 12, 66, 71, 77, 84, 124, 80, 90, 77, 64, DateTimeFieldType.HOUR_OF_DAY, 111, 46, 37, 52, 55, 47, 50, 43, 31, 33, 36, 51, 31, 35, 47, 45, 45, 47, 46, 88, 68, 68, 64, 67, 10, 31, 31, 87, 66, 81, 64, 88, DateTimeFieldType.SECOND_OF_MINUTE, 67, 30, 86, 81, 83, 85, 82, 95, 95, 91, 30, 83, 95, 93, 4, 24, 24, 28, 31, 86, 67, 67, 27, 27, 27, 73, 31, 66, 10, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 9, DateTimeFieldType.HOUR_OF_HALFDAY, 3, 3, 7, 66, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 3, 1, 83, 83, 83};
    }

    static {
        A09();
        A01 = new AtomicReference<>();
        A02 = new AtomicReference<>();
    }

    public static String A00() {
        return A02() + A03(47, 19, 24);
    }

    public static String A01() {
        return A02() + A03(1, 21, 21);
    }

    public static String A02() {
        String str = A01.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        String urlOverride = A03(66, 28, 104);
        return A06(urlOverride);
    }

    public static String A04(C8C c8c) {
        return A07(JT.A0N(c8c)) + A03(22, 14, 63);
    }

    public static String A05(C8C c8c) {
        return A07(JT.A0O(c8c)) + A03(36, 11, 123);
    }

    public static String A06(String prefix) {
        String strA03;
        String urlPrefix = AdInternalSettings.getUrlPrefix();
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        if (TextUtils.isEmpty(urlPrefix)) {
            strA03 = A03(0, 0, 29);
        } else {
            strA03 = A03(0, 1, 0) + urlPrefix;
        }
        objArr[0] = strA03;
        return String.format(locale, prefix, objArr);
    }

    public static String A07(String urlOverride) {
        String str = A02.get();
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        return A08(A06(A03(94, 26, 52)), urlOverride);
    }

    public static String A08(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return str.replace(A03(120, 3, 124), str2);
    }
}
