package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class B3 implements Runnable {
    public final /* synthetic */ B5 A00;
    public final /* synthetic */ BZ A01;

    public B3(B5 b5, BZ bz) {
        this.A00 = b5;
        this.A01 = bz;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.A00();
            this.A00.A01.A8z(this.A01);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
