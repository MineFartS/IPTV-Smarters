package com.facebook.ads.redexgen.X;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class X7 extends AbstractRunnableC0829Kx {
    public final /* synthetic */ C0906Ny A00;

    public X7(C0906Ny c0906Ny) {
        this.A00 = c0906Ny;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    @RequiresApi(api = 16)
    public final void A07() {
        this.A00.setPressed(false);
        C0906Ny c0906Ny = this.A00;
        c0906Ny.postOnAnimationDelayed(c0906Ny.A08, this.A00.A07);
    }
}
