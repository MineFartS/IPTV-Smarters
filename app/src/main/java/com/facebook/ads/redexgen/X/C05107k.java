package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C05107k extends KE {
    public final /* synthetic */ I3 A00;

    public C05107k(I3 i3) {
        this.A00 = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C9F
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A04(KJ kj) {
        if (!this.A00.A03 || !this.A00.A02) {
            return;
        }
        this.A00.A03 = false;
        if (!this.A00.A0E(PY.A04) && !this.A00.A04) {
            if (!this.A00.A0E(PY.A03)) {
                return;
            }
            this.A00.A03();
            this.A00.A07(true, true);
            return;
        }
        this.A00.A04 = false;
        this.A00.A05.postDelayed(new I9(this), this.A00.A00);
    }
}
