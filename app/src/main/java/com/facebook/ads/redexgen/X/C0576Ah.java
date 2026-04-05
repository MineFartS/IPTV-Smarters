package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ah, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0576Ah {
    public final int A00;
    public final FB A01;

    public C0576Ah(int i2, FB fb) {
        this.A00 = i2;
        this.A01 = fb;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0576Ah c0576Ah = (C0576Ah) obj;
        return this.A00 == c0576Ah.A00 && this.A01.equals(c0576Ah.A01);
    }

    public final int hashCode() {
        return (this.A00 * 31) + this.A01.hashCode();
    }
}
