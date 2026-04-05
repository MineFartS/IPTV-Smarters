package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0879Mx implements View.OnClickListener {
    public final /* synthetic */ N0 A00;

    public ViewOnClickListenerC0879Mx(N0 n0) {
        this.A00 = n0;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (this.A00.A04) {
                this.A00.A03.A42();
            } else {
                this.A00.A03.A43();
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
