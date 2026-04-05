package c.d.a.r;

/* JADX INFO: loaded from: classes.dex */
public class f implements c, b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f5913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f5914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c f5915c;

    public f(c cVar) {
        this.f5915c = cVar;
    }

    @Override // c.d.a.r.c
    public boolean a() {
        return k() || d();
    }

    @Override // c.d.a.r.b
    public void b() {
        this.f5913a.b();
        this.f5914b.b();
    }

    @Override // c.d.a.r.c
    public boolean c(b bVar) {
        return i() && bVar.equals(this.f5913a) && !a();
    }

    @Override // c.d.a.r.b
    public void clear() {
        this.f5914b.clear();
        this.f5913a.clear();
    }

    @Override // c.d.a.r.b
    public boolean d() {
        return this.f5913a.d() || this.f5914b.d();
    }

    @Override // c.d.a.r.c
    public boolean e(b bVar) {
        return j() && (bVar.equals(this.f5913a) || !this.f5913a.d());
    }

    @Override // c.d.a.r.c
    public void f(b bVar) {
        if (bVar.equals(this.f5914b)) {
            return;
        }
        c cVar = this.f5915c;
        if (cVar != null) {
            cVar.f(this);
        }
        if (this.f5914b.h()) {
            return;
        }
        this.f5914b.clear();
    }

    @Override // c.d.a.r.b
    public void g() {
        if (!this.f5914b.isRunning()) {
            this.f5914b.g();
        }
        if (this.f5913a.isRunning()) {
            return;
        }
        this.f5913a.g();
    }

    @Override // c.d.a.r.b
    public boolean h() {
        return this.f5913a.h() || this.f5914b.h();
    }

    public final boolean i() {
        c cVar = this.f5915c;
        return cVar == null || cVar.c(this);
    }

    @Override // c.d.a.r.b
    public boolean isCancelled() {
        return this.f5913a.isCancelled();
    }

    @Override // c.d.a.r.b
    public boolean isRunning() {
        return this.f5913a.isRunning();
    }

    public final boolean j() {
        c cVar = this.f5915c;
        return cVar == null || cVar.e(this);
    }

    public final boolean k() {
        c cVar = this.f5915c;
        return cVar != null && cVar.a();
    }

    public void l(b bVar, b bVar2) {
        this.f5913a = bVar;
        this.f5914b = bVar2;
    }

    @Override // c.d.a.r.b
    public void pause() {
        this.f5913a.pause();
        this.f5914b.pause();
    }
}
