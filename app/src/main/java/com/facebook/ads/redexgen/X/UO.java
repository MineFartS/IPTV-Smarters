package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UO implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ US A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"b1sQJ", "SIF58uGHe7qyLmHU2z0R0", "OwOBv3ZEKz2Te88ibAl3d47J53q2OGoK", "esWFBpscKVup9jNI8XCXNCETTdpqRq5Z", "zivB8", "FBi4O7QrEsFNvdqkgZ6MOGJI", "H45EAoAIvQ1szMaGMHC8haArjN6", "w12X6M1S0qfh4A3JJ2wkr2WlTLMqdjE1"};
    }

    public UO(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (this.A00.A01 == null) {
            US us = this.A00;
            String[] strArr = A01;
            if (strArr[4].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "DiCvH";
            strArr2[0] = "OWYZT";
            return us.A08(EnumC04916o.A07);
        }
        US us2 = this.A00;
        return us2.A09(us2.A01.publicSourceDir);
    }
}
