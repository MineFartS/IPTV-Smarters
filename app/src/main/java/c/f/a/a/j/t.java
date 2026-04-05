package c.f.a.a.j;

/* JADX INFO: loaded from: classes.dex */
public final class t implements c.f.a.a.j.v.a.b<r> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.a0.a> f6199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.a0.a> f6200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.y.e> f6201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.y.j.m> f6202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.y.j.q> f6203e;

    public t(g.a.a<c.f.a.a.j.a0.a> aVar, g.a.a<c.f.a.a.j.a0.a> aVar2, g.a.a<c.f.a.a.j.y.e> aVar3, g.a.a<c.f.a.a.j.y.j.m> aVar4, g.a.a<c.f.a.a.j.y.j.q> aVar5) {
        this.f6199a = aVar;
        this.f6200b = aVar2;
        this.f6201c = aVar3;
        this.f6202d = aVar4;
        this.f6203e = aVar5;
    }

    public static t a(g.a.a<c.f.a.a.j.a0.a> aVar, g.a.a<c.f.a.a.j.a0.a> aVar2, g.a.a<c.f.a.a.j.y.e> aVar3, g.a.a<c.f.a.a.j.y.j.m> aVar4, g.a.a<c.f.a.a.j.y.j.q> aVar5) {
        return new t(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static r c(c.f.a.a.j.a0.a aVar, c.f.a.a.j.a0.a aVar2, c.f.a.a.j.y.e eVar, c.f.a.a.j.y.j.m mVar, c.f.a.a.j.y.j.q qVar) {
        return new r(aVar, aVar2, eVar, mVar, qVar);
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.f6199a.get(), this.f6200b.get(), this.f6201c.get(), this.f6202d.get(), this.f6203e.get());
    }
}
