package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0823Kq extends C9F<C7q> {
    public final /* synthetic */ C7r A00;

    public C0823Kq(C7r c7r) {
        this.A00 = c7r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9F
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A04(C7q c7q) {
        int iA00 = c7q.A00();
        int iA01 = c7q.A01();
        if (this.A00.A00 > 0 && iA00 == iA01 && iA01 > this.A00.A00) {
            return;
        }
        if (iA01 < iA00 + 500) {
            if (iA01 == 0) {
                C7r c7r = this.A00;
                c7r.A0e(c7r.A00);
                return;
            } else {
                this.A00.A0e(iA01);
                return;
            }
        }
        this.A00.A0e(iA00);
    }

    @Override // com.facebook.ads.redexgen.X.C9F
    public final Class<C7q> A01() {
        return C7q.class;
    }
}
