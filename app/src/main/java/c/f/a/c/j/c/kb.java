package c.f.a.c.j.c;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final kb f12910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kb f12911b;

    static {
        jb jbVar = null;
        f12910a = new nb();
        f12911b = new lb();
    }

    public kb() {
    }

    public static kb c() {
        return f12910a;
    }

    public static kb d() {
        return f12911b;
    }

    public abstract void a(Object obj, long j2);

    public abstract <L> void b(Object obj, Object obj2, long j2);
}
