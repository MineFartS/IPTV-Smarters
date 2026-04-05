package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class RA implements InterfaceC0884Nc {
    public final /* synthetic */ R8 A00;

    public RA(R8 r8) {
        this.A00 = r8;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0884Nc
    public final void AAN(String str) {
        this.A00.A0I = false;
        this.A00.A0C.setProgress(100);
        C0856Lz.A0Q(this.A00.A0C, 8);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0884Nc
    public final void AAP(String str) {
        this.A00.A0I = true;
        C0856Lz.A0Q(this.A00.A0C, 0);
        this.A00.A0B.setUrl(str);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0884Nc
    public final void AAf(int i2) {
        if (this.A00.A0I) {
            this.A00.A0C.setProgress(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0884Nc
    public final void AAk(String str) {
        this.A00.A0B.setTitle(str);
    }
}
