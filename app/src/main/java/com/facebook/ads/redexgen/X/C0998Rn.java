package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0998Rn implements AnonymousClass74 {
    public final /* synthetic */ C1000Rp A00;

    public C0998Rn(C1000Rp c1000Rp) {
        this.A00 = c1000Rp;
    }

    private void A00(boolean z) {
        if (z) {
            this.A00.A03.A8q();
        } else {
            this.A00.A03.A8p(AdError.CACHE_ERROR);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9B() {
        A00(false);
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9I() {
        A00(true);
    }
}
