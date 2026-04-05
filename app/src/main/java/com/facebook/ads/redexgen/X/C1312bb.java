package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1312bb extends AbstractRunnableC0817Kk {
    public final /* synthetic */ C05659v A00;
    public final /* synthetic */ K7 A01;

    public C1312bb(C05659v c05659v, K7 k7) {
        this.A00 = c05659v;
        this.A01 = k7;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0817Kk
    public final void A04() {
        this.A00.A01.onError(this.A00.A00, K7.A00(this.A01));
    }
}
