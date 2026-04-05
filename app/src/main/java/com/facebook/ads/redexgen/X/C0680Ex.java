package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ex, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0680Ex extends AbstractC1010Rz {
    public DV A00;

    public C0680Ex(DV dv, C03611k c03611k) {
        super(dv, c03611k);
        this.A00 = dv;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1010Rz
    public final void A0N() {
        if (super.A00 != null) {
            this.A00.A0A().A3o();
            this.A07.A0D(super.A00);
        } else {
            this.A00.A0A().A3p();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1010Rz
    public final void A0Q(InterfaceC03380n interfaceC03380n, C05408v c05408v, C05388t c05388t, Map<String, Object> map) {
        this.A00.A0A().A3i();
        RY ry = (RY) interfaceC03380n;
        C1005Ru c1005Ru = new C1005Ru(this, map, ry);
        A0G().postDelayed(c1005Ru, c05408v.A05().A05());
        ry.A0D(this.A00, this.A09, this.A08.A06, new C1006Rv(this, c1005Ru), map);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1010Rz
    public final void A0S(String str) {
        this.A00.A0A().A3n(str != null);
        super.A0S(str);
    }
}
