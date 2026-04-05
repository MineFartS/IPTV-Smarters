package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0888Ng implements Runnable {
    public final /* synthetic */ C0889Nh A00;
    public final /* synthetic */ InterfaceC0890Ni A01;

    public RunnableC0888Ng(C0889Nh c0889Nh, InterfaceC0890Ni interfaceC0890Ni) {
        this.A00 = c0889Nh;
        this.A01 = interfaceC0890Ni;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.A8x();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
