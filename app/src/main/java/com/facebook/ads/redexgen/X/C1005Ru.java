package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ru, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1005Ru extends AbstractRunnableC0829Kx {
    public final /* synthetic */ RY A00;
    public final /* synthetic */ C0680Ex A01;
    public final /* synthetic */ Map A02;

    public C1005Ru(C0680Ex c0680Ex, Map map, RY ry) {
        this.A01 = c0680Ex;
        this.A02 = map;
        this.A00 = ry;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A01.A0V(this.A02);
        this.A01.A0P(this.A00);
        this.A01.A0O();
    }
}
