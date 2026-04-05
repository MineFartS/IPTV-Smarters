package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1105Vs implements InterfaceC04806d {
    public final /* synthetic */ W5 A00;

    public C1105Vs(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A02 != null) {
            W5 w5 = this.A00;
            return w5.A09(w5.A02.getInstallerPackageName(this.A00.A00.getPackageName()));
        }
        return this.A00.A08(EnumC04916o.A07);
    }
}
