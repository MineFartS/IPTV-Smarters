package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Delayed;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class awe<V> extends awd implements ScheduledFuture, awl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final awl<V> f20662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledFuture f20663b;

    public awe(awl<V> awlVar) {
        super(null);
        this.f20662a = awlVar;
    }

    public awe(awl awlVar, ScheduledFuture scheduledFuture) {
        this(awlVar);
        this.f20663b = scheduledFuture;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awd, com.google.ads.interactivemedia.v3.internal.atg
    public final /* bridge */ /* synthetic */ Object a() {
        return this.f20662a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awd
    public final awl<V> b() {
        return this.f20662a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awd
    public final /* bridge */ /* synthetic */ Future c() {
        return this.f20662a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awd, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = c().cancel(z);
        if (zCancel) {
            this.f20663b.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f20663b.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f20663b.getDelay(timeUnit);
    }
}
