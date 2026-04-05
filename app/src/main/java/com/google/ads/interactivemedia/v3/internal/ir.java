package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class ir implements AudioManager.OnAudioFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ it f21973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f21974b;

    public ir(it itVar, Handler handler) {
        this.f21973a = itVar;
        this.f21974b = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i2) {
        this.f21974b.post(new Runnable() { // from class: com.google.ads.interactivemedia.v3.internal.iq
            @Override // java.lang.Runnable
            public final void run() {
                ir irVar = this.f21971a;
                it.c(irVar.f21973a, i2);
            }
        });
    }
}
