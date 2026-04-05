package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.UUID;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0608Bq extends Exception {
    public static byte[] A00;
    public static String[] A01;

    static {
        A02();
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 119);
            if (A01[6].charAt(20) != 'A') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "o3d2o9ikgoxA5z1";
            strArr[3] = "o3d2o9ikgoxA5z1";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-15, 9, 8, DateTimeFieldType.HALFDAY_OF_DAY, 5, -60, 8, DateTimeFieldType.MINUTE_OF_HOUR, 9, DateTimeFieldType.MILLIS_OF_SECOND, -60, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 24, -60, DateTimeFieldType.MILLIS_OF_SECOND, 25, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_DAY, 24, -60, 25, 25, DateTimeFieldType.HALFDAY_OF_DAY, 8, -34, -60};
    }

    public static void A02() {
        A01 = new String[]{"jybu9AmlZPNYJFO5CETURgZbL9", "roja0bhL1B9gUBQhWiTEX", "WMiIg6bDBi41NZoApBFo0", BuildConfig.FLAVOR, "oT4iuMPk3LT2VVBhdE9cDO7Myr", "ruzB4PX8Fu4D5Uvu", "vAhBirgpsYGDvsbxec1VAyH2PJeSZTTh", "yf8hg5uJFg3VA494hRWQ5mGXrAA"};
    }

    public C0608Bq(UUID uuid) {
        super(A00(0, 29, 45) + uuid);
    }
}
