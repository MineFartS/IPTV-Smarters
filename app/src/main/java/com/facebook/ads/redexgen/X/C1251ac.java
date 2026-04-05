package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ac, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1251ac extends AbstractRunnableC0829Kx {
    public final /* synthetic */ LP A00;

    public C1251ac(LP lp) {
        this.A00 = lp;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (this.A00.A06()) {
            this.A00.A01();
            this.A00.A03.postDelayed(this, 250L);
        }
    }
}
