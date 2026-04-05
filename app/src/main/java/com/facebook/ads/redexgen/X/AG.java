package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AG {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final FB A04;
    public final boolean A05;
    public final boolean A06;

    public AG(FB fb, long j2, long j3, long j4, long j5, boolean z, boolean z2) {
        this.A04 = fb;
        this.A03 = j2;
        this.A02 = j3;
        this.A00 = j4;
        this.A01 = j5;
        this.A06 = z;
        this.A05 = z2;
    }

    public final AG A00(int i2) {
        return new AG(this.A04.A01(i2), this.A03, this.A02, this.A00, this.A01, this.A06, this.A05);
    }

    public final AG A01(long j2) {
        return new AG(this.A04, j2, this.A02, this.A00, this.A01, this.A06, this.A05);
    }
}
