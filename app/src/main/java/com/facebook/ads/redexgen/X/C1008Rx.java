package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1008Rx extends AbstractRunnableC0829Kx {
    public static byte[] A01;
    public final /* synthetic */ AbstractC1010Rz A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 34);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-113, -98, -105};
    }

    public C1008Rx(AbstractC1010Rz abstractC1010Rz) {
        this.A00 = abstractC1010Rz;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        try {
            this.A00.A09();
        } catch (Exception e2) {
            this.A00.A0C.A04().A86(A00(0, 3, 12), C05228d.A0I, new C05238e(e2));
        }
    }
}
