package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.player.AdMediaInfo;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class cm implements VideoAdPlayer.VideoAdPlayerCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final cl f21554a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f21556c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap<AdMediaInfo, Boolean> f21555b = auv.c(2);

    public cm(cl clVar) {
        this.f21554a = clVar;
    }

    private final void c(dv dvVar, AdMediaInfo adMediaInfo) {
        d(dvVar, adMediaInfo, null);
    }

    private final void d(dv dvVar, AdMediaInfo adMediaInfo, Object obj) {
        this.f21554a.b(dvVar, adMediaInfo, obj);
    }

    public final void a() {
        this.f21556c = true;
    }

    public final void b() {
        this.f21556c = false;
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onAdProgress(AdMediaInfo adMediaInfo, VideoProgressUpdate videoProgressUpdate) {
        if (this.f21556c && videoProgressUpdate != null && videoProgressUpdate.getDuration() > 0.0f) {
            if (this.f21555b.get(adMediaInfo) == null && videoProgressUpdate.getCurrentTime() > 0.0f) {
                c(dv.start, adMediaInfo);
                this.f21555b.put(adMediaInfo, Boolean.TRUE);
            }
            d(dv.timeupdate, adMediaInfo, com.google.ads.interactivemedia.v3.impl.data.bj.create(videoProgressUpdate));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onBuffering(AdMediaInfo adMediaInfo) {
        if (this.f21556c) {
            c(dv.waiting, adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onContentComplete() {
        this.f21554a.a(du.adsLoader, dv.contentComplete);
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onEnded(AdMediaInfo adMediaInfo) {
        if (this.f21556c) {
            c(dv.end, adMediaInfo);
            this.f21555b.remove(adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onError(AdMediaInfo adMediaInfo) {
        if (this.f21556c) {
            c(dv.error, adMediaInfo);
            this.f21555b.remove(adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onLoaded(AdMediaInfo adMediaInfo) {
        if (this.f21556c) {
            c(dv.loaded, adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onPause(AdMediaInfo adMediaInfo) {
        if (this.f21556c) {
            c(dv.pause, adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onPlay(AdMediaInfo adMediaInfo) {
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onResume(AdMediaInfo adMediaInfo) {
        if (this.f21556c) {
            c(dv.play, adMediaInfo);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer.VideoAdPlayerCallback
    public final void onVolumeChanged(AdMediaInfo adMediaInfo, int i2) {
        if (this.f21556c) {
            d(dv.volumeChange, adMediaInfo, com.google.ads.interactivemedia.v3.impl.data.bo.builder().volumePercentage(i2).build());
        }
    }
}
