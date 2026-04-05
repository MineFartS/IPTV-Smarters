package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1107Vu implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ W5 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"eOUuWViEzFdpoMILAqmgKfGD", "kQ8zGky5wq3o9AT", "ncGQnuO4sM8XFQVxbr6Mt1Vf36DFujo3", "a4nYvm2BizGaG1Ug1SxTpBLIw0WxQ6vz", "jAlZY9MHNrHTDDv2DRP1sCieuZx8QBhv", "RCRcS7R4oQOTyLjlpIEX5API7Ni0gnf1", "stcG16G11KY1ooFu5mTwbs8KzP9kRkND", "k7goAJY4JhsqFIUQ56a5dCg3eq5QWQcp"};
    }

    public C1107Vu(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 26) {
            return this.A00.A08(EnumC04916o.A05);
        }
        if (this.A00.A02 != null && this.A00.A02.getPackageInstaller() != null && this.A00.A02.getPackageInstaller().getSessionInfo(0) != null) {
            W5 w5 = this.A00;
            return w5.A05(w5.A02.getPackageInstaller().getSessionInfo(0).getInstallReason());
        }
        W5 w52 = this.A00;
        EnumC04916o enumC04916o = EnumC04916o.A07;
        if (A01[4].charAt(16) != 'D') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "aumDgxyAyTkwYeibDzhpdrzSDvCJmfPb";
        strArr[4] = "aumDgxyAyTkwYeibDzhpdrzSDvCJmfPb";
        return w52.A08(enumC04916o);
    }
}
