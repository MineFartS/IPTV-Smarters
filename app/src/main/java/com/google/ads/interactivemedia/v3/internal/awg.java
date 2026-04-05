package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes.dex */
public final class awg<V> implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Future<V> f20664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final awf<? super V> f20665b;

    public awg(Future<V> future, awf<? super V> awfVar) {
        this.f20664a = future;
        this.f20665b = awfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        V v;
        Throwable thA;
        Future<V> future = this.f20664a;
        if ((future instanceof aws) && (thA = awt.a((aws) future)) != null) {
            this.f20665b.a(thA);
            return;
        }
        try {
            Future<V> future2 = this.f20664a;
            boolean z = false;
            if (!future2.isDone()) {
                throw new IllegalStateException(art.b("Future was expected to be done: %s", future2));
            }
            while (true) {
                try {
                    v = future2.get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            this.f20665b.b(v);
        } catch (Error e2) {
            e = e2;
            this.f20665b.a(e);
        } catch (RuntimeException e3) {
            e = e3;
            this.f20665b.a(e);
        } catch (ExecutionException e4) {
            this.f20665b.a(e4.getCause());
        }
    }

    public final String toString() {
        return arq.a(this).a(this.f20665b).toString();
    }
}
