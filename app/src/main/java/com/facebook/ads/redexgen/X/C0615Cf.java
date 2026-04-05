package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Cf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0615Cf implements InterfaceC1181Yq {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;

    public C0615Cf(long j2, long j3, CL cl) {
        this.A04 = j3;
        this.A01 = cl.A02;
        this.A00 = cl.A00;
        if (j2 == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
        } else {
            this.A02 = j2 - j3;
            this.A03 = A7B(j2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final long A67() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final CN A6v(long positionOffset) {
        long j2 = this.A02;
        if (j2 == -1) {
            return new CN(new CP(0L, this.A04));
        }
        long j3 = (((long) this.A00) * positionOffset) / 8000000;
        int i2 = this.A01;
        long jA0F = J1.A0F((j3 / ((long) i2)) * ((long) i2), 0L, j2 - ((long) i2));
        long j4 = this.A04 + jA0F;
        long jA7B = A7B(j4);
        CP seekPoint = new CP(jA7B, j4);
        if (jA7B < positionOffset) {
            long j5 = this.A02;
            int i3 = this.A01;
            if (jA0F != j5 - ((long) i3)) {
                long secondSeekTimeUs = ((long) i3) + j4;
                return new CN(seekPoint, new CP(A7B(secondSeekTimeUs), secondSeekTimeUs));
            }
        }
        return new CN(seekPoint);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC1181Yq
    public final long A7B(long j2) {
        return ((Math.max(0L, j2 - this.A04) * 1000000) * 8) / ((long) this.A00);
    }

    @Override // com.facebook.ads.redexgen.X.CO
    public final boolean A7q() {
        return this.A02 != -1;
    }
}
