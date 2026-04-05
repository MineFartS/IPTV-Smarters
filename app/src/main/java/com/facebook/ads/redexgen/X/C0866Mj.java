package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0866Mj extends AbstractRunnableC0829Kx {
    public static String[] A04;
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0854Lx A02;
    public final /* synthetic */ EnumC0958Pz A03;

    static {
        A00();
    }

    public static void A00() {
        A04 = new String[]{"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    }

    public C0866Mj(C0854Lx c0854Lx, EnumC0958Pz enumC0958Pz, int i2, int i3) {
        this.A02 = c0854Lx;
        this.A03 = enumC0958Pz;
        this.A01 = i2;
        this.A00 = i3;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractRunnableC0829Kx
    public final void A07() {
        if (this.A03 == EnumC0958Pz.A07) {
            this.A02.A0J(EnumC0788Jf.A0m);
            this.A02.A0A.A0A().A30();
            this.A02.A0B.A03(C0854Lx.A0C());
            return;
        }
        if (this.A03 == EnumC0958Pz.A03) {
            this.A02.A0J(EnumC0788Jf.A0h);
            this.A02.A03 = true;
            this.A02.A0B.A03(C0854Lx.A0F);
            return;
        }
        EnumC0958Pz enumC0958Pz = this.A03;
        EnumC0958Pz enumC0958Pz2 = EnumC0958Pz.A06;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        strArr2[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        if (enumC0958Pz == enumC0958Pz2) {
            this.A02.A0J(EnumC0788Jf.A0g);
            this.A02.A0A.A0A().A2s();
            this.A02.A03 = true;
            this.A02.A07.removeCallbacksAndMessages(null);
            C9E c9e = this.A02.A0B;
            int i2 = this.A01;
            c9e.A03(new C7q(i2, i2));
            return;
        }
        if (this.A03 == EnumC0958Pz.A0A) {
            this.A02.A0J(EnumC0788Jf.A0k);
            this.A02.A0A.A0A().A37();
            this.A02.A0B.A03(C0854Lx.A0B());
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0G();
            return;
        }
        if (this.A03 == EnumC0958Pz.A05) {
            this.A02.A0J(EnumC0788Jf.A0j);
            this.A02.A0A.A0A().A2w();
            C9E c9e2 = this.A02.A0B;
            final int i3 = this.A00;
            c9e2.A03(new KR(i3) { // from class: com.facebook.ads.redexgen.X.7o
            });
            this.A02.A07.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC0958Pz.A04) {
            this.A02.A0J(EnumC0788Jf.A0i);
            this.A02.A0A.A0A().A2t();
            this.A02.A0B.A03(C0854Lx.A0J);
            this.A02.A07.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC0958Pz.A09) {
            this.A02.A0J(EnumC0788Jf.A0g);
            this.A02.A0A.A0A().A32();
            this.A02.A03 = true;
            this.A02.A07.removeCallbacksAndMessages(null);
            this.A02.A0B.A03(new C7q(this.A00, this.A01));
        }
    }
}
