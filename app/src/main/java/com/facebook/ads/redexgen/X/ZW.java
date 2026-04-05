package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ZW implements DT {
    public final C0767Ik A00 = new C0767Ik(new byte[4]);
    public final /* synthetic */ ZY A01;

    public ZW(ZY zy) {
        this.A01 = zy;
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final void A48(C0768Il c0768Il) {
        if (c0768Il.A0F() != 0) {
            return;
        }
        c0768Il.A0a(7);
        int iA05 = c0768Il.A05() / 4;
        for (int i2 = 0; i2 < iA05; i2++) {
            c0768Il.A0b(this.A00, 4);
            int iA052 = this.A00.A05(16);
            this.A00.A09(3);
            if (iA052 == 0) {
                this.A00.A09(13);
            } else {
                int iA053 = this.A00.A05(13);
                this.A01.A06.put(iA053, new ZT(new ZX(this.A01, iA053)));
                ZY.A01(this.A01);
            }
        }
        if (this.A01.A05 == 2) {
            return;
        }
        this.A01.A06.remove(0);
    }

    @Override // com.facebook.ads.redexgen.X.DT
    public final void A7X(C0780Ix c0780Ix, CH ch, DZ dz) {
    }
}
