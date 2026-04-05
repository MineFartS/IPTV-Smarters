package com.facebook.ads.redexgen.X;

import android.view.View;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class NI implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass26 A00;
    public final /* synthetic */ N5 A01;
    public final /* synthetic */ NJ A02;

    public NI(NJ nj, N5 n5, AnonymousClass26 anonymousClass26) {
        this.A02 = nj;
        this.A01 = n5;
        this.A00 = anonymousClass26;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A02.AAM(this.A00);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
