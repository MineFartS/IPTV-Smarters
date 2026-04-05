package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TD extends AbstractRunnableC0817Kk {
    public final /* synthetic */ TH A00;
    public final /* synthetic */ K7 A01;

    public TD(TH th, K7 k7) {
        this.A00 = th;
        this.A01 = k7;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0817Kk
    public final void A04() {
        if (this.A00.A01.A07() == null) {
            return;
        }
        this.A00.A01.A07().onError(this.A00.A01.A08(), K7.A00(this.A01));
    }
}
