package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NN implements View.OnClickListener {
    public static String[] A02;
    public final /* synthetic */ N5 A00;
    public final /* synthetic */ C1154Xp A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"9sVCZE1JzKyNlgcXamStOEuF7vpp11q7", "2ezkH3kSqCf8dvr0XQnySHd1TgVVvlpb", "j6uQAgvGWfRMr40VSzlVsWkcoISldlVB", "dNEMzbO6BFzdIEcJ0MNYA8UShcXW2fNX", "CiFQ7cnsU8a2IY039", "of093nELJxDtvmpwlx40Sj96vTqfYWfZ", "89mnR6KKQKsitukE0pK0FSEAWYYgI9MC", "iqJuIXwOIBXLoaWKOF5L6veUHjclhPcL"};
    }

    public NN(C1154Xp c1154Xp, N5 n5) {
        this.A01 = c1154Xp;
        this.A00 = n5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0A.A7t();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            String[] strArr = A02;
            if (strArr[7].charAt(23) == strArr[1].charAt(23)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "erh4HILEwUj6GeiKdMF57q4cd8pDAg7o";
            strArr2[3] = "erh4HILEwUj6GeiKdMF57q4cd8pDAg7o";
        }
    }
}
