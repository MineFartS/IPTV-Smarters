package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UK implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ US A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"pBrDaZa5X5LjOgDS06qrKfvSDyGe8efw", "mQEhYUIy596kL", "EIforD6eBYb22Ex4JOKq", "k4SBaaSc1moa84J0CFgFz3nqLP2HVqmu", "u8nSh4T3SaBZfkGp86pLE93qaiXMklcf", "jMwuEx2OfYupc0", "IfOhRtB8SPti74hSuqBgnsqawc0MdhYN", "25E6wEyieKrSwG"};
    }

    public UK(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 4) {
            US us = this.A00;
            String[] strArr = A01;
            if (strArr[7].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "5uTBAcIF1H8x94";
            strArr2[5] = "w8sP31VUPTTap4";
            return us.A08(EnumC04916o.A05);
        }
        if (this.A00.A01 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        US us2 = this.A00;
        String[] strArr3 = A01;
        if (strArr3[3].charAt(9) != strArr3[6].charAt(9)) {
            String[] strArr4 = A01;
            strArr4[7] = "fRLqK3UXRIvALx";
            strArr4[5] = "beY33YfNkspfTw";
            return us2.A05(us2.A01.targetSdkVersion);
        }
        String[] strArr5 = A01;
        strArr5[4] = "qWUfrjWL8adA9tG6bFG21ciodwCrSrmB";
        strArr5[4] = "qWUfrjWL8adA9tG6bFG21ciodwCrSrmB";
        return us2.A05(us2.A01.targetSdkVersion);
    }
}
