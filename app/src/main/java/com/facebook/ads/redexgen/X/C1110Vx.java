package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1110Vx implements InterfaceC04806d {
    public final /* synthetic */ W5 A00;

    public C1110Vx(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A01 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        W5 w5 = this.A00;
        return w5.A07(w5.A01.lastUpdateTime);
    }
}
