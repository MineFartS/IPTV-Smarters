package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ew, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0679Ew extends AbstractC1010Rz {
    public C0679Ew(X2 x2, C03611k c03611k) {
        super(x2, c03611k);
    }

    private InterfaceC03480x A00(Runnable runnable) {
        return new S1(this, runnable);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1010Rz
    public final void A0N() {
        ((RZ) this.A02).A0B();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1010Rz
    public final void A0Q(InterfaceC03380n interfaceC03380n, C05408v c05408v, C05388t c05388t, Map<String, Object> map) {
        RZ rz = (RZ) interfaceC03380n;
        S0 s0 = new S0(this, map, rz);
        A0G().postDelayed(s0, c05408v.A05().A05());
        rz.A0A(this.A0C, A00(s0), map, this.A08.A09, this.A08.A03, this.A08.A04, this.A08.A01);
    }
}
