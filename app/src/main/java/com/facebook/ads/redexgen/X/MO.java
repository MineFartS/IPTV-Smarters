package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MO implements View.OnClickListener {
    public final /* synthetic */ C1233aK A00;

    public MO(C1233aK c1233aK) {
        this.A00 = c1233aK;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (this.A00.A00 == null || !this.A00.A04.A03()) {
                return;
            }
            this.A00.A00.A9E();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
