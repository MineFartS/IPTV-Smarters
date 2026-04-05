package c.f.a.b.j3;

import java.lang.Exception;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n0<R, E extends Exception> implements RunnableFuture<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f9226b = new l();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f9227c = new l();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f9228d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Exception f9229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public R f9230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Thread f9231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f9232h;

    public final void a() {
        this.f9227c.c();
    }

    public final void b() {
        this.f9226b.c();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this.f9228d) {
            if (!this.f9232h && !this.f9227c.e()) {
                this.f9232h = true;
                c();
                Thread thread = this.f9231g;
                if (thread == null) {
                    this.f9226b.f();
                    this.f9227c.f();
                } else if (z) {
                    thread.interrupt();
                }
                return true;
            }
            return false;
        }
    }

    public abstract R d();

    public final R e() throws ExecutionException {
        if (this.f9232h) {
            throw new CancellationException();
        }
        if (this.f9229e == null) {
            return this.f9230f;
        }
        throw new ExecutionException(this.f9229e);
    }

    @Override // java.util.concurrent.Future
    public final R get() {
        this.f9227c.a();
        return e();
    }

    @Override // java.util.concurrent.Future
    public final R get(long j2, TimeUnit timeUnit) throws TimeoutException {
        if (this.f9227c.b(TimeUnit.MILLISECONDS.convert(j2, timeUnit))) {
            return e();
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9232h;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9227c.e();
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f9228d) {
            if (this.f9232h) {
                return;
            }
            this.f9231g = Thread.currentThread();
            this.f9226b.f();
            try {
                try {
                    this.f9230f = d();
                    synchronized (this.f9228d) {
                        this.f9227c.f();
                        this.f9231g = null;
                        Thread.interrupted();
                    }
                } catch (Exception e2) {
                    this.f9229e = e2;
                    synchronized (this.f9228d) {
                        this.f9227c.f();
                        this.f9231g = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th) {
                synchronized (this.f9228d) {
                    this.f9227c.f();
                    this.f9231g = null;
                    Thread.interrupted();
                    throw th;
                }
            }
        }
    }
}
