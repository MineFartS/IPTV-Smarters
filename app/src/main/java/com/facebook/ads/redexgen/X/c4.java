package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class c4 implements InterfaceC0797Jo {
    public WeakReference<C1320bj> A00;

    public c4(C1320bj c1320bj) {
        this.A00 = new WeakReference<>(c1320bj);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0797Jo
    public final void AAR(boolean z) {
        if (this.A00.get() != null) {
            this.A00.get().A1U(z, false);
        }
    }
}
