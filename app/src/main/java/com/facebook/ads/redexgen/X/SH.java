package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SH extends AbstractC03390o {
    public final /* synthetic */ SJ A00;

    public SH(SJ sj) {
        this.A00 = sj;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A05() {
        this.A00.A05.onRewardServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A06() {
        this.A00.A05.onRewardServerSuccess();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A07() {
        this.A00.A05.onRewardedVideoCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A08() {
        this.A00.A05.onRewardedVideoActivityDestroyed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A09() {
        this.A00.A05.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0B() {
        this.A00.A05.onAdClicked(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0C() {
        this.A00.A05.onLoggingImpression(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0E(InterfaceC03380n interfaceC03380n) {
        SJ sj = this.A00;
        sj.A03 = sj.A02.A0I();
        AbstractC0992Rh abstractC0992Rh = (AbstractC0992Rh) interfaceC03380n;
        if (this.A00.A06.A03 != null) {
            abstractC0992Rh.A01(this.A00.A06.A03);
        }
        this.A00.A06.A00 = abstractC0992Rh.A0B();
        this.A00.A04 = true;
        this.A00.A05.onAdLoaded(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0F(K7 k7) {
        this.A00.A0A(true);
        this.A00.A06.A0B.A0A().A2d(C0848Lr.A01(this.A00.A01), k7.A04().getErrorCode(), k7.A05());
        this.A00.A05.onError(this.A00.A06.A01(), K7.A00(k7));
    }
}
