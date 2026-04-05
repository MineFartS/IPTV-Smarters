package c.f.a.c.o;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public final class l {
    @RecentlyNonNull
    public static <TResult> TResult a(@RecentlyNonNull i<TResult> iVar) throws InterruptedException {
        c.f.a.c.f.q.o.g();
        c.f.a.c.f.q.o.j(iVar, "Task must not be null");
        if (iVar.n()) {
            return (TResult) f(iVar);
        }
        m mVar = new m(null);
        g(iVar, mVar);
        mVar.b();
        return (TResult) f(iVar);
    }

    @RecentlyNonNull
    public static <TResult> TResult b(@RecentlyNonNull i<TResult> iVar, long j2, @RecentlyNonNull TimeUnit timeUnit) throws TimeoutException {
        c.f.a.c.f.q.o.g();
        c.f.a.c.f.q.o.j(iVar, "Task must not be null");
        c.f.a.c.f.q.o.j(timeUnit, "TimeUnit must not be null");
        if (iVar.n()) {
            return (TResult) f(iVar);
        }
        m mVar = new m(null);
        g(iVar, mVar);
        if (mVar.d(j2, timeUnit)) {
            return (TResult) f(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> i<TResult> c(@RecentlyNonNull Executor executor, @RecentlyNonNull Callable<TResult> callable) {
        c.f.a.c.f.q.o.j(executor, "Executor must not be null");
        c.f.a.c.f.q.o.j(callable, "Callback must not be null");
        g0 g0Var = new g0();
        executor.execute(new h0(g0Var, callable));
        return g0Var;
    }

    public static <TResult> i<TResult> d(@RecentlyNonNull Exception exc) {
        g0 g0Var = new g0();
        g0Var.s(exc);
        return g0Var;
    }

    public static <TResult> i<TResult> e(@RecentlyNonNull TResult tresult) {
        g0 g0Var = new g0();
        g0Var.q(tresult);
        return g0Var;
    }

    public static <TResult> TResult f(i<TResult> iVar) throws ExecutionException {
        if (iVar.o()) {
            return iVar.k();
        }
        if (iVar.m()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.j());
    }

    public static <T> void g(i<T> iVar, n<? super T> nVar) {
        Executor executor = k.f14585b;
        iVar.g(executor, nVar);
        iVar.e(executor, nVar);
        iVar.a(executor, nVar);
    }
}
