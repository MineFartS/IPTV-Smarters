package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class W1 implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ W5 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"zJajY9dZZxYFsLRzsvnBiwQWt0HnizLC", "gzFaheVOcPUMbI38nwUIVYmc91b5uR", "ce0KJPPQByTAaQ9ATxZk2kwW24DeaJ9j", "R6Wiv8wmYaZdmPdgU3hXsutSf", "job2ys34errF3to", "kwK9VFGEGX8wPEd", "j3AidPNHk3dBWfN6HPyZ7", "rfM1O6R1RyyEf1DP"};
    }

    public W1(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A01 == null || Build.VERSION.SDK_INT < 22) {
            return this.A00.A08(EnumC04916o.A07);
        }
        W5 w5 = this.A00;
        if (A01[1].length() != 30) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "SsABSdrOWb5CHUfmSefeH";
        strArr[6] = "SsABSdrOWb5CHUfmSefeH";
        return w5.A05(w5.A01.baseRevisionCode);
    }
}
