package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UB implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ US A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"Yjf", "XOVitfQUgjced3EP4pTxR9JfCPrZNimg", "oba6yDpI8JhOkZT1tW78u2uvc0qfjLnV", "P0DudR6QiRsnBUUKuogjXBQdTc93lhW3", "bGr8mOattKCTE", "1b5SBqQWJyWOe", "v908sogRF2eWxcHJkGHFI", "Zt6OKsa3VoJXRparXiRDL2uvOYm8XqDs"};
    }

    public UB(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() throws Exception {
        String strA07 = this.A00.A03.A07(10003);
        if (strA07 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        US us = this.A00;
        if (A01[0].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "utTbKSFu34D38IEG5HgAcdNNoC6CJDRH";
        strArr[1] = "utTbKSFu34D38IEG5HgAcdNNoC6CJDRH";
        return us.A09(strA07);
    }
}
