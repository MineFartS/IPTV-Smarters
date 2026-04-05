package c.f.a.c.k.b;

/* JADX INFO: loaded from: classes2.dex */
public final class l9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.c.f.t.d f14068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14069b;

    public l9(c.f.a.c.f.t.d dVar) {
        c.f.a.c.f.q.o.i(dVar);
        this.f14068a = dVar;
    }

    public final void a() {
        this.f14069b = this.f14068a.b();
    }

    public final void b() {
        this.f14069b = 0L;
    }

    public final boolean c(long j2) {
        return this.f14069b == 0 || this.f14068a.b() - this.f14069b >= 3600000;
    }
}
