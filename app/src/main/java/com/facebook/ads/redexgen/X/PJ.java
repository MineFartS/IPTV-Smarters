package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PJ implements OP {
    public final /* synthetic */ PI A00;

    public PJ(PI pi) {
        this.A00 = pi;
    }

    @Override // com.facebook.ads.redexgen.X.OP
    public final void ABM(View view) {
        if (this.A00.A07) {
            this.A00.A05 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.OP
    public final void ABN(View view) {
        R6 r6 = (R6) view;
        r6.A0g();
        if (this.A00.A07) {
            this.A00.A05 = true;
        }
        if (this.A00.A0E.A0b() && ((Integer) r6.getTag(-1593835536)).intValue() == 0) {
            this.A00.A0E.A0W();
        }
    }
}
