package com.google.ads.interactivemedia.v3.internal;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes.dex */
public final class ox extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f22660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ pg f22661b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ox(pg pgVar, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f22661b = pgVar;
        this.f22660a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f22660a.flush();
            this.f22660a.release();
        } finally {
            this.f22661b.f22696g.open();
        }
    }
}
