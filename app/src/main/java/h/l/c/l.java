package h.l.c;

/* JADX INFO: loaded from: classes2.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f30388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h.n.b[] f30389b;

    static {
        m mVar = null;
        try {
            mVar = (m) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (mVar == null) {
            mVar = new m();
        }
        f30388a = mVar;
        f30389b = new h.n.b[0];
    }

    public static h.n.b a(Class cls) {
        return f30388a.a(cls);
    }

    public static h.n.d b(i iVar) {
        return f30388a.b(iVar);
    }

    public static String c(h hVar) {
        return f30388a.d(hVar);
    }
}
