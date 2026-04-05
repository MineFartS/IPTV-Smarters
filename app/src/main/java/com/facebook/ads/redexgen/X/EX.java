package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class EX implements Runnable {
    public final /* synthetic */ RunnableC0659Ea A00;

    public EX(RunnableC0659Ea runnableC0659Ea) {
        this.A00 = runnableC0659Ea;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A0G(5, 3);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
