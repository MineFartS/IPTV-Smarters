package c.f.a.e.a.i;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class j<ResultT> implements k<ResultT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f15762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15763b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b<? super ResultT> f15764c;

    public j(Executor executor, b<? super ResultT> bVar) {
        this.f15762a = executor;
        this.f15764c = bVar;
    }

    @Override // c.f.a.e.a.i.k
    public final void a(d<ResultT> dVar) {
        if (dVar.f()) {
            synchronized (this.f15763b) {
                if (this.f15764c == null) {
                    return;
                }
                this.f15762a.execute(new i(this, dVar));
            }
        }
    }
}
