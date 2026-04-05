package com.google.android.exoplayer2.source.hls;

import c.f.a.b.c3.i0;
import c.f.a.b.e3.f1.l;
import c.f.a.b.e3.f1.m;
import c.f.a.b.e3.f1.x.c;
import c.f.a.b.e3.f1.x.d;
import c.f.a.b.e3.f1.x.e;
import c.f.a.b.e3.f1.x.g;
import c.f.a.b.e3.f1.x.j;
import c.f.a.b.e3.f1.x.k;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.j0;
import c.f.a.b.e3.k0;
import c.f.a.b.e3.n;
import c.f.a.b.e3.u;
import c.f.a.b.e3.v0;
import c.f.a.b.i1;
import c.f.a.b.i3.f;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.n0;
import c.f.a.b.i3.p;
import c.f.a.b.i3.y;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.p1;
import c.f.a.b.w0;
import c.f.a.b.x2.c0;
import c.f.a.b.x2.e0;
import c.f.a.b.x2.v;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class HlsMediaSource extends n implements k.e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f23952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p1.g f23953i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c.f.a.b.e3.f1.k f23954j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final u f23955k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c0 f23956l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f0 f23957m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f23958n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f23959o;
    public final boolean p;
    public final k q;
    public final long r;
    public final p1 s;
    public p1.f t;
    public n0 u;

    public static final class Factory implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.e3.f1.k f23960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l f23961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public j f23962c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public k.a f23963d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public u f23964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f23965f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e0 f23966g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public f0 f23967h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f23968i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f23969j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f23970k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<i0> f23971l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Object f23972m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f23973n;

        public Factory(c.f.a.b.e3.f1.k kVar) {
            this.f23960a = (c.f.a.b.e3.f1.k) g.e(kVar);
            this.f23966g = new v();
            this.f23962c = new c();
            this.f23963d = d.f7366b;
            this.f23961b = l.f7298a;
            this.f23967h = new y();
            this.f23964e = new c.f.a.b.e3.v();
            this.f23969j = 1;
            this.f23971l = Collections.emptyList();
            this.f23973n = -9223372036854775807L;
        }

        public Factory(p.a aVar) {
            this(new c.f.a.b.e3.f1.g(aVar));
        }

        public static /* synthetic */ c0 e(c0 c0Var, p1 p1Var) {
            return c0Var;
        }

        @Override // c.f.a.b.e3.k0
        public int[] b() {
            return new int[]{2};
        }

        @Override // c.f.a.b.e3.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource a(p1 p1Var) {
            p1.c cVarA;
            p1.c cVarA2;
            p1 p1VarA = p1Var;
            g.e(p1VarA.f9643d);
            j eVar = this.f23962c;
            List<i0> list = p1VarA.f9643d.f9689e.isEmpty() ? this.f23971l : p1VarA.f9643d.f9689e;
            if (!list.isEmpty()) {
                eVar = new e(eVar, list);
            }
            p1.g gVar = p1VarA.f9643d;
            boolean z = gVar.f9692h == null && this.f23972m != null;
            boolean z2 = gVar.f9689e.isEmpty() && !list.isEmpty();
            if (!z || !z2) {
                if (z) {
                    cVarA2 = p1Var.a().A(this.f23972m);
                    p1VarA = cVarA2.a();
                    p1 p1Var2 = p1VarA;
                    c.f.a.b.e3.f1.k kVar = this.f23960a;
                    l lVar = this.f23961b;
                    u uVar = this.f23964e;
                    c0 c0VarA = this.f23966g.a(p1Var2);
                    f0 f0Var = this.f23967h;
                    return new HlsMediaSource(p1Var2, kVar, lVar, uVar, c0VarA, f0Var, this.f23963d.a(this.f23960a, f0Var, eVar), this.f23973n, this.f23968i, this.f23969j, this.f23970k);
                }
                if (z2) {
                    cVarA = p1Var.a();
                }
                p1 p1Var22 = p1VarA;
                c.f.a.b.e3.f1.k kVar2 = this.f23960a;
                l lVar2 = this.f23961b;
                u uVar2 = this.f23964e;
                c0 c0VarA2 = this.f23966g.a(p1Var22);
                f0 f0Var2 = this.f23967h;
                return new HlsMediaSource(p1Var22, kVar2, lVar2, uVar2, c0VarA2, f0Var2, this.f23963d.a(this.f23960a, f0Var2, eVar), this.f23973n, this.f23968i, this.f23969j, this.f23970k);
            }
            cVarA = p1Var.a().A(this.f23972m);
            cVarA2 = cVarA.y(list);
            p1VarA = cVarA2.a();
            p1 p1Var222 = p1VarA;
            c.f.a.b.e3.f1.k kVar22 = this.f23960a;
            l lVar22 = this.f23961b;
            u uVar22 = this.f23964e;
            c0 c0VarA22 = this.f23966g.a(p1Var222);
            f0 f0Var22 = this.f23967h;
            return new HlsMediaSource(p1Var222, kVar22, lVar22, uVar22, c0VarA22, f0Var22, this.f23963d.a(this.f23960a, f0Var22, eVar), this.f23973n, this.f23968i, this.f23969j, this.f23970k);
        }

        @Override // c.f.a.b.e3.k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory c(final c0 c0Var) {
            if (c0Var == null) {
                g(null);
            } else {
                g(new e0() { // from class: c.f.a.b.e3.f1.a
                    @Override // c.f.a.b.x2.e0
                    public final c0 a(p1 p1Var) {
                        c0 c0Var2 = c0Var;
                        HlsMediaSource.Factory.e(c0Var2, p1Var);
                        return c0Var2;
                    }
                });
            }
            return this;
        }

        public Factory g(e0 e0Var) {
            boolean z;
            if (e0Var != null) {
                this.f23966g = e0Var;
                z = true;
            } else {
                this.f23966g = new v();
                z = false;
            }
            this.f23965f = z;
            return this;
        }
    }

    static {
        i1.a("goog.exo.hls");
    }

    public HlsMediaSource(p1 p1Var, c.f.a.b.e3.f1.k kVar, l lVar, u uVar, c0 c0Var, f0 f0Var, k kVar2, long j2, boolean z, int i2, boolean z2) {
        this.f23953i = (p1.g) g.e(p1Var.f9643d);
        this.s = p1Var;
        this.t = p1Var.f9644e;
        this.f23954j = kVar;
        this.f23952h = lVar;
        this.f23955k = uVar;
        this.f23956l = c0Var;
        this.f23957m = f0Var;
        this.q = kVar2;
        this.r = j2;
        this.f23958n = z;
        this.f23959o = i2;
        this.p = z2;
    }

    public static g.b G(List<g.b> list, long j2) {
        g.b bVar = null;
        for (int i2 = 0; i2 < list.size(); i2++) {
            g.b bVar2 = list.get(i2);
            long j3 = bVar2.f7438f;
            if (j3 > j2 || !bVar2.f7427m) {
                if (j3 > j2) {
                    break;
                }
            } else {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    public static g.d H(List<g.d> list, long j2) {
        return list.get(x0.f(list, Long.valueOf(j2), true, true));
    }

    public static long K(c.f.a.b.e3.f1.x.g gVar, long j2) {
        long j3;
        g.f fVar = gVar.v;
        long j4 = gVar.f7416e;
        if (j4 != -9223372036854775807L) {
            j3 = gVar.u - j4;
        } else {
            long j5 = fVar.f7448d;
            if (j5 == -9223372036854775807L || gVar.f7425n == -9223372036854775807L) {
                long j6 = fVar.f7447c;
                j3 = j6 != -9223372036854775807L ? j6 : gVar.f7424m * 3;
            } else {
                j3 = j5;
            }
        }
        return j3 + j2;
    }

    @Override // c.f.a.b.e3.n
    public void B(n0 n0Var) {
        this.u = n0Var;
        this.f23956l.prepare();
        this.q.h(this.f23953i.f9685a, w(null), this);
    }

    @Override // c.f.a.b.e3.n
    public void D() {
        this.q.stop();
        this.f23956l.release();
    }

    public final v0 E(c.f.a.b.e3.f1.x.g gVar, long j2, long j3, m mVar) {
        long jD = gVar.f7419h - this.q.d();
        long j4 = gVar.f7426o ? jD + gVar.u : -9223372036854775807L;
        long jI = I(gVar);
        long j5 = this.t.f9680c;
        L(x0.s(j5 != -9223372036854775807L ? w0.d(j5) : K(gVar, jI), jI, gVar.u + jI));
        return new v0(j2, j3, -9223372036854775807L, j4, gVar.u, jD, J(gVar, jI), true, !gVar.f7426o, gVar.f7415d == 2 && gVar.f7417f, mVar, this.s, this.t);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final c.f.a.b.e3.v0 F(c.f.a.b.e3.f1.x.g r25, long r26, long r28, c.f.a.b.e3.f1.m r30) {
        /*
            r24 = this;
            r0 = r25
            long r1 = r0.f7416e
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            java.util.List<c.f.a.b.e3.f1.x.g$d> r1 = r0.r
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L16
            goto L2f
        L16:
            boolean r1 = r0.f7418g
            if (r1 != 0) goto L2c
            long r1 = r0.f7416e
            long r3 = r0.u
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L23
            goto L2c
        L23:
            java.util.List<c.f.a.b.e3.f1.x.g$d> r3 = r0.r
            c.f.a.b.e3.f1.x.g$d r1 = H(r3, r1)
            long r1 = r1.f7438f
            goto L31
        L2c:
            long r1 = r0.f7416e
            goto L31
        L2f:
            r1 = 0
        L31:
            r16 = r1
            c.f.a.b.e3.v0 r1 = new c.f.a.b.e3.v0
            r3 = r1
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r10 = r0.u
            r12 = r10
            r14 = 0
            r18 = 1
            r19 = 0
            r20 = 1
            r0 = r24
            c.f.a.b.p1 r2 = r0.s
            r22 = r2
            r23 = 0
            r4 = r26
            r6 = r28
            r21 = r30
            r3.<init>(r4, r6, r8, r10, r12, r14, r16, r18, r19, r20, r21, r22, r23)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.hls.HlsMediaSource.F(c.f.a.b.e3.f1.x.g, long, long, c.f.a.b.e3.f1.m):c.f.a.b.e3.v0");
    }

    public final long I(c.f.a.b.e3.f1.x.g gVar) {
        if (gVar.p) {
            return w0.d(x0.Z(this.r)) - gVar.e();
        }
        return 0L;
    }

    public final long J(c.f.a.b.e3.f1.x.g gVar, long j2) {
        long jD = gVar.f7416e;
        if (jD == -9223372036854775807L) {
            jD = (gVar.u + j2) - w0.d(this.t.f9680c);
        }
        if (gVar.f7418g) {
            return jD;
        }
        g.b bVarG = G(gVar.s, jD);
        if (bVarG != null) {
            return bVarG.f7438f;
        }
        if (gVar.r.isEmpty()) {
            return 0L;
        }
        g.d dVarH = H(gVar.r, jD);
        g.b bVarG2 = G(dVarH.f7433n, jD);
        return bVarG2 != null ? bVarG2.f7438f : dVarH.f7438f;
    }

    public final void L(long j2) {
        long jE = w0.e(j2);
        if (jE != this.t.f9680c) {
            this.t = this.s.a().u(jE).a().f9644e;
        }
    }

    @Override // c.f.a.b.e3.i0
    public c.f.a.b.e3.f0 a(i0.a aVar, f fVar, long j2) {
        j0.a aVarW = w(aVar);
        return new c.f.a.b.e3.f1.p(this.f23952h, this.q, this.f23954j, this.u, this.f23956l, t(aVar), this.f23957m, aVarW, fVar, this.f23955k, this.f23958n, this.f23959o, this.p);
    }

    @Override // c.f.a.b.e3.f1.x.k.e
    public void c(c.f.a.b.e3.f1.x.g gVar) {
        long jE = gVar.p ? w0.e(gVar.f7419h) : -9223372036854775807L;
        int i2 = gVar.f7415d;
        long j2 = (i2 == 2 || i2 == 1) ? jE : -9223372036854775807L;
        m mVar = new m((c.f.a.b.e3.f1.x.f) c.f.a.b.j3.g.e(this.q.g()), gVar);
        C(this.q.e() ? E(gVar, j2, jE, mVar) : F(gVar, j2, jE, mVar));
    }

    @Override // c.f.a.b.e3.i0
    public p1 h() {
        return this.s;
    }

    @Override // c.f.a.b.e3.i0
    public void l() {
        this.q.i();
    }

    @Override // c.f.a.b.e3.i0
    public void o(c.f.a.b.e3.f0 f0Var) {
        ((c.f.a.b.e3.f1.p) f0Var).B();
    }
}
