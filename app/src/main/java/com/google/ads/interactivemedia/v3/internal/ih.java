package com.google.ads.interactivemedia.v3.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class ih<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, AtomicReference<T>> f21960a = new HashMap();

    public final AtomicReference<T> a(String str) {
        synchronized (this) {
            if (!this.f21960a.containsKey(str)) {
                this.f21960a.put(str, new AtomicReference<>());
            }
        }
        return this.f21960a.get(str);
    }
}
