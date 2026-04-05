package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class m7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l7 f13432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l7 f13433b;

    static {
        l7 l7Var;
        try {
            l7Var = (l7) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            l7Var = null;
        }
        f13432a = l7Var;
        f13433b = new l7();
    }

    public static l7 a() {
        return f13432a;
    }

    public static l7 b() {
        return f13433b;
    }
}
