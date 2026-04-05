package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UQ implements InterfaceC04806d {
    public final /* synthetic */ US A00;

    public UQ(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A01 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        US us = this.A00;
        return us.A09(us.A01.processName);
    }
}
