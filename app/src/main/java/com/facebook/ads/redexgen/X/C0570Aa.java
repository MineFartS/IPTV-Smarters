package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0570Aa {
    public final long A00;
    public final long A01;
    public static final C0570Aa A04 = new C0570Aa(0, 0);
    public static final C0570Aa A02 = new C0570Aa(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C0570Aa A06 = new C0570Aa(Long.MAX_VALUE, 0);
    public static final C0570Aa A05 = new C0570Aa(0, Long.MAX_VALUE);
    public static final C0570Aa A03 = A04;

    public C0570Aa(long j2, long j3) {
        IM.A03(j2 >= 0);
        IM.A03(j3 >= 0);
        this.A01 = j2;
        this.A00 = j3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C0570Aa c0570Aa = (C0570Aa) obj;
        return this.A01 == c0570Aa.A01 && this.A00 == c0570Aa.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
