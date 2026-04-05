package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1213Zz implements LO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1212Zy A01;

    public C1213Zz(AbstractC1212Zy abstractC1212Zy, int i2) {
        this.A01 = abstractC1212Zy;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.LO
    public final void A9H() {
        this.A01.A03 = false;
        this.A01.A0P();
        this.A01.A0C.setToolbarActionMode(this.A01.getCloseButtonStyle());
    }

    @Override // com.facebook.ads.redexgen.X.LO
    public final void AAe(float f2) {
        this.A01.A0C.setProgress(100.0f * (1.0f - (f2 / this.A00)));
    }
}
