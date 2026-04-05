package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class arc<TResult> extends aqv<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20407a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final aqx<TResult> f20408b = new aqx<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f20409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f20410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private TResult f20411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Exception f20412f;

    private final void p() {
        if (this.f20409c) {
            throw aqi.a(this);
        }
    }

    private final void q() {
        synchronized (this.f20407a) {
            if (this.f20409c) {
                this.f20408b.b(this);
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqv
    public final <TContinuationResult> aqv<TContinuationResult> a(aqf<TResult, aqv<TContinuationResult>> aqfVar) {
        Executor executor = arb.f20405a;
        arc arcVar = new arc();
        this.f20408b.a(new aqh(are.a(executor), aqfVar, arcVar));
        q();
        return arcVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqv
    public final Exception b() {
        Exception exc;
        synchronized (this.f20407a) {
            exc = this.f20412f;
        }
        return exc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqv
    public final TResult c() {
        TResult tresult;
        synchronized (this.f20407a) {
            c.f.a.c.f.q.o.m(this.f20409c, "Task is not yet complete");
            if (this.f20410d) {
                throw new CancellationException("Task is already canceled.");
            }
            Exception exc = this.f20412f;
            if (exc != null) {
                throw new aqu(exc);
            }
            tresult = this.f20411e;
        }
        return tresult;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqv
    public final boolean d() {
        return this.f20410d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqv
    public final boolean e() {
        boolean z;
        synchronized (this.f20407a) {
            z = this.f20409c;
        }
        return z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqv
    public final boolean f() {
        boolean z;
        synchronized (this.f20407a) {
            z = false;
            if (this.f20409c && !this.f20410d && this.f20412f == null) {
                z = true;
            }
        }
        return z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqv
    public final void g(Executor executor, aql aqlVar) {
        this.f20408b.a(new aqk(are.a(executor), aqlVar));
        q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqv
    public final void h(dx dxVar) {
        this.f20408b.a(new aqn(are.a(arb.f20405a), dxVar));
        q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqv
    public final void i(Executor executor, aqq aqqVar) {
        this.f20408b.a(new aqp(are.a(executor), aqqVar));
        q();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aqv
    public final void j(Executor executor, aqt<? super TResult> aqtVar) {
        this.f20408b.a(new aqs(are.a(executor), aqtVar));
        q();
    }

    public final void k(Exception exc) {
        c.f.a.c.f.q.o.j(exc, "Exception must not be null");
        synchronized (this.f20407a) {
            p();
            this.f20409c = true;
            this.f20412f = exc;
        }
        this.f20408b.b(this);
    }

    public final void l(TResult tresult) {
        synchronized (this.f20407a) {
            p();
            this.f20409c = true;
            this.f20411e = tresult;
        }
        this.f20408b.b(this);
    }

    public final boolean m(Exception exc) {
        c.f.a.c.f.q.o.j(exc, "Exception must not be null");
        synchronized (this.f20407a) {
            if (this.f20409c) {
                return false;
            }
            this.f20409c = true;
            this.f20412f = exc;
            this.f20408b.b(this);
            return true;
        }
    }

    public final boolean n(TResult tresult) {
        synchronized (this.f20407a) {
            if (this.f20409c) {
                return false;
            }
            this.f20409c = true;
            this.f20411e = tresult;
            this.f20408b.b(this);
            return true;
        }
    }

    public final void o() {
        synchronized (this.f20407a) {
            if (this.f20409c) {
                return;
            }
            this.f20409c = true;
            this.f20410d = true;
            this.f20408b.b(this);
        }
    }
}
