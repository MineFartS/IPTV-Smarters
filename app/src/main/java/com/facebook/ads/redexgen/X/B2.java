package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class B2 implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ B5 A03;

    public B2(B5 b5, int i2, long j2, long j3) {
        this.A03 = b5;
        this.A00 = i2;
        this.A01 = j2;
        this.A02 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A03.A01.A93(this.A00, this.A01, this.A02);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
