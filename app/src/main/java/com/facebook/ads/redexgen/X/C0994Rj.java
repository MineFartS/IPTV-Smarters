package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0994Rj implements InterfaceC0896No {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC0995Rk A01;
    public final /* synthetic */ C1320bj A02;

    public C0994Rj(AbstractC0995Rk abstractC0995Rk, int i2, C1320bj c1320bj) {
        this.A01 = abstractC0995Rk;
        this.A00 = i2;
        this.A02 = c1320bj;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896No
    public final void A9k(boolean z) {
        if (this.A00 == 0) {
            this.A02.A1R(this.A01.A04);
        }
        this.A02.A1U(z, true);
    }
}
