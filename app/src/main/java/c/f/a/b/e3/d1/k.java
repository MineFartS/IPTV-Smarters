package c.f.a.b.e3.d1;

import c.f.a.b.e3.d1.g;
import c.f.a.b.i3.l0;
import c.f.a.b.i3.s;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;

/* JADX INFO: loaded from: classes2.dex */
public class k extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f7052o;
    public final long p;
    public final g q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public k(c.f.a.b.i3.p pVar, s sVar, k1 k1Var, int i2, Object obj, long j2, long j3, long j4, long j5, long j6, int i3, long j7, g gVar) {
        super(pVar, sVar, k1Var, i2, obj, j2, j3, j4, j5, j6);
        this.f7052o = i3;
        this.p = j7;
        this.q = gVar;
    }

    @Override // c.f.a.b.i3.g0.e
    public final void a() {
        if (this.r == 0) {
            d dVarJ = j();
            dVarJ.b(this.p);
            g gVar = this.q;
            g.b bVarL = l(dVarJ);
            long j2 = this.f6995k;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.p;
            long j4 = this.f6996l;
            gVar.c(bVarL, j3, j4 == -9223372036854775807L ? -9223372036854775807L : j4 - this.p);
        }
        try {
            s sVarE = this.f7023b.e(this.r);
            l0 l0Var = this.f7030i;
            c.f.a.b.z2.g gVar2 = new c.f.a.b.z2.g(l0Var, sVarE.f9067g, l0Var.g(sVarE));
            do {
                try {
                    if (this.s) {
                        break;
                    }
                } finally {
                    this.r = gVar2.getPosition() - this.f7023b.f9067g;
                }
            } while (this.q.a(gVar2));
            x0.n(this.f7030i);
            this.t = !this.s;
        } catch (Throwable th) {
            x0.n(this.f7030i);
            throw th;
        }
    }

    @Override // c.f.a.b.i3.g0.e
    public final void c() {
        this.s = true;
    }

    @Override // c.f.a.b.e3.d1.n
    public long g() {
        return this.f7059j + ((long) this.f7052o);
    }

    @Override // c.f.a.b.e3.d1.n
    public boolean h() {
        return this.t;
    }

    public g.b l(d dVar) {
        return dVar;
    }
}
