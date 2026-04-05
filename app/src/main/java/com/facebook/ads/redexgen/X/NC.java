package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NC implements View.OnClickListener {
    public static String[] A02;
    public final /* synthetic */ N5 A00;
    public final /* synthetic */ C1157Xs A01;

    static {
        A00();
    }

    public static void A00() {
        A02 = new String[]{"Oq", "EvGClE7if1wWI664DgGuGJMVxIj5MmF8", "WEj5b", "ZnP49bXAxkKFgNqp8", "Y2wBPaH57L9Gttlp", "AMrJJ9So27w7KiYttAq3AFMsZzT3RVfH", "8te6O8WI5P7ERWBX", "5xXH0hCktOzz8vKUWRcLVJoUpm5lTBxe"};
    }

    public NC(C1157Xs c1157Xs, N5 n5) {
        this.A01 = c1157Xs;
        this.A00 = n5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0A.AAE(AnonymousClass24.A05);
        } catch (Throwable th) {
            if (A02[5].charAt(20) == 'D') {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[2] = "snOHg";
            strArr[2] = "snOHg";
            C0822Kp.A00(th, this);
        }
    }
}
