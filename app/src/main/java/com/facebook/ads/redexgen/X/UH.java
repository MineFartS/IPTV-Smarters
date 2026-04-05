package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UH implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ US A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"xoHvVsjIwv7W5ClpzJbisJEpOcq", "SYDRmpizq5sDZ4GfL4h8WluGMHdmoTuM", "DVzF2PeQv7hgrICuH3nyQdrZNKSxdA", "4lIziXMzxgphshR2rAqW9SlDjwpMcvxS", "Bksnruu9CDcd9v5jIjvraWrOMG1PGOq1", "vT5fBH5lG6OjAtE20tf2f7rqol7xKp1H", "b74VzSGUDjeF5gq780pkK2xwxVTOFG7b", "77MleEyOR9uHuiszCvhjWPNRz4PKDadz"};
    }

    public UH(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        String strA0f = this.A00.A02.A0f();
        if (strA0f == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        US us = this.A00;
        if (A01[7].charAt(13) != 'i') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[2] = "f9T5AhYAPA98oVvlWKPWGyhu6RS3SO";
        strArr[0] = "b7yxm3cRAk17Eqj8H4F2BjoUql6";
        return us.A09(strA0f);
    }
}
