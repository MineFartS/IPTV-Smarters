package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RunnableC0753Hw implements Runnable {
    public final InterfaceC0752Hv A00;

    public RunnableC0753Hw(InterfaceC0752Hv interfaceC0752Hv) {
        this.A00 = interfaceC0752Hv;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.AA8();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
