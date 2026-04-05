package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7X, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C7X extends IX {
    public final /* synthetic */ C0745Hn A00;

    public C7X(C0745Hn c0745Hn) {
        this.A00 = c0745Hn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9F
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A04(C0757Ia c0757Ia) {
        if (this.A00.A01 == null || c0757Ia.A00().getAction() != 0) {
            return;
        }
        this.A00.A04.removeCallbacksAndMessages(null);
        this.A00.A08(new PN(this));
    }
}
