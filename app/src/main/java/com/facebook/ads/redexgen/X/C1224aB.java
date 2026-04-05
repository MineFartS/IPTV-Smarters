package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aB, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1224aB implements FY {
    public final int A00;
    public final /* synthetic */ BQ A01;

    public C1224aB(BQ bq, int i2) {
        this.A01 = bq;
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.FY
    public final boolean A7m() {
        return this.A01.A0T(this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.FY
    public final void A8Y() throws IOException {
        this.A01.A0R();
    }

    @Override // com.facebook.ads.redexgen.X.FY
    public final int AC3(AC ac, YH yh, boolean z) {
        return this.A01.A0Q(this.A00, ac, yh, z);
    }

    @Override // com.facebook.ads.redexgen.X.FY
    public final int ADI(long j2) {
        return this.A01.A0P(this.A00, j2);
    }
}
