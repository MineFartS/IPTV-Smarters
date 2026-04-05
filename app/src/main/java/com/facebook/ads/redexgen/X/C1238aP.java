package com.facebook.ads.redexgen.X;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1238aP extends AbstractRunnableC0829Kx {
    public static String[] A02;
    public final /* synthetic */ DialogInterface A00;
    public final /* synthetic */ MC A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"r", "tRYI", "7UJuVMqBcP2QEoAe5I9ReZPElv0qEy55", "leQvAr8Bdm", "IrxDcEzjLLQBxw", "x58zC904VQqUCNnuzCjkyAfM", "58DZzAqOGTGaE", "1xO3"};
    }

    public C1238aP(MC mc, DialogInterface dialogInterface) {
        this.A01 = mc;
        this.A00 = dialogInterface;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (this.A01.A01.A01 != null) {
            this.A01.A01.A01.ABg(C0812Ke.A01(), new QL().A06(this.A01.A01.A03(this.A01.A00.getText().toString())).A09());
        }
        DialogInterface dialogInterface = this.A00;
        if (A02[6].length() != 13) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[6] = "1hADnGgCLejuT";
        strArr[6] = "1hADnGgCLejuT";
        dialogInterface.cancel();
    }
}
