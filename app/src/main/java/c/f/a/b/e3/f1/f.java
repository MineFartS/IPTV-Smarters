package c.f.a.b.e3.f1;

import c.f.a.b.j3.u0;
import c.f.a.b.k1;
import c.f.a.b.z2.m0.h0;
import c.f.a.b.z2.w;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f7260a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.z2.j f7261b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k1 f7262c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0 f7263d;

    public f(c.f.a.b.z2.j jVar, k1 k1Var, u0 u0Var) {
        this.f7261b = jVar;
        this.f7262c = k1Var;
        this.f7263d = u0Var;
    }

    @Override // c.f.a.b.e3.f1.o
    public boolean a(c.f.a.b.z2.k kVar) {
        return this.f7261b.g(kVar, f7260a) == 0;
    }

    @Override // c.f.a.b.e3.f1.o
    public void b() {
        this.f7261b.a(0L, 0L);
    }

    @Override // c.f.a.b.e3.f1.o
    public void c(c.f.a.b.z2.l lVar) {
        this.f7261b.c(lVar);
    }

    @Override // c.f.a.b.e3.f1.o
    public boolean d() {
        c.f.a.b.z2.j jVar = this.f7261b;
        return (jVar instanceof c.f.a.b.z2.m0.j) || (jVar instanceof c.f.a.b.z2.m0.f) || (jVar instanceof c.f.a.b.z2.m0.h) || (jVar instanceof c.f.a.b.z2.i0.f);
    }

    @Override // c.f.a.b.e3.f1.o
    public boolean e() {
        c.f.a.b.z2.j jVar = this.f7261b;
        return (jVar instanceof h0) || (jVar instanceof c.f.a.b.z2.j0.i);
    }

    @Override // c.f.a.b.e3.f1.o
    public o f() {
        c.f.a.b.z2.j fVar;
        c.f.a.b.j3.g.g(!e());
        c.f.a.b.z2.j jVar = this.f7261b;
        if (jVar instanceof v) {
            fVar = new v(this.f7262c.f9329d, this.f7263d);
        } else if (jVar instanceof c.f.a.b.z2.m0.j) {
            fVar = new c.f.a.b.z2.m0.j();
        } else if (jVar instanceof c.f.a.b.z2.m0.f) {
            fVar = new c.f.a.b.z2.m0.f();
        } else if (jVar instanceof c.f.a.b.z2.m0.h) {
            fVar = new c.f.a.b.z2.m0.h();
        } else {
            if (!(jVar instanceof c.f.a.b.z2.i0.f)) {
                throw new IllegalStateException("Unexpected extractor type for recreation: " + this.f7261b.getClass().getSimpleName());
            }
            fVar = new c.f.a.b.z2.i0.f();
        }
        return new f(fVar, this.f7262c, this.f7263d);
    }
}
