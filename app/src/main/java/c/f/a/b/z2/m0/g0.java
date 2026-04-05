package c.f.a.b.z2.m0;

import c.f.a.b.j3.u0;
import c.f.a.b.j3.x0;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11167a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f11170d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11171e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f11172f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u0 f11168b = new u0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11173g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f11174h = -9223372036854775807L;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f11175i = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11169c = new c.f.a.b.j3.i0();

    public g0(int i2) {
        this.f11167a = i2;
    }

    public final int a(c.f.a.b.z2.k kVar) {
        this.f11169c.M(x0.f9301f);
        this.f11170d = true;
        kVar.r();
        return 0;
    }

    public long b() {
        return this.f11175i;
    }

    public u0 c() {
        return this.f11168b;
    }

    public boolean d() {
        return this.f11170d;
    }

    public int e(c.f.a.b.z2.k kVar, c.f.a.b.z2.w wVar, int i2) {
        if (i2 <= 0) {
            return a(kVar);
        }
        if (!this.f11172f) {
            return h(kVar, wVar, i2);
        }
        if (this.f11174h == -9223372036854775807L) {
            return a(kVar);
        }
        if (!this.f11171e) {
            return f(kVar, wVar, i2);
        }
        long j2 = this.f11173g;
        if (j2 == -9223372036854775807L) {
            return a(kVar);
        }
        this.f11175i = this.f11168b.b(this.f11174h) - this.f11168b.b(j2);
        return a(kVar);
    }

    public final int f(c.f.a.b.z2.k kVar, c.f.a.b.z2.w wVar, int i2) {
        int iMin = (int) Math.min(this.f11167a, kVar.getLength());
        long j2 = 0;
        if (kVar.getPosition() != j2) {
            wVar.f11506a = j2;
            return 1;
        }
        this.f11169c.L(iMin);
        kVar.r();
        kVar.u(this.f11169c.d(), 0, iMin);
        this.f11173g = g(this.f11169c, i2);
        this.f11171e = true;
        return 0;
    }

    public final long g(c.f.a.b.j3.i0 i0Var, int i2) {
        int iF = i0Var.f();
        for (int iE = i0Var.e(); iE < iF; iE++) {
            if (i0Var.d()[iE] == 71) {
                long jC = j0.c(i0Var, iE, i2);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final int h(c.f.a.b.z2.k kVar, c.f.a.b.z2.w wVar, int i2) {
        long length = kVar.getLength();
        int iMin = (int) Math.min(this.f11167a, length);
        long j2 = length - ((long) iMin);
        if (kVar.getPosition() != j2) {
            wVar.f11506a = j2;
            return 1;
        }
        this.f11169c.L(iMin);
        kVar.r();
        kVar.u(this.f11169c.d(), 0, iMin);
        this.f11174h = i(this.f11169c, i2);
        this.f11172f = true;
        return 0;
    }

    public final long i(c.f.a.b.j3.i0 i0Var, int i2) {
        int iE = i0Var.e();
        int iF = i0Var.f();
        for (int i3 = iF - 188; i3 >= iE; i3--) {
            if (j0.b(i0Var.d(), iE, iF, i3)) {
                long jC = j0.c(i0Var, i3, i2);
                if (jC != -9223372036854775807L) {
                    return jC;
                }
            }
        }
        return -9223372036854775807L;
    }
}
