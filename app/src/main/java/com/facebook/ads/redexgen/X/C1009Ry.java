package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ry, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1009Ry extends AbstractRunnableC0829Kx {
    public final /* synthetic */ AbstractC1010Rz A00;
    public final /* synthetic */ K7 A01;

    public C1009Ry(AbstractC1010Rz abstractC1010Rz, K7 k7) {
        this.A00 = abstractC1010Rz;
        this.A01 = k7;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A00.A0C.A0A().A4Z(this.A01.A04().getErrorCode(), this.A01.A05());
        this.A00.A07.A0F(this.A01);
    }
}
