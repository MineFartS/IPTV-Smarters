package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0862Mf implements View.OnClickListener {
    public final /* synthetic */ C0857Ma A00;
    public final /* synthetic */ YL A01;

    public ViewOnClickListenerC0862Mf(YL yl, C0857Ma c0857Ma) {
        this.A01 = yl;
        this.A00 = c0857Ma;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            C0856Lz.A0M(this.A00);
            C0856Lz.A0O(this.A01.A0N);
            C0856Lz.A0O(this.A01.A04);
            this.A01.A0L();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
