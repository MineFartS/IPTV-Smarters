package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ND implements View.OnClickListener {
    public final /* synthetic */ N5 A00;
    public final /* synthetic */ C1157Xs A01;

    public ND(C1157Xs c1157Xs, N5 n5) {
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
            this.A01.A0A.A7t();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
