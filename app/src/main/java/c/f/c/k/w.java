package c.f.c.k;

/* JADX INFO: loaded from: classes2.dex */
public class w<T> implements c.f.c.r.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f16122a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f16123b = f16122a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c.f.c.r.b<T> f16124c;

    public w(c.f.c.r.b<T> bVar) {
        this.f16124c = bVar;
    }

    @Override // c.f.c.r.b
    public T get() {
        T t = (T) this.f16123b;
        Object obj = f16122a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f16123b;
                if (t == obj) {
                    t = this.f16124c.get();
                    this.f16123b = t;
                    this.f16124c = null;
                }
            }
        }
        return t;
    }
}
