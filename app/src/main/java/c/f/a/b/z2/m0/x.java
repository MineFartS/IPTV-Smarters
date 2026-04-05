package c.f.a.b.z2.m0;

import c.f.a.b.j3.u0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.z2.m0.i0;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class x implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k1 f11432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u0 f11433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11434c;

    public x(String str) {
        this.f11432a = new k1.b().e0(str).E();
    }

    @Override // c.f.a.b.z2.m0.c0
    public void a(u0 u0Var, c.f.a.b.z2.l lVar, i0.d dVar) {
        this.f11433b = u0Var;
        dVar.a();
        c.f.a.b.z2.a0 a0VarE = lVar.e(dVar.c(), 5);
        this.f11434c = a0VarE;
        a0VarE.e(this.f11432a);
    }

    @Override // c.f.a.b.z2.m0.c0
    public void b(c.f.a.b.j3.i0 i0Var) {
        c();
        long jD = this.f11433b.d();
        long jE = this.f11433b.e();
        if (jD == -9223372036854775807L || jE == -9223372036854775807L) {
            return;
        }
        k1 k1Var = this.f11432a;
        if (jE != k1Var.q) {
            k1 k1VarE = k1Var.b().i0(jE).E();
            this.f11432a = k1VarE;
            this.f11434c.e(k1VarE);
        }
        int iA = i0Var.a();
        this.f11434c.c(i0Var, iA);
        this.f11434c.d(jD, 1, iA, 0, null);
    }

    @EnsuresNonNull({"timestampAdjuster", "output"})
    public final void c() {
        c.f.a.b.j3.g.i(this.f11433b);
        x0.i(this.f11434c);
    }
}
