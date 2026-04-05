package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1185Yu implements InterfaceC0618Ci {
    public final int A00;
    public final int A01;
    public final C0768Il A02;

    public C1185Yu(C1184Yt c1184Yt) {
        this.A02 = c1184Yt.A00;
        this.A02.A0Z(12);
        this.A00 = this.A02.A0I();
        this.A01 = this.A02.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Ci
    public final int A6t() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Ci
    public final boolean A7h() {
        return this.A00 != 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Ci
    public final int AC6() {
        int i2 = this.A00;
        return i2 == 0 ? this.A02.A0I() : i2;
    }
}
