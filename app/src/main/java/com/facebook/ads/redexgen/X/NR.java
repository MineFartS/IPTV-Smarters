package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NR implements View.OnClickListener {
    public final /* synthetic */ NU A00;

    public NR(NU nu) {
        this.A00 = nu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (this.A00.A02 == null) {
                return;
            }
            this.A00.A02.A9E();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
