package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1253ae implements GC {
    public final long A00;
    public final YX A01;

    public C1253ae(YX yx, long j2) {
        this.A01 = yx;
        this.A00 = j2;
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final long A6L() {
        return 0L;
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final int A6w(long j2) {
        return this.A01.A00;
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final GN A6x(long j2) {
        return new GN(null, this.A01.A03[(int) j2], this.A01.A01[(int) j2]);
    }

    @Override // com.facebook.ads.redexgen.X.GC
    public final long A7B(long j2) {
        return this.A01.A04[(int) j2] - this.A00;
    }
}
