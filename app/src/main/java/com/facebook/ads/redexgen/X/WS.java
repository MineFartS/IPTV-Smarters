package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WS implements InterfaceC04806d {
    public final /* synthetic */ WZ A00;

    public WS(WZ wz) {
        this.A00 = wz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A00 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        WZ wz = this.A00;
        return wz.A05(wz.A00.getPhoneType());
    }
}
