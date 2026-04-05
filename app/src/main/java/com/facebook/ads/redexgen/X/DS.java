package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DS {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final DL A05;
    public final C0767Ik A06 = new C0767Ik(new byte[64]);
    public final C0780Ix A07;

    public DS(DL dl, C0780Ix c0780Ix) {
        this.A05 = dl;
        this.A07 = c0780Ix;
    }

    private void A00() {
        this.A06.A09(8);
        this.A03 = this.A06.A0G();
        this.A02 = this.A06.A0G();
        this.A06.A09(6);
        this.A00 = this.A06.A05(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A09(4);
            long jA05 = ((long) this.A06.A05(3)) << 30;
            this.A06.A09(1);
            long jA052 = jA05 | ((long) (this.A06.A05(15) << 15));
            this.A06.A09(1);
            long jA053 = jA052 | ((long) this.A06.A05(15));
            this.A06.A09(1);
            if (!this.A04 && this.A02) {
                this.A06.A09(4);
                long jA054 = ((long) this.A06.A05(3)) << 30;
                this.A06.A09(1);
                long jA055 = jA054 | ((long) (this.A06.A05(15) << 15));
                this.A06.A09(1);
                long jA056 = jA055 | ((long) this.A06.A05(15));
                this.A06.A09(1);
                this.A07.A08(jA056);
                this.A04 = true;
            }
            long pts = this.A07.A08(jA053);
            this.A01 = pts;
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.ACl();
    }

    public final void A03(C0768Il c0768Il) throws AI {
        c0768Il.A0d(this.A06.A00, 0, 3);
        this.A06.A08(0);
        A00();
        c0768Il.A0d(this.A06.A00, 0, this.A00);
        this.A06.A08(0);
        A01();
        this.A05.ABY(this.A01, true);
        this.A05.A48(c0768Il);
        this.A05.ABX();
    }
}
