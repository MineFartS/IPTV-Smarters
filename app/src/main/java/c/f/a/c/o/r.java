package c.f.a.c.o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class r<TResult, TContinuationResult> implements f<TContinuationResult>, e, c, c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f14594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<TResult, i<TContinuationResult>> f14595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0<TContinuationResult> f14596c;

    public r(Executor executor, a<TResult, i<TContinuationResult>> aVar, g0<TContinuationResult> g0Var) {
        this.f14594a = executor;
        this.f14595b = aVar;
        this.f14596c = g0Var;
    }

    @Override // c.f.a.c.o.f
    public final void a(TContinuationResult tcontinuationresult) {
        this.f14596c.q(tcontinuationresult);
    }

    @Override // c.f.a.c.o.c0
    public final void b(i<TResult> iVar) {
        this.f14594a.execute(new q(this, iVar));
    }

    @Override // c.f.a.c.o.c
    public final void c() {
        this.f14596c.u();
    }

    @Override // c.f.a.c.o.e
    public final void onFailure(Exception exc) {
        this.f14596c.s(exc);
    }
}
