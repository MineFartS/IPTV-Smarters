package c.f.a.a.j.a0;

/* JADX INFO: loaded from: classes.dex */
public final class d implements c.f.a.a.j.v.a.b<c.f.a.a.j.a0.a> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f6148a = new d();
    }

    public static d a() {
        return a.f6148a;
    }

    public static c.f.a.a.j.a0.a c() {
        return (c.f.a.a.j.a0.a) c.f.a.a.j.v.a.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.f.a.a.j.a0.a get() {
        return c();
    }
}
