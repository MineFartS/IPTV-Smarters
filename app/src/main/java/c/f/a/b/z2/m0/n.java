package c.f.a.b.z2.m0;

import c.f.a.b.k1;
import c.f.a.b.z2.m0.i0;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<i0.a> f11270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.z2.a0[] f11271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f11273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f11275f;

    public n(List<i0.a> list) {
        this.f11270a = list;
        this.f11271b = new c.f.a.b.z2.a0[list.size()];
    }

    public final boolean a(c.f.a.b.j3.i0 i0Var, int i2) {
        if (i0Var.a() == 0) {
            return false;
        }
        if (i0Var.D() != i2) {
            this.f11272c = false;
        }
        this.f11273d--;
        return this.f11272c;
    }

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        if (this.f11272c) {
            if (this.f11273d != 2 || a(i0Var, 32)) {
                if (this.f11273d != 1 || a(i0Var, 0)) {
                    int iE = i0Var.e();
                    int iA = i0Var.a();
                    for (c.f.a.b.z2.a0 a0Var : this.f11271b) {
                        i0Var.P(iE);
                        a0Var.c(i0Var, iA);
                    }
                    this.f11274e += iA;
                }
            }
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        this.f11272c = false;
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
        if (this.f11272c) {
            for (c.f.a.b.z2.a0 a0Var : this.f11271b) {
                a0Var.d(this.f11275f, 1, this.f11274e, 0, null);
            }
            this.f11272c = false;
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        for (int i2 = 0; i2 < this.f11271b.length; i2++) {
            i0.a aVar = this.f11270a.get(i2);
            dVar.a();
            c.f.a.b.z2.a0 a0VarE = lVar.e(dVar.c(), 3);
            a0VarE.e(new k1.b().S(dVar.b()).e0("application/dvbsubs").T(Collections.singletonList(aVar.f11217c)).V(aVar.f11215a).E());
            this.f11271b[i2] = a0VarE;
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f11272c = true;
        this.f11275f = j2;
        this.f11274e = 0;
        this.f11273d = 2;
    }
}
