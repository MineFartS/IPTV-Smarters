package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1197Zg implements LO {
    public static String[] A01;
    public final /* synthetic */ YW A00;

    public static void A00() {
        A01 = new String[]{"XQ6pDaA1rZEM", "XoeGOYiSv0w2M1U1qXC2kK0WxpTFbq6C", "goNPtYs5sZFfNSJyOgs171oDuCl7t69H", "IBRmsKraW8ihcuaNuynFKjmRlH", "udOMyB", "k9bLdXox5SSCuqwZoRmzAy5kJm", "rLCACxpviKCtWgunDsmekf59Ef0kXw8R", "IiDilnQTvcIperbA6lCpmy3utrrmGEhT"};
    }

    static {
        A00();
    }

    public C1197Zg(YW yw) {
        this.A00 = yw;
    }

    public /* synthetic */ C1197Zg(YW yw, C1207Zt c1207Zt) {
        this(yw);
    }

    @Override // com.facebook.ads.redexgen.X.LO
    public final void A9H() {
        this.A00.A0H();
        if (this.A00.A0N && this.A00.A0W()) {
            this.A00.A0P.setToolbarActionMode(1);
        } else {
            this.A00.A0P.setToolbarActionMode(0);
        }
        boolean z = this.A00.A0O;
        if (A01[4].length() != 6) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "RNuzR8";
        strArr[4] = "RNuzR8";
        if (!z) {
            C0856Lz.A0Y(this.A00, 500);
            if (this.A00.A05 != null) {
                C0856Lz.A0Q(this.A00.A05, 0);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.LO
    public final void AAe(float f2) {
        this.A00.A0P.setProgress(100.0f * (1.0f - (f2 / this.A00.A0A.A08())));
        this.A00.A0O((int) f2);
    }
}
