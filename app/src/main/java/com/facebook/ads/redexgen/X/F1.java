package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F1 extends AbstractC1004Rt {
    public final /* synthetic */ F0 A00;
    public final /* synthetic */ AbstractC0992Rh A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F1(F0 f0, boolean z, AbstractC0992Rh abstractC0992Rh) {
        super(z);
        this.A00 = f0;
        this.A01 = abstractC0992Rh;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1004Rt
    public final void A00() {
        this.A00.A01.AAu(this.A01, AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1004Rt
    public final void A01(boolean z) {
        this.A00.A0B.set(true);
        this.A00.A01.AAr(this.A01);
    }
}
