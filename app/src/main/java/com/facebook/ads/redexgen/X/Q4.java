package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Q4 extends AbstractRunnableC0829Kx {
    public static byte[] A02;
    public final /* synthetic */ AnonymousClass80 A00;
    public final /* synthetic */ C05127n A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-126, -75, -90, -90, -91, -78, -87, -82, -89, 96, -87, -82, -92, -91, -90, -87, -82, -87, -76, -91, -84, -71};
    }

    public Q4(AnonymousClass80 anonymousClass80, C05127n c05127n) {
        this.A00 = anonymousClass80;
        this.A01 = c05127n;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (this.A00.A0A.getState() == EnumC0958Pz.A02 && this.A00.A0A.getCurrentPositionInMillis() == A00()) {
            this.A00.A0H(A00(0, 22, 11));
        }
    }
}
