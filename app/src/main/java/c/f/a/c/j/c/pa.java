package c.f.a.c.j.c;

import c.f.a.c.j.c.oa;

/* JADX INFO: loaded from: classes2.dex */
public final class pa implements yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pa f13025a = new pa();

    public static pa c() {
        return f13025a;
    }

    @Override // c.f.a.c.j.c.yb
    public final boolean a(Class<?> cls) {
        return oa.class.isAssignableFrom(cls);
    }

    @Override // c.f.a.c.j.c.yb
    public final zb b(Class<?> cls) {
        if (!oa.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            throw new IllegalArgumentException(name.length() != 0 ? "Unsupported message type: ".concat(name) : new String("Unsupported message type: "));
        }
        try {
            return (zb) oa.j(cls.asSubclass(oa.class)).k(oa.e.f12998c, null, null);
        } catch (Exception e2) {
            String name2 = cls.getName();
            throw new RuntimeException(name2.length() != 0 ? "Unable to get message info for ".concat(name2) : new String("Unable to get message info for "), e2);
        }
    }
}
