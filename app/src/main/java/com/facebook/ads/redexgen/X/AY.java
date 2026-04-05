package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AY {
    public static final AY A01 = new AY(0);
    public final int A00;

    public AY(int i2) {
        this.A00 = i2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((AY) obj).A00;
    }

    public final int hashCode() {
        return this.A00;
    }
}
