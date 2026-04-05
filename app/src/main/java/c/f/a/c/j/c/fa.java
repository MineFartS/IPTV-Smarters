package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public final class fa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final da<?> f12813a = new ga();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final da<?> f12814b = a();

    public static da<?> a() {
        try {
            return (da) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    public static da<?> b() {
        return f12813a;
    }

    public static da<?> c() {
        da<?> daVar = f12814b;
        if (daVar != null) {
            return daVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
