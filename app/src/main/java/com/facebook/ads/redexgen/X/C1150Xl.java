package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Xl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1150Xl extends AbstractRunnableC0829Kx {
    public final WeakReference<Q2> A00;

    public C1150Xl(Q2 q2) {
        this.A00 = new WeakReference<>(q2);
    }

    public C1150Xl(WeakReference<Q2> weakReference) {
        this.A00 = weakReference;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        Q2 q2 = this.A00.get();
        if (q2 != null) {
            q2.A0W();
        }
    }
}
