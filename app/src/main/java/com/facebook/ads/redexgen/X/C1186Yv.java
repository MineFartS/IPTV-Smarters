package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Yv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1186Yv implements InterfaceC0618Ci {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C0768Il A04;

    public C1186Yv(C1184Yt c1184Yt) {
        this.A04 = c1184Yt.A00;
        this.A04.A0Z(12);
        this.A02 = this.A04.A0I() & 255;
        this.A03 = this.A04.A0I();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Ci
    public final int A6t() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Ci
    public final boolean A7h() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Ci
    public final int AC6() {
        int i2 = this.A02;
        if (i2 == 8) {
            return this.A04.A0F();
        }
        if (i2 == 16) {
            return this.A04.A0J();
        }
        int i3 = this.A01;
        this.A01 = i3 + 1;
        if (i3 % 2 == 0) {
            this.A00 = this.A04.A0F();
            return (this.A00 & 240) >> 4;
        }
        return this.A00 & 15;
    }
}
