package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e7 f13302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e7 f13303b;

    static {
        b7 b7Var = null;
        f13302a = new c7(b7Var);
        f13303b = new d7(b7Var);
    }

    public /* synthetic */ e7(b7 b7Var) {
    }

    public static e7 c() {
        return f13302a;
    }

    public static e7 d() {
        return f13303b;
    }

    public abstract void a(Object obj, long j2);

    public abstract <L> void b(Object obj, Object obj2, long j2);
}
