package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PR implements View.OnClickListener {
    public final /* synthetic */ C0743Hk A00;

    public PR(C0743Hk c0743Hk) {
        this.A00 = c0743Hk;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A03.A03(EnumC0788Jf.A0Z, null);
            this.A00.A02.A0A().A33();
            if (this.A00.A00 != null) {
                if (this.A00.A08()) {
                    this.A00.A00.setVolume(1.0f);
                } else {
                    this.A00.A00.setVolume(0.0f);
                }
                this.A00.A0A();
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
