package com.google.ads.interactivemedia.v3.internal;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class awc extends AbstractExecutorService implements awm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f20661a;

    public awc() {
    }

    public awc(ExecutorService executorService) {
        this();
        ars.g(executorService);
        this.f20661a = executorService;
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final <T> awl<T> submit(Callable<T> callable) {
        return (awl) super.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f20661a.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f20661a.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f20661a.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f20661a.isTerminated();
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return awr.q(runnable, t);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return awr.p(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f20661a.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.f20661a.shutdownNow();
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return (awl) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public final /* bridge */ /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (awl) super.submit(runnable, obj);
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f20661a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2 + strValueOf.length());
        sb.append(string);
        sb.append("[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }
}
