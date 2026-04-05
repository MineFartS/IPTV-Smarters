package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class B0 implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ B5 A02;
    public final /* synthetic */ String A03;

    public B0(B5 b5, String str, long j2, long j3) {
        this.A02 = b5;
        this.A03 = str;
        this.A01 = j2;
        this.A00 = j3;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A02.A01.A8y(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
