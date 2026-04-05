package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0599Bh implements Runnable {
    public final /* synthetic */ C0604Bm A00;
    public final /* synthetic */ InterfaceC0605Bn A01;

    public RunnableC0599Bh(C0604Bm c0604Bm, InterfaceC0605Bn interfaceC0605Bn) {
        this.A00 = c0604Bm;
        this.A01 = interfaceC0605Bn;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.A9T();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
