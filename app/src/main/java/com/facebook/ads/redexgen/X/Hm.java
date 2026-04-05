package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class Hm implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C1290bF A03;

    public Hm(C1290bF c1290bF, int i2, long j2, long j3) {
        this.A03 = c1290bF;
        this.A00 = i2;
        this.A02 = j2;
        this.A01 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A03.A07.A94(this.A00, this.A02, this.A01);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
