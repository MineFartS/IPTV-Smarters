package c.d.a.n.i;

import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public class h<Z> implements l<Z> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<Z> f5579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f5580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f5581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.d.a.n.c f5582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5584f;

    public interface a {
        void d(c.d.a.n.c cVar, h<?> hVar);
    }

    public h(l<Z> lVar, boolean z) {
        if (lVar == null) {
            throw new NullPointerException("Wrapped resource must not be null");
        }
        this.f5579a = lVar;
        this.f5580b = z;
    }

    public void a() {
        if (this.f5584f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
        this.f5583e++;
    }

    @Override // c.d.a.n.i.l
    public void b() {
        if (this.f5583e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f5584f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f5584f = true;
        this.f5579a.b();
    }

    public boolean c() {
        return this.f5580b;
    }

    public void d() {
        if (this.f5583e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        }
        if (!Looper.getMainLooper().equals(Looper.myLooper())) {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
        int i2 = this.f5583e - 1;
        this.f5583e = i2;
        if (i2 == 0) {
            this.f5581c.d(this.f5582d, this);
        }
    }

    public void e(c.d.a.n.c cVar, a aVar) {
        this.f5582d = cVar;
        this.f5581c = aVar;
    }

    @Override // c.d.a.n.i.l
    public Z get() {
        return this.f5579a.get();
    }

    @Override // c.d.a.n.i.l
    public int getSize() {
        return this.f5579a.getSize();
    }
}
