package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6B {
    public final List<C6L> A00 = new ArrayList();

    public final void A00() {
        for (C6L biometricSignalLifecycleHandler : this.A00) {
            biometricSignalLifecycleHandler.ABb();
        }
    }

    public final void A01(C6L c6l) {
        this.A00.add(c6l);
    }
}
