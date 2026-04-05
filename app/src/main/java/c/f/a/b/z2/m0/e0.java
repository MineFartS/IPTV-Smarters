package c.f.a.b.z2.m0;

import c.f.a.b.k1;
import c.f.a.b.z2.m0.i0;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<k1> f11145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.z2.a0[] f11146b;

    public e0(List<k1> list) {
        this.f11145a = list;
        this.f11146b = new c.f.a.b.z2.a0[list.size()];
    }

    public void a(long j2, c.f.a.b.j3.i0 i0Var) {
        c.f.a.b.z2.d.a(j2, i0Var, this.f11146b);
    }

    public void b(c.f.a.b.z2.l lVar, i0.d dVar) {
        for (int i2 = 0; i2 < this.f11146b.length; i2++) {
            dVar.a();
            c.f.a.b.z2.a0 a0VarE = lVar.e(dVar.c(), 3);
            k1 k1Var = this.f11145a.get(i2);
            String str = k1Var.f9338m;
            c.f.a.b.j3.g.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption mime type provided: " + str);
            String strB = k1Var.f9327b;
            if (strB == null) {
                strB = dVar.b();
            }
            a0VarE.e(new k1.b().S(strB).e0(str).g0(k1Var.f9330e).V(k1Var.f9329d).F(k1Var.E).T(k1Var.f9340o).E());
            this.f11146b[i2] = a0VarE;
        }
    }
}
