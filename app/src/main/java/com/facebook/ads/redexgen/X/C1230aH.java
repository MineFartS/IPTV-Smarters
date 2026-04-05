package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1230aH implements InterfaceC04464u {
    public final /* synthetic */ C1220a7 A00;

    public C1230aH(C1220a7 c1220a7) {
        this.A00 = c1220a7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04464u
    public final boolean A7Z() {
        if (this.A00.A0B.canGoBack()) {
            this.A00.A0B.goBack();
            return true;
        }
        return false;
    }
}
