package c.f.a.e.a.i;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class h<ResultT> implements k<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f15757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15758b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15759c;

    public h(Executor executor, a aVar) {
        this.f15757a = executor;
        this.f15759c = aVar;
    }

    @Override // c.f.a.e.a.i.k
    public final void a(d<ResultT> dVar) {
        if (dVar.f()) {
            return;
        }
        synchronized (this.f15758b) {
            if (this.f15759c == null) {
                return;
            }
            this.f15757a.execute(new g(this, dVar));
        }
    }
}
