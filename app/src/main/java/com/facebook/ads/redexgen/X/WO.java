package com.facebook.ads.redexgen.X;

import android.annotation.SuppressLint;
import android.os.Build;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class WO implements InterfaceC04806d {
    public static String[] A01;
    public final /* synthetic */ WZ A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"Zr9pMbCXDOnIQia1rxNbs", "xgHdKmUla89dgoNlEUmYBSdthljERTVN", "t0eJ9CzsilrQTJZ3mBY5uHdLOToWpPD0", "xn7Df6Bsn6N8b", "nuXOesuXOGqaff6jWjDzzwB48Mr7m9Ru", "HD4PNhpjIErL9f7FhF1L2XB0w8jmfy8z", "GFJMAbd7JtPv78Iw3eZ5GKABpr6j7C", "a6D5eDw1EZzTAa7WvhZLV0FGc6KUpGTS"};
    }

    public WO(WZ wz) {
        this.A00 = wz;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC04806d
    @SuppressLint({"MissingPermission"})
    public final AbstractC04956s A51() {
        if (Build.VERSION.SDK_INT < 17) {
            return this.A00.A08(EnumC04916o.A05);
        }
        boolean zA0E = AnonymousClass71.A0E();
        if (A01[2].charAt(7) != 's') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[4] = "7cAAgCcjwnswSonydGODzEoLsKghCJb5";
        strArr[4] = "7cAAgCcjwnswSonydGODzEoLsKghCJb5";
        if (zA0E) {
            boolean zA0D = AnonymousClass71.A0D();
            if (A01[1].charAt(23) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "A1O8dvsw8NjieGbBncMIJ1M47KAaXmaM";
            strArr2[7] = "A1O8dvsw8NjieGbBncMIJ1M47KAaXmaM";
            if (zA0D) {
                return this.A00.A08(EnumC04916o.A07);
            }
        }
        if (this.A00.A00 != null) {
            WZ wz = this.A00;
            return wz.A05(WZ.A01(wz.A00.getAllCellInfo().get(0)));
        }
        WZ wz2 = this.A00;
        EnumC04916o enumC04916o = EnumC04916o.A07;
        String[] strArr3 = A01;
        if (strArr3[3].length() == strArr3[6].length()) {
            return wz2.A08(enumC04916o);
        }
        String[] strArr4 = A01;
        strArr4[3] = "coCM9MFponCPc";
        strArr4[6] = "NV1iD8UH9ErBba9OnjbAeyrfSpL8qw";
        return wz2.A08(enumC04916o);
    }
}
