package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class YU implements ML {
    public static String[] A01;
    public final /* synthetic */ YL A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"6N", "smQA5TSxp7vjrWoIt3G8gqRI7vuv9Mo2", "nC2JCQuxt461FEwUH0osGyRmdjA", "Hvedh13CT0GkY3JhzOxajNH8XlaZQpLN", "5Odrxu44jwGQpLwu9LnTSanJ4TNopF0a", "7krTPzdKMYjdejqNC8FU3CrmbwWia7OA", "A91WiRAFiXbxe3egNbtfICOYy0", "PiGZqdHGAPhzlIXS2UC0uVxfbNyiCcLD"};
    }

    public YU(YL yl) {
        this.A00 = yl;
    }

    @Override // com.facebook.ads.redexgen.X.ML
    public final void A9E() {
        this.A00.A0T.A03(EnumC0788Jf.A07, null);
        this.A00.A0R.A0A().A2Z();
        if (!this.A00.A0V.A0A(this.A00.getContext())) {
            if (!this.A00.A0I) {
                C0854Lx c0854Lx = this.A00.A09;
                if (A01[2].length() != 27) {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[4] = "5zrYwBRwluqa1cGxPZZJZEcv5DdOFBPm";
                strArr[7] = "gq390Wd0Yu1IJshZC9Clpt7tVnhSzLar";
                if (c0854Lx != null) {
                    if (this.A00.A0f()) {
                        this.A00.A09.A0X(P9.A07);
                        return;
                    } else {
                        this.A00.A0N();
                        return;
                    }
                }
            }
            boolean z = this.A00.A0I;
            if (A01[1].charAt(8) == 'p') {
                String[] strArr2 = A01;
                strArr2[5] = "Zcc8pzIQVtObnEDs8jyH13QzYMXIQUWE";
                strArr2[5] = "Zcc8pzIQVtObnEDs8jyH13QzYMXIQUWE";
                if (!z) {
                    return;
                }
            } else if (!z) {
                return;
            }
            this.A00.A0I();
            return;
        }
        this.A00.A0S.A83(this.A00.A0P.A0Q(), new C0897Np().A04(this.A00.A0f).A03(this.A00.A0V).A06());
    }
}
