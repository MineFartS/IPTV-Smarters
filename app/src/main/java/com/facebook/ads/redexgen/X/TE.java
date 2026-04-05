package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TE extends AbstractRunnableC0817Kk {
    public final /* synthetic */ TH A00;

    public TE(TH th) {
        this.A00 = th;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0817Kk
    public final void A04() {
        if (this.A00.A01.A07() == null) {
            return;
        }
        this.A00.A01.A07().onAdLoaded(this.A00.A01.A08());
    }
}
