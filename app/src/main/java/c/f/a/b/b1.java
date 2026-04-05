package c.f.a.b;

/* JADX INFO: loaded from: classes.dex */
public final class b1 implements c.f.a.b.j3.b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.j3.q0 f6513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f6514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h2 f6515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c.f.a.b.j3.b0 f6516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f6517f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6518g;

    public interface a {
        void d(z1 z1Var);
    }

    public b1(a aVar, c.f.a.b.j3.i iVar) {
        this.f6514c = aVar;
        this.f6513b = new c.f.a.b.j3.q0(iVar);
    }

    public void a(h2 h2Var) {
        if (h2Var == this.f6515d) {
            this.f6516e = null;
            this.f6515d = null;
            this.f6517f = true;
        }
    }

    public void b(h2 h2Var) throws d1 {
        c.f.a.b.j3.b0 b0Var;
        c.f.a.b.j3.b0 b0VarV = h2Var.v();
        if (b0VarV == null || b0VarV == (b0Var = this.f6516e)) {
            return;
        }
        if (b0Var != null) {
            throw d1.f(new IllegalStateException("Multiple renderer media clocks enabled."));
        }
        this.f6516e = b0VarV;
        this.f6515d = h2Var;
        b0VarV.d(this.f6513b.c());
    }

    @Override // c.f.a.b.j3.b0
    public z1 c() {
        c.f.a.b.j3.b0 b0Var = this.f6516e;
        return b0Var != null ? b0Var.c() : this.f6513b.c();
    }

    @Override // c.f.a.b.j3.b0
    public void d(z1 z1Var) {
        c.f.a.b.j3.b0 b0Var = this.f6516e;
        if (b0Var != null) {
            b0Var.d(z1Var);
            z1Var = this.f6516e.c();
        }
        this.f6513b.d(z1Var);
    }

    public void e(long j2) {
        this.f6513b.a(j2);
    }

    public final boolean f(boolean z) {
        h2 h2Var = this.f6515d;
        return h2Var == null || h2Var.b() || (!this.f6515d.e() && (z || this.f6515d.f()));
    }

    public void g() {
        this.f6518g = true;
        this.f6513b.b();
    }

    public void h() {
        this.f6518g = false;
        this.f6513b.e();
    }

    public long i(boolean z) {
        k(z);
        return j();
    }

    @Override // c.f.a.b.j3.b0
    public long j() {
        return this.f6517f ? this.f6513b.j() : ((c.f.a.b.j3.b0) c.f.a.b.j3.g.e(this.f6516e)).j();
    }

    public final void k(boolean z) {
        if (f(z)) {
            this.f6517f = true;
            if (this.f6518g) {
                this.f6513b.b();
                return;
            }
            return;
        }
        c.f.a.b.j3.b0 b0Var = (c.f.a.b.j3.b0) c.f.a.b.j3.g.e(this.f6516e);
        long j2 = b0Var.j();
        if (this.f6517f) {
            if (j2 < this.f6513b.j()) {
                this.f6513b.e();
                return;
            } else {
                this.f6517f = false;
                if (this.f6518g) {
                    this.f6513b.b();
                }
            }
        }
        this.f6513b.a(j2);
        z1 z1VarC = b0Var.c();
        if (z1VarC.equals(this.f6513b.c())) {
            return;
        }
        this.f6513b.d(z1VarC);
        this.f6514c.d(z1VarC);
    }
}
