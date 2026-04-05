package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.StreamManager;

/* JADX INFO: loaded from: classes.dex */
public final class cw implements AdsManagerLoadedEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdsManager f21594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StreamManager f21595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f21596c;

    public cw(AdsManager adsManager, Object obj) {
        this.f21594a = adsManager;
        this.f21595b = null;
        this.f21596c = obj;
    }

    public cw(StreamManager streamManager, Object obj) {
        this.f21594a = null;
        this.f21595b = streamManager;
        this.f21596c = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final AdsManager getAdsManager() {
        return this.f21594a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final StreamManager getStreamManager() {
        return this.f21595b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final Object getUserRequestContext() {
        return this.f21596c;
    }
}
