package c.f.a.a.j.y.k;

/* JADX INFO: loaded from: classes.dex */
public final class f implements c.f.a.a.j.v.a.b<String> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f6344a = new f();
    }

    public static f a() {
        return a.f6344a;
    }

    public static String b() {
        return (String) c.f.a.a.j.v.a.d.c(e.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}
