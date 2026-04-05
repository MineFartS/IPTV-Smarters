package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.source.TrackGroup;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AO extends AbstractC1280b5 {
    public float A00;
    public int A01;
    public int A02;
    public long A03;
    public final float A04;
    public final float A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final long A09;
    public final InterfaceC0735Hc A0A;
    public final IP A0B;

    public AO(TrackGroup trackGroup, int[] iArr, InterfaceC0735Hc interfaceC0735Hc, long j2, long j3, long j4, float f2, float f3, long j5, IP ip) {
        super(trackGroup, iArr);
        this.A0A = interfaceC0735Hc;
        this.A07 = j2 * 1000;
        this.A06 = j3 * 1000;
        this.A08 = 1000 * j4;
        this.A04 = f2;
        this.A05 = f3;
        this.A09 = j5;
        this.A0B = ip;
        this.A00 = 1.0f;
        this.A01 = 1;
        this.A03 = -9223372036854775807L;
        this.A02 = A00(Long.MIN_VALUE);
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x000f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int A00(long r8) {
        /*
            r7 = this;
            com.facebook.ads.redexgen.X.Hc r0 = r7.A0A
            long r2 = r0.A5T()
            float r1 = (float) r2
            float r0 = r7.A04
            float r1 = r1 * r0
            long r3 = (long) r1
            r6 = 0
            r5 = 0
        Ld:
            int r0 = r7.A03
            if (r5 >= r0) goto L35
            r1 = -9223372036854775808
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L1d
            boolean r0 = r7.A02(r5, r8)
            if (r0 != 0) goto L32
        L1d:
            com.facebook.ads.internal.exoplayer2.Format r0 = r7.A6M(r5)
            int r0 = r0.A04
            float r1 = (float) r0
            float r0 = r7.A00
            float r1 = r1 * r0
            int r0 = java.lang.Math.round(r1)
            long r1 = (long) r0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 > 0) goto L31
            return r5
        L31:
            r6 = r5
        L32:
            int r5 = r5 + 1
            goto Ld
        L35:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AO.A00(long):int");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1280b5, com.facebook.ads.redexgen.X.HT
    public final void A4t() {
        this.A03 = -9223372036854775807L;
    }

    @Override // com.facebook.ads.redexgen.X.HT
    public final int A6z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1280b5, com.facebook.ads.redexgen.X.HT
    public final void AAW(float f2) {
        this.A00 = f2;
    }
}
