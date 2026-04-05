package c.f.a.b.s2;

import android.os.Looper;
import android.util.SparseArray;
import c.f.a.b.a2;
import c.f.a.b.b2;
import c.f.a.b.c2;
import c.f.a.b.e3.i0;
import c.f.a.b.i3.i;
import c.f.a.b.j3.y;
import c.f.a.b.k1;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.s2.j1;
import c.f.a.b.x1;
import c.f.a.b.z1;
import c.f.b.b.v;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes.dex */
public class h1 implements a2.e, c.f.a.b.t2.u, c.f.a.b.k3.d0, c.f.a.b.e3.j0, i.a, c.f.a.b.x2.a0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.j3.i f9870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2.b f9871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2.c f9872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f9873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray<j1.a> f9874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c.f.a.b.j3.y<j1> f9875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a2 f9876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c.f.a.b.j3.v f9877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f9878j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p2.b f9879a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.f.b.b.t<i0.a> f9880b = c.f.b.b.t.J();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c.f.b.b.v<i0.a, p2> f9881c = c.f.b.b.v.k();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i0.a f9882d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public i0.a f9883e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public i0.a f9884f;

        public a(p2.b bVar) {
            this.f9879a = bVar;
        }

        public static i0.a c(a2 a2Var, c.f.b.b.t<i0.a> tVar, i0.a aVar, p2.b bVar) {
            p2 p2VarG = a2Var.G();
            int iL = a2Var.l();
            Object objM = p2VarG.q() ? null : p2VarG.m(iL);
            int iD = (a2Var.e() || p2VarG.q()) ? -1 : p2VarG.f(iL, bVar).d(c.f.a.b.w0.d(a2Var.getCurrentPosition()) - bVar.o());
            for (int i2 = 0; i2 < tVar.size(); i2++) {
                i0.a aVar2 = tVar.get(i2);
                if (i(aVar2, objM, a2Var.e(), a2Var.B(), a2Var.q(), iD)) {
                    return aVar2;
                }
            }
            if (tVar.isEmpty() && aVar != null) {
                if (i(aVar, objM, a2Var.e(), a2Var.B(), a2Var.q(), iD)) {
                    return aVar;
                }
            }
            return null;
        }

        public static boolean i(i0.a aVar, Object obj, boolean z, int i2, int i3, int i4) {
            if (aVar.f7476a.equals(obj)) {
                return (z && aVar.f7477b == i2 && aVar.f7478c == i3) || (!z && aVar.f7477b == -1 && aVar.f7480e == i4);
            }
            return false;
        }

        public final void b(v.a<i0.a, p2> aVar, i0.a aVar2, p2 p2Var) {
            if (aVar2 == null) {
                return;
            }
            if (p2Var.b(aVar2.f7476a) == -1 && (p2Var = this.f9881c.get(aVar2)) == null) {
                return;
            }
            aVar.c(aVar2, p2Var);
        }

        public i0.a d() {
            return this.f9882d;
        }

        public i0.a e() {
            if (this.f9880b.isEmpty()) {
                return null;
            }
            return (i0.a) c.f.b.b.y.c(this.f9880b);
        }

        public p2 f(i0.a aVar) {
            return this.f9881c.get(aVar);
        }

        public i0.a g() {
            return this.f9883e;
        }

        public i0.a h() {
            return this.f9884f;
        }

        public void j(a2 a2Var) {
            this.f9882d = c(a2Var, this.f9880b, this.f9883e, this.f9879a);
        }

        public void k(List<i0.a> list, i0.a aVar, a2 a2Var) {
            this.f9880b = c.f.b.b.t.D(list);
            if (!list.isEmpty()) {
                this.f9883e = list.get(0);
                this.f9884f = (i0.a) c.f.a.b.j3.g.e(aVar);
            }
            if (this.f9882d == null) {
                this.f9882d = c(a2Var, this.f9880b, this.f9883e, this.f9879a);
            }
            m(a2Var.G());
        }

        public void l(a2 a2Var) {
            this.f9882d = c(a2Var, this.f9880b, this.f9883e, this.f9879a);
            m(a2Var.G());
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m(c.f.a.b.p2 r4) {
            /*
                r3 = this;
                c.f.b.b.v$a r0 = c.f.b.b.v.b()
                c.f.b.b.t<c.f.a.b.e3.i0$a> r1 = r3.f9880b
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L35
                c.f.a.b.e3.i0$a r1 = r3.f9883e
                r3.b(r0, r1, r4)
                c.f.a.b.e3.i0$a r1 = r3.f9884f
                c.f.a.b.e3.i0$a r2 = r3.f9883e
                boolean r1 = c.f.b.a.h.a(r1, r2)
                if (r1 != 0) goto L20
                c.f.a.b.e3.i0$a r1 = r3.f9884f
                r3.b(r0, r1, r4)
            L20:
                c.f.a.b.e3.i0$a r1 = r3.f9882d
                c.f.a.b.e3.i0$a r2 = r3.f9883e
                boolean r1 = c.f.b.a.h.a(r1, r2)
                if (r1 != 0) goto L5b
                c.f.a.b.e3.i0$a r1 = r3.f9882d
                c.f.a.b.e3.i0$a r2 = r3.f9884f
                boolean r1 = c.f.b.a.h.a(r1, r2)
                if (r1 != 0) goto L5b
                goto L56
            L35:
                r1 = 0
            L36:
                c.f.b.b.t<c.f.a.b.e3.i0$a> r2 = r3.f9880b
                int r2 = r2.size()
                if (r1 >= r2) goto L4c
                c.f.b.b.t<c.f.a.b.e3.i0$a> r2 = r3.f9880b
                java.lang.Object r2 = r2.get(r1)
                c.f.a.b.e3.i0$a r2 = (c.f.a.b.e3.i0.a) r2
                r3.b(r0, r2, r4)
                int r1 = r1 + 1
                goto L36
            L4c:
                c.f.b.b.t<c.f.a.b.e3.i0$a> r1 = r3.f9880b
                c.f.a.b.e3.i0$a r2 = r3.f9882d
                boolean r1 = r1.contains(r2)
                if (r1 != 0) goto L5b
            L56:
                c.f.a.b.e3.i0$a r1 = r3.f9882d
                r3.b(r0, r1, r4)
            L5b:
                c.f.b.b.v r4 = r0.a()
                r3.f9881c = r4
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.s2.h1.a.m(c.f.a.b.p2):void");
        }
    }

    public h1(c.f.a.b.j3.i iVar) {
        this.f9870b = (c.f.a.b.j3.i) c.f.a.b.j3.g.e(iVar);
        this.f9875g = new c.f.a.b.j3.y<>(c.f.a.b.j3.x0.Q(), iVar, new y.b() { // from class: c.f.a.b.s2.m0
            @Override // c.f.a.b.j3.y.b
            public final void a(Object obj, c.f.a.b.j3.t tVar) {
                h1.v0((j1) obj, tVar);
            }
        });
        p2.b bVar = new p2.b();
        this.f9871c = bVar;
        this.f9872d = new p2.c();
        this.f9873e = new a(bVar);
        this.f9874f = new SparseArray<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void B1() {
        this.f9875g.h();
    }

    public static /* synthetic */ void B0(j1.a aVar, c.f.a.b.v2.d dVar, j1 j1Var) {
        j1Var.t(aVar, dVar);
        j1Var.l0(aVar, 1, dVar);
    }

    public static /* synthetic */ void C0(j1.a aVar, c.f.a.b.v2.d dVar, j1 j1Var) {
        j1Var.u(aVar, dVar);
        j1Var.w(aVar, 1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void D1(a2 a2Var, j1 j1Var, c.f.a.b.j3.t tVar) {
        j1Var.E(a2Var, new j1.b(tVar, this.f9874f));
    }

    public static /* synthetic */ void D0(j1.a aVar, k1 k1Var, c.f.a.b.v2.g gVar, j1 j1Var) {
        j1Var.I(aVar, k1Var);
        j1Var.i0(aVar, k1Var, gVar);
        j1Var.d(aVar, 1, k1Var);
    }

    public static /* synthetic */ void N0(j1.a aVar, int i2, j1 j1Var) {
        j1Var.n0(aVar);
        j1Var.f(aVar, i2);
    }

    public static /* synthetic */ void R0(j1.a aVar, boolean z, j1 j1Var) {
        j1Var.q(aVar, z);
        j1Var.o0(aVar, z);
    }

    public static /* synthetic */ void g1(j1.a aVar, int i2, a2.f fVar, a2.f fVar2, j1 j1Var) {
        j1Var.k(aVar, i2);
        j1Var.W(aVar, fVar, fVar2, i2);
    }

    public static /* synthetic */ void s1(j1.a aVar, String str, long j2, long j3, j1 j1Var) {
        j1Var.f0(aVar, str, j2);
        j1Var.b0(aVar, str, j3, j2);
        j1Var.i(aVar, 2, str, j2);
    }

    public static /* synthetic */ void u1(j1.a aVar, c.f.a.b.v2.d dVar, j1 j1Var) {
        j1Var.p0(aVar, dVar);
        j1Var.l0(aVar, 2, dVar);
    }

    public static /* synthetic */ void v0(j1 j1Var, c.f.a.b.j3.t tVar) {
    }

    public static /* synthetic */ void v1(j1.a aVar, c.f.a.b.v2.d dVar, j1 j1Var) {
        j1Var.x(aVar, dVar);
        j1Var.w(aVar, 2, dVar);
    }

    public static /* synthetic */ void x1(j1.a aVar, k1 k1Var, c.f.a.b.v2.g gVar, j1 j1Var) {
        j1Var.K(aVar, k1Var);
        j1Var.c0(aVar, k1Var, gVar);
        j1Var.d(aVar, 2, k1Var);
    }

    public static /* synthetic */ void y1(j1.a aVar, c.f.a.b.k3.e0 e0Var, j1 j1Var) {
        j1Var.G(aVar, e0Var);
        j1Var.b(aVar, e0Var.f9371c, e0Var.f9372d, e0Var.f9373e, e0Var.f9374f);
    }

    public static /* synthetic */ void z0(j1.a aVar, String str, long j2, long j3, j1 j1Var) {
        j1Var.z(aVar, str, j2);
        j1Var.y(aVar, str, j3, j2);
        j1Var.i(aVar, 1, str, j2);
    }

    @Override // c.f.a.b.t2.u
    public final void A(final String str) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1013, new y.a() { // from class: c.f.a.b.s2.e
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).Z(aVarU0, str);
            }
        });
    }

    @Override // c.f.a.b.t2.u
    public final void B(final String str, final long j2, final long j3) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1009, new y.a() { // from class: c.f.a.b.s2.g0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.z0(aVarU0, str, j3, j2, (j1) obj);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public final void C(final boolean z) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 10, new y.a() { // from class: c.f.a.b.s2.b0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).P(aVarO0, z);
            }
        });
    }

    @Override // c.f.a.b.b3.f
    public final void D(final c.f.a.b.b3.a aVar) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 1007, new y.a() { // from class: c.f.a.b.s2.k0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).A(aVarO0, aVar);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void E(a2 a2Var, a2.d dVar) {
        c2.f(this, a2Var, dVar);
    }

    public final void E1() {
        if (this.f9878j) {
            return;
        }
        final j1.a aVarO0 = o0();
        this.f9878j = true;
        G1(aVarO0, -1, new y.a() { // from class: c.f.a.b.s2.o
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).g0(aVarO0);
            }
        });
    }

    @Override // c.f.a.b.k3.d0
    public final void F(final int i2, final long j2) {
        final j1.a aVarT0 = t0();
        G1(aVarT0, 1023, new y.a() { // from class: c.f.a.b.s2.z
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).V(aVarT0, i2, j2);
            }
        });
    }

    public void F1() {
        final j1.a aVarO0 = o0();
        this.f9874f.put(1036, aVarO0);
        G1(aVarO0, 1036, new y.a() { // from class: c.f.a.b.s2.y
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).D(aVarO0);
            }
        });
        ((c.f.a.b.j3.v) c.f.a.b.j3.g.i(this.f9877i)).b(new Runnable() { // from class: c.f.a.b.s2.v
            @Override // java.lang.Runnable
            public final void run() {
                this.f9951b.B1();
            }
        });
    }

    @Override // c.f.a.b.w2.c
    public /* synthetic */ void G(int i2, boolean z) {
        c2.e(this, i2, z);
    }

    public final void G1(j1.a aVar, int i2, y.a<j1> aVar2) {
        this.f9874f.put(i2, aVar);
        this.f9875g.j(i2, aVar2);
    }

    @Override // c.f.a.b.a2.c
    public final void H(final boolean z, final int i2) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, -1, new y.a() { // from class: c.f.a.b.s2.a0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).F(aVarO0, z, i2);
            }
        });
    }

    public void H1(final a2 a2Var, Looper looper) {
        c.f.a.b.j3.g.g(this.f9876h == null || this.f9873e.f9880b.isEmpty());
        this.f9876h = (a2) c.f.a.b.j3.g.e(a2Var);
        this.f9877i = this.f9870b.d(looper, null);
        this.f9875g = this.f9875g.b(looper, new y.b() { // from class: c.f.a.b.s2.f
            @Override // c.f.a.b.j3.y.b
            public final void a(Object obj, c.f.a.b.j3.t tVar) {
                this.f9850a.D1(a2Var, (j1) obj, tVar);
            }
        });
    }

    @Override // c.f.a.b.t2.u
    public final void I(final k1 k1Var, final c.f.a.b.v2.g gVar) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1010, new y.a() { // from class: c.f.a.b.s2.e0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.D0(aVarU0, k1Var, gVar, (j1) obj);
            }
        });
    }

    public final void I1(List<i0.a> list, i0.a aVar) {
        this.f9873e.k(list, aVar, (a2) c.f.a.b.j3.g.e(this.f9876h));
    }

    @Override // c.f.a.b.t2.r
    public final void J(final c.f.a.b.t2.p pVar) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1016, new y.a() { // from class: c.f.a.b.s2.e1
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).C(aVarU0, pVar);
            }
        });
    }

    @Override // c.f.a.b.x2.a0
    public final void K(int i2, i0.a aVar) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, 1034, new y.a() { // from class: c.f.a.b.s2.x
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).q0(aVarS0);
            }
        });
    }

    @Override // c.f.a.b.k3.b0
    public /* synthetic */ void L(int i2, int i3, int i4, float f2) {
        c.f.a.b.k3.a0.a(this, i2, i3, i4, f2);
    }

    @Override // c.f.a.b.k3.d0
    public final void M(final Object obj, final long j2) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1027, new y.a() { // from class: c.f.a.b.s2.j0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj2) {
                ((j1) obj2).k0(aVarU0, obj, j2);
            }
        });
    }

    @Override // c.f.a.b.k3.b0
    public /* synthetic */ void N() {
        c2.s(this);
    }

    @Override // c.f.a.b.a2.c
    public final void O(final p1 p1Var, final int i2) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 1, new y.a() { // from class: c.f.a.b.s2.v0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).h0(aVarO0, p1Var, i2);
            }
        });
    }

    @Override // c.f.a.b.x2.a0
    public /* synthetic */ void P(int i2, i0.a aVar) {
        c.f.a.b.x2.z.a(this, i2, aVar);
    }

    @Override // c.f.a.b.f3.l
    public /* synthetic */ void Q(List list) {
        c2.c(this, list);
    }

    @Override // c.f.a.b.k3.d0
    public /* synthetic */ void R(k1 k1Var) {
        c.f.a.b.k3.c0.i(this, k1Var);
    }

    @Override // c.f.a.b.k3.d0
    public final void S(final c.f.a.b.v2.d dVar) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1020, new y.a() { // from class: c.f.a.b.s2.j
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.v1(aVarU0, dVar, (j1) obj);
            }
        });
    }

    @Override // c.f.a.b.k3.d0
    public final void T(final k1 k1Var, final c.f.a.b.v2.g gVar) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1022, new y.a() { // from class: c.f.a.b.s2.t0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.x1(aVarU0, k1Var, gVar, (j1) obj);
            }
        });
    }

    @Override // c.f.a.b.t2.u
    public final void U(final long j2) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1011, new y.a() { // from class: c.f.a.b.s2.x0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).N(aVarU0, j2);
            }
        });
    }

    @Override // c.f.a.b.x2.a0
    public final void V(int i2, i0.a aVar) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, 1031, new y.a() { // from class: c.f.a.b.s2.p
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).J(aVarS0);
            }
        });
    }

    @Override // c.f.a.b.t2.u
    public final void W(final Exception exc) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1037, new y.a() { // from class: c.f.a.b.s2.a1
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).R(aVarU0, exc);
            }
        });
    }

    @Override // c.f.a.b.t2.u
    public /* synthetic */ void X(k1 k1Var) {
        c.f.a.b.t2.t.f(this, k1Var);
    }

    @Override // c.f.a.b.k3.d0
    public final void Y(final Exception exc) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1038, new y.a() { // from class: c.f.a.b.s2.d
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).d0(aVarU0, exc);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public final void Z(final boolean z, final int i2) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 6, new y.a() { // from class: c.f.a.b.s2.y0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).a0(aVarO0, z, i2);
            }
        });
    }

    @Override // c.f.a.b.t2.r
    public final void a(final boolean z) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1017, new y.a() { // from class: c.f.a.b.s2.d0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).Y(aVarU0, z);
            }
        });
    }

    @Override // c.f.a.b.e3.j0
    public final void a0(int i2, i0.a aVar, final c.f.a.b.e3.a0 a0Var, final c.f.a.b.e3.d0 d0Var) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, AdError.NO_FILL_ERROR_CODE, new y.a() { // from class: c.f.a.b.s2.m
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).T(aVarS0, a0Var, d0Var);
            }
        });
    }

    @Override // c.f.a.b.k3.b0
    public final void b(final c.f.a.b.k3.e0 e0Var) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1028, new y.a() { // from class: c.f.a.b.s2.g1
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.y1(aVarU0, e0Var, (j1) obj);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public final void b0(final c.f.a.b.e3.a1 a1Var, final c.f.a.b.g3.l lVar) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 2, new y.a() { // from class: c.f.a.b.s2.f0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).M(aVarO0, a1Var, lVar);
            }
        });
    }

    @Override // c.f.a.b.t2.u
    public final void c(final Exception exc) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1018, new y.a() { // from class: c.f.a.b.s2.g
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).X(aVarU0, exc);
            }
        });
    }

    @Override // c.f.a.b.k3.d0
    public final void c0(final c.f.a.b.v2.d dVar) {
        final j1.a aVarT0 = t0();
        G1(aVarT0, 1025, new y.a() { // from class: c.f.a.b.s2.o0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.u1(aVarT0, dVar, (j1) obj);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public final void d(final z1 z1Var) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 13, new y.a() { // from class: c.f.a.b.s2.r
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).p(aVarO0, z1Var);
            }
        });
    }

    @Override // c.f.a.b.k3.b0
    public void d0(final int i2, final int i3) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1029, new y.a() { // from class: c.f.a.b.s2.h
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).O(aVarU0, i2, i3);
            }
        });
    }

    @Override // c.f.a.b.t2.u
    public final void e(final c.f.a.b.v2.d dVar) {
        final j1.a aVarT0 = t0();
        G1(aVarT0, 1014, new y.a() { // from class: c.f.a.b.s2.q
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.B0(aVarT0, dVar, (j1) obj);
            }
        });
    }

    @Override // c.f.a.b.x2.a0
    public final void e0(int i2, i0.a aVar, final int i3) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, 1030, new y.a() { // from class: c.f.a.b.s2.i0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.N0(aVarS0, i3, (j1) obj);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public final void f(final a2.f fVar, final a2.f fVar2, final int i2) {
        if (i2 == 1) {
            this.f9878j = false;
        }
        this.f9873e.j((a2) c.f.a.b.j3.g.e(this.f9876h));
        final j1.a aVarO0 = o0();
        G1(aVarO0, 12, new y.a() { // from class: c.f.a.b.s2.c1
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.g1(aVarO0, i2, fVar, fVar2, (j1) obj);
            }
        });
    }

    @Override // c.f.a.b.x2.a0
    public final void f0(int i2, i0.a aVar) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, 1035, new y.a() { // from class: c.f.a.b.s2.u
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).m(aVarS0);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public final void g(final int i2) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 7, new y.a() { // from class: c.f.a.b.s2.a
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).o(aVarO0, i2);
            }
        });
    }

    @Override // c.f.a.b.t2.u
    public final void g0(final int i2, final long j2, final long j3) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1012, new y.a() { // from class: c.f.a.b.s2.b1
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).r(aVarU0, i2, j2, j3);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void h(boolean z) {
        b2.d(this, z);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void h0(x1 x1Var) {
        c2.q(this, x1Var);
    }

    @Override // c.f.a.b.a2.c
    public /* synthetic */ void i(int i2) {
        b2.l(this, i2);
    }

    @Override // c.f.a.b.e3.j0
    public final void i0(int i2, i0.a aVar, final c.f.a.b.e3.a0 a0Var, final c.f.a.b.e3.d0 d0Var, final IOException iOException, final boolean z) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, 1003, new y.a() { // from class: c.f.a.b.s2.l
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).v(aVarS0, a0Var, d0Var, iOException, z);
            }
        });
    }

    @Override // c.f.a.b.k3.d0
    public final void j(final String str) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1024, new y.a() { // from class: c.f.a.b.s2.n0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).c(aVarU0, str);
            }
        });
    }

    @Override // c.f.a.b.k3.d0
    public final void j0(final long j2, final int i2) {
        final j1.a aVarT0 = t0();
        G1(aVarT0, 1026, new y.a() { // from class: c.f.a.b.s2.z0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).e(aVarT0, j2, i2);
            }
        });
    }

    @Override // c.f.a.b.t2.u
    public final void k(final c.f.a.b.v2.d dVar) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1008, new y.a() { // from class: c.f.a.b.s2.n
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.C0(aVarU0, dVar, (j1) obj);
            }
        });
    }

    @Override // c.f.a.b.w2.c
    public /* synthetic */ void k0(c.f.a.b.w2.b bVar) {
        c2.d(this, bVar);
    }

    @Override // c.f.a.b.a2.c
    @Deprecated
    public final void l(final List<c.f.a.b.b3.a> list) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 3, new y.a() { // from class: c.f.a.b.s2.t
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).m0(aVarO0, list);
            }
        });
    }

    @Override // c.f.a.b.x2.a0
    public final void l0(int i2, i0.a aVar) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, 1033, new y.a() { // from class: c.f.a.b.s2.i
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).n(aVarS0);
            }
        });
    }

    @Override // c.f.a.b.k3.d0
    public final void m(final String str, final long j2, final long j3) {
        final j1.a aVarU0 = u0();
        G1(aVarU0, 1021, new y.a() { // from class: c.f.a.b.s2.b
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.s1(aVarU0, str, j3, j2, (j1) obj);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public void m0(final boolean z) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 8, new y.a() { // from class: c.f.a.b.s2.l0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).Q(aVarO0, z);
            }
        });
    }

    @Override // c.f.a.b.e3.j0
    public final void n(int i2, i0.a aVar, final c.f.a.b.e3.d0 d0Var) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, 1004, new y.a() { // from class: c.f.a.b.s2.d1
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).S(aVarS0, d0Var);
            }
        });
    }

    public void n0(j1 j1Var) {
        c.f.a.b.j3.g.e(j1Var);
        this.f9875g.a(j1Var);
    }

    @Override // c.f.a.b.e3.j0
    public final void o(int i2, i0.a aVar, final c.f.a.b.e3.a0 a0Var, final c.f.a.b.e3.d0 d0Var) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new y.a() { // from class: c.f.a.b.s2.q0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).L(aVarS0, a0Var, d0Var);
            }
        });
    }

    public final j1.a o0() {
        return q0(this.f9873e.d());
    }

    @Override // c.f.a.b.a2.c
    public final void onRepeatModeChanged(final int i2) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 9, new y.a() { // from class: c.f.a.b.s2.f1
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).B(aVarO0, i2);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public final void p(final boolean z) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 4, new y.a() { // from class: c.f.a.b.s2.k
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                h1.R0(aVarO0, z, (j1) obj);
            }
        });
    }

    @RequiresNonNull({"player"})
    public final j1.a p0(p2 p2Var, int i2, i0.a aVar) {
        long jX;
        i0.a aVar2 = p2Var.q() ? null : aVar;
        long jB = this.f9870b.b();
        boolean z = p2Var.equals(this.f9876h.G()) && i2 == this.f9876h.s();
        long jB2 = 0;
        if (aVar2 != null && aVar2.b()) {
            if (z && this.f9876h.B() == aVar2.f7477b && this.f9876h.q() == aVar2.f7478c) {
                jB2 = this.f9876h.getCurrentPosition();
            }
        } else {
            if (z) {
                jX = this.f9876h.x();
                return new j1.a(jB, p2Var, i2, aVar2, jX, this.f9876h.G(), this.f9876h.s(), this.f9873e.d(), this.f9876h.getCurrentPosition(), this.f9876h.f());
            }
            if (!p2Var.q()) {
                jB2 = p2Var.n(i2, this.f9872d).b();
            }
        }
        jX = jB2;
        return new j1.a(jB, p2Var, i2, aVar2, jX, this.f9876h.G(), this.f9876h.s(), this.f9873e.d(), this.f9876h.getCurrentPosition(), this.f9876h.f());
    }

    @Override // c.f.a.b.e3.j0
    public final void q(int i2, i0.a aVar, final c.f.a.b.e3.d0 d0Var) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, 1005, new y.a() { // from class: c.f.a.b.s2.w0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).U(aVarS0, d0Var);
            }
        });
    }

    public final j1.a q0(i0.a aVar) {
        c.f.a.b.j3.g.e(this.f9876h);
        p2 p2VarF = aVar == null ? null : this.f9873e.f(aVar);
        if (aVar != null && p2VarF != null) {
            return p0(p2VarF, p2VarF.h(aVar.f7476a, this.f9871c).f9704d, aVar);
        }
        int iS = this.f9876h.s();
        p2 p2VarG = this.f9876h.G();
        if (!(iS < p2VarG.p())) {
            p2VarG = p2.f9699a;
        }
        return p0(p2VarG, iS, null);
    }

    @Override // c.f.a.b.a2.c
    public final void r() {
        final j1.a aVarO0 = o0();
        G1(aVarO0, -1, new y.a() { // from class: c.f.a.b.s2.r0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).g(aVarO0);
            }
        });
    }

    public final j1.a r0() {
        return q0(this.f9873e.e());
    }

    @Override // c.f.a.b.a2.c
    public final void s(final x1 x1Var) {
        c.f.a.b.e3.g0 g0Var;
        final j1.a aVarQ0 = (!(x1Var instanceof c.f.a.b.d1) || (g0Var = ((c.f.a.b.d1) x1Var).f6849k) == null) ? null : q0(new i0.a(g0Var));
        if (aVarQ0 == null) {
            aVarQ0 = o0();
        }
        G1(aVarQ0, 11, new y.a() { // from class: c.f.a.b.s2.p0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).j(aVarQ0, x1Var);
            }
        });
    }

    public final j1.a s0(int i2, i0.a aVar) {
        c.f.a.b.j3.g.e(this.f9876h);
        if (aVar != null) {
            return this.f9873e.f(aVar) != null ? q0(aVar) : p0(p2.f9699a, i2, aVar);
        }
        p2 p2VarG = this.f9876h.G();
        if (!(i2 < p2VarG.p())) {
            p2VarG = p2.f9699a;
        }
        return p0(p2VarG, i2, null);
    }

    @Override // c.f.a.b.a2.c
    public void t(final a2.b bVar) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 14, new y.a() { // from class: c.f.a.b.s2.c
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).j0(aVarO0, bVar);
            }
        });
    }

    public final j1.a t0() {
        return q0(this.f9873e.g());
    }

    @Override // c.f.a.b.x2.a0
    public final void u(int i2, i0.a aVar, final Exception exc) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, 1032, new y.a() { // from class: c.f.a.b.s2.w
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).l(aVarS0, exc);
            }
        });
    }

    public final j1.a u0() {
        return q0(this.f9873e.h());
    }

    @Override // c.f.a.b.a2.c
    public final void v(p2 p2Var, final int i2) {
        this.f9873e.l((a2) c.f.a.b.j3.g.e(this.f9876h));
        final j1.a aVarO0 = o0();
        G1(aVarO0, 0, new y.a() { // from class: c.f.a.b.s2.u0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).e0(aVarO0, i2);
            }
        });
    }

    @Override // c.f.a.b.e3.j0
    public final void w(int i2, i0.a aVar, final c.f.a.b.e3.a0 a0Var, final c.f.a.b.e3.d0 d0Var) {
        final j1.a aVarS0 = s0(i2, aVar);
        G1(aVarS0, 1000, new y.a() { // from class: c.f.a.b.s2.s
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).h(aVarS0, a0Var, d0Var);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public final void x(final int i2) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 5, new y.a() { // from class: c.f.a.b.s2.s0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).H(aVarO0, i2);
            }
        });
    }

    @Override // c.f.a.b.i3.i.a
    public final void y(final int i2, final long j2, final long j3) {
        final j1.a aVarR0 = r0();
        G1(aVarR0, 1006, new y.a() { // from class: c.f.a.b.s2.c0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).a(aVarR0, i2, j2, j3);
            }
        });
    }

    @Override // c.f.a.b.a2.c
    public void z(final q1 q1Var) {
        final j1.a aVarO0 = o0();
        G1(aVarO0, 15, new y.a() { // from class: c.f.a.b.s2.h0
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                ((j1) obj).s(aVarO0, q1Var);
            }
        });
    }
}
