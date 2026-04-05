package com.facebook.ads.redexgen.X;

import android.media.AudioTrack;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class BI extends Thread {
    public final /* synthetic */ AudioTrack A00;
    public final /* synthetic */ Y9 A01;

    public BI(Y9 y9, AudioTrack audioTrack) {
        this.A01 = y9;
        this.A00 = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        if (C0822Kp.A02(this)) {
            return;
        }
        try {
            try {
                this.A00.flush();
                this.A00.release();
            } finally {
                this.A01.A0f.open();
            }
        } catch (Throwable th) {
            C0822Kp.A00(th, this);
        }
    }
}
