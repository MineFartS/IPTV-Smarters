package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C05087i extends IX {
    public final /* synthetic */ I3 A00;

    public C05087i(I3 i3) {
        this.A00 = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9F
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A04(C0757Ia c0757Ia) {
        if (this.A00.A01 == null || this.A00.A03 || c0757Ia.A00().getAction() != 0) {
            return;
        }
        this.A00.A05.removeCallbacksAndMessages(null);
        if (this.A00.A0E(PY.A05)) {
            this.A00.A03();
            this.A00.A07(true, false);
        }
        if (this.A00.A02) {
            this.A00.A05.postDelayed(new I7(this), this.A00.A00);
        }
    }
}
