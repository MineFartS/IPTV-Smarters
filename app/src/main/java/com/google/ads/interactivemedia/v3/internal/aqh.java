package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aqh<TResult, TContinuationResult> implements aqw, aqt, aqq, aql {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aqf<TResult, aqv<TContinuationResult>> f20374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final arc<TContinuationResult> f20375c;

    public aqh(Executor executor, aqf<TResult, aqv<TContinuationResult>> aqfVar, arc<TContinuationResult> arcVar) {
        this.f20373a = executor;
        this.f20374b = aqfVar;
        this.f20375c = arcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aql
    public final void c() {
        this.f20375c.o();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqw
    public final void d(aqv<TResult> aqvVar) {
        this.f20373a.execute(new aqg(this, aqvVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqq
    public final void e(Exception exc) {
        this.f20375c.k(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqt
    public final void f(TContinuationResult tcontinuationresult) {
        this.f20375c.l(tcontinuationresult);
    }
}
