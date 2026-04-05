package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class j9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f12894a = a("libcore.io.Memory");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f12895b;

    static {
        f12895b = a("org.robolectric.Robolectric") != null;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean b() {
        return (f12894a == null || f12895b) ? false : true;
    }

    public static Class<?> c() {
        return f12894a;
    }
}
