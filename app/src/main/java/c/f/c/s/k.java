package c.f.c.s;

/* JADX INFO: loaded from: classes2.dex */
public class k implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.c.o.j<String> f16276a;

    public k(c.f.a.c.o.j<String> jVar) {
        this.f16276a = jVar;
    }

    @Override // c.f.c.s.n
    public boolean a(Exception exc) {
        return false;
    }

    @Override // c.f.c.s.n
    public boolean b(c.f.c.s.q.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f16276a.e(dVar.d());
        return true;
    }
}
