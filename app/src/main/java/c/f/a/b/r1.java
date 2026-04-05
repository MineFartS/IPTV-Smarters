package c.f.a.b;

import c.f.a.b.e3.i0;

/* JADX INFO: loaded from: classes.dex */
public final class r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.e3.f0 f9770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.e3.s0[] f9772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9773d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public s1 f9775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9776g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean[] f9777h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j2[] f9778i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c.f.a.b.g3.o f9779j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v1 f9780k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r1 f9781l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.f.a.b.e3.a1 f9782m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.f.a.b.g3.p f9783n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f9784o;

    public r1(j2[] j2VarArr, long j2, c.f.a.b.g3.o oVar, c.f.a.b.i3.f fVar, v1 v1Var, s1 s1Var, c.f.a.b.g3.p pVar) {
        this.f9778i = j2VarArr;
        this.f9784o = j2;
        this.f9779j = oVar;
        this.f9780k = v1Var;
        i0.a aVar = s1Var.f9801a;
        this.f9771b = aVar.f7476a;
        this.f9775f = s1Var;
        this.f9782m = c.f.a.b.e3.a1.f6902b;
        this.f9783n = pVar;
        this.f9772c = new c.f.a.b.e3.s0[j2VarArr.length];
        this.f9777h = new boolean[j2VarArr.length];
        this.f9770a = e(aVar, v1Var, fVar, s1Var.f9802b, s1Var.f9804d);
    }

    public static c.f.a.b.e3.f0 e(i0.a aVar, v1 v1Var, c.f.a.b.i3.f fVar, long j2, long j3) {
        c.f.a.b.e3.f0 f0VarG = v1Var.g(aVar, fVar, j2);
        return j3 != -9223372036854775807L ? new c.f.a.b.e3.q(f0VarG, true, 0L, j3) : f0VarG;
    }

    public static void u(v1 v1Var, c.f.a.b.e3.f0 f0Var) {
        try {
            if (f0Var instanceof c.f.a.b.e3.q) {
                f0Var = ((c.f.a.b.e3.q) f0Var).f7924b;
            }
            v1Var.z(f0Var);
        } catch (RuntimeException e2) {
            c.f.a.b.j3.z.e("MediaPeriodHolder", "Period release failed.", e2);
        }
    }

    public void A() {
        c.f.a.b.e3.f0 f0Var = this.f9770a;
        if (f0Var instanceof c.f.a.b.e3.q) {
            long j2 = this.f9775f.f9804d;
            if (j2 == -9223372036854775807L) {
                j2 = Long.MIN_VALUE;
            }
            ((c.f.a.b.e3.q) f0Var).u(0L, j2);
        }
    }

    public long a(c.f.a.b.g3.p pVar, long j2, boolean z) {
        return b(pVar, j2, z, new boolean[this.f9778i.length]);
    }

    public long b(c.f.a.b.g3.p pVar, long j2, boolean z, boolean[] zArr) {
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= pVar.f8522a) {
                break;
            }
            boolean[] zArr2 = this.f9777h;
            if (z || !pVar.b(this.f9783n, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        g(this.f9772c);
        f();
        this.f9783n = pVar;
        h();
        long jS = this.f9770a.s(pVar.f8524c, this.f9777h, this.f9772c, zArr, j2);
        c(this.f9772c);
        this.f9774e = false;
        int i3 = 0;
        while (true) {
            c.f.a.b.e3.s0[] s0VarArr = this.f9772c;
            if (i3 >= s0VarArr.length) {
                return jS;
            }
            if (s0VarArr[i3] != null) {
                c.f.a.b.j3.g.g(pVar.c(i3));
                if (this.f9778i[i3].getTrackType() != 7) {
                    this.f9774e = true;
                }
            } else {
                c.f.a.b.j3.g.g(pVar.f8524c[i3] == null);
            }
            i3++;
        }
    }

    public final void c(c.f.a.b.e3.s0[] s0VarArr) {
        int i2 = 0;
        while (true) {
            j2[] j2VarArr = this.f9778i;
            if (i2 >= j2VarArr.length) {
                return;
            }
            if (j2VarArr[i2].getTrackType() == 7 && this.f9783n.c(i2)) {
                s0VarArr[i2] = new c.f.a.b.e3.x();
            }
            i2++;
        }
    }

    public void d(long j2) {
        c.f.a.b.j3.g.g(r());
        this.f9770a.c(y(j2));
    }

    public final void f() {
        if (!r()) {
            return;
        }
        int i2 = 0;
        while (true) {
            c.f.a.b.g3.p pVar = this.f9783n;
            if (i2 >= pVar.f8522a) {
                return;
            }
            boolean zC = pVar.c(i2);
            c.f.a.b.g3.h hVar = this.f9783n.f8524c[i2];
            if (zC && hVar != null) {
                hVar.disable();
            }
            i2++;
        }
    }

    public final void g(c.f.a.b.e3.s0[] s0VarArr) {
        int i2 = 0;
        while (true) {
            j2[] j2VarArr = this.f9778i;
            if (i2 >= j2VarArr.length) {
                return;
            }
            if (j2VarArr[i2].getTrackType() == 7) {
                s0VarArr[i2] = null;
            }
            i2++;
        }
    }

    public final void h() {
        if (!r()) {
            return;
        }
        int i2 = 0;
        while (true) {
            c.f.a.b.g3.p pVar = this.f9783n;
            if (i2 >= pVar.f8522a) {
                return;
            }
            boolean zC = pVar.c(i2);
            c.f.a.b.g3.h hVar = this.f9783n.f8524c[i2];
            if (zC && hVar != null) {
                hVar.enable();
            }
            i2++;
        }
    }

    public long i() {
        if (!this.f9773d) {
            return this.f9775f.f9802b;
        }
        long jG = this.f9774e ? this.f9770a.g() : Long.MIN_VALUE;
        return jG == Long.MIN_VALUE ? this.f9775f.f9805e : jG;
    }

    public r1 j() {
        return this.f9781l;
    }

    public long k() {
        if (this.f9773d) {
            return this.f9770a.b();
        }
        return 0L;
    }

    public long l() {
        return this.f9784o;
    }

    public long m() {
        return this.f9775f.f9802b + this.f9784o;
    }

    public c.f.a.b.e3.a1 n() {
        return this.f9782m;
    }

    public c.f.a.b.g3.p o() {
        return this.f9783n;
    }

    public void p(float f2, p2 p2Var) {
        this.f9773d = true;
        this.f9782m = this.f9770a.t();
        c.f.a.b.g3.p pVarV = v(f2, p2Var);
        s1 s1Var = this.f9775f;
        long jMax = s1Var.f9802b;
        long j2 = s1Var.f9805e;
        if (j2 != -9223372036854775807L && jMax >= j2) {
            jMax = Math.max(0L, j2 - 1);
        }
        long jA = a(pVarV, jMax, false);
        long j3 = this.f9784o;
        s1 s1Var2 = this.f9775f;
        this.f9784o = j3 + (s1Var2.f9802b - jA);
        this.f9775f = s1Var2.b(jA);
    }

    public boolean q() {
        return this.f9773d && (!this.f9774e || this.f9770a.g() == Long.MIN_VALUE);
    }

    public final boolean r() {
        return this.f9781l == null;
    }

    public void s(long j2) {
        c.f.a.b.j3.g.g(r());
        if (this.f9773d) {
            this.f9770a.h(y(j2));
        }
    }

    public void t() {
        f();
        u(this.f9780k, this.f9770a);
    }

    public c.f.a.b.g3.p v(float f2, p2 p2Var) {
        c.f.a.b.g3.p pVarE = this.f9779j.e(this.f9778i, n(), this.f9775f.f9801a, p2Var);
        for (c.f.a.b.g3.h hVar : pVarE.f8524c) {
            if (hVar != null) {
                hVar.o(f2);
            }
        }
        return pVarE;
    }

    public void w(r1 r1Var) {
        if (r1Var == this.f9781l) {
            return;
        }
        f();
        this.f9781l = r1Var;
        h();
    }

    public void x(long j2) {
        this.f9784o = j2;
    }

    public long y(long j2) {
        return j2 - l();
    }

    public long z(long j2) {
        return j2 + l();
    }
}
