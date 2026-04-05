package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YQ extends Q1 {
    public final /* synthetic */ YL A00;

    public YQ(YL yl) {
        this.A00 = yl;
    }

    @Override // com.facebook.ads.redexgen.X.Q1
    public final void A04() {
        if (!this.A00.A0V.A08()) {
            this.A00.A0V.A06();
            if (!TextUtils.isEmpty(this.A00.A0P.A0Q())) {
                this.A00.A0S.A8A(this.A00.A0P.A0Q(), new C0897Np().A04(this.A00.A0f).A03(this.A00.A0V).A05(this.A00.A0P.A0S()).A06());
                this.A00.A0R.A0A().A2a();
            }
            if (this.A00.A05 != null) {
                this.A00.A05.A3s(PF.A0A.A02());
            }
        }
    }
}
