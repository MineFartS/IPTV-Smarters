package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class MQ implements View.OnClickListener {
    public final /* synthetic */ DialogC1236aN A00;
    public final /* synthetic */ C1233aK A01;
    public final /* synthetic */ InterfaceC0868Ml A02;

    public MQ(C1233aK c1233aK, InterfaceC0868Ml interfaceC0868Ml, DialogC1236aN dialogC1236aN) {
        this.A01 = c1233aK;
        this.A02 = interfaceC0868Ml;
        this.A00 = dialogC1236aN;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A02.A8s();
            this.A00.hide();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
