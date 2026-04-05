package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XK extends AbstractRunnableC0829Kx {
    public final /* synthetic */ C0895Nn A00;

    public XK(C0895Nn c0895Nn) {
        this.A00 = c0895Nn;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A00.A03();
        if (this.A00.A08) {
            this.A00.A0D.postDelayed(this.A00.A0F, 250L);
        }
    }
}
