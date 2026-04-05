package c.f.a.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class u0 implements h2, j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10216b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k2 f10218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.a.b.e3.s0 f10221g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k1[] f10222h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f10223i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f10224j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10226l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10227m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1 f10217c = new l1();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f10225k = Long.MIN_VALUE;

    public u0(int i2) {
        this.f10216b = i2;
    }

    public final int A() {
        return this.f10219e;
    }

    public final k1[] B() {
        return (k1[]) c.f.a.b.j3.g.e(this.f10222h);
    }

    public final boolean C() {
        return f() ? this.f10226l : ((c.f.a.b.e3.s0) c.f.a.b.j3.g.e(this.f10221g)).e();
    }

    public abstract void D();

    public void E(boolean z, boolean z2) {
    }

    public abstract void F(long j2, boolean z);

    public void G() {
    }

    public void H() {
    }

    public void I() {
    }

    public void J(k1[] k1VarArr, long j2, long j3) {
    }

    public final int K(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
        int i3 = ((c.f.a.b.e3.s0) c.f.a.b.j3.g.e(this.f10221g)).i(l1Var, fVar, i2);
        if (i3 == -4) {
            if (fVar.isEndOfStream()) {
                this.f10225k = Long.MIN_VALUE;
                return this.f10226l ? -4 : -3;
            }
            long j2 = fVar.f10278e + this.f10223i;
            fVar.f10278e = j2;
            this.f10225k = Math.max(this.f10225k, j2);
        } else if (i3 == -5) {
            k1 k1Var = (k1) c.f.a.b.j3.g.e(l1Var.f9575b);
            if (k1Var.q != Long.MAX_VALUE) {
                l1Var.f9575b = k1Var.b().i0(k1Var.q + this.f10223i).E();
            }
        }
        return i3;
    }

    public int L(long j2) {
        return ((c.f.a.b.e3.s0) c.f.a.b.j3.g.e(this.f10221g)).p(j2 - this.f10223i);
    }

    @Override // c.f.a.b.h2
    public final void disable() {
        c.f.a.b.j3.g.g(this.f10220f == 1);
        this.f10217c.a();
        this.f10220f = 0;
        this.f10221g = null;
        this.f10222h = null;
        this.f10226l = false;
        D();
    }

    @Override // c.f.a.b.h2
    public final boolean f() {
        return this.f10225k == Long.MIN_VALUE;
    }

    @Override // c.f.a.b.h2
    public final void g(k1[] k1VarArr, c.f.a.b.e3.s0 s0Var, long j2, long j3) {
        c.f.a.b.j3.g.g(!this.f10226l);
        this.f10221g = s0Var;
        if (this.f10225k == Long.MIN_VALUE) {
            this.f10225k = j2;
        }
        this.f10222h = k1VarArr;
        this.f10223i = j3;
        J(k1VarArr, j2, j3);
    }

    @Override // c.f.a.b.h2
    public final int getState() {
        return this.f10220f;
    }

    @Override // c.f.a.b.h2, c.f.a.b.j2
    public final int getTrackType() {
        return this.f10216b;
    }

    @Override // c.f.a.b.h2
    public final void h() {
        this.f10226l = true;
    }

    @Override // c.f.a.b.h2
    public final j2 i() {
        return this;
    }

    @Override // c.f.a.b.h2
    public /* synthetic */ void k(float f2, float f3) {
        g2.a(this, f2, f3);
    }

    @Override // c.f.a.b.h2
    public final void l(int i2) {
        this.f10219e = i2;
    }

    @Override // c.f.a.b.h2
    public final void m(k2 k2Var, k1[] k1VarArr, c.f.a.b.e3.s0 s0Var, long j2, boolean z, boolean z2, long j3, long j4) {
        c.f.a.b.j3.g.g(this.f10220f == 0);
        this.f10218d = k2Var;
        this.f10220f = 1;
        this.f10224j = j2;
        E(z, z2);
        g(k1VarArr, s0Var, j3, j4);
        F(j2, z);
    }

    public int n() {
        return 0;
    }

    @Override // c.f.a.b.d2.b
    public void p(int i2, Object obj) {
    }

    @Override // c.f.a.b.h2
    public final c.f.a.b.e3.s0 q() {
        return this.f10221g;
    }

    @Override // c.f.a.b.h2
    public final void r() {
        ((c.f.a.b.e3.s0) c.f.a.b.j3.g.e(this.f10221g)).a();
    }

    @Override // c.f.a.b.h2
    public final void reset() {
        c.f.a.b.j3.g.g(this.f10220f == 0);
        this.f10217c.a();
        G();
    }

    @Override // c.f.a.b.h2
    public final long s() {
        return this.f10225k;
    }

    @Override // c.f.a.b.h2
    public final void start() {
        c.f.a.b.j3.g.g(this.f10220f == 1);
        this.f10220f = 2;
        H();
    }

    @Override // c.f.a.b.h2
    public final void stop() {
        c.f.a.b.j3.g.g(this.f10220f == 2);
        this.f10220f = 1;
        I();
    }

    @Override // c.f.a.b.h2
    public final void t(long j2) {
        this.f10226l = false;
        this.f10224j = j2;
        this.f10225k = j2;
        F(j2, false);
    }

    @Override // c.f.a.b.h2
    public final boolean u() {
        return this.f10226l;
    }

    @Override // c.f.a.b.h2
    public c.f.a.b.j3.b0 v() {
        return null;
    }

    public final d1 w(Throwable th, k1 k1Var, int i2) {
        return x(th, k1Var, false, i2);
    }

    public final d1 x(Throwable th, k1 k1Var, boolean z, int i2) {
        int i3;
        if (k1Var == null || this.f10227m) {
            i3 = 4;
        } else {
            this.f10227m = true;
            try {
                int iD = i2.d(a(k1Var));
                this.f10227m = false;
                i3 = iD;
            } catch (d1 unused) {
                this.f10227m = false;
                i3 = 4;
            } catch (Throwable th2) {
                this.f10227m = false;
                throw th2;
            }
        }
        return d1.d(th, getName(), A(), k1Var, i3, z, i2);
    }

    public final k2 y() {
        return (k2) c.f.a.b.j3.g.e(this.f10218d);
    }

    public final l1 z() {
        this.f10217c.a();
        return this.f10217c;
    }
}
