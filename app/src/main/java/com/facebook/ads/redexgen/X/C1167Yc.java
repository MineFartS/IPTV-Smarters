package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1167Yc implements CO {
    public final long A00;
    public final CN A01;

    public C1167Yc(long j2) {
        this(j2, 0L);
    }

    public C1167Yc(long j2, long j3) {
        this.A00 = j2;
        this.A01 = new CN(j3 == 0 ? CP.A04 : new CP(0L, j3));
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long A67() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final CN A6v(long j2) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final boolean A7q() {
        return false;
    }
}
