package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UE implements InterfaceC04806d {
    public final /* synthetic */ US A00;

    public UE(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() throws Throwable {
        if (this.A00.A02.A0a() == EnumC04846h.A0I) {
            return this.A00.A08(EnumC04916o.A04);
        }
        String strA07 = this.A00.A03.A07(10010);
        if (strA07 != null) {
            return this.A00.A09(strA07);
        }
        return this.A00.A08(EnumC04916o.A07);
    }
}
