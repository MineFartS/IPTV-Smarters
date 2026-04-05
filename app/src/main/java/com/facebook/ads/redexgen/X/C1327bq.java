package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1327bq extends AbstractRunnableC0829Kx {
    public final /* synthetic */ C1328br A00;

    public C1327bq(C1328br c1328br) {
        this.A00 = c1328br;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A00.A0C = false;
        if (!this.A00.A0B.getQueue().isEmpty()) {
            return;
        }
        this.A00.A0B.execute(this.A00.A0A);
    }
}
