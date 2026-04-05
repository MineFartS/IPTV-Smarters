package com.google.ads.interactivemedia.v3.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ajz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f19961a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, String> f19962b;

    public final synchronized Map<String, String> a() {
        if (this.f19962b == null) {
            this.f19962b = Collections.unmodifiableMap(new HashMap(this.f19961a));
        }
        return this.f19962b;
    }
}
