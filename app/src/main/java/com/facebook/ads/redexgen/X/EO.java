package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EO extends KE {
    public final /* synthetic */ AnonymousClass57 A00;

    public EO(AnonymousClass57 anonymousClass57) {
        this.A00 = anonymousClass57;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9F
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A04(KJ kj) {
        if (this.A00.A08 != null) {
            C1320bj.A0J(this.A00.A08.getInternalNativeAd()).A1U(true, true);
        }
        this.A00.A00.onPlayed();
    }
}
