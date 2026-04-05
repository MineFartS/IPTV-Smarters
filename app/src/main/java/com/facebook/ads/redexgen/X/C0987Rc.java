package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0987Rc implements InterfaceC03571g {
    public final /* synthetic */ F0 A00;
    public final /* synthetic */ AbstractC0992Rh A01;

    public C0987Rc(F0 f0, AbstractC0992Rh abstractC0992Rh) {
        this.A00 = f0;
        this.A01 = abstractC0992Rh;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03571g
    public final void AAT(AdError adError) {
        this.A00.A01.AAu(this.A01, adError);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC03571g
    public final void AAU() {
        this.A00.A0B.set(true);
        this.A00.A01.AAr(this.A01);
    }
}
