package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WP implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ WZ A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"xn6Y4xiAj5nTE1ZX0fcI9", "IuzZJNTC9Fpz", "Zp9uFgGuFlryeSNHyo4T0p", "eRJH2gjtevDtLFu1wMxFEv", "pTKacr9NdWTXHSX", "3c0ViuxMUKEAC", "2WDSEnCYP4spNEJs", "S3q5Kz3J"};
    }

    public WP(WZ wz) {
        this.A00 = wz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 26) {
            WZ wz = this.A00;
            String[] strArr = A01;
            if (strArr[2].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[2] = "x95Rh7kgyGSfBF3YHwpGzi";
            strArr2[3] = "73CHLU13D6YvD39ECjSAyL";
            return wz.A08(EnumC04916o.A05);
        }
        if (this.A00.A00 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        WZ wz2 = this.A00;
        return wz2.A0G(wz2.A00.isDataEnabled());
    }
}
