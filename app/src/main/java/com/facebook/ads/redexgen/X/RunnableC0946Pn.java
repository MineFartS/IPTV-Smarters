package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Pn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0946Pn implements Runnable {
    public final /* synthetic */ C0949Pq A00;

    public RunnableC0946Pn(C0949Pq c0949Pq) {
        this.A00 = c0949Pq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A08();
            this.A00.A05.removeCallbacks(this);
            this.A00.A05.postDelayed(this, 250L);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
