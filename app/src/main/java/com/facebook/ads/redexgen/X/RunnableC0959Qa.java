package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0959Qa implements Runnable {
    public final /* synthetic */ C0960Qb A00;

    public RunnableC0959Qa(C0960Qb c0960Qb) {
        this.A00 = c0960Qb;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
