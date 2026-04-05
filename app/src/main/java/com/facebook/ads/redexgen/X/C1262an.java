package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1262an extends GS {
    public final long A00;
    public final long A01;

    public C1262an() {
        this(null, 1L, 0L, 0L, 0L);
    }

    public C1262an(GN gn, long j2, long j3, long j4, long j5) {
        super(gn, j2, j3);
        this.A01 = j4;
        this.A00 = j5;
    }

    public final GN A02() {
        long j2 = this.A00;
        if (j2 <= 0) {
            return null;
        }
        return new GN(null, this.A01, j2);
    }
}
