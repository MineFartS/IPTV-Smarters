package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class aqs<TResult> implements aqw<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f20392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f20393b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final aqt<? super TResult> f20394c;

    public aqs(Executor executor, aqt<? super TResult> aqtVar) {
        this.f20392a = executor;
        this.f20394c = aqtVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqw
    public final void d(aqv<TResult> aqvVar) {
        if (aqvVar.f()) {
            synchronized (this.f20393b) {
                if (this.f20394c == null) {
                    return;
                }
                this.f20392a.execute(new aqr(this, aqvVar));
            }
        }
    }
}
