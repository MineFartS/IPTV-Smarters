package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class OE implements View.OnClickListener {
    public final /* synthetic */ C9V A00;

    public OE(C9V c9v) {
        this.A00 = c9v;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A07 = false;
            if (this.A00.A04 != null) {
                C0856Lz.A0O(this.A00.A04);
            }
            C0856Lz.A0Q(this.A00.A0A, 0);
            C0856Lz.A0Q(this.A00.A0B, 0);
            C0856Lz.A0Q(this.A00.getAdDetailsView(), 0);
            C0856Lz.A0M(this.A00.A08);
            this.A00.A0A.A0Y(PD.A03, 14);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
