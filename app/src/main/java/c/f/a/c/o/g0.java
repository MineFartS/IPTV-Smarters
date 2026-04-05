package c.f.a.c.o;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import javax.annotation.concurrent.GuardedBy;

/* JADX INFO: loaded from: classes2.dex */
public final class g0<TResult> extends i<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f14575a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0<TResult> f14576b = new d0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @GuardedBy("mLock")
    public boolean f14577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f14578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @GuardedBy("mLock")
    public TResult f14579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @GuardedBy("mLock")
    public Exception f14580f;

    @Override // c.f.a.c.o.i
    public final i<TResult> a(Executor executor, c cVar) {
        this.f14576b.a(new t(executor, cVar));
        y();
        return this;
    }

    @Override // c.f.a.c.o.i
    public final i<TResult> b(d<TResult> dVar) {
        this.f14576b.a(new v(k.f14584a, dVar));
        y();
        return this;
    }

    @Override // c.f.a.c.o.i
    public final i<TResult> c(Executor executor, d<TResult> dVar) {
        this.f14576b.a(new v(executor, dVar));
        y();
        return this;
    }

    @Override // c.f.a.c.o.i
    public final i<TResult> d(e eVar) {
        e(k.f14584a, eVar);
        return this;
    }

    @Override // c.f.a.c.o.i
    public final i<TResult> e(Executor executor, e eVar) {
        this.f14576b.a(new x(executor, eVar));
        y();
        return this;
    }

    @Override // c.f.a.c.o.i
    public final i<TResult> f(f<? super TResult> fVar) {
        g(k.f14584a, fVar);
        return this;
    }

    @Override // c.f.a.c.o.i
    public final i<TResult> g(Executor executor, f<? super TResult> fVar) {
        this.f14576b.a(new z(executor, fVar));
        y();
        return this;
    }

    @Override // c.f.a.c.o.i
    public final <TContinuationResult> i<TContinuationResult> h(Executor executor, a<TResult, TContinuationResult> aVar) {
        g0 g0Var = new g0();
        this.f14576b.a(new p(executor, aVar, g0Var));
        y();
        return g0Var;
    }

    @Override // c.f.a.c.o.i
    public final <TContinuationResult> i<TContinuationResult> i(Executor executor, a<TResult, i<TContinuationResult>> aVar) {
        g0 g0Var = new g0();
        this.f14576b.a(new r(executor, aVar, g0Var));
        y();
        return g0Var;
    }

    @Override // c.f.a.c.o.i
    public final Exception j() {
        Exception exc;
        synchronized (this.f14575a) {
            exc = this.f14580f;
        }
        return exc;
    }

    @Override // c.f.a.c.o.i
    public final TResult k() {
        TResult tresult;
        synchronized (this.f14575a) {
            v();
            x();
            Exception exc = this.f14580f;
            if (exc != null) {
                throw new g(exc);
            }
            tresult = this.f14579e;
        }
        return tresult;
    }

    @Override // c.f.a.c.o.i
    public final <X extends Throwable> TResult l(Class<X> cls) {
        TResult tresult;
        synchronized (this.f14575a) {
            v();
            x();
            if (cls.isInstance(this.f14580f)) {
                throw cls.cast(this.f14580f);
            }
            Exception exc = this.f14580f;
            if (exc != null) {
                throw new g(exc);
            }
            tresult = this.f14579e;
        }
        return tresult;
    }

    @Override // c.f.a.c.o.i
    public final boolean m() {
        return this.f14578d;
    }

    @Override // c.f.a.c.o.i
    public final boolean n() {
        boolean z;
        synchronized (this.f14575a) {
            z = this.f14577c;
        }
        return z;
    }

    @Override // c.f.a.c.o.i
    public final boolean o() {
        boolean z;
        synchronized (this.f14575a) {
            z = false;
            if (this.f14577c && !this.f14578d && this.f14580f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // c.f.a.c.o.i
    public final <TContinuationResult> i<TContinuationResult> p(Executor executor, h<TResult, TContinuationResult> hVar) {
        g0 g0Var = new g0();
        this.f14576b.a(new b0(executor, hVar, g0Var));
        y();
        return g0Var;
    }

    public final void q(TResult tresult) {
        synchronized (this.f14575a) {
            w();
            this.f14577c = true;
            this.f14579e = tresult;
        }
        this.f14576b.b(this);
    }

    public final boolean r(TResult tresult) {
        synchronized (this.f14575a) {
            if (this.f14577c) {
                return false;
            }
            this.f14577c = true;
            this.f14579e = tresult;
            this.f14576b.b(this);
            return true;
        }
    }

    public final void s(Exception exc) {
        c.f.a.c.f.q.o.j(exc, "Exception must not be null");
        synchronized (this.f14575a) {
            w();
            this.f14577c = true;
            this.f14580f = exc;
        }
        this.f14576b.b(this);
    }

    public final boolean t(Exception exc) {
        c.f.a.c.f.q.o.j(exc, "Exception must not be null");
        synchronized (this.f14575a) {
            if (this.f14577c) {
                return false;
            }
            this.f14577c = true;
            this.f14580f = exc;
            this.f14576b.b(this);
            return true;
        }
    }

    public final boolean u() {
        synchronized (this.f14575a) {
            if (this.f14577c) {
                return false;
            }
            this.f14577c = true;
            this.f14578d = true;
            this.f14576b.b(this);
            return true;
        }
    }

    @GuardedBy("mLock")
    public final void v() {
        c.f.a.c.f.q.o.m(this.f14577c, "Task is not yet complete");
    }

    @GuardedBy("mLock")
    public final void w() {
        if (this.f14577c) {
            throw b.a(this);
        }
    }

    @GuardedBy("mLock")
    public final void x() {
        if (this.f14578d) {
            throw new CancellationException("Task is already canceled.");
        }
    }

    public final void y() {
        synchronized (this.f14575a) {
            if (this.f14577c) {
                this.f14576b.b(this);
            }
        }
    }
}
