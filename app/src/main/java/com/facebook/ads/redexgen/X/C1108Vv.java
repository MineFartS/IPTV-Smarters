package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1108Vv implements InterfaceC04806d {
    public final /* synthetic */ W5 A00;

    public C1108Vv(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 26) {
            return this.A00.A08(EnumC04916o.A05);
        }
        if (this.A00.A02 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        W5 w5 = this.A00;
        return w5.A0G(w5.A02.canRequestPackageInstalls());
    }
}
