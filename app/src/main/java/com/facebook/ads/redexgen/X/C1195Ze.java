package com.facebook.ads.redexgen.X;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ze, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@TargetApi(21)
public final class C1195Ze implements InterfaceC0648Dn {
    public static byte[] A02;
    public MediaCodecInfo[] A00;
    public final int A01;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 39);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{10, 28, 26, 12, 11, 28, 84, 9, DateTimeFieldType.SECOND_OF_MINUTE, 24, 0, 27, 24, 26, DateTimeFieldType.MINUTE_OF_DAY};
    }

    public C1195Ze(boolean z) {
        this.A01 = z ? 1 : 0;
    }

    private void A01() {
        if (this.A00 == null) {
            this.A00 = new MediaCodecList(this.A01).getCodecInfos();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Dn
    public final int A5m() {
        A01();
        return this.A00.length;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Dn
    public final MediaCodecInfo A5n(int i2) {
        A01();
        return this.A00[i2];
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Dn
    public final boolean A7p(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(A00(0, 15, 94));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0648Dn
    public final boolean ACk() {
        return true;
    }
}
