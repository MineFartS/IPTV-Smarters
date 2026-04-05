package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.util.Log;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LV {
    public static byte[] A00;
    public static final String A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 89);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{108, 78, 65, 8, 91, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 75, 74, 91, 74, 93, 66, 70, 65, 74, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 70, 73, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 78, 95, 95, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 70, 92, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 122, 65, 70, 91, 86, 1, 24, 34, 113, 4, 63, 56, 37, 40, 113, 48, 33, 33, 107, 113, 118, 122, 120, 59, 115, 116, 118, 112, 119, 122, 122, 126, 59, 103, 112, 116, 118, 97, 59, 71, 112, 116, 118, 97, 84, 118, 97, 124, 99, 124, 97, 108, 4, 8, 10, 73, DateTimeFieldType.MINUTE_OF_DAY, 9, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 30, 84, 3, 73, DateTimeFieldType.MILLIS_OF_SECOND, 11, 6, 30, 2, DateTimeFieldType.SECOND_OF_MINUTE, 73, 50, 9, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 30, 55, 11, 6, 30, 2, DateTimeFieldType.SECOND_OF_MINUTE, 38, 4, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.MINUTE_OF_HOUR, 30};
    }

    static {
        A01();
        A01 = LV.class.getSimpleName();
    }

    @SuppressLint({"CatchGeneralException"})
    public static boolean A02() {
        try {
            Class.forName(A00(46, 32, 76));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A03() {
        try {
            Class.forName(A00(78, 38, 62));
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean A04(int i2, int i3) {
        return i2 >= 640 && i3 >= 640;
    }

    public static boolean A05(Context context) {
        boolean z = false;
        try {
            boolean z2 = true;
            ActivityInfo[] activityInfoArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities;
            if (activityInfoArr != null) {
                for (ActivityInfo activityInfo : activityInfoArr) {
                    if (A00(78, 38, 62).equals(activityInfo.name)) {
                        z = true;
                    }
                }
            }
            if (!z && !A03()) {
                z2 = false;
            }
            boolean isUnity = BuildConfigApi.isDebug();
            if (isUnity) {
                String str = A00(32, 14, 8) + z2;
            }
            return z2;
        } catch (Throwable th) {
            if (BuildConfigApi.isDebug()) {
                Log.e(A01, A00(0, 32, 118), th);
            }
            return false;
        }
    }
}
