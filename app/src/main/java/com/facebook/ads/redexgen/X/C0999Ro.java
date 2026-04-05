package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ro, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0999Ro implements InterfaceC03571g {
    public final /* synthetic */ C1000Rp A00;

    public C0999Ro(C1000Rp c1000Rp) {
        this.A00 = c1000Rp;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03571g
    public final void AAT(AdError adError) {
        this.A00.A03.A8p(AdError.CACHE_ERROR);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03571g
    public final void AAU() {
        this.A00.A03.A8q();
    }
}
