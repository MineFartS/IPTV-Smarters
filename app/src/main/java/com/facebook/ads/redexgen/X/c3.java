package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class c3 extends Q1 {
    public static String[] A01;
    public final /* synthetic */ C1339c5 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"17VeHKqvAV3iPquTRFV5nkfekqPAOX2Y", "lAWAATHLIf1ZCLkldXz2HdhVco5hUmDN", "zF5", "DmLMY21jiUoRuKlWConaRVpMyfqBnv90", "gnaW18bfkM8k", "Xsqe1WvhzdEOHDRdZu2mXr6vcctMp9sP", "yZ63PHoRBoKgX7qS3XV5e7w7nB", "vlnJSN6CnOAejO47j4gW78Wzdr557VH0"};
    }

    public c3(C1339c5 c1339c5) {
        this.A00 = c1339c5;
    }

    @Override // com.facebook.ads.redexgen.X.Q1
    public final void A02() {
        if (this.A00.A04 == null) {
            return;
        }
        this.A00.A04.A0T();
    }

    @Override // com.facebook.ads.redexgen.X.Q1
    public final void A04() {
        if (this.A00.A04 == null) {
            return;
        }
        if (!this.A00.A0B && (this.A00.A0A || this.A00.A0L())) {
            C1339c5 c1339c5 = this.A00;
            PD pd = PD.A03;
            if (A01[5].charAt(14) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "6AVoG9MmguoU1vvLobA8P3uXYnnJUDvb";
            strArr[3] = "6AVoG9MmguoU1vvLobA8P3uXYnnJUDvb";
            c1339c5.A0K(pd);
        }
        this.A00.A0A = false;
        this.A00.A0B = false;
    }
}
