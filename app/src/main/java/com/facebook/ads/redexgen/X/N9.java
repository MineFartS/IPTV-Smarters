package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N9 implements View.OnClickListener {
    public static String[] A01;
    public final /* synthetic */ C1161Xw A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"RpRdDeRKSCMdi", "IuXxM6erDWGrR2ilBdYngNq10nVc0mkU", "Kill7HMysw6SnDOrBs", "MIbB774K8liBHgb3cyiNiqUG4b3Um782", "7YEQDQbB6rycAAMyAlOvxfyaq0dnUo7P", "y1fFSWKNdNdnYTXNNG", "pYfR2zdeniJKCCLkUpT", "pJHaP"};
    }

    public N9(C1161Xw c1161Xw) {
        this.A00 = c1161Xw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A0A.A7t();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            if (A01[5].length() == 17) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[5] = "tK5zLur";
            strArr[5] = "tK5zLur";
        }
    }
}
