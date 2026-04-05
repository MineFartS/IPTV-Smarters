package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum KA {
    A06,
    A02,
    A03,
    A04,
    A05;

    public static byte[] A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HALFDAY_OF_DAY, 26, 26, DateTimeFieldType.HOUR_OF_DAY, 30, 8, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 4, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 8, DateTimeFieldType.MINUTE_OF_HOUR, 8, 0, 11, -58, -71, -52, -63, -50, -67, -18, -31, -13, -35, -18, -32, -31, -32, -5, -14, -27, -32, -31, -21, -34, -41, -44, -41, -40, -32, -41};
    }

    static {
        A02();
    }

    public static KA A00(KD kd) {
        switch (kd) {
            case A06:
                return A04;
            case A0A:
            case A0B:
            case A0C:
            case A09:
                return A02;
            case A0D:
            case A0G:
            case A0E:
            case A0F:
                return A03;
            case A07:
                return A05;
            default:
                return A06;
        }
    }

    public final AdPlacementType A03() {
        int i2 = K9.A00[ordinal()];
        if (i2 == 1) {
            return AdPlacementType.INTERSTITIAL;
        }
        if (i2 == 2) {
            return AdPlacementType.BANNER;
        }
        if (i2 == 3) {
            return AdPlacementType.NATIVE;
        }
        if (i2 != 4) {
            return AdPlacementType.UNKNOWN;
        }
        return AdPlacementType.REWARDED_VIDEO;
    }
}
