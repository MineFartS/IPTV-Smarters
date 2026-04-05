package c.f.c.k;

/* JADX INFO: loaded from: classes2.dex */
public class b0<T> implements c.f.c.r.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.c.r.a<Object> f16060a = z.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.f.c.r.b<Object> f16061b = a0.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f.c.r.a<T> f16062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile c.f.c.r.b<T> f16063d;

    public b0(c.f.c.r.a<T> aVar, c.f.c.r.b<T> bVar) {
        this.f16062c = aVar;
        this.f16063d = bVar;
    }

    public static <T> b0<T> a() {
        return new b0<>(f16060a, f16061b);
    }

    public static /* synthetic */ void b(c.f.c.r.b bVar) {
    }

    public static /* synthetic */ Object c() {
        return null;
    }

    public void d(c.f.c.r.b<T> bVar) {
        c.f.c.r.a<T> aVar;
        if (this.f16063d != f16061b) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            aVar = this.f16062c;
            this.f16062c = null;
            this.f16063d = bVar;
        }
        aVar.a(bVar);
    }

    @Override // c.f.c.r.b
    public T get() {
        return this.f16063d.get();
    }
}
