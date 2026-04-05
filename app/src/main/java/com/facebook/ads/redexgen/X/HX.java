package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class HX {
    public final int A00;
    public final HU A01;
    public final Object A02;
    public final AY[] A03;

    public HX(AY[] ayArr, HT[] htArr, Object obj) {
        this.A03 = ayArr;
        this.A01 = new HU(htArr);
        this.A02 = obj;
        this.A00 = ayArr.length;
    }

    public final boolean A00(int i2) {
        return this.A03[i2] != null;
    }

    public final boolean A01(HX hx) {
        if (hx == null || hx.A01.A01 != this.A01.A01) {
            return false;
        }
        for (int i2 = 0; i2 < this.A01.A01; i2++) {
            if (!A02(hx, i2)) {
                return false;
            }
        }
        return true;
    }

    public final boolean A02(HX hx, int i2) {
        return hx != null && J1.A0k(this.A03[i2], hx.A03[i2]) && J1.A0k(this.A01.A01(i2), hx.A01.A01(i2));
    }
}
