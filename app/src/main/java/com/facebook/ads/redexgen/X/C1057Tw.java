package com.facebook.ads.redexgen.X;

import android.app.ActivityManager;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1057Tw implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ U7 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"ks6FgoJovve7iHM2pZkl", "wha53u", "49wSJ7V8XkDKZTUcjMDnpoSn", "1JQ5I5ad77Yrp3ewkirQ0oRutiEmvr6i", "jAt3ZHaaMbDXz0fIQiir7V", "EKdcAjdCbYFTR4bnYqi4SV", "MwtlcC", "w1RouBmka6J1zGDRhikmrfItH78owLWg"};
    }

    public C1057Tw(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A02 != null) {
            return this.A00.A0G(ActivityManager.isUserAMonkey());
        }
        U7 u7 = this.A00;
        EnumC04916o enumC04916o = EnumC04916o.A07;
        if (A01[2].length() == 23) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "MHidzBjnmsHNQkooJipxy3AaWgleVPOv";
        strArr[7] = "EW2Ra62KpqEXQLSIkiFDqiivYFqdEGvM";
        return u7.A08(enumC04916o);
    }
}
