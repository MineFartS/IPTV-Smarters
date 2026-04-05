package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R2 implements InterfaceC0909Ob {
    public static byte[] A01;
    public final /* synthetic */ R0 A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-43, -56, -60, -42, -79, -60, -64, -61, -40, -77, -50, -78, -57, -50, -42, -121, -122, -124, -46, -122, -120, -102};
    }

    public R2(R0 r0) {
        this.A00 = r0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0909Ob
    public final void A9x() {
        this.A00.A09.A03(EnumC0788Jf.A0M, null);
        this.A00.A0J(String.format(Locale.US, A00(0, 22, 72), this.A00.A0I));
    }
}
