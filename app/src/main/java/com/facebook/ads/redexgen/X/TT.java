package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TT extends AbstractRunnableC0817Kk {
    public final /* synthetic */ TU A00;

    public TT(TU tu) {
        this.A00 = tu;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0817Kk
    public final void A04() {
        if (this.A00.A01.A00.A02() == null) {
            return;
        }
        this.A00.A01.A00.A02().onAdsLoaded();
    }
}
