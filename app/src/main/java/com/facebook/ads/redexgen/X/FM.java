package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FM implements Runnable {
    public final /* synthetic */ FO A00;
    public final /* synthetic */ FQ A01;
    public final /* synthetic */ FR A02;

    public FM(FO fo, FR fr, FQ fq) {
        this.A00 = fo;
        this.A02 = fr;
        this.A01 = fq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A02.A9S(this.A00.A00, this.A00.A01, this.A01);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
