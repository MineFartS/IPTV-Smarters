package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class b6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z5<?> f13214a = new a6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z5<?> f13215b;

    static {
        z5<?> z5Var;
        try {
            z5Var = (z5) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            z5Var = null;
        }
        f13215b = z5Var;
    }

    public static z5<?> a() {
        return f13214a;
    }

    public static z5<?> b() {
        z5<?> z5Var = f13215b;
        if (z5Var != null) {
            return z5Var;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
