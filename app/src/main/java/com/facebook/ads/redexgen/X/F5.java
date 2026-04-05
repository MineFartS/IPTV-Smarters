package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F5 implements Runnable {
    public final /* synthetic */ BQ A00;

    public F5(BQ bq) {
        this.A00 = bq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A09();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
