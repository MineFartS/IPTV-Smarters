package c.f.a.b.z2.g0;

import c.f.a.b.b3.a;
import c.f.a.b.j3.g;
import c.f.a.b.j3.i0;
import c.f.a.b.k1;
import c.f.a.b.z2.j;
import c.f.a.b.z2.k;
import c.f.a.b.z2.l;
import c.f.a.b.z2.w;
import c.f.a.b.z2.x;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l f10765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10768e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.a.b.b3.n.c f10770g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public k f10771h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f10772i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c.f.a.b.z2.j0.k f10773j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f10764a = new i0(6);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f10769f = -1;

    public static c.f.a.b.b3.n.c f(String str, long j2) {
        b bVarA;
        if (j2 == -1 || (bVarA = e.a(str)) == null) {
            return null;
        }
        return bVarA.a(j2);
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        if (j2 == 0) {
            this.f10766c = 0;
            this.f10773j = null;
        } else if (this.f10766c == 5) {
            ((c.f.a.b.z2.j0.k) g.e(this.f10773j)).a(j2, j3);
        }
    }

    public final void b(k kVar) {
        this.f10764a.L(2);
        kVar.u(this.f10764a.d(), 0, 2);
        kVar.m(this.f10764a.J() - 2);
    }

    @Override // c.f.a.b.z2.j
    public void c(l lVar) {
        this.f10765b = lVar;
    }

    public final void d() {
        h(new a.b[0]);
        ((l) g.e(this.f10765b)).p();
        this.f10765b.i(new x.b(-9223372036854775807L));
        this.f10766c = 6;
    }

    @Override // c.f.a.b.z2.j
    public boolean e(k kVar) {
        if (i(kVar) != 65496) {
            return false;
        }
        int i2 = i(kVar);
        this.f10767d = i2;
        if (i2 == 65504) {
            b(kVar);
            this.f10767d = i(kVar);
        }
        if (this.f10767d != 65505) {
            return false;
        }
        kVar.m(2);
        this.f10764a.L(6);
        kVar.u(this.f10764a.d(), 0, 6);
        return this.f10764a.F() == 1165519206 && this.f10764a.J() == 0;
    }

    @Override // c.f.a.b.z2.j
    public int g(k kVar, w wVar) {
        int i2 = this.f10766c;
        if (i2 == 0) {
            j(kVar);
            return 0;
        }
        if (i2 == 1) {
            l(kVar);
            return 0;
        }
        if (i2 == 2) {
            k(kVar);
            return 0;
        }
        if (i2 == 4) {
            long position = kVar.getPosition();
            long j2 = this.f10769f;
            if (position != j2) {
                wVar.f11506a = j2;
                return 1;
            }
            m(kVar);
            return 0;
        }
        if (i2 != 5) {
            if (i2 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f10772i == null || kVar != this.f10771h) {
            this.f10771h = kVar;
            this.f10772i = new c(kVar, this.f10769f);
        }
        int iG = ((c.f.a.b.z2.j0.k) g.e(this.f10773j)).g(this.f10772i, wVar);
        if (iG == 1) {
            wVar.f11506a += this.f10769f;
        }
        return iG;
    }

    public final void h(a.b... bVarArr) {
        ((l) g.e(this.f10765b)).e(1024, 4).e(new k1.b().K("image/jpeg").X(new c.f.a.b.b3.a(bVarArr)).E());
    }

    public final int i(k kVar) {
        this.f10764a.L(2);
        kVar.u(this.f10764a.d(), 0, 2);
        return this.f10764a.J();
    }

    public final void j(k kVar) {
        int i2;
        this.f10764a.L(2);
        kVar.l(this.f10764a.d(), 0, 2);
        int iJ = this.f10764a.J();
        this.f10767d = iJ;
        if (iJ == 65498) {
            if (this.f10769f == -1) {
                d();
                return;
            }
            i2 = 4;
        } else if ((iJ >= 65488 && iJ <= 65497) || iJ == 65281) {
            return;
        } else {
            i2 = 1;
        }
        this.f10766c = i2;
    }

    public final void k(k kVar) {
        String strX;
        if (this.f10767d == 65505) {
            i0 i0Var = new i0(this.f10768e);
            kVar.l(i0Var.d(), 0, this.f10768e);
            if (this.f10770g == null && "http://ns.adobe.com/xap/1.0/".equals(i0Var.x()) && (strX = i0Var.x()) != null) {
                c.f.a.b.b3.n.c cVarF = f(strX, kVar.getLength());
                this.f10770g = cVarF;
                if (cVarF != null) {
                    this.f10769f = cVarF.f6602e;
                }
            }
        } else {
            kVar.s(this.f10768e);
        }
        this.f10766c = 0;
    }

    public final void l(k kVar) {
        this.f10764a.L(2);
        kVar.l(this.f10764a.d(), 0, 2);
        this.f10768e = this.f10764a.J() - 2;
        this.f10766c = 2;
    }

    public final void m(k kVar) {
        if (kVar.i(this.f10764a.d(), 0, 1, true)) {
            kVar.r();
            if (this.f10773j == null) {
                this.f10773j = new c.f.a.b.z2.j0.k();
            }
            c cVar = new c(kVar, this.f10769f);
            this.f10772i = cVar;
            if (this.f10773j.e(cVar)) {
                this.f10773j.c(new d(this.f10769f, (l) g.e(this.f10765b)));
                n();
                return;
            }
        }
        d();
    }

    public final void n() {
        h((a.b) g.e(this.f10770g));
        this.f10766c = 5;
    }

    @Override // c.f.a.b.z2.j
    public void release() {
        c.f.a.b.z2.j0.k kVar = this.f10773j;
        if (kVar != null) {
            kVar.release();
        }
    }
}
