package c.c.b;

import c.c.b.b;

/* JADX INFO: loaded from: classes.dex */
public class p<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f5252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b.a f5253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f5254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5255d;

    public interface a {
        void b(u uVar);
    }

    public interface b<T> {
        void a(T t);
    }

    public p(u uVar) {
        this.f5255d = false;
        this.f5252a = null;
        this.f5253b = null;
        this.f5254c = uVar;
    }

    public p(T t, b.a aVar) {
        this.f5255d = false;
        this.f5252a = t;
        this.f5253b = aVar;
        this.f5254c = null;
    }

    public static <T> p<T> a(u uVar) {
        return new p<>(uVar);
    }

    public static <T> p<T> c(T t, b.a aVar) {
        return new p<>(t, aVar);
    }

    public boolean b() {
        return this.f5254c == null;
    }
}
