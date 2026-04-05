package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class CT {
    public final CR A00;

    public abstract void A0C(C0768Il c0768Il, long j2) throws AI;

    public abstract boolean A0D(C0768Il c0768Il) throws AI;

    public CT(CR cr) {
        this.A00 = cr;
    }

    public final void A00(C0768Il c0768Il, long j2) throws AI {
        if (A0D(c0768Il)) {
            A0C(c0768Il, j2);
        }
    }
}
