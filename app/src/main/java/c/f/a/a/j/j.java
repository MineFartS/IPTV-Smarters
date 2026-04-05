package c.f.a.a.j;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class j implements c.f.a.a.j.v.a.b<Executor> {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f6182a = new j();
    }

    public static j a() {
        return a.f6182a;
    }

    public static Executor b() {
        return (Executor) c.f.a.a.j.v.a.d.c(i.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // g.a.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Executor get() {
        return b();
    }
}
