package com.facebook.ads.redexgen.X;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0984Qz extends Q1 {
    public final /* synthetic */ AbstractC0980Qv A00;

    public C0984Qz(AbstractC0980Qv abstractC0980Qv) {
        this.A00 = abstractC0980Qv;
    }

    @Override // com.facebook.ads.redexgen.X.Q1
    public final void A04() {
        if (!this.A00.A06.A08()) {
            this.A00.A06.A06();
            if (!TextUtils.isEmpty(this.A00.A01.A0Q())) {
                this.A00.A04.A8A(this.A00.A01.A0Q(), new C0897Np().A04(this.A00.A0A).A03(this.A00.A06).A05(this.A00.A01.A0S()).A06());
                this.A00.A03.A0A().A2a();
                this.A00.A08.A3s(this.A00.A09.A6Q());
            }
        }
    }
}
