package c.f.a.b.s2;

import android.util.SparseArray;
import c.f.a.b.a2;
import c.f.a.b.e3.i0;
import c.f.a.b.k1;
import c.f.a.b.p1;
import c.f.a.b.p2;
import c.f.a.b.q1;
import c.f.a.b.x1;
import c.f.a.b.z1;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface j1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p2 f9894b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f9895c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final i0.a f9896d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f9897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p2 f9898f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f9899g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final i0.a f9900h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final long f9901i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final long f9902j;

        public a(long j2, p2 p2Var, int i2, i0.a aVar, long j3, p2 p2Var2, int i3, i0.a aVar2, long j4, long j5) {
            this.f9893a = j2;
            this.f9894b = p2Var;
            this.f9895c = i2;
            this.f9896d = aVar;
            this.f9897e = j3;
            this.f9898f = p2Var2;
            this.f9899g = i3;
            this.f9900h = aVar2;
            this.f9901i = j4;
            this.f9902j = j5;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f9893a == aVar.f9893a && this.f9895c == aVar.f9895c && this.f9897e == aVar.f9897e && this.f9899g == aVar.f9899g && this.f9901i == aVar.f9901i && this.f9902j == aVar.f9902j && c.f.b.a.h.a(this.f9894b, aVar.f9894b) && c.f.b.a.h.a(this.f9896d, aVar.f9896d) && c.f.b.a.h.a(this.f9898f, aVar.f9898f) && c.f.b.a.h.a(this.f9900h, aVar.f9900h);
        }

        public int hashCode() {
            return c.f.b.a.h.b(Long.valueOf(this.f9893a), this.f9894b, Integer.valueOf(this.f9895c), this.f9896d, Long.valueOf(this.f9897e), this.f9898f, Integer.valueOf(this.f9899g), this.f9900h, Long.valueOf(this.f9901i), Long.valueOf(this.f9902j));
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c.f.a.b.j3.t f9903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final SparseArray<a> f9904b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(c.f.a.b.j3.t tVar, SparseArray<a> sparseArray) {
            this.f9903a = tVar;
            SparseArray<a> sparseArray2 = new SparseArray<>(tVar.d());
            for (int i2 = 0; i2 < tVar.d(); i2++) {
                int iC = tVar.c(i2);
                sparseArray2.append(iC, c.f.a.b.j3.g.e(sparseArray.get(iC)));
            }
            this.f9904b = sparseArray2;
        }
    }

    void A(a aVar, c.f.a.b.b3.a aVar2);

    void B(a aVar, int i2);

    void C(a aVar, c.f.a.b.t2.p pVar);

    void D(a aVar);

    void E(a2 a2Var, b bVar);

    @Deprecated
    void F(a aVar, boolean z, int i2);

    void G(a aVar, c.f.a.b.k3.e0 e0Var);

    void H(a aVar, int i2);

    @Deprecated
    void I(a aVar, k1 k1Var);

    void J(a aVar);

    @Deprecated
    void K(a aVar, k1 k1Var);

    void L(a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var);

    void M(a aVar, c.f.a.b.e3.a1 a1Var, c.f.a.b.g3.l lVar);

    void N(a aVar, long j2);

    void O(a aVar, int i2, int i3);

    void P(a aVar, boolean z);

    void Q(a aVar, boolean z);

    void R(a aVar, Exception exc);

    void S(a aVar, c.f.a.b.e3.d0 d0Var);

    void T(a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var);

    void U(a aVar, c.f.a.b.e3.d0 d0Var);

    void V(a aVar, int i2, long j2);

    void W(a aVar, a2.f fVar, a2.f fVar2, int i2);

    void X(a aVar, Exception exc);

    void Y(a aVar, boolean z);

    void Z(a aVar, String str);

    void a(a aVar, int i2, long j2, long j3);

    void a0(a aVar, boolean z, int i2);

    @Deprecated
    void b(a aVar, int i2, int i3, int i4, float f2);

    void b0(a aVar, String str, long j2, long j3);

    void c(a aVar, String str);

    void c0(a aVar, k1 k1Var, c.f.a.b.v2.g gVar);

    @Deprecated
    void d(a aVar, int i2, k1 k1Var);

    void d0(a aVar, Exception exc);

    void e(a aVar, long j2, int i2);

    void e0(a aVar, int i2);

    void f(a aVar, int i2);

    @Deprecated
    void f0(a aVar, String str, long j2);

    @Deprecated
    void g(a aVar);

    @Deprecated
    void g0(a aVar);

    void h(a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var);

    void h0(a aVar, p1 p1Var, int i2);

    @Deprecated
    void i(a aVar, int i2, String str, long j2);

    void i0(a aVar, k1 k1Var, c.f.a.b.v2.g gVar);

    void j(a aVar, x1 x1Var);

    void j0(a aVar, a2.b bVar);

    @Deprecated
    void k(a aVar, int i2);

    void k0(a aVar, Object obj, long j2);

    void l(a aVar, Exception exc);

    @Deprecated
    void l0(a aVar, int i2, c.f.a.b.v2.d dVar);

    void m(a aVar);

    @Deprecated
    void m0(a aVar, List<c.f.a.b.b3.a> list);

    void n(a aVar);

    @Deprecated
    void n0(a aVar);

    void o(a aVar, int i2);

    void o0(a aVar, boolean z);

    void p(a aVar, z1 z1Var);

    void p0(a aVar, c.f.a.b.v2.d dVar);

    @Deprecated
    void q(a aVar, boolean z);

    void q0(a aVar);

    void r(a aVar, int i2, long j2, long j3);

    void s(a aVar, q1 q1Var);

    void t(a aVar, c.f.a.b.v2.d dVar);

    void u(a aVar, c.f.a.b.v2.d dVar);

    void v(a aVar, c.f.a.b.e3.a0 a0Var, c.f.a.b.e3.d0 d0Var, IOException iOException, boolean z);

    @Deprecated
    void w(a aVar, int i2, c.f.a.b.v2.d dVar);

    void x(a aVar, c.f.a.b.v2.d dVar);

    void y(a aVar, String str, long j2, long j3);

    @Deprecated
    void z(a aVar, String str, long j2);
}
