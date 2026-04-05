package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class awk<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Runnable f20667b = new awj(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Runnable f20668c = new awj(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ awr f20669a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Callable f20670d;

    public awk() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public awk(awr awrVar, Callable callable) {
        this();
        this.f20669a = awrVar;
        ars.g(callable);
        this.f20670d = callable;
    }

    private final void g(Thread thread) {
        Runnable runnable = get();
        awi awiVar = null;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (!(runnable instanceof awi)) {
                if (runnable != f20668c) {
                    break;
                }
            } else {
                awiVar = (awi) runnable;
            }
            i2++;
            if (i2 > 1000) {
                Runnable runnable2 = f20668c;
                if (runnable == runnable2 || compareAndSet(runnable, runnable2)) {
                    z = Thread.interrupted() || z;
                    LockSupport.park(awiVar);
                }
            } else {
                Thread.yield();
            }
            runnable = get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    public final void a() {
        Runnable runnable = get();
        if (runnable instanceof Thread) {
            awi awiVar = new awi(this);
            super/*java.util.concurrent.locks.AbstractOwnableSynchronizer*/.setExclusiveOwnerThread(Thread.currentThread());
            if (compareAndSet(runnable, awiVar)) {
                try {
                    Thread thread = (Thread) runnable;
                    thread.interrupt();
                    if (getAndSet(f20667b) == f20668c) {
                        LockSupport.unpark(thread);
                    }
                } catch (Throwable th) {
                    if (getAndSet(f20667b) == f20668c) {
                        LockSupport.unpark((Thread) runnable);
                    }
                    throw th;
                }
            }
        }
    }

    public final Object b() {
        return this.f20670d.call();
    }

    public final String c() {
        return this.f20670d.toString();
    }

    public final void d(Throwable th) {
        this.f20669a.o(th);
    }

    public final void e(Object obj) {
        this.f20669a.j(obj);
    }

    public final boolean f() {
        return this.f20669a.isDone();
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objB = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z = !f();
            if (z) {
                try {
                    objB = b();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, f20667b)) {
                        g(threadCurrentThread);
                    }
                    d(th);
                    return;
                }
            }
            if (!compareAndSet(threadCurrentThread, f20667b)) {
                g(threadCurrentThread);
            }
            if (z) {
                e(objB);
            }
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String string;
        Runnable runnable = get();
        if (runnable == f20667b) {
            string = "running=[DONE]";
        } else if (runnable instanceof awi) {
            string = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            String name = ((Thread) runnable).getName();
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 21);
            sb.append("running=[RUNNING ON ");
            sb.append(name);
            sb.append("]");
            string = sb.toString();
        } else {
            string = "running=[NOT STARTED YET]";
        }
        String strC = c();
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(strC).length());
        sb2.append(string);
        sb2.append(", ");
        sb2.append(strC);
        return sb2.toString();
    }
}
