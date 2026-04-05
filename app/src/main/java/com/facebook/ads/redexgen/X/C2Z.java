package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2Z, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2Z extends AbstractC05689y {
    public final int A00;
    public final int A01;
    public final I2<? super InterfaceC0740Hh> A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I2 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2Z(String str, I2<? super InterfaceC0740Hh> i2) {
        this(str, i2, 8000, 8000, false);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.I2 != com.facebook.ads.internal.exoplayer2.upstream.TransferListener<? super com.facebook.ads.internal.exoplayer2.upstream.DataSource> */
    public C2Z(String str, I2<? super InterfaceC0740Hh> i2, int i3, int i4, boolean z) {
        this.A03 = str;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
        this.A04 = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC05689y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final A0 A01(C0748Hr c0748Hr) {
        return new A0(this.A03, null, this.A02, this.A00, this.A01, this.A04, c0748Hr);
    }
}
