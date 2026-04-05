package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8B, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C8B {
    public static final AtomicReference<X3> A00 = new AtomicReference<>();

    @Nullable
    public static X3 A00() {
        return A00.get();
    }

    public static void A01(X3 x3) {
        if (x3 == null) {
            return;
        }
        A00.compareAndSet(null, x3);
    }
}
