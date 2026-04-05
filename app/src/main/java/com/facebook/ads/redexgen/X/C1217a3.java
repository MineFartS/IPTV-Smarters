package com.facebook.ads.redexgen.X;

import android.R;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1217a3 extends AbstractRunnableC0829Kx {
    public final /* synthetic */ MY A00;

    public C1217a3(MY my) {
        this.A00 = my;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A0I().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
