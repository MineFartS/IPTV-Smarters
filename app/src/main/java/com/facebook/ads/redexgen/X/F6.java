package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class F6 implements Runnable {
    public final /* synthetic */ BQ A00;

    public F6(BQ bq) {
        this.A00 = bq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            if (!this.A00.A0G) {
                this.A00.A08.A9J(this.A00);
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
