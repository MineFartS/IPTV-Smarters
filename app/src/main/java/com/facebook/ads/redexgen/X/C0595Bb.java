package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C0595Bb extends Thread {
    public final /* synthetic */ YJ A00;

    public C0595Bb(YJ yj) {
        this.A00 = yj;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A0N();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
