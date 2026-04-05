package com.facebook.ads.redexgen.X;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1261am extends GS {
    public static String[] A03;
    public final long A00;
    public final long A01;
    public final List<GR> A02;

    static {
        A00();
    }

    public static void A00() {
        A03 = new String[]{"bNPYwAoDtIBZoouGwtv5ypJQZ6qsxo2X", "eKwdj9WvSnNuQ1", "1gRadvGXCcrQqS", "yHDVIADlMBtkjV96CL0kZlX7gdCtUKdF", "Sw0ATH4pFwZMlLzYGogxuLPhb3Dp7", "1jnsKoAS8k5tubMoPdlcjXtCZJp0llp3", "A2FzW5z9HhtLGXS7XprFQn5tZ7rNphvP", "pEMy7q228Pl3Goh7WxMg1caDHBMoVA15"};
    }

    public abstract int A02(long j2);

    public abstract GN A05(GP gp, long j2);

    public AbstractC1261am(GN gn, long j2, long j3, long j4, long j5, List<GR> list) {
        super(gn, j2, j3);
        this.A01 = j4;
        this.A00 = j5;
        this.A02 = list;
    }

    public final long A03() {
        return this.A01;
    }

    public final long A04(long j2) {
        long j3;
        List<GR> list = this.A02;
        if (list != null) {
            int i2 = (int) (j2 - this.A01);
            if (A03[5].charAt(12) != 'u') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[4] = "b3ff2FxHwK82Rhm82lesKyXAnXGsy";
            strArr[4] = "b3ff2FxHwK82Rhm82lesKyXAnXGsy";
            j3 = list.get(i2).A01 - super.A00;
        } else {
            long j4 = j2 - this.A01;
            long j5 = this.A00;
            String[] strArr2 = A03;
            if (strArr2[0].charAt(13) != strArr2[7].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr3 = A03;
            strArr3[2] = "HsWrEauk9MSXey";
            strArr3[1] = "vZleujFblUDiFs";
            j3 = j4 * j5;
        }
        return J1.A0G(j3, 1000000L, super.A01);
    }
}
