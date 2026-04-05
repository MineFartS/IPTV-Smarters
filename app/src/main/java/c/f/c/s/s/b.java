package c.f.c.s.s;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static b f16330a;

    public static b b() {
        if (f16330a == null) {
            f16330a = new b();
        }
        return f16330a;
    }

    @Override // c.f.c.s.s.a
    public long a() {
        return System.currentTimeMillis();
    }
}
