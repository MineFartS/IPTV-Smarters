package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class ara implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f20404a = new aqd(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f20404a.post(runnable);
    }
}
