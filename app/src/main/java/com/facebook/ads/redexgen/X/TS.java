package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TS extends AbstractRunnableC0817Kk {
    public final /* synthetic */ TV A00;
    public final /* synthetic */ K7 A01;

    public TS(TV tv2, K7 k7) {
        this.A00 = tv2;
        this.A01 = k7;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0817Kk
    public final void A04() {
        if (this.A00.A00.A02() != null) {
            this.A00.A00.A02().onAdError(K7.A00(this.A01));
        }
    }
}
