package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class LK {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 118);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-60, -52, 8, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 5, 29, 9, 8, -60, 10, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MILLIS_OF_DAY, -60, 24, 9, DateTimeFieldType.MILLIS_OF_SECOND, 24, -60, 5, 8, DateTimeFieldType.MILLIS_OF_SECOND, -60, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 29, -51};
    }

    public static void A02(Context context, String str) {
        if (AdInternalSettings.isTestMode(context)) {
            String str2 = str + A00(0, 30, 46);
        }
    }
}
