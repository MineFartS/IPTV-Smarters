package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class awd<V> extends atg implements Future<V>, awl {
    public awd() {
    }

    public awd(byte[] bArr) {
        this();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.atg
    public /* bridge */ /* synthetic */ Object a() {
        throw null;
    }

    public abstract awl b();

    public /* bridge */ /* synthetic */ Future c() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return c().cancel(z);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awl
    public final void g(Runnable runnable, Executor executor) {
        b().g(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return (V) c().get();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        return (V) c().get(j2, timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return c().isDone();
    }
}
