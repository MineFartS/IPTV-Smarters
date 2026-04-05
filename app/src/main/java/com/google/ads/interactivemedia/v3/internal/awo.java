package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class awo extends awc implements ScheduledExecutorService, awm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f20672a;

    public awo(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        ars.g(scheduledExecutorService);
        this.f20672a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        awr awrVarQ = awr.q(runnable, null);
        return new awe(awrVarQ, this.f20672a.schedule(awrVarQ, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        awr awrVarP = awr.p(callable);
        return new awe(awrVarP, this.f20672a.schedule(awrVarP, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        awn awnVar = new awn(runnable);
        return new awe(awnVar, this.f20672a.scheduleAtFixedRate(awnVar, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        awn awnVar = new awn(runnable);
        return new awe(awnVar, this.f20672a.scheduleWithFixedDelay(awnVar, j2, j3, timeUnit));
    }
}
