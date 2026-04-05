package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class B4 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ B5 A01;

    public B4(B5 b5, int i2) {
        this.A01 = b5;
        this.A00 = i2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.A01.A92(this.A00);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
