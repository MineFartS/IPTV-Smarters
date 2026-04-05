package com.facebook.ads.redexgen.X;

import com.facebook.ads.NativeAdBase;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public enum EnumC0798Jp {
    A05(0, NativeAdBase.MediaCacheFlag.NONE),
    A04(1, NativeAdBase.MediaCacheFlag.ALL);

    public static byte[] A02;
    public final long A00;
    public final NativeAdBase.MediaCacheFlag A01;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 111);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{70, 75, 75, 34, 35, 34, 41};
    }

    static {
        A02();
    }

    EnumC0798Jp(long j2, NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        this.A00 = j2;
        this.A01 = mediaCacheFlag;
    }

    public static EnumC0798Jp A00(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        for (EnumC0798Jp enumC0798Jp : values()) {
            if (enumC0798Jp.A01 == mediaCacheFlag) {
                return enumC0798Jp;
            }
        }
        return null;
    }
}
