package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1047Tm extends AbstractRunnableC0829Kx {
    public static byte[] A03;
    public final /* synthetic */ C04725v A00;
    public final /* synthetic */ X3 A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 80);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{53, 55, 60, 55, 32, 59, 49};
    }

    public C1047Tm(C04725v c04725v, String str, X3 x3) {
        this.A00 = c04725v;
        this.A02 = str;
        this.A01 = x3;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        try {
            this.A00.A07(this.A02);
        } catch (Throwable th) {
            this.A01.A04().A86(A00(0, 7, 2), C05228d.A0z, new C05238e(th));
        }
    }
}
