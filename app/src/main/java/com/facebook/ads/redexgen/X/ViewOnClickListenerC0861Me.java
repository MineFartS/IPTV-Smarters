package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Me, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0861Me implements View.OnClickListener {
    public final /* synthetic */ C0857Ma A00;
    public final /* synthetic */ YL A01;

    public ViewOnClickListenerC0861Me(YL yl, C0857Ma c0857Ma) {
        this.A01 = yl;
        this.A00 = c0857Ma;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            View v = this.A00;
            C0856Lz.A0M(v);
            View v2 = this.A01.A0N;
            C0856Lz.A0O(v2);
            View v3 = this.A01.A04;
            C0856Lz.A0O(v3);
            View v4 = this.A01.A09;
            if (v4 == null) {
                return;
            }
            this.A01.A09.A0Y(PD.A03, 15);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
