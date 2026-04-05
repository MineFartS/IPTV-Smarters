package c.f.a.b.e3.g1.o0;

import c.f.a.b.e3.g1.q;
import c.f.a.b.j3.g;
import c.f.a.b.j3.h0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.t2.n;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.l;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f7639a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a0 f7641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7642d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7645g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f7640b = new h0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7643e = -9223372036854775807L;

    public c(q qVar) {
        this.f7639a = qVar;
    }

    public static long j(long j2, long j3, long j4, int i2) {
        return j2 + x0.P0(j3 - j4, 1000000L, i2);
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void a(long j2, long j3) {
        this.f7643e = j2;
        this.f7645g = j3;
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void b(i0 i0Var, long j2, int i2, boolean z) {
        int iD = i0Var.D() & 3;
        int iD2 = i0Var.D() & 255;
        long j3 = j(this.f7645g, j2, this.f7643e, this.f7639a.f7662b);
        if (iD == 0) {
            e();
            if (iD2 == 1) {
                i(i0Var, j3);
                return;
            } else {
                h(i0Var, iD2, j3);
                return;
            }
        }
        if (iD == 1 || iD == 2) {
            e();
        } else if (iD != 3) {
            throw new IllegalArgumentException(String.valueOf(iD));
        }
        g(i0Var, z, iD, j3);
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void c(long j2, int i2) {
        g.g(this.f7643e == -9223372036854775807L);
        this.f7643e = j2;
    }

    @Override // c.f.a.b.e3.g1.o0.e
    public void d(l lVar, int i2) {
        a0 a0VarE = lVar.e(i2, 1);
        this.f7641c = a0VarE;
        a0VarE.e(this.f7639a.f7663c);
    }

    public final void e() {
        if (this.f7642d > 0) {
            f();
        }
    }

    public final void f() {
        ((a0) x0.i(this.f7641c)).d(this.f7644f, 1, this.f7642d, 0, null);
        this.f7642d = 0;
    }

    public final void g(i0 i0Var, boolean z, int i2, long j2) {
        int iA = i0Var.a();
        ((a0) g.e(this.f7641c)).c(i0Var, iA);
        this.f7642d += iA;
        this.f7644f = j2;
        if (z && i2 == 3) {
            f();
        }
    }

    public final void h(i0 i0Var, int i2, long j2) {
        this.f7640b.n(i0Var.d());
        this.f7640b.s(2);
        for (int i3 = 0; i3 < i2; i3++) {
            n.b bVarE = n.e(this.f7640b);
            ((a0) g.e(this.f7641c)).c(i0Var, bVarE.f10139e);
            ((a0) x0.i(this.f7641c)).d(j2, 1, bVarE.f10139e, 0, null);
            j2 += ((long) (bVarE.f10140f / bVarE.f10137c)) * 1000000;
            this.f7640b.s(bVarE.f10139e);
        }
    }

    public final void i(i0 i0Var, long j2) {
        int iA = i0Var.a();
        ((a0) g.e(this.f7641c)).c(i0Var, iA);
        ((a0) x0.i(this.f7641c)).d(j2, 1, iA, 0, null);
    }
}
