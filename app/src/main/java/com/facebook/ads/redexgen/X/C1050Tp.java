package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1050Tp implements AnonymousClass65 {
    public static String[] A02;
    public final C1052Tr A00;
    public final X3 A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"iWDBF2OKl3jtj3mE0UZLtkhUaVvUxXqs", "ms2LCEwCyzsqM8QDDj0PRev1P1CSm3w7", "hMtVrOKQMF9h", "gi6PEiuAAOhVuZEccjIoIAk9XYc1uF", "R32JKWcbl7Qu2cyp2LhmQehQDOktlipk", "kBJUlLOX6LAUVPMDIzawXbz3hNZwTKWy", "5r9f7V6KCkM3IvysTdnytDlDBRDUQAcw", "vGzO7SO4CN32udhBb2qyIGFDHHv1hOkX"};
    }

    public C1050Tp(X3 x3) {
        this.A01 = x3;
        this.A00 = new C1052Tr(x3);
    }

    public final C1052Tr A01() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass65
    @SuppressLint({"BadMethodUse-java.lang.String.length"})
    public final void ACX(Throwable th) {
        if (th == null || C04685r.A00(this.A01) >= Math.random()) {
            return;
        }
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.toString();
        C1052Tr c1052Tr = this.A00;
        String strA03 = AnonymousClass60.A04.A03();
        String strA02 = AnonymousClass61.A06.A02();
        HashMap map = new HashMap();
        String message = th.getMessage();
        if (string != null) {
            int length = string.length();
            if (A02[1].charAt(16) != 'D') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[5] = "Ct83iaSYEVOHUGfDQtOJkAbKybUxEBTx";
            strArr[5] = "Ct83iaSYEVOHUGfDQtOJkAbKybUxEBTx";
            if (length > 500) {
                string = string.substring(0, 500);
            }
        }
        c1052Tr.A8F(strA03, strA02, map, null, message, string, th.getClass().getSimpleName());
    }
}
