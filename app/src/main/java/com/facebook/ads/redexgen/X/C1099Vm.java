package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1099Vm implements InterfaceC04806d {
    public final /* synthetic */ W5 A00;

    public C1099Vm(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A05 != null) {
            ArrayList arrayList = new ArrayList();
            int iMin = Math.min(this.A00.A05.length, this.A00.A03.A0U());
            for (int i2 = 0; i2 < iMin; i2++) {
                arrayList.add(this.A00.A05[i2].name);
            }
            Collections.sort(arrayList);
            return this.A00.A0F(arrayList);
        }
        return this.A00.A08(EnumC04916o.A07);
    }
}
