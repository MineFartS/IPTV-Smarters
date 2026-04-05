package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class ES implements Runnable {
    public final /* synthetic */ ConditionVariable A00;

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A00.open();
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
