package com.facebook.ads.redexgen.X;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class IJ extends Thread {
    public final /* synthetic */ ConditionVariable A00;
    public final /* synthetic */ C1318bh A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IJ(C1318bh c1318bh, String str, ConditionVariable conditionVariable) {
        super(str);
        this.A01 = c1318bh;
        this.A00 = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            synchronized (this.A01) {
                try {
                    this.A00.open();
                    this.A01.A04();
                } finally {
                    th = th;
                    while (true) {
                        try {
                        } catch (Throwable th) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            C0822Kp.A00(th2, this);
        }
    }
}
