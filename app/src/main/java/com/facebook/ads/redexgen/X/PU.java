package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PU implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass76 A00;

    public PU(AnonymousClass76 anonymousClass76) {
        this.A00 = anonymousClass76;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            View v = this.A00.getVideoView();
            if (v != null) {
                if (this.A00.A02 != null) {
                    this.A00.A02.A03(EnumC0788Jf.A0l, null);
                }
                this.A00.A01.A0A().A2x();
                int i2 = PV.A00[this.A00.getVideoView().getState().ordinal()];
                if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 4) {
                    this.A00.getVideoView().A0Y(PD.A05, 12);
                } else if (i2 == 5) {
                    this.A00.getVideoView().A0b(true, 8);
                }
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
