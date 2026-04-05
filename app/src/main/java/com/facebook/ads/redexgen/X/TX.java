package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class TX extends AbstractRunnableC0829Kx {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ C5G A01;
    public final /* synthetic */ C1320bj A02;

    public TX(C5G c5g, C1320bj c1320bj, Drawable drawable) {
        this.A01 = c5g;
        this.A02 = c1320bj;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A02.A1E(this.A00);
    }
}
