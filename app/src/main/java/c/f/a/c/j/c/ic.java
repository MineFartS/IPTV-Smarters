package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class ic {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final gc f12884a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gc f12885b = new jc();

    public static gc a() {
        return f12884a;
    }

    public static gc b() {
        return f12885b;
    }

    public static gc c() {
        try {
            return (gc) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
