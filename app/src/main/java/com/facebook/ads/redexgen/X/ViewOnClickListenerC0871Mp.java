package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0871Mp implements View.OnClickListener {
    public final /* synthetic */ Y5 A00;

    public ViewOnClickListenerC0871Mp(Y5 y5) {
        this.A00 = y5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A05.A9g();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
