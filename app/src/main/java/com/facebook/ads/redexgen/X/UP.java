package com.facebook.ads.redexgen.X;

import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class UP implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ US A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"9CH7FUr60fjSOu0uDtam6QWrW1LAXcO0", "MGZ5NGAJYsXrcQ530Rpa4mq072uYsiXm", "FSEpTqAJrXrPXD8Cb", "YDmM9nsCETgUfJB46tzDOSpydcNxEQ3F", "VGv8Kw1xSq2totQkDwmbaDQvoJVXTwia", "PqLjk4LqC3tC9ytXEM059nB67sHSnsxP", "xjbenFCMrkBs7EfKqhSnYCZ0lRG62qii", "xgMaaa53aLKiV09tKVXK6rj7dvlbsjte"};
    }

    public UP(US us) {
        this.A00 = us;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 24) {
            US us = this.A00;
            EnumC04916o enumC04916o = EnumC04916o.A05;
            String[] strArr = A01;
            if (strArr[4].charAt(20) == strArr[5].charAt(20)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "fnZh3TS8JAEKtifjP4n7RBztgRvZoar8";
            strArr2[2] = "4XQjD71oxr9tiB6pv";
            return us.A08(enumC04916o);
        }
        if (this.A00.A01 == null) {
            return this.A00.A08(EnumC04916o.A07);
        }
        US us2 = this.A00;
        return us2.A09(us2.A01.deviceProtectedDataDir);
    }
}
