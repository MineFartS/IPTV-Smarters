package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class h6 implements o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h6 f13352a = new h6();

    public static h6 c() {
        return f13352a;
    }

    @Override // c.f.a.c.j.h.o7
    public final boolean a(Class<?> cls) {
        return l6.class.isAssignableFrom(cls);
    }

    @Override // c.f.a.c.j.h.o7
    public final n7 b(Class<?> cls) {
        if (!l6.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (n7) l6.s(cls.asSubclass(l6.class)).v(3, null, null);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }
}
