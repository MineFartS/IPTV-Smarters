package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NO implements View.OnClickListener {
    public final /* synthetic */ C1154Xp A00;

    public NO(C1154Xp c1154Xp) {
        this.A00 = c1154Xp;
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
