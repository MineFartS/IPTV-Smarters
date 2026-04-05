package c.f.a.a.j.y;

/* JADX INFO: loaded from: classes.dex */
public final class g implements c.f.a.a.j.v.a.b<c.f.a.a.j.y.j.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g.a.a<c.f.a.a.j.a0.a> f6250a;

    public g(g.a.a<c.f.a.a.j.a0.a> aVar) {
        this.f6250a = aVar;
    }

    public static c.f.a.a.j.y.j.g a(c.f.a.a.j.a0.a aVar) {
        return (c.f.a.a.j.y.j.g) c.f.a.a.j.v.a.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(g.a.a<c.f.a.a.j.a0.a> aVar) {
        return new g(aVar);
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.f.a.a.j.y.j.g get() {
        return a(this.f6250a.get());
    }
}
