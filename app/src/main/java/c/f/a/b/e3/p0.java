package c.f.a.b.e3;

import c.f.a.b.e3.i0;
import c.f.a.b.e3.n0;
import c.f.a.b.e3.o0;
import c.f.a.b.e3.p0;
import c.f.a.b.i3.p;
import c.f.a.b.p1;
import c.f.a.b.p2;
import com.amazonaws.services.s3.internal.Constants;

/* JADX INFO: loaded from: classes2.dex */
public final class p0 extends n implements o0.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final p1 f7907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p1.g f7908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p.a f7909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final n0.a f7910k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c.f.a.b.x2.c0 f7911l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c.f.a.b.i3.f0 f7912m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f7913n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7914o;
    public long p;
    public boolean q;
    public boolean r;
    public c.f.a.b.i3.n0 s;

    public class a extends y {
        public a(p2 p2Var) {
            super(p2Var);
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public p2.b g(int i2, p2.b bVar, boolean z) {
            super.g(i2, bVar, z);
            bVar.f9707g = true;
            return bVar;
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public p2.c o(int i2, p2.c cVar, long j2) {
            super.o(i2, cVar, j2);
            cVar.p = true;
            return cVar;
        }
    }

    public static final class b implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p.a f7916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n0.a f7917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7918c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c.f.a.b.x2.e0 f7919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c.f.a.b.i3.f0 f7920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f7922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Object f7923h;

        public b(p.a aVar, n0.a aVar2) {
            this.f7916a = aVar;
            this.f7917b = aVar2;
            this.f7919d = new c.f.a.b.x2.v();
            this.f7920e = new c.f.a.b.i3.y();
            this.f7921f = Constants.MB;
        }

        public b(p.a aVar, final c.f.a.b.z2.o oVar) {
            this(aVar, new n0.a() { // from class: c.f.a.b.e3.k
                @Override // c.f.a.b.e3.n0.a
                public final n0 a() {
                    return p0.b.e(oVar);
                }
            });
        }

        public static /* synthetic */ n0 e(c.f.a.b.z2.o oVar) {
            return new p(oVar);
        }

        public static /* synthetic */ c.f.a.b.x2.c0 f(c.f.a.b.x2.c0 c0Var, p1 p1Var) {
            return c0Var;
        }

        @Override // c.f.a.b.e3.k0
        public int[] b() {
            return new int[]{4};
        }

        @Override // c.f.a.b.e3.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public p0 a(p1 p1Var) {
            p1.c cVarA;
            p1.c cVarA2;
            c.f.a.b.j3.g.e(p1Var.f9643d);
            p1.g gVar = p1Var.f9643d;
            boolean z = gVar.f9692h == null && this.f7923h != null;
            boolean z2 = gVar.f9690f == null && this.f7922g != null;
            if (!z || !z2) {
                if (z) {
                    cVarA2 = p1Var.a().A(this.f7923h);
                    p1Var = cVarA2.a();
                    p1 p1Var2 = p1Var;
                    return new p0(p1Var2, this.f7916a, this.f7917b, this.f7919d.a(p1Var2), this.f7920e, this.f7921f, null);
                }
                if (z2) {
                    cVarA = p1Var.a();
                }
                p1 p1Var22 = p1Var;
                return new p0(p1Var22, this.f7916a, this.f7917b, this.f7919d.a(p1Var22), this.f7920e, this.f7921f, null);
            }
            cVarA = p1Var.a().A(this.f7923h);
            cVarA2 = cVarA.g(this.f7922g);
            p1Var = cVarA2.a();
            p1 p1Var222 = p1Var;
            return new p0(p1Var222, this.f7916a, this.f7917b, this.f7919d.a(p1Var222), this.f7920e, this.f7921f, null);
        }

        @Override // c.f.a.b.e3.k0
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public b c(final c.f.a.b.x2.c0 c0Var) {
            if (c0Var == null) {
                h(null);
            } else {
                h(new c.f.a.b.x2.e0() { // from class: c.f.a.b.e3.l
                    @Override // c.f.a.b.x2.e0
                    public final c.f.a.b.x2.c0 a(p1 p1Var) {
                        c.f.a.b.x2.c0 c0Var2 = c0Var;
                        p0.b.f(c0Var2, p1Var);
                        return c0Var2;
                    }
                });
            }
            return this;
        }

        public b h(c.f.a.b.x2.e0 e0Var) {
            boolean z;
            if (e0Var != null) {
                this.f7919d = e0Var;
                z = true;
            } else {
                this.f7919d = new c.f.a.b.x2.v();
                z = false;
            }
            this.f7918c = z;
            return this;
        }
    }

    public p0(p1 p1Var, p.a aVar, n0.a aVar2, c.f.a.b.x2.c0 c0Var, c.f.a.b.i3.f0 f0Var, int i2) {
        this.f7908i = (p1.g) c.f.a.b.j3.g.e(p1Var.f9643d);
        this.f7907h = p1Var;
        this.f7909j = aVar;
        this.f7910k = aVar2;
        this.f7911l = c0Var;
        this.f7912m = f0Var;
        this.f7913n = i2;
        this.f7914o = true;
        this.p = -9223372036854775807L;
    }

    public /* synthetic */ p0(p1 p1Var, p.a aVar, n0.a aVar2, c.f.a.b.x2.c0 c0Var, c.f.a.b.i3.f0 f0Var, int i2, a aVar3) {
        this(p1Var, aVar, aVar2, c0Var, f0Var, i2);
    }

    @Override // c.f.a.b.e3.n
    public void B(c.f.a.b.i3.n0 n0Var) {
        this.s = n0Var;
        this.f7911l.prepare();
        E();
    }

    @Override // c.f.a.b.e3.n
    public void D() {
        this.f7911l.release();
    }

    public final void E() {
        p2 v0Var = new v0(this.p, this.q, false, this.r, null, this.f7907h);
        if (this.f7914o) {
            v0Var = new a(v0Var);
        }
        C(v0Var);
    }

    @Override // c.f.a.b.e3.i0
    public f0 a(i0.a aVar, c.f.a.b.i3.f fVar, long j2) {
        c.f.a.b.i3.p pVarA = this.f7909j.a();
        c.f.a.b.i3.n0 n0Var = this.s;
        if (n0Var != null) {
            pVarA.h(n0Var);
        }
        return new o0(this.f7908i.f9685a, pVarA, this.f7910k.a(), this.f7911l, t(aVar), this.f7912m, w(aVar), this, fVar, this.f7908i.f9690f, this.f7913n);
    }

    @Override // c.f.a.b.e3.o0.b
    public void g(long j2, boolean z, boolean z2) {
        if (j2 == -9223372036854775807L) {
            j2 = this.p;
        }
        if (!this.f7914o && this.p == j2 && this.q == z && this.r == z2) {
            return;
        }
        this.p = j2;
        this.q = z;
        this.r = z2;
        this.f7914o = false;
        E();
    }

    @Override // c.f.a.b.e3.i0
    public p1 h() {
        return this.f7907h;
    }

    @Override // c.f.a.b.e3.i0
    public void l() {
    }

    @Override // c.f.a.b.e3.i0
    public void o(f0 f0Var) {
        ((o0) f0Var).d0();
    }
}
