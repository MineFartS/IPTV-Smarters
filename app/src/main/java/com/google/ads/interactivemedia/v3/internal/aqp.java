package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aqp<TResult> implements aqw<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20388b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aqq f20389c;

    public aqp(Executor executor, aqq aqqVar) {
        this.f20387a = executor;
        this.f20389c = aqqVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqw
    public final void d(aqv<TResult> aqvVar) {
        if (aqvVar.f() || aqvVar.d()) {
            return;
        }
        synchronized (this.f20388b) {
            if (this.f20389c == null) {
                return;
            }
            this.f20387a.execute(new aqo(this, aqvVar));
        }
    }
}
