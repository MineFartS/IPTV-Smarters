package c.f.a.a.j.v.a;

/* JADX INFO: loaded from: classes.dex */
public final class a<T> implements g.a.a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f6227a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile g.a.a<T> f6228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f6229c = f6227a;

    public a(g.a.a<T> aVar) {
        this.f6228b = aVar;
    }

    public static <P extends g.a.a<T>, T> g.a.a<T> a(P p) {
        d.b(p);
        return p instanceof a ? p : new a(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != f6227a) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // g.a.a
    public T get() {
        T t = (T) this.f6229c;
        Object obj = f6227a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f6229c;
                if (t == obj) {
                    t = this.f6228b.get();
                    this.f6229c = b(this.f6229c, t);
                    this.f6228b = null;
                }
            }
        }
        return t;
    }
}
