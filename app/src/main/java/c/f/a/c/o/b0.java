package c.f.a.c.o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class b0<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f14568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h<TResult, TContinuationResult> f14569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0<TContinuationResult> f14570c;

    public b0(Executor executor, h<TResult, TContinuationResult> hVar, g0<TContinuationResult> g0Var) {
        this.f14568a = executor;
        this.f14569b = hVar;
        this.f14570c = g0Var;
    }

    @Override // c.f.a.c.o.f
    public final void a(TContinuationResult tcontinuationresult) {
        this.f14570c.q(tcontinuationresult);
    }

    @Override // c.f.a.c.o.c0
    public final void b(i<TResult> iVar) {
        this.f14568a.execute(new a0(this, iVar));
    }

    @Override // c.f.a.c.o.c
    public final void c() {
        this.f14570c.u();
    }

    @Override // c.f.a.c.o.e
    public final void onFailure(Exception exc) {
        this.f14570c.s(exc);
    }
}
