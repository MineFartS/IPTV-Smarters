package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class GS {
    public final long A00;
    public final long A01;
    public final GN A02;

    public GS(GN gn, long j2, long j3) {
        this.A02 = gn;
        this.A01 = j2;
        this.A00 = j3;
    }

    public final long A00() {
        return J1.A0G(this.A00, 1000000L, this.A01);
    }

    public GN A01(GP gp) {
        return this.A02;
    }
}
