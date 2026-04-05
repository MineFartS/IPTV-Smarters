package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R9 extends AbstractRunnableC0829Kx {
    public final /* synthetic */ R8 A00;
    public final /* synthetic */ boolean A01;

    public R9(R8 r8, boolean z) {
        this.A00 = r8;
        this.A01 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        MM mmA08 = this.A00.A0E.A08();
        if (mmA08 == null) {
            return;
        }
        mmA08.setPageDetailsVisible((this.A01 || mmA08.A07()) ? false : true);
        mmA08.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
