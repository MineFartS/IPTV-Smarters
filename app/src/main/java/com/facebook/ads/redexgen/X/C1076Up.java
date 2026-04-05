package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Up, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1076Up implements InterfaceC04806d {
    public final /* synthetic */ C1079Us A00;

    public C1076Up(C1079Us c1079Us) {
        this.A00 = c1079Us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A00 == null) {
            return this.A00.A08(EnumC04916o.A06);
        }
        C1079Us c1079Us = this.A00;
        return c1079Us.A09(c1079Us.A00.getName());
    }
}
