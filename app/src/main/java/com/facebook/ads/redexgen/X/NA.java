package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NA implements View.OnClickListener {
    public final /* synthetic */ C1157Xs A00;

    public NA(C1157Xs c1157Xs) {
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
            C0822Kp.A00(th, this);
        }
    }
}
