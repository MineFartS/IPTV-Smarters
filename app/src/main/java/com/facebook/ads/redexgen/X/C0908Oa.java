package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0908Oa {

    @Nullable
    public String A02;

    @Nullable
    public String A03;
    public final C1G A04;
    public final C1Q A05;
    public final X2 A06;
    public C1H A01 = C1H.A01(null);
    public int A00 = 1000;

    public C0908Oa(X2 x2, C1G c1g, C1Q c1q) {
        this.A06 = x2;
        this.A04 = c1g;
        this.A05 = c1q;
    }

    public final C0908Oa A07(int i2) {
        this.A00 = i2;
        return this;
    }

    public final C0908Oa A08(C1H c1h) {
        this.A01 = c1h;
        return this;
    }

    public final C0908Oa A09(String str) {
        this.A02 = str;
        return this;
    }

    public final C0908Oa A0A(String str) {
        this.A03 = str;
        return this;
    }

    public final C0910Oc A0B() {
        return new C0910Oc(this, null);
    }
}
