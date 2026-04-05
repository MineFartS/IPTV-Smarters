package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class x7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w7 f13632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w7 f13633b;

    static {
        w7 w7Var;
        try {
            w7Var = (w7) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            w7Var = null;
        }
        f13632a = w7Var;
        f13633b = new w7();
    }

    public static w7 a() {
        return f13632a;
    }

    public static w7 b() {
        return f13633b;
    }
}
