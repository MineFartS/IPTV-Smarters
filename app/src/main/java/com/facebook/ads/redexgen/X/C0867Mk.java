package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0867Mk extends AbstractRunnableC0829Kx {
    public final /* synthetic */ C0854Lx A00;

    public C0867Mk(C0854Lx c0854Lx) {
        this.A00 = c0854Lx;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (!this.A00.A03) {
            C9E c9e = this.A00.A0B;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c9e.A03(new KR(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.7n
            });
            this.A00.A07.postDelayed(this, this.A00.A00);
        }
    }
}
