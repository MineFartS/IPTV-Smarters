package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class pe extends AudioTrack.StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pf f22686a;

    public pe(pf pfVar) {
        this.f22686a = pfVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i2) {
        ajr.f(audioTrack == this.f22686a.f22687a.q);
        if (this.f22686a.f22687a.f22703n == null || !this.f22686a.f22687a.Q) {
            return;
        }
        this.f22686a.f22687a.f22703n.b();
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        ajr.f(audioTrack == this.f22686a.f22687a.q);
        if (this.f22686a.f22687a.f22703n == null || !this.f22686a.f22687a.Q) {
            return;
        }
        this.f22686a.f22687a.f22703n.b();
    }
}
