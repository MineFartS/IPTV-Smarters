package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class O8 {
    public static final int A00 = C0856Lz.A02.heightPixels;
    public static final int A01 = C0856Lz.A02.widthPixels;

    public static float A00(AnonymousClass19 anonymousClass19) {
        int iA01 = anonymousClass19.A0E().A01();
        int height = anonymousClass19.A0E().A00();
        if (height > 0) {
            return iA01 / height;
        }
        return -1.0f;
    }

    public static int A01(double d2) {
        return (int) (((double) (A01 - (O9.A09 * 2))) / d2);
    }

    public static int A02(int ctaTextHeight) {
        int ctaMargin = C0856Lz.A01(16);
        int i2 = C0906Ny.A0B * 2;
        int ctaSpacing = O9.A09;
        int ctaMargin2 = ctaMargin + i2 + (ctaSpacing * 2);
        int bottomMargin = A00;
        return (bottomMargin - ctaTextHeight) - ctaMargin2;
    }

    public static boolean A03(double d2) {
        return d2 < 0.9d;
    }

    public static boolean A04(double d2, int i2) {
        return A02(i2) < A01(d2);
    }

    public static boolean A05(int i2, int i3, double d2) {
        return i2 == 2 || A04(d2, i3);
    }
}
