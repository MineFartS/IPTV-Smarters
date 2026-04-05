package com.facebook.ads.redexgen.X;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FW {

    @Nullable
    public FW A00;

    @Nullable
    public HY A01;
    public boolean A02;
    public final long A03;
    public final long A04;

    public FW(long j2, int i2) {
        this.A04 = j2;
        this.A03 = ((long) i2) + j2;
    }

    public final int A00(long j2) {
        return ((int) (j2 - this.A04)) + this.A01.A00;
    }

    public final FW A01() {
        this.A01 = null;
        FW fw = this.A00;
        this.A00 = null;
        return fw;
    }

    public final void A02(HY hy, FW fw) {
        this.A01 = hy;
        this.A00 = fw;
        this.A02 = true;
    }
}
