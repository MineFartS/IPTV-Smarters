package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ar, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1266ar implements InterfaceC0710Gd {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 103);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{62, 11, 11, 26, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 11, 26, 27, 95, 11, DateTimeFieldType.CLOCKHOUR_OF_DAY, 95, 28, DateTimeFieldType.HALFDAY_OF_DAY, 26, 30, 11, 26, 95, 27, 26, 28, DateTimeFieldType.CLOCKHOUR_OF_DAY, 27, 26, DateTimeFieldType.HALFDAY_OF_DAY, 95, 25, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 95, 10, DateTimeFieldType.HOUR_OF_DAY, 12, 10, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 11, 26, 27, 95, 25, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, 30, 11, 113, 96, 96, 124, 121, 115, 113, 100, 121, 127, 126, 63, 115, 117, 113, 61, 38, 32, 40, 29, 12, 12, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.SECOND_OF_MINUTE, 31, 29, 8, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 83, 31, 25, 29, 81, 75, 76, 68, 103, 118, 118, 106, 111, 101, 103, 114, 111, 105, 104, 41, 98, 112, 100, 117, 115, 100, 117, 28, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, DateTimeFieldType.HOUR_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 30, 28, 9, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, 82, DateTimeFieldType.HALFDAY_OF_DAY, 26, DateTimeFieldType.HOUR_OF_HALFDAY, 81, 64, 64, 92, 89, 83, 81, 68, 89, 95, 94, 31, 68, 68, 93, 92, 27, 72, 93, 92, 33, 48, 48, 44, 41, 35, 33, 52, 41, 47, 46, 111, 56, 109, 45, 48, 116, 109, 35, 37, 33, 109, 118, 112, 120, 63, 46, 46, 50, 55, 61, 63, 42, 55, 49, 48, 113, 38, 115, 51, 46, 106, 115, 40, 42, 42, 123, 106, 106, 118, 115, 121, 123, 110, 115, 117, 116, 53, 98, 55, 107, 111, 115, 121, 113, 110, 115, 119, 127, 55, 110, 98, 41, 125, 4, DateTimeFieldType.SECOND_OF_MINUTE, DateTimeFieldType.SECOND_OF_MINUTE, 9, 12, 6, 4, DateTimeFieldType.HOUR_OF_DAY, 12, 10, 11, 74, 29, 72, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 7, DateTimeFieldType.MILLIS_OF_SECOND, 12, DateTimeFieldType.SECOND_OF_MINUTE, 99, 114, 111, 99, 56, 97, 99, 99, 70, 87, 74, 70, 29, 74, 31, 65, 65, 83};
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0009  */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0710Gd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.InterfaceC1265aq A4G(com.facebook.ads.internal.exoplayer2.Format r5) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C1266ar.A4G(com.facebook.ads.internal.exoplayer2.Format):com.facebook.ads.redexgen.X.aq");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0710Gd
    public final boolean ADW(Format format) {
        String str = format.A0O;
        return A00(236, 8, 112).equals(str) || A00(IjkMediaMeta.FF_PROFILE_H264_HIGH_444_PREDICTIVE, 10, 85).equals(str) || A00(122, 20, 87).equals(str) || A00(167, 21, 57).equals(str) || A00(216, 20, 2).equals(str) || A00(188, 28, 125).equals(str) || A00(50, 19, 119).equals(str) || A00(142, 25, 39).equals(str) || A00(69, 19, 27).equals(str) || A00(88, 19, 97).equals(str) || A00(107, 15, 26).equals(str);
    }
}
