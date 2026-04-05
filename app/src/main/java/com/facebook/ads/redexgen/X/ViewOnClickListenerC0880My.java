package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.My, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0880My implements View.OnClickListener {
    public final /* synthetic */ N0 A00;

    public ViewOnClickListenerC0880My(N0 n0) {
        this.A00 = n0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A03.A7s();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
