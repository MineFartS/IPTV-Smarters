package c.f.c.s;

/* JADX INFO: loaded from: classes2.dex */
public class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f16274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.c.o.j<l> f16275b;

    public j(o oVar, c.f.a.c.o.j<l> jVar) {
        this.f16274a = oVar;
        this.f16275b = jVar;
    }

    @Override // c.f.c.s.n
    public boolean a(Exception exc) {
        this.f16275b.d(exc);
        return true;
    }

    @Override // c.f.c.s.n
    public boolean b(c.f.c.s.q.d dVar) {
        if (!dVar.k() || this.f16274a.f(dVar)) {
            return false;
        }
        this.f16275b.c(l.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
