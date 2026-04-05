package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: assets/audience_network.dex */
public class PM implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C05057f A00;

    public PM(C05057f c05057f) {
        this.A00 = c05057f;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i2) {
        new Handler(Looper.getMainLooper()).post(new C0754Hx(this, i2));
    }
}
