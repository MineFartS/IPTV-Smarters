package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1221a8 implements InterfaceC0884Nc {
    public final /* synthetic */ C1220a7 A00;

    public C1221a8(C1220a7 c1220a7) {
        this.A00 = c1220a7;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0884Nc
    public final void AAN(String str) {
        this.A00.A0A.setProgress(100);
        this.A00.A05 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0884Nc
    public final void AAP(String str) {
        this.A00.A05 = true;
        this.A00.A09.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0884Nc
    public final void AAf(int i2) {
        if (this.A00.A05) {
            this.A00.A0A.setProgress(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0884Nc
    public final void AAk(String str) {
        this.A00.A09.setTitle(str);
    }
}
