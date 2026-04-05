package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class aou {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicReference<aot> f20318a = new AtomicReference<>();

    static {
        new AtomicBoolean();
    }

    public static aot a() {
        return f20318a.get();
    }

    public static void b(aot aotVar) {
        f20318a.set(aotVar);
    }
}
