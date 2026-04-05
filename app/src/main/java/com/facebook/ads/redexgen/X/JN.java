package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JN implements Runnable {
    public final /* synthetic */ BZ A00;
    public final /* synthetic */ JO A01;

    public JN(JO jo, BZ bz) {
        this.A01 = jo;
        this.A00 = bz;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A00();
            this.A01.A01.ABI(this.A00);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
