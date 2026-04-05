package c.f.a.b.e3.d1;

import c.f.a.b.e3.d1.g;
import c.f.a.b.i3.l0;
import c.f.a.b.i3.s;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;

/* JADX INFO: loaded from: classes2.dex */
public final class m extends f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f7055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g.b f7056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f7057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f7058m;

    public m(c.f.a.b.i3.p pVar, s sVar, k1 k1Var, int i2, Object obj, g gVar) {
        super(pVar, sVar, 2, k1Var, i2, obj, -9223372036854775807L, -9223372036854775807L);
        this.f7055j = gVar;
    }

    @Override // c.f.a.b.i3.g0.e
    public void a() {
        if (this.f7057l == 0) {
            this.f7055j.c(this.f7056k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            s sVarE = this.f7023b.e(this.f7057l);
            l0 l0Var = this.f7030i;
            c.f.a.b.z2.g gVar = new c.f.a.b.z2.g(l0Var, sVarE.f9067g, l0Var.g(sVarE));
            while (!this.f7058m && this.f7055j.a(gVar)) {
                try {
                } finally {
                    this.f7057l = gVar.getPosition() - this.f7023b.f9067g;
                }
            }
        } finally {
            x0.n(this.f7030i);
        }
    }

    @Override // c.f.a.b.i3.g0.e
    public void c() {
        this.f7058m = true;
    }

    public void g(g.b bVar) {
        this.f7056k = bVar;
    }
}
