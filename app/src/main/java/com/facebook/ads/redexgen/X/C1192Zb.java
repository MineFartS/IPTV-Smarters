package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1192Zb implements CO {
    public long A00;
    public long A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;

    public C1192Zb(int i2, int i3, int i4, int i5, int i6, int i7) {
        this.A06 = i2;
        this.A07 = i3;
        this.A02 = i4;
        this.A04 = i5;
        this.A03 = i6;
        this.A05 = i7;
    }

    public final int A00() {
        return this.A07 * this.A03 * this.A06;
    }

    public final int A01() {
        return this.A04;
    }

    public final int A02() {
        return this.A05;
    }

    public final int A03() {
        return this.A06;
    }

    public final int A04() {
        return this.A07;
    }

    public final long A05(long j2) {
        return (1000000 * Math.max(0L, j2 - this.A01)) / ((long) this.A02);
    }

    public final void A06(long j2, long j3) {
        this.A01 = j2;
        this.A00 = j3;
    }

    public final boolean A07() {
        return (this.A01 == 0 || this.A00 == 0) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long A67() {
        return (1000000 * (this.A00 / ((long) this.A04))) / ((long) this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final CN A6v(long j2) {
        long j3 = (((long) this.A02) * j2) / 1000000;
        int i2 = this.A04;
        long jA0F = J1.A0F((j3 / ((long) i2)) * ((long) i2), 0L, this.A00 - ((long) i2));
        long j4 = this.A01 + jA0F;
        long seekTimeUs = A05(j4);
        CP cp = new CP(seekTimeUs, j4);
        if (seekTimeUs < j2) {
            long j5 = this.A00;
            int i3 = this.A04;
            if (jA0F != j5 - ((long) i3)) {
                long j6 = ((long) i3) + j4;
                long seekPosition = A05(j6);
                return new CN(cp, new CP(seekPosition, j6));
            }
        }
        return new CN(cp);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final boolean A7q() {
        return true;
    }
}
