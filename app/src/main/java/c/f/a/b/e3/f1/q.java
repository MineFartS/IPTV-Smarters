package c.f.a.b.e3.f1;

import c.f.a.b.e3.s0;
import c.f.a.b.l1;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f7321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7322d = -1;

    public q(r rVar, int i2) {
        this.f7321c = rVar;
        this.f7320b = i2;
    }

    @Override // c.f.a.b.e3.s0
    public void a() throws t {
        int i2 = this.f7322d;
        if (i2 == -2) {
            throw new t(this.f7321c.t().b(this.f7320b).b(0).f9338m);
        }
        if (i2 == -1) {
            this.f7321c.V();
        } else if (i2 != -3) {
            this.f7321c.W(i2);
        }
    }

    public void b() {
        c.f.a.b.j3.g.a(this.f7322d == -1);
        this.f7322d = this.f7321c.x(this.f7320b);
    }

    public final boolean c() {
        int i2 = this.f7322d;
        return (i2 == -1 || i2 == -3 || i2 == -2) ? false : true;
    }

    public void d() {
        if (this.f7322d != -1) {
            this.f7321c.q0(this.f7320b);
            this.f7322d = -1;
        }
    }

    @Override // c.f.a.b.e3.s0
    public boolean e() {
        return this.f7322d == -3 || (c() && this.f7321c.Q(this.f7322d));
    }

    @Override // c.f.a.b.e3.s0
    public int i(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
        if (this.f7322d == -3) {
            fVar.addFlag(4);
            return -4;
        }
        if (c()) {
            return this.f7321c.f0(this.f7322d, l1Var, fVar, i2);
        }
        return -3;
    }

    @Override // c.f.a.b.e3.s0
    public int p(long j2) {
        if (c()) {
            return this.f7321c.p0(this.f7322d, j2);
        }
        return 0;
    }
}
