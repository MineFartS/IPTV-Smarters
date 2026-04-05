package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0865Mi extends AbstractRunnableC0829Kx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0854Lx A02;

    public C0865Mi(C0854Lx c0854Lx, int i2, int i3) {
        this.A02 = c0854Lx;
        this.A00 = i2;
        this.A01 = i3;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        this.A02.A0B.A03(new C0774Ir(this.A00, this.A01));
    }
}
