package c.f.a.b.e3.h1;

import c.f.a.b.c3.i0;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.d1.i;
import c.f.a.b.e3.f0;
import c.f.a.b.e3.h1.d;
import c.f.a.b.e3.h1.f.a;
import c.f.a.b.e3.j0;
import c.f.a.b.e3.s0;
import c.f.a.b.e3.t0;
import c.f.a.b.e3.u;
import c.f.a.b.e3.z0;
import c.f.a.b.g3.h;
import c.f.a.b.i3.f;
import c.f.a.b.i3.h0;
import c.f.a.b.i3.n0;
import c.f.a.b.k1;
import c.f.a.b.m2;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.c0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements f0, t0.a<i<d>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d.a f7759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f7760c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0 f7761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c0 f7762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0.a f7763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.b.i3.f0 f7764g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0.a f7765h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f7766i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a1 f7767j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f7768k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f0.a f7769l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.f.a.b.e3.h1.f.a f7770m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i<d>[] f7771n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public t0 f7772o;

    public e(c.f.a.b.e3.h1.f.a aVar, d.a aVar2, n0 n0Var, u uVar, c0 c0Var, a0.a aVar3, c.f.a.b.i3.f0 f0Var, j0.a aVar4, h0 h0Var, f fVar) {
        this.f7770m = aVar;
        this.f7759b = aVar2;
        this.f7760c = n0Var;
        this.f7761d = h0Var;
        this.f7762e = c0Var;
        this.f7763f = aVar3;
        this.f7764g = f0Var;
        this.f7765h = aVar4;
        this.f7766i = fVar;
        this.f7768k = uVar;
        this.f7767j = e(aVar, c0Var);
        i<d>[] iVarArrM = m(0);
        this.f7771n = iVarArrM;
        this.f7772o = uVar.a(iVarArrM);
    }

    public static a1 e(c.f.a.b.e3.h1.f.a aVar, c0 c0Var) {
        z0[] z0VarArr = new z0[aVar.f7778f.length];
        int i2 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f7778f;
            if (i2 >= bVarArr.length) {
                return new a1(z0VarArr);
            }
            k1[] k1VarArr = bVarArr[i2].f7793j;
            k1[] k1VarArr2 = new k1[k1VarArr.length];
            for (int i3 = 0; i3 < k1VarArr.length; i3++) {
                k1 k1Var = k1VarArr[i3];
                k1VarArr2[i3] = k1Var.c(c0Var.c(k1Var));
            }
            z0VarArr[i2] = new z0(k1VarArr2);
            i2++;
        }
    }

    public static i<d>[] m(int i2) {
        return new i[i2];
    }

    public final i<d> a(h hVar, long j2) {
        int iC = this.f7767j.c(hVar.a());
        return new i<>(this.f7770m.f7778f[iC].f7784a, null, null, this.f7759b.a(this.f7761d, this.f7770m, iC, hVar, this.f7760c), this, this.f7766i, j2, this.f7762e, this.f7763f, this.f7764g, this.f7765h);
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long b() {
        return this.f7772o.b();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean c(long j2) {
        return this.f7772o.c(j2);
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean d() {
        return this.f7772o.d();
    }

    @Override // c.f.a.b.e3.f0
    public long f(long j2, m2 m2Var) {
        for (i<d> iVar : this.f7771n) {
            if (iVar.f7033b == 2) {
                return iVar.f(j2, m2Var);
            }
        }
        return j2;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long g() {
        return this.f7772o.g();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public void h(long j2) {
        this.f7772o.h(j2);
    }

    @Override // c.f.a.b.e3.f0
    public List<i0> l(List<h> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            h hVar = list.get(i2);
            int iC = this.f7767j.c(hVar.a());
            for (int i3 = 0; i3 < hVar.length(); i3++) {
                arrayList.add(new i0(iC, hVar.h(i3)));
            }
        }
        return arrayList;
    }

    @Override // c.f.a.b.e3.f0
    public void n() {
        this.f7761d.a();
    }

    @Override // c.f.a.b.e3.f0
    public long o(long j2) {
        for (i<d> iVar : this.f7771n) {
            iVar.T(j2);
        }
        return j2;
    }

    @Override // c.f.a.b.e3.t0.a
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void i(i<d> iVar) {
        this.f7769l.i(this);
    }

    @Override // c.f.a.b.e3.f0
    public long q() {
        return -9223372036854775807L;
    }

    @Override // c.f.a.b.e3.f0
    public void r(f0.a aVar, long j2) {
        this.f7769l = aVar;
        aVar.k(this);
    }

    @Override // c.f.a.b.e3.f0
    public long s(h[] hVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j2) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            if (s0VarArr[i2] != null) {
                i iVar = (i) s0VarArr[i2];
                if (hVarArr[i2] == null || !zArr[i2]) {
                    iVar.Q();
                    s0VarArr[i2] = null;
                } else {
                    ((d) iVar.F()).b(hVarArr[i2]);
                    arrayList.add(iVar);
                }
            }
            if (s0VarArr[i2] == null && hVarArr[i2] != null) {
                i<d> iVarA = a(hVarArr[i2], j2);
                arrayList.add(iVarA);
                s0VarArr[i2] = iVarA;
                zArr2[i2] = true;
            }
        }
        i<d>[] iVarArrM = m(arrayList.size());
        this.f7771n = iVarArrM;
        arrayList.toArray(iVarArrM);
        this.f7772o = this.f7768k.a(this.f7771n);
        return j2;
    }

    @Override // c.f.a.b.e3.f0
    public a1 t() {
        return this.f7767j;
    }

    public void u() {
        for (i<d> iVar : this.f7771n) {
            iVar.Q();
        }
        this.f7769l = null;
    }

    @Override // c.f.a.b.e3.f0
    public void v(long j2, boolean z) {
        for (i<d> iVar : this.f7771n) {
            iVar.v(j2, z);
        }
    }

    public void w(c.f.a.b.e3.h1.f.a aVar) {
        this.f7770m = aVar;
        for (i<d> iVar : this.f7771n) {
            ((d) iVar.F()).d(aVar);
        }
        this.f7769l.i(this);
    }
}
