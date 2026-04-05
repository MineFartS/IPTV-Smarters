package c.f.a.a.j.a0;

/* JADX INFO: loaded from: classes.dex */
public final class c implements c.f.a.a.j.v.a.b<c.f.a.a.j.a0.a> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f6147a = new c();
    }

    public static c a() {
        return a.f6147a;
    }

    public static c.f.a.a.j.a0.a b() {
        return (c.f.a.a.j.a0.a) c.f.a.a.j.v.a.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c.f.a.a.j.a0.a get() {
        return b();
    }
}
