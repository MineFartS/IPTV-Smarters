package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YP extends AbstractRunnableC0829Kx {
    public static byte[] A01;
    public final /* synthetic */ YL A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-29, -10, -15, -14, -4, -83, 4, -18, 0, -83, -5, -14, 3, -14, -1, -83, -3, -1, -14, -3, -18, -1, -14, -15};
    }

    public YP(YL yl) {
        this.A00 = yl;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (!this.A00.A0G) {
            this.A00.A0e(A00(0, 24, 64));
        }
    }
}
