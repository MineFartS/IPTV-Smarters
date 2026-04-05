package c.f.a.b.e3.d1;

import c.f.a.b.i3.s;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.z2.a0;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f7061o;
    public final k1 p;
    public long q;
    public boolean r;

    public p(c.f.a.b.i3.p pVar, s sVar, k1 k1Var, int i2, Object obj, long j2, long j3, long j4, int i3, k1 k1Var2) {
        super(pVar, sVar, k1Var, i2, obj, j2, j3, -9223372036854775807L, -9223372036854775807L, j4);
        this.f7061o = i3;
        this.p = k1Var2;
    }

    @Override // c.f.a.b.i3.g0.e
    public void a() {
        d dVarJ = j();
        dVarJ.b(0L);
        a0 a0VarE = dVarJ.e(0, this.f7061o);
        a0VarE.e(this.p);
        try {
            long jG = this.f7030i.g(this.f7023b.e(this.q));
            if (jG != -1) {
                jG += this.q;
            }
            c.f.a.b.z2.g gVar = new c.f.a.b.z2.g(this.f7030i, this.q, jG);
            for (int iB = 0; iB != -1; iB = a0VarE.b(gVar, Integer.MAX_VALUE, true)) {
                this.q += (long) iB;
            }
            a0VarE.d(this.f7028g, 1, (int) this.q, 0, null);
            x0.n(this.f7030i);
            this.r = true;
        } catch (Throwable th) {
            x0.n(this.f7030i);
            throw th;
        }
    }

    @Override // c.f.a.b.i3.g0.e
    public void c() {
    }

    @Override // c.f.a.b.e3.d1.n
    public boolean h() {
        return this.r;
    }
}
