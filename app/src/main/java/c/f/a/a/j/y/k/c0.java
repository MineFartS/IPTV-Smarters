package c.f.a.a.j.y.k;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements c.f.a.a.j.v.a.b<b0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.a0.a> f6337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.a0.a> f6338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.a.a<d> f6339c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g.a.a<h0> f6340d;

    public c0(g.a.a<c.f.a.a.j.a0.a> aVar, g.a.a<c.f.a.a.j.a0.a> aVar2, g.a.a<d> aVar3, g.a.a<h0> aVar4) {
        this.f6337a = aVar;
        this.f6338b = aVar2;
        this.f6339c = aVar3;
        this.f6340d = aVar4;
    }

    public static c0 a(g.a.a<c.f.a.a.j.a0.a> aVar, g.a.a<c.f.a.a.j.a0.a> aVar2, g.a.a<d> aVar3, g.a.a<h0> aVar4) {
        return new c0(aVar, aVar2, aVar3, aVar4);
    }

    public static b0 c(c.f.a.a.j.a0.a aVar, c.f.a.a.j.a0.a aVar2, Object obj, Object obj2) {
        return new b0(aVar, aVar2, (d) obj, (h0) obj2);
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(this.f6337a.get(), this.f6338b.get(), this.f6339c.get(), this.f6340d.get());
    }
}
