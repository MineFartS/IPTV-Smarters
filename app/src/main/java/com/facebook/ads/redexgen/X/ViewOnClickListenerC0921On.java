package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.On, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0921On implements View.OnClickListener {
    public final /* synthetic */ C0922Oo A00;

    public ViewOnClickListenerC0921On(C0922Oo c0922Oo) {
        this.A00 = c0922Oo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A04.performClick();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
