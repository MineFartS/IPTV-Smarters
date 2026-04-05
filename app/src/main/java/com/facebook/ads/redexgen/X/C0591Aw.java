package com.facebook.ads.redexgen.X;

import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Aw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0591Aw extends AbstractC1261am {
    public final GT A00;
    public final GT A01;

    public C0591Aw(GN gn, long j2, long j3, long j4, long j5, List<GR> list, GT gt, GT gt2) {
        super(gn, j2, j3, j4, j5, list);
        this.A00 = gt;
        this.A01 = gt2;
    }

    @Override // com.facebook.ads.redexgen.X.GS
    public final GN A01(GP gp) {
        GT gt = this.A00;
        if (gt != null) {
            return new GN(gt.A05(gp.A02.A0M, 0L, gp.A02.A04, 0L), 0L, -1L);
        }
        return super.A01(gp);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261am
    public final int A02(long j2) {
        if (((AbstractC1261am) this).A02 != null) {
            return ((AbstractC1261am) this).A02.size();
        }
        if (j2 != -9223372036854775807L) {
            return (int) J1.A0E(j2, (((AbstractC1261am) this).A00 * 1000000) / ((GS) this).A01);
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC1261am
    public final GN A05(GP gp, long time) {
        return new GN(this.A01.A05(gp.A02.A0M, time, gp.A02.A04, ((AbstractC1261am) this).A02 != null ? ((AbstractC1261am) this).A02.get((int) (time - ((AbstractC1261am) this).A01)).A01 : (time - ((AbstractC1261am) this).A01) * ((AbstractC1261am) this).A00), 0L, -1L);
    }
}
