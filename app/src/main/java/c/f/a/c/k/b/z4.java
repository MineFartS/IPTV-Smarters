package c.f.a.c.k.b;

import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class z4 extends x5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLong f14497c = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y4 f14498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y4 f14499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final PriorityBlockingQueue<x4<?>> f14500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BlockingQueue<x4<?>> f14501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f14502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f14503i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f14504j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Semaphore f14505k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public volatile boolean f14506l;

    public z4(c5 c5Var) {
        super(c5Var);
        this.f14504j = new Object();
        this.f14505k = new Semaphore(2);
        this.f14500f = new PriorityBlockingQueue<>();
        this.f14501g = new LinkedBlockingQueue();
        this.f14502h = new w4(this, "Thread death: Uncaught exception on worker thread");
        this.f14503i = new w4(this, "Thread death: Uncaught exception on network thread");
    }

    public static /* synthetic */ y4 B(z4 z4Var, y4 y4Var) {
        z4Var.f14499e = null;
        return null;
    }

    public static /* synthetic */ boolean w(z4 z4Var) {
        boolean z = z4Var.f14506l;
        return false;
    }

    public static /* synthetic */ y4 z(z4 z4Var, y4 y4Var) {
        z4Var.f14498d = null;
        return null;
    }

    public final void D(x4<?> x4Var) {
        synchronized (this.f14504j) {
            this.f14500f.add(x4Var);
            y4 y4Var = this.f14498d;
            if (y4Var == null) {
                y4 y4Var2 = new y4(this, "Measurement Worker", this.f14500f);
                this.f14498d = y4Var2;
                y4Var2.setUncaughtExceptionHandler(this.f14502h);
                this.f14498d.start();
            } else {
                y4Var.a();
            }
        }
    }

    @Override // c.f.a.c.k.b.w5
    public final void f() {
        if (Thread.currentThread() != this.f14499e) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    @Override // c.f.a.c.k.b.w5
    public final void g() {
        if (Thread.currentThread() != this.f14498d) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // c.f.a.c.k.b.x5
    public final boolean h() {
        return false;
    }

    public final boolean o() {
        return Thread.currentThread() == this.f14498d;
    }

    public final <V> Future<V> p(Callable<V> callable) {
        k();
        c.f.a.c.f.q.o.i(callable);
        x4<?> x4Var = new x4<>(this, (Callable<?>) callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.f14498d) {
            if (!this.f14500f.isEmpty()) {
                this.f14413a.c().r().a("Callable skipped the worker queue.");
            }
            x4Var.run();
        } else {
            D(x4Var);
        }
        return x4Var;
    }

    public final <V> Future<V> q(Callable<V> callable) {
        k();
        c.f.a.c.f.q.o.i(callable);
        x4<?> x4Var = new x4<>(this, (Callable<?>) callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.f14498d) {
            x4Var.run();
        } else {
            D(x4Var);
        }
        return x4Var;
    }

    public final void r(Runnable runnable) {
        k();
        c.f.a.c.f.q.o.i(runnable);
        D(new x4<>(this, runnable, false, "Task exception on worker thread"));
    }

    public final <T> T s(AtomicReference<T> atomicReference, long j2, String str, Runnable runnable) {
        synchronized (atomicReference) {
            this.f14413a.d().r(runnable);
            try {
                atomicReference.wait(j2);
            } catch (InterruptedException unused) {
                this.f14413a.c().r().a(str.length() != 0 ? "Interrupted waiting for ".concat(str) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            this.f14413a.c().r().a(str.length() != 0 ? "Timed out waiting for ".concat(str) : new String("Timed out waiting for "));
        }
        return t;
    }

    public final void t(Runnable runnable) {
        k();
        c.f.a.c.f.q.o.i(runnable);
        D(new x4<>(this, runnable, true, "Task exception on worker thread"));
    }

    public final void u(Runnable runnable) {
        k();
        c.f.a.c.f.q.o.i(runnable);
        x4<?> x4Var = new x4<>(this, runnable, false, "Task exception on network thread");
        synchronized (this.f14504j) {
            this.f14501g.add(x4Var);
            y4 y4Var = this.f14499e;
            if (y4Var == null) {
                y4 y4Var2 = new y4(this, "Measurement Network", this.f14501g);
                this.f14499e = y4Var2;
                y4Var2.setUncaughtExceptionHandler(this.f14503i);
                this.f14499e.start();
            } else {
                y4Var.a();
            }
        }
    }
}
