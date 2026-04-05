package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NH implements View.OnClickListener {
    public final /* synthetic */ NJ A00;

    public NH(NJ nj) {
        this.A00 = nj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A02.A7I();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
