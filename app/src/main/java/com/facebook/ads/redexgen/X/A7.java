package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class A7 {
    public int A00;
    public int A01;
    public AJ A02;
    public boolean A03;

    public A7() {
    }

    public /* synthetic */ A7(A4 a4) {
        this();
    }

    public final void A03(int i2) {
        this.A01 += i2;
    }

    public final void A04(int i2) {
        if (this.A03 && this.A00 != 4) {
            IM.A03(i2 == 4);
        } else {
            this.A03 = true;
            this.A00 = i2;
        }
    }

    public final void A05(AJ aj) {
        this.A02 = aj;
        this.A01 = 0;
        this.A03 = false;
    }

    public final boolean A06(AJ aj) {
        return aj != this.A02 || this.A01 > 0 || this.A03;
    }
}
