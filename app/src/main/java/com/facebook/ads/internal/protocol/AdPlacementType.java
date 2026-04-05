package com.facebook.ads.internal.protocol;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum AdPlacementType {
    BANNER(A00(66, 6, 17)),
    INSTREAM(A00(72, 8, 77)),
    INTERSTITIAL(A00(80, 12, 15)),
    NATIVE(A00(92, 6, 100)),
    NATIVE_BANNER(A00(98, 13, 15)),
    REWARDED_VIDEO(A00(111, 14, 107)),
    UNKNOWN(A00(125, 7, 57));

    public static byte[] A01;
    public String A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 32, 32, DateTimeFieldType.MILLIS_OF_SECOND, 36, 35, 40, 45, 46, 44, 31, 27, 39, 33, 38, 44, 29, 42, 43, 44, 33, 44, 33, 25, 36, 4, -9, 10, -1, 12, -5, -44, -57, -38, -49, -36, -53, -27, -56, -57, -44, -44, -53, -40, DateTimeFieldType.MINUTE_OF_HOUR, 6, 24, 2, DateTimeFieldType.MINUTE_OF_HOUR, 5, 6, 5, 32, DateTimeFieldType.MILLIS_OF_SECOND, 10, 5, 6, DateTimeFieldType.CLOCKHOUR_OF_DAY, -57, -64, -67, -64, -63, -55, -64, -42, -43, -30, -30, -39, -26, 25, 30, 35, 36, 34, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.HOUR_OF_DAY, 29, -37, -32, -26, -41, -28, -27, -26, -37, -26, -37, -45, -34, 53, 40, 59, 48, 61, 44, -32, -45, -26, -37, -24, -41, -47, -44, -45, -32, -32, -41, -28, 64, 51, 69, 47, 64, 50, 51, 50, 45, 68, 55, 50, 51, 61, DateTimeFieldType.HOUR_OF_DAY, 10, 7, 10, 11, DateTimeFieldType.MINUTE_OF_HOUR, 10};
    }

    static {
        A01();
    }

    AdPlacementType(String str) {
        this.A00 = str;
    }

    public static AdPlacementType fromString(String str) {
        if (TextUtils.isEmpty(str)) {
            return UNKNOWN;
        }
        try {
            return valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNKNOWN;
        }
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.A00;
    }
}
