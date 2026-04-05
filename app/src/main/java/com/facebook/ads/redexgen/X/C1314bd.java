package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1314bd implements InterfaceC0739Hg {
    public final int A00;
    public final InterfaceC0737He A01;
    public final InterfaceC0739Hg A02;
    public final InterfaceC0739Hg A03;
    public final I6 A04;
    public final I8 A05;

    public C1314bd(I6 i6, InterfaceC0739Hg interfaceC0739Hg, InterfaceC0739Hg interfaceC0739Hg2, InterfaceC0737He interfaceC0737He, int i2, I8 i8) {
        this.A04 = i6;
        this.A03 = interfaceC0739Hg;
        this.A02 = interfaceC0739Hg2;
        this.A01 = interfaceC0737He;
        this.A00 = i2;
        this.A05 = i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0739Hg
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C1313bc A4E() {
        I6 i6 = this.A04;
        InterfaceC0740Hh interfaceC0740HhA4E = this.A03.A4E();
        InterfaceC0740Hh interfaceC0740HhA4E2 = this.A02.A4E();
        InterfaceC0737He interfaceC0737He = this.A01;
        return new C1313bc(i6, interfaceC0740HhA4E, interfaceC0740HhA4E2, interfaceC0737He != null ? interfaceC0737He.createDataSink() : null, this.A00, this.A05);
    }
}
