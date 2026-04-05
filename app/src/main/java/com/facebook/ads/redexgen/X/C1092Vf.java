package com.facebook.ads.redexgen.X;

import java.util.Locale;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1092Vf implements InterfaceC04806d {
    public final /* synthetic */ C1095Vi A00;

    public C1092Vf(C1095Vi c1095Vi) {
        this.A00 = c1095Vi;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        return this.A00.A09(Locale.getDefault().getCountry());
    }
}
