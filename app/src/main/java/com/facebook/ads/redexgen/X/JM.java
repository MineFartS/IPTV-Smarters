package com.facebook.ads.redexgen.X;

import android.view.Surface;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JM implements Runnable {
    public final /* synthetic */ Surface A00;
    public final /* synthetic */ JO A01;

    public JM(JO jo, Surface surface) {
        this.A01 = jo;
        this.A00 = surface;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.A01.AAm(this.A00);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
