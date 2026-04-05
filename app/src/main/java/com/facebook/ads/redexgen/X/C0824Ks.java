package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ks, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0824Ks extends C9F<C05127n> {
    public final /* synthetic */ C7r A00;

    public C0824Ks(C7r c7r) {
        this.A00 = c7r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9F
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A04(C05127n c05127n) {
        int iA00 = c05127n.A00();
        if (this.A00.A00 > 0 && iA00 == this.A00.A0B.getDuration() && this.A00.A0B.getDuration() > this.A00.A00) {
            return;
        }
        this.A00.A0d(iA00);
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    public final Class<C05127n> A01() {
        return C05127n.class;
    }
}
