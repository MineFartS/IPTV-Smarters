package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class R7 implements InterfaceC0896No {
    public final WeakReference<R6> A00;

    public R7(R6 r6) {
        this.A00 = new WeakReference<>(r6);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0896No
    public final void A9k(boolean z) {
        R6 r6 = this.A00.get();
        if (r6 != null) {
            r6.A06 = z;
            r6.A01();
        }
    }
}
