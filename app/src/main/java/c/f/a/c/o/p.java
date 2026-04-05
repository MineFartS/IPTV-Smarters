package c.f.a.c.o;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class p<TResult, TContinuationResult> implements c0<TResult> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f14589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a<TResult, TContinuationResult> f14590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g0<TContinuationResult> f14591c;

    public p(Executor executor, a<TResult, TContinuationResult> aVar, g0<TContinuationResult> g0Var) {
        this.f14589a = executor;
        this.f14590b = aVar;
        this.f14591c = g0Var;
    }

    @Override // c.f.a.c.o.c0
    public final void b(i<TResult> iVar) {
        this.f14589a.execute(new o(this, iVar));
    }
}
