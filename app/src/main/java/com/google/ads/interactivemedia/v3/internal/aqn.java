package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aqn<TResult> implements aqw<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20383b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dx f20384c;

    public aqn(Executor executor, dx dxVar) {
        this.f20382a = executor;
        this.f20384c = dxVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqw
    public final void d(aqv<TResult> aqvVar) {
        synchronized (this.f20383b) {
        }
        this.f20382a.execute(new aqm(this, aqvVar));
    }
}
