package c.f.a.b.z2.m0;

import c.f.a.b.k1;
import c.f.a.b.z2.m0.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class t implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11394a = new c.f.a.b.j3.i0(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11396c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11397d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11398e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f11399f;

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) {
        c.f.a.b.j3.g.i(this.f11395b);
        if (this.f11396c) {
            int iA = i0Var.a();
            int i2 = this.f11399f;
            if (i2 < 10) {
                int iMin = Math.min(iA, 10 - i2);
                System.arraycopy(i0Var.d(), i0Var.e(), this.f11394a.d(), this.f11399f, iMin);
                if (this.f11399f + iMin == 10) {
                    this.f11394a.P(0);
                    if (73 != this.f11394a.D() || 68 != this.f11394a.D() || 51 != this.f11394a.D()) {
                        c.f.a.b.j3.z.i("Id3Reader", "Discarding invalid ID3 tag");
                        this.f11396c = false;
                        return;
                    } else {
                        this.f11394a.Q(3);
                        this.f11398e = this.f11394a.C() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f11398e - this.f11399f);
            this.f11395b.c(i0Var, iMin2);
            this.f11399f += iMin2;
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        this.f11396c = false;
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
        int i2;
        c.f.a.b.j3.g.i(this.f11395b);
        if (this.f11396c && (i2 = this.f11398e) != 0 && this.f11399f == i2) {
            this.f11395b.d(this.f11397d, 1, i2, 0, null);
            this.f11396c = false;
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        c.f.a.b.z2.a0 a0VarE = lVar.e(dVar.c(), 5);
        this.f11395b = a0VarE;
        a0VarE.e(new k1.b().S(dVar.b()).e0("application/id3").E());
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        if ((i2 & 4) == 0) {
            return;
        }
        this.f11396c = true;
        this.f11397d = j2;
        this.f11398e = 0;
        this.f11399f = 0;
    }
}
