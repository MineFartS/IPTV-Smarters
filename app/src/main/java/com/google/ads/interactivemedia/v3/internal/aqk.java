package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aqk<TResult> implements aqw<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20378b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aql f20379c;

    public aqk(Executor executor, aql aqlVar) {
        this.f20377a = executor;
        this.f20379c = aqlVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqw
    public final void d(aqv<TResult> aqvVar) {
        if (aqvVar.d()) {
            synchronized (this.f20378b) {
                if (this.f20379c == null) {
                    return;
                }
                this.f20377a.execute(new aqj(this));
            }
        }
    }
}
