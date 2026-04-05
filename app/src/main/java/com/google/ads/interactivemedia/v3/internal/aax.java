package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public final class aax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicLong f19023a = new AtomicLong();

    public aax() {
    }

    public aax(ajl ajlVar) {
        Uri uri = ajlVar.f19897a;
        Collections.emptyMap();
    }

    public static long a() {
        return f19023a.getAndIncrement();
    }
}
