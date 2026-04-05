package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class SE extends AbstractC03390o {
    public final /* synthetic */ SG A00;

    public SE(SG sg) {
        this.A00 = sg;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A00() {
        this.A00.A02 = false;
        this.A00.A05.onInterstitialActivityDestroyed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A02() {
        this.A00.A02 = false;
        if (this.A00.A01 != null) {
            this.A00.A01.A0R(new SD(this));
            this.A00.A01.A0L();
            this.A00.A01 = null;
        }
        this.A00.A05.onInterstitialDismissed(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A04() {
        this.A00.A05.onInterstitialDisplayed(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A05() {
        this.A00.A05.onRewardedAdServerFailed();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A06() {
        this.A00.A05.onRewardedAdServerSucceeded();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A07() {
        this.A00.A05.onRewardedAdCompleted();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0B() {
        this.A00.A04.A0A().A2Y();
        this.A00.A05.onAdClicked(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0C() {
        this.A00.A05.onLoggingImpression(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0D(View view) {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0E(InterfaceC03380n interfaceC03380n) {
        this.A00.A03 = true;
        this.A00.A05.onAdLoaded(this.A00.A06.A01());
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC03390o
    public final void A0F(K7 k7) {
        this.A00.A04.A0A().A2d(C0848Lr.A01(this.A00.A00), k7.A04().getErrorCode(), k7.A05());
        this.A00.A05.onError(this.A00.A06.A01(), K7.A00(k7));
    }
}
