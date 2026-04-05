package com.facebook.ads.redexgen.X;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JI implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ JO A02;
    public final /* synthetic */ String A03;

    public JI(JO jo, String str, long j2, long j3) {
        this.A02 = jo;
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
            this.A02.A01.ABH(this.A03, this.A01, this.A00);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
