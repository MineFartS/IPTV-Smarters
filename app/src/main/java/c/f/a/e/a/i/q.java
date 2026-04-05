package c.f.a.e.a.i;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class q<ResultT> extends d<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15770a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l<ResultT> f15771b = new l<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ResultT f15773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Exception f15774e;

    @Override // c.f.a.e.a.i.d
    public final d<ResultT> a(Executor executor, a aVar) {
        this.f15771b.a(new h(executor, aVar));
        m();
        return this;
    }

    @Override // c.f.a.e.a.i.d
    public final d<ResultT> b(Executor executor, b<? super ResultT> bVar) {
        this.f15771b.a(new j(executor, bVar));
        m();
        return this;
    }

    @Override // c.f.a.e.a.i.d
    public final Exception c() {
        Exception exc;
        synchronized (this.f15770a) {
            exc = this.f15774e;
        }
        return exc;
    }

    @Override // c.f.a.e.a.i.d
    public final ResultT d() {
        ResultT resultt;
        synchronized (this.f15770a) {
            k();
            Exception exc = this.f15774e;
            if (exc != null) {
                throw new c(exc);
            }
            resultt = this.f15773d;
        }
        return resultt;
    }

    @Override // c.f.a.e.a.i.d
    public final boolean e() {
        boolean z;
        synchronized (this.f15770a) {
            z = this.f15772c;
        }
        return z;
    }

    @Override // c.f.a.e.a.i.d
    public final boolean f() {
        boolean z;
        synchronized (this.f15770a) {
            z = false;
            if (this.f15772c && this.f15774e == null) {
                z = true;
            }
        }
        return z;
    }

    public final void g(ResultT resultt) {
        synchronized (this.f15770a) {
            l();
            this.f15772c = true;
            this.f15773d = resultt;
        }
        this.f15771b.b(this);
    }

    public final boolean h(ResultT resultt) {
        synchronized (this.f15770a) {
            if (this.f15772c) {
                return false;
            }
            this.f15772c = true;
            this.f15773d = resultt;
            this.f15771b.b(this);
            return true;
        }
    }

    public final void i(Exception exc) {
        synchronized (this.f15770a) {
            l();
            this.f15772c = true;
            this.f15774e = exc;
        }
        this.f15771b.b(this);
    }

    public final boolean j(Exception exc) {
        synchronized (this.f15770a) {
            if (this.f15772c) {
                return false;
            }
            this.f15772c = true;
            this.f15774e = exc;
            this.f15771b.b(this);
            return true;
        }
    }

    public final void k() {
        c.f.a.e.a.e.m.b(this.f15772c, "Task is not yet complete");
    }

    public final void l() {
        c.f.a.e.a.e.m.b(!this.f15772c, "Task is already complete");
    }

    public final void m() {
        synchronized (this.f15770a) {
            if (this.f15772c) {
                this.f15771b.b(this);
            }
        }
    }
}
