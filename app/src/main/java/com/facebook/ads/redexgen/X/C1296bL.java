package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1296bL implements InterfaceC0739Hg {
    public final I2<? super C1295bK> A00;

    public C1296bL() {
        this(null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I2 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.FileDataSource> */
    public C1296bL(I2<? super C1295bK> i2) {
        this.A00 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0739Hg
    public final InterfaceC0740Hh A4E() {
        return new C1295bK(this.A00);
    }
}
