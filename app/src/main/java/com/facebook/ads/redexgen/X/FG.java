package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FG implements Runnable {
    public final /* synthetic */ FO A00;
    public final /* synthetic */ FP A01;
    public final /* synthetic */ FQ A02;
    public final /* synthetic */ FR A03;

    public FG(FO fo, FR fr, FP fp, FQ fq) {
        this.A00 = fo;
        this.A03 = fr;
        this.A01 = fp;
        this.A02 = fq;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A03.AA7(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
