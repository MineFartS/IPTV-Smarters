package c.f.a.b.z2.m0;

import c.f.a.b.k1;
import c.f.a.b.t2.m;
import c.f.a.b.w1;
import c.f.a.b.z2.m0.i0;
import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class u implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.j3.i0 f11401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.j3.h0 f11402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c.f.a.b.z2.a0 f11403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f11404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k1 f11405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f11406g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f11407h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f11408i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f11409j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f11410k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f11411l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11412m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f11413n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f11414o;
    public boolean p;
    public long q;
    public int r;
    public long s;
    public int t;
    public String u;

    public u(String str) {
        this.f11400a = str;
        c.f.a.b.j3.i0 i0Var = new c.f.a.b.j3.i0(1024);
        this.f11401b = i0Var;
        this.f11402c = new c.f.a.b.j3.h0(i0Var.d());
    }

    public static long a(c.f.a.b.j3.h0 h0Var) {
        return h0Var.h((h0Var.h(2) + 1) * 8);
    }

    @Override // c.f.a.b.z2.m0.o
    public void b(c.f.a.b.j3.i0 i0Var) throws w1 {
        c.f.a.b.j3.g.i(this.f11403d);
        while (i0Var.a() > 0) {
            int i2 = this.f11406g;
            if (i2 != 0) {
                if (i2 == 1) {
                    int iD = i0Var.D();
                    if ((iD & 224) == 224) {
                        this.f11409j = iD;
                        this.f11406g = 2;
                    } else if (iD != 86) {
                        this.f11406g = 0;
                    }
                } else if (i2 == 2) {
                    int iD2 = ((this.f11409j & (-225)) << 8) | i0Var.D();
                    this.f11408i = iD2;
                    if (iD2 > this.f11401b.d().length) {
                        m(this.f11408i);
                    }
                    this.f11407h = 0;
                    this.f11406g = 3;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(i0Var.a(), this.f11408i - this.f11407h);
                    i0Var.j(this.f11402c.f9198a, this.f11407h, iMin);
                    int i3 = this.f11407h + iMin;
                    this.f11407h = i3;
                    if (i3 == this.f11408i) {
                        this.f11402c.p(0);
                        g(this.f11402c);
                        this.f11406g = 0;
                    }
                }
            } else if (i0Var.D() == 86) {
                this.f11406g = 1;
            }
        }
    }

    @Override // c.f.a.b.z2.m0.o
    public void c() {
        this.f11406g = 0;
        this.f11411l = false;
    }

    @Override // c.f.a.b.z2.m0.o
    public void d() {
    }

    @Override // c.f.a.b.z2.m0.o
    public void e(c.f.a.b.z2.l lVar, i0.d dVar) {
        dVar.a();
        this.f11403d = lVar.e(dVar.c(), 1);
        this.f11404e = dVar.b();
    }

    @Override // c.f.a.b.z2.m0.o
    public void f(long j2, int i2) {
        this.f11410k = j2;
    }

    @RequiresNonNull({"output"})
    public final void g(c.f.a.b.j3.h0 h0Var) throws w1 {
        if (!h0Var.g()) {
            this.f11411l = true;
            l(h0Var);
        } else if (!this.f11411l) {
            return;
        }
        if (this.f11412m != 0) {
            throw w1.a(null, null);
        }
        if (this.f11413n != 0) {
            throw w1.a(null, null);
        }
        k(h0Var, j(h0Var));
        if (this.p) {
            h0Var.r((int) this.q);
        }
    }

    public final int h(c.f.a.b.j3.h0 h0Var) throws w1 {
        int iB = h0Var.b();
        m.b bVarF = c.f.a.b.t2.m.f(h0Var, true);
        this.u = bVarF.f10114c;
        this.r = bVarF.f10112a;
        this.t = bVarF.f10113b;
        return iB - h0Var.b();
    }

    public final void i(c.f.a.b.j3.h0 h0Var) {
        int i2;
        int iH = h0Var.h(3);
        this.f11414o = iH;
        if (iH == 0) {
            i2 = 8;
        } else {
            if (iH != 1) {
                if (iH == 3 || iH == 4 || iH == 5) {
                    h0Var.r(6);
                    return;
                } else {
                    if (iH != 6 && iH != 7) {
                        throw new IllegalStateException();
                    }
                    h0Var.r(1);
                    return;
                }
            }
            i2 = 9;
        }
        h0Var.r(i2);
    }

    public final int j(c.f.a.b.j3.h0 h0Var) throws w1 {
        int iH;
        if (this.f11414o != 0) {
            throw w1.a(null, null);
        }
        int i2 = 0;
        do {
            iH = h0Var.h(8);
            i2 += iH;
        } while (iH == 255);
        return i2;
    }

    @RequiresNonNull({"output"})
    public final void k(c.f.a.b.j3.h0 h0Var, int i2) {
        int iE = h0Var.e();
        if ((iE & 7) == 0) {
            this.f11401b.P(iE >> 3);
        } else {
            h0Var.i(this.f11401b.d(), 0, i2 * 8);
            this.f11401b.P(0);
        }
        this.f11403d.c(this.f11401b, i2);
        this.f11403d.d(this.f11410k, 1, i2, 0, null);
        this.f11410k += this.s;
    }

    @RequiresNonNull({"output"})
    public final void l(c.f.a.b.j3.h0 h0Var) throws w1 {
        boolean zG;
        int iH = h0Var.h(1);
        int iH2 = iH == 1 ? h0Var.h(1) : 0;
        this.f11412m = iH2;
        if (iH2 != 0) {
            throw w1.a(null, null);
        }
        if (iH == 1) {
            a(h0Var);
        }
        if (!h0Var.g()) {
            throw w1.a(null, null);
        }
        this.f11413n = h0Var.h(6);
        int iH3 = h0Var.h(4);
        int iH4 = h0Var.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw w1.a(null, null);
        }
        if (iH == 0) {
            int iE = h0Var.e();
            int iH5 = h(h0Var);
            h0Var.p(iE);
            byte[] bArr = new byte[(iH5 + 7) / 8];
            h0Var.i(bArr, 0, iH5);
            k1 k1VarE = new k1.b().S(this.f11404e).e0("audio/mp4a-latm").I(this.u).H(this.t).f0(this.r).T(Collections.singletonList(bArr)).V(this.f11400a).E();
            if (!k1VarE.equals(this.f11405f)) {
                this.f11405f = k1VarE;
                this.s = 1024000000 / ((long) k1VarE.A);
                this.f11403d.e(k1VarE);
            }
        } else {
            h0Var.r(((int) a(h0Var)) - h(h0Var));
        }
        i(h0Var);
        boolean zG2 = h0Var.g();
        this.p = zG2;
        this.q = 0L;
        if (zG2) {
            if (iH == 1) {
                this.q = a(h0Var);
            } else {
                do {
                    zG = h0Var.g();
                    this.q = (this.q << 8) + ((long) h0Var.h(8));
                } while (zG);
            }
        }
        if (h0Var.g()) {
            h0Var.r(8);
        }
    }

    public final void m(int i2) {
        this.f11401b.L(i2);
        this.f11402c.n(this.f11401b.d());
    }
}
