package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class XG extends AbstractRunnableC0829Kx {
    public final /* synthetic */ X3 A00;

    public XG(X3 x3) {
        this.A00 = x3;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        for (C8Y event : C8X.A02()) {
            C8X.A0B(this.A00, event.A02(), event.A00(), event.A01(), false);
        }
        C8X.A02().clear();
    }
}
