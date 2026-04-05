package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Vn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1100Vn implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ W5 A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"Kjl9x1nXLMp", "FYT6FJfE388FncoeBbUW5LDH7Ti6Kpnc", "Yxd2XW5tX0tpbE5v80iFGWNMQ7F", "Eun4caaboMQouomEKTkKbMJy1uWMR8C3", "2B", "gVUv49X3C1I0CRHiCQrxfKc2j3pZm33W", "VtV7HGxoJcmYVE0XtMWfAnTQdxbbthfO", "Muv0aFmfDz7QlEQw1d"};
    }

    public C1100Vn(W5 w5) {
        this.A00 = w5;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A05 == null) {
            W5 w5 = this.A00;
            String[] strArr = A01;
            if (strArr[7].length() == strArr[4].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "czOc910r7ol";
            strArr2[2] = "WgsI1fVM7Yu7d9q7aeaJmksjNii";
            return w5.A08(EnumC04916o.A07);
        }
        W5 w52 = this.A00;
        return w52.A05(w52.A05.length);
    }
}
