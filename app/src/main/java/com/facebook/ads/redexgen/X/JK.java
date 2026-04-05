package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JK implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ JO A02;

    public JK(JO jo, int i2, long j2) {
        this.A02 = jo;
        this.A00 = i2;
        this.A01 = j2;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A02.A01.A9X(this.A00, this.A01);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
