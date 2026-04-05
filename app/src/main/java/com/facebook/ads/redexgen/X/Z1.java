package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Z1 implements CO {
    public final /* synthetic */ Z2 A00;

    public Z1(Z2 z2) {
        this.A00 = z2;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long A67() {
        return this.A00.A0B.A04(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final CN A6v(long j2) {
        if (j2 == 0) {
            return new CN(new CP(0L, this.A00.A09));
        }
        long jA05 = this.A00.A0B.A05(j2);
        Z2 z2 = this.A00;
        return new CN(new CP(j2, z2.A00(z2.A09, jA05, 30000L)));
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final boolean A7q() {
        return true;
    }
}
