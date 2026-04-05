package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class A2 extends Handler {
    public final /* synthetic */ C0631Cw A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(C0631Cw c0631Cw, Looper looper) {
        super(looper);
        this.A00 = c0631Cw;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.A0B(message);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
