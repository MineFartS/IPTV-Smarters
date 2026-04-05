package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class N6 implements View.OnClickListener {
    public final /* synthetic */ C1161Xw A00;

    public N6(C1161Xw c1161Xw) {
        this.A00 = c1161Xw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A0A.A43();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
