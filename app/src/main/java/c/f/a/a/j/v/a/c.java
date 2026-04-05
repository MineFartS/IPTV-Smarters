package c.f.a.a.j.v.a;

/* JADX INFO: loaded from: classes.dex */
public final class c<T> implements b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c<Object> f6230a = new c<>(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f6231b;

    public c(T t) {
        this.f6231b = t;
    }

    public static <T> b<T> a(T t) {
        return new c(d.c(t, "instance cannot be null"));
    }

    @Override // g.a.a
    public T get() {
        return this.f6231b;
    }
}
