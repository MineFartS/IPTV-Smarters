package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NL implements View.OnClickListener {
    public static String[] A02;
    public final /* synthetic */ N5 A00;
    public final /* synthetic */ C1154Xp A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"0jbDV4SqpRnuIwDLdLhaSwFsy", "4CrQo2YdoWcqlYT3QJHt1izZuISw0o1a", "L1hOW0A7sRjLAVrGrG7yuKVrDUUFxwrZ", "r8z", "jBR", "EADx", "Dw2r3KoKizw7HI548vOXrftmgV6TcaYT", "JzZVJSkZeh7kJVI6l2oDTz"};
    }

    public NL(C1154Xp c1154Xp, N5 n5) {
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
            this.A01.A0A.AAE(AnonymousClass24.A03);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
            if (A02[7].length() == 1) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[4] = "wzs";
            strArr[0] = "95EfxSbyIArn9raLN6CoppC7A";
        }
    }
}
