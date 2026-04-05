package c.f.a.b.z2.m0;

import c.f.a.b.k1;
import c.f.a.b.z2.m0.i0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k1> f11255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.z2.a0[] f11256b;

    public k0(List<k1> list) {
        this.f11255a = list;
        this.f11256b = new c.f.a.b.z2.a0[list.size()];
    }

    public void a(long j2, c.f.a.b.j3.i0 i0Var) {
        if (i0Var.a() < 9) {
            return;
        }
        int iN = i0Var.n();
        int iN2 = i0Var.n();
        int iD = i0Var.D();
        if (iN == 434 && iN2 == 1195456820 && iD == 3) {
            c.f.a.b.z2.d.b(j2, i0Var, this.f11256b);
        }
    }

    public void b(c.f.a.b.z2.l lVar, i0.d dVar) {
        for (int i2 = 0; i2 < this.f11256b.length; i2++) {
            dVar.a();
            c.f.a.b.z2.a0 a0VarE = lVar.e(dVar.c(), 3);
            k1 k1Var = this.f11255a.get(i2);
            String str = k1Var.f9338m;
            c.f.a.b.j3.g.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            a0VarE.e(new k1.b().S(dVar.b()).e0(str).g0(k1Var.f9330e).V(k1Var.f9329d).F(k1Var.E).T(k1Var.f9340o).E());
            this.f11256b[i2] = a0VarE;
        }
    }
}
