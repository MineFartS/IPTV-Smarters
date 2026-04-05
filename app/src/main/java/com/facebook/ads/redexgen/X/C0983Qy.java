package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0983Qy implements LO {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC0829Kx A01;
    public final /* synthetic */ AbstractC0980Qv A02;

    public C0983Qy(AbstractC0980Qv abstractC0980Qv, int i2, AbstractRunnableC0829Kx abstractRunnableC0829Kx) {
        this.A02 = abstractC0980Qv;
        this.A00 = i2;
        this.A01 = abstractRunnableC0829Kx;
    }

    @Override // com.facebook.ads.redexgen.X.LO
    public final void A9H() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.X.LO
    public final void AAe(float f2) {
        this.A02.A07.setProgress(100.0f * (1.0f - (f2 / this.A00)));
    }
}
