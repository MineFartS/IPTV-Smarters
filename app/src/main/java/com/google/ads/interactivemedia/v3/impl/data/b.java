package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.ark;

/* JADX INFO: loaded from: classes.dex */
@ark(a = j.class)
public abstract class b {
    public static a builder() {
        return new i();
    }

    public abstract String appState();

    public abstract String eventId();

    public abstract long nativeTime();

    public abstract ar nativeViewBounds();

    public abstract boolean nativeViewHidden();

    public abstract ar nativeViewVisibleBounds();

    public abstract double nativeVolume();

    public abstract String queryId();
}
