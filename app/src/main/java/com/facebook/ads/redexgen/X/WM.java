package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WM implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ WZ A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"1jYE18OinQfv5WLTq2cVBe585KmN", "X325BmovX2W2cAXv5JjOdne9uqamI6Ku", "itArcmOQ038W2qOxTmWDysJ", "YLO301mgb0CV", "8Iuh4U1kakUbsQ2Nn", "O3ZH7jI89PddtJoXg7iV4O6wtsqjtnrU", "1x9H6MAyleaM4oP8QSazbLvKby53Pv0n", "YmZygv2VfDGVkOFuuIE9CAITaRVNY9b1"};
    }

    public WM(WZ wz) {
        this.A00 = wz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A00 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        WZ wz = this.A00;
        String simCountryIso = wz.A00.getSimCountryIso();
        String[] strArr = A01;
        if (strArr[6].charAt(3) != strArr[5].charAt(3)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[2] = "tduom2IhCerqtA7iCB";
        strArr2[2] = "tduom2IhCerqtA7iCB";
        return wz.A09(simCountryIso);
    }
}
