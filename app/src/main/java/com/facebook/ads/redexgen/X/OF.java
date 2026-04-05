package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OF implements View.OnClickListener {
    public static String[] A01;
    public final /* synthetic */ C9V A00;

    static {
        A00();
    }

    public static void A00() {
        A01 = new String[]{"c2PEJ6DOqpui9EPvmckbHNLd48C", "0LubsyKGJKKePfKATMceGef14XY86Ri5", "M6oVByKNfKe8LZIrCewzhyGONHgeYcNo", "g1oo9eCM7RcmOvTxZ1VejNMrbdbCR0G4", "3al8rHdAj04D", "Lmo63BJo3ocNRJpk0", "u0Zxd4kfnWeayuGPbNnNq6ZbpiAglx3D", "JRUzdnx3lrNIQCskW6e2Avl8V"};
    }

    public OF(C9V c9v) {
        this.A00 = c9v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = false;
            this.A00.A0C();
        } catch (Throwable th) {
            if (A01[3].charAt(5) != 'e') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "oQ6hKoRa6K50vxrlE5lU8mLQHveYoJVv";
            strArr[1] = "5HqmMGmqvKeUZ55y8iy1lLJbe1y4dd8I";
            C0822Kp.A00(th, this);
        }
    }
}
