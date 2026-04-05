package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ub f13126a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ub f13127b = new xb();

    public static ub a() {
        return f13126a;
    }

    public static ub b() {
        return f13127b;
    }

    public static ub c() {
        try {
            return (ub) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
