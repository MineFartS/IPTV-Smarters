package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0859Mc implements View.OnClickListener {
    public final /* synthetic */ YW A00;

    public ViewOnClickListenerC0859Mc(YW yw) {
        this.A00 = yw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A0V(false);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
