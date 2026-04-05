package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class W0 implements InterfaceC04806d {
    public final /* synthetic */ W5 A00;

    public W0(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A01 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        W5 w5 = this.A00;
        return w5.A09(w5.A01.packageName);
    }
}
