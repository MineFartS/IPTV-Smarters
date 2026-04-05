package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NE implements View.OnClickListener {
    public static String[] A01;
    public final /* synthetic */ C1157Xs A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"KnJgliGO", "VwHKKtvbMk7FPKbBmIqapgeuC2T6fwds", "wENtEeepoPFkxQkEwI5qJp4A5OxzxToD", "COqx4q9kDUbjFrhSKPpHQyyB6JO5bBDL", "v63", "lzTgDb46XsVjhse8XoOOStoy8Mg7tCsc", "1yL2I4AIQTHR8fVHiYQ7c9e8uwPzvL3", "TX4RO1m5K"};
    }

    public NE(C1157Xs c1157Xs) {
        this.A00 = c1157Xs;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A0A.A7I();
        } catch (Throwable th) {
            String[] strArr = A01;
            if (strArr[3].charAt(11) != strArr[5].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "zPAJp5EfhF2KrfBUqv";
            strArr2[0] = "zPAJp5EfhF2KrfBUqv";
            C0822Kp.A00(th, this);
        }
    }
}
