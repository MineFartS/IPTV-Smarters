package com.facebook.ads.redexgen.X;

import java.util.ArrayList;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class W2 implements InterfaceC04806d {
    public final /* synthetic */ W5 A00;

    public W2(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A04 != null) {
            ArrayList arrayList = new ArrayList();
            int iMin = Math.min(this.A00.A04.length, this.A00.A03.A0U());
            for (int i2 = 0; i2 < iMin; i2++) {
                arrayList.add(this.A00.A04[i2].name);
            }
            return this.A00.A0F(arrayList);
        }
        return this.A00.A08(EnumC04916o.A07);
    }
}
