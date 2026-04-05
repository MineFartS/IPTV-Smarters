package com.facebook.ads.redexgen.X;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class RunnableC0600Bi implements Runnable {
    public final /* synthetic */ C0604Bm A00;
    public final /* synthetic */ InterfaceC0605Bn A01;
    public final /* synthetic */ Exception A02;

    public RunnableC0600Bi(C0604Bm c0604Bm, InterfaceC0605Bn interfaceC0605Bn, Exception exc) {
        this.A00 = c0604Bm;
        this.A01 = interfaceC0605Bn;
        this.A02 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.A9W(this.A02);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
