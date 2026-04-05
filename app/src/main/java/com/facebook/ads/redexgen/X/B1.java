package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class B1 implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ B5 A01;

    public B1(B5 b5, Format format) {
        this.A01 = b5;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.A01.A91(this.A00);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
