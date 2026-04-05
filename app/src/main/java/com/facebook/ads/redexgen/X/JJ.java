package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.Format;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class JJ implements Runnable {
    public final /* synthetic */ Format A00;
    public final /* synthetic */ JO A01;

    public JJ(JO jo, Format format) {
        this.A01 = jo;
        this.A00 = format;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            this.A01.A01.ABL(this.A00);
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
