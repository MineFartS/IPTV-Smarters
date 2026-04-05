package com.facebook.ads.redexgen.X;

import java.util.List;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BD extends AbstractC1261am {
    public final List<GN> A00;

    public BD(GN gn, long j2, long j3, long j4, long j5, List<GR> list, List<GN> list2) {
        super(gn, j2, j3, j4, j5, list);
        this.A00 = list2;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261am
    public final int A02(long j2) {
        return this.A00.size();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261am
    public final GN A05(GP gp, long j2) {
        return this.A00.get((int) (j2 - ((AbstractC1261am) this).A01));
    }
}
