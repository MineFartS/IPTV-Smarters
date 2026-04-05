package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rt, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1004Rt implements AnonymousClass74 {
    public final boolean A00;

    public abstract void A00();

    public abstract void A01(boolean z);

    public AbstractC1004Rt(boolean z) {
        this.A00 = z;
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9B() {
        if (this.A00) {
            A00();
        } else {
            A01(false);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AnonymousClass74
    public final void A9I() {
        A01(true);
    }
}
