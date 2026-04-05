package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class v4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f13585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f13586b;

    static {
        Class<?> cls;
        Class<?> cls2 = null;
        try {
            cls = Class.forName("libcore.io.Memory");
        } catch (Throwable unused) {
            cls = null;
        }
        f13585a = cls;
        try {
            cls2 = Class.forName("org.robolectric.Robolectric");
        } catch (Throwable unused2) {
        }
        f13586b = cls2 != null;
    }

    public static boolean a() {
        return (f13585a == null || f13586b) ? false : true;
    }

    public static Class<?> b() {
        return f13585a;
    }
}
