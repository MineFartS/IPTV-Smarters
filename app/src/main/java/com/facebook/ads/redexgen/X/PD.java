package com.facebook.ads.redexgen.X;

import com.facebook.ads.VideoStartReason;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public enum PD {
    A04(VideoStartReason.NOT_STARTED),
    A05(VideoStartReason.USER_STARTED),
    A03(VideoStartReason.AUTO_STARTED);

    public static byte[] A01;
    public final VideoStartReason A00;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{10, 30, 31, 4, DateTimeFieldType.SECOND_OF_DAY, 24, 31, 10, 25, 31, DateTimeFieldType.HOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 66, 67, 88, 83, 95, 88, 77, 94, 88, 73, 72, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 2, DateTimeFieldType.SECOND_OF_MINUTE, 24, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 6, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, 2, 3};
    }

    static {
        A02();
    }

    PD(VideoStartReason videoStartReason) {
        this.A00 = videoStartReason;
    }

    public static PD A00(VideoStartReason videoStartReason) {
        for (PD pd : values()) {
            if (pd.A00 == videoStartReason) {
                return pd;
            }
        }
        return A04;
    }
}
