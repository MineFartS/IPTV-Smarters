package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;

/* JADX INFO: loaded from: classes.dex */
public final class cj implements AdErrorEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdError f21549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f21550b;

    public cj(AdError adError) {
        this.f21549a = adError;
        this.f21550b = null;
    }

    public cj(AdError adError, Object obj) {
        this.f21549a = adError;
        this.f21550b = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final AdError getError() {
        return this.f21549a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final Object getUserRequestContext() {
        return this.f21550b;
    }
}
