package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class X6 extends AbstractRunnableC0829Kx {
    public final /* synthetic */ C0906Ny A00;

    public X6(C0906Ny c0906Ny) {
        this.A00 = c0906Ny;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A00.clearAnimation();
        C0856Lz.A0H(1000, this.A00.A06, this.A00);
        this.A00.postDelayed(this, r2.A07);
    }
}
