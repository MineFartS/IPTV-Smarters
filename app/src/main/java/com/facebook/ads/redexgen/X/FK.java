package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class FK implements Runnable {
    public final /* synthetic */ FO A00;
    public final /* synthetic */ FR A01;

    public FK(FO fo, FR fr) {
        this.A00 = fo;
        this.A01 = fr;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.AAj(this.A00.A00, this.A00.A01);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
