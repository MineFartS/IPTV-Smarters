package com.facebook.ads.redexgen.X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1194Zd implements InterfaceC0648Dn {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 13);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{72, 87, 90, 91, 81, DateTimeFieldType.HOUR_OF_DAY, 95, 72, 93};
    }

    public C1194Zd() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Dn
    public final int A5m() {
        return MediaCodecList.getCodecCount();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Dn
    public final MediaCodecInfo A5n(int i2) {
        return MediaCodecList.getCodecInfoAt(i2);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Dn
    public final boolean A7p(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return A00(0, 9, 51).equals(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Dn
    public final boolean ACk() {
        return false;
    }
}
