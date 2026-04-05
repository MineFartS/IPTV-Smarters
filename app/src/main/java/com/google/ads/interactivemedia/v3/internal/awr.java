package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes.dex */
public final class awr<V> extends awh implements RunnableFuture<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile awk<?> f20673a;

    public awr(Callable<V> callable) {
        super((char[]) null);
        this.f20673a = new awk<>(this, callable);
    }

    public static <V> awr<V> p(Callable<V> callable) {
        return new awr<>(callable);
    }

    public static <V> awr<V> q(Runnable runnable, V v) {
        return new awr<>(Executors.callable(runnable, v));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awb
    public final String e() {
        awk<?> awkVar = this.f20673a;
        if (awkVar == null) {
            return super.e();
        }
        String strValueOf = String.valueOf(awkVar);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awb
    public final void h() {
        awk<?> awkVar;
        if (k() && (awkVar = this.f20673a) != null) {
            awkVar.a();
        }
        this.f20673a = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        awk<?> awkVar = this.f20673a;
        if (awkVar != null) {
            awkVar.run();
        }
        this.f20673a = null;
    }
}
