package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IY {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final long A07;

    public IY(byte[] bArr, int i2) {
        C0767Ik c0767Ik = new C0767Ik(bArr);
        c0767Ik.A08(i2 * 8);
        this.A04 = c0767Ik.A05(16);
        this.A02 = c0767Ik.A05(16);
        this.A05 = c0767Ik.A05(24);
        this.A03 = c0767Ik.A05(24);
        this.A06 = c0767Ik.A05(20);
        this.A01 = c0767Ik.A05(3) + 1;
        this.A00 = c0767Ik.A05(5) + 1;
        this.A07 = ((((long) c0767Ik.A05(4)) & 15) << 32) | (((long) c0767Ik.A05(32)) & 4294967295L);
    }

    public final int A00() {
        return this.A00 * this.A06;
    }

    public final long A01() {
        return (this.A07 * 1000000) / ((long) this.A06);
    }
}
