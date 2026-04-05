package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Tz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1060Tz implements InterfaceC04806d {
    public final /* synthetic */ U7 A00;

    public C1060Tz(U7 u7) {
        this.A00 = u7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A00 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        U7 u7 = this.A00;
        return u7.A09(u7.A00.getGlEsVersion());
    }
}
