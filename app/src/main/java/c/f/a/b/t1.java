package c.f.a.b;

import android.os.Handler;
import android.util.Pair;
import c.f.a.b.e3.i0;
import c.f.a.b.p2;
import c.f.b.b.t;

/* JADX INFO: loaded from: classes.dex */
public final class t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2.b f9975a = new p2.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2.c f9976b = new p2.c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.s2.h1 f9977c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f9978d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f9979e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f9981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public r1 f9982h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r1 f9983i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r1 f9984j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9985k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f9986l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f9987m;

    public t1(c.f.a.b.s2.h1 h1Var, Handler handler) {
        this.f9977c = h1Var;
        this.f9978d = handler;
    }

    public static i0.a B(p2 p2Var, Object obj, long j2, long j3, p2.b bVar) {
        p2Var.h(obj, bVar);
        int iE = bVar.e(j2);
        return iE == -1 ? new i0.a(obj, j3, bVar.d(j2)) : new i0.a(obj, iE, bVar.l(iE), j3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void w(t.a aVar, i0.a aVar2) {
        this.f9977c.I1(aVar.e(), aVar2);
    }

    public i0.a A(p2 p2Var, Object obj, long j2) {
        return B(p2Var, obj, j2, C(p2Var, obj), this.f9975a);
    }

    public final long C(p2 p2Var, Object obj) {
        int iB;
        int i2 = p2Var.h(obj, this.f9975a).f9704d;
        Object obj2 = this.f9986l;
        if (obj2 != null && (iB = p2Var.b(obj2)) != -1 && p2Var.f(iB, this.f9975a).f9704d == i2) {
            return this.f9987m;
        }
        r1 r1VarJ = this.f9982h;
        while (true) {
            if (r1VarJ == null) {
                r1VarJ = this.f9982h;
                while (r1VarJ != null) {
                    int iB2 = p2Var.b(r1VarJ.f9771b);
                    if (iB2 == -1 || p2Var.f(iB2, this.f9975a).f9704d != i2) {
                        r1VarJ = r1VarJ.j();
                    }
                }
                long j2 = this.f9979e;
                this.f9979e = 1 + j2;
                if (this.f9982h == null) {
                    this.f9986l = obj;
                    this.f9987m = j2;
                }
                return j2;
            }
            if (r1VarJ.f9771b.equals(obj)) {
                break;
            }
            r1VarJ = r1VarJ.j();
        }
        return r1VarJ.f9775f.f9801a.f7479d;
    }

    public boolean D() {
        r1 r1Var = this.f9984j;
        return r1Var == null || (!r1Var.f9775f.f9809i && r1Var.q() && this.f9984j.f9775f.f9805e != -9223372036854775807L && this.f9985k < 100);
    }

    public final boolean E(p2 p2Var) {
        r1 r1VarJ = this.f9982h;
        if (r1VarJ == null) {
            return true;
        }
        int iB = p2Var.b(r1VarJ.f9771b);
        while (true) {
            iB = p2Var.d(iB, this.f9975a, this.f9976b, this.f9980f, this.f9981g);
            while (r1VarJ.j() != null && !r1VarJ.f9775f.f9807g) {
                r1VarJ = r1VarJ.j();
            }
            r1 r1VarJ2 = r1VarJ.j();
            if (iB == -1 || r1VarJ2 == null || p2Var.b(r1VarJ2.f9771b) != iB) {
                break;
            }
            r1VarJ = r1VarJ2;
        }
        boolean z = z(r1VarJ);
        r1VarJ.f9775f = q(p2Var, r1VarJ.f9775f);
        return !z;
    }

    public boolean F(p2 p2Var, long j2, long j3) {
        s1 s1VarQ;
        r1 r1VarJ = this.f9982h;
        r1 r1Var = null;
        while (r1VarJ != null) {
            s1 s1Var = r1VarJ.f9775f;
            if (r1Var != null) {
                s1 s1VarH = h(p2Var, r1Var, j2);
                if (s1VarH != null && d(s1Var, s1VarH)) {
                    s1VarQ = s1VarH;
                }
                return !z(r1Var);
            }
            s1VarQ = q(p2Var, s1Var);
            r1VarJ.f9775f = s1VarQ.a(s1Var.f9803c);
            if (!c(s1Var.f9805e, s1VarQ.f9805e)) {
                r1VarJ.A();
                long j4 = s1VarQ.f9805e;
                return (z(r1VarJ) || (r1VarJ == this.f9983i && !r1VarJ.f9775f.f9806f && ((j3 > Long.MIN_VALUE ? 1 : (j3 == Long.MIN_VALUE ? 0 : -1)) == 0 || (j3 > ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : r1VarJ.z(j4)) ? 1 : (j3 == ((j4 > (-9223372036854775807L) ? 1 : (j4 == (-9223372036854775807L) ? 0 : -1)) == 0 ? Long.MAX_VALUE : r1VarJ.z(j4)) ? 0 : -1)) >= 0))) ? false : true;
            }
            r1Var = r1VarJ;
            r1VarJ = r1VarJ.j();
        }
        return true;
    }

    public boolean G(p2 p2Var, int i2) {
        this.f9980f = i2;
        return E(p2Var);
    }

    public boolean H(p2 p2Var, boolean z) {
        this.f9981g = z;
        return E(p2Var);
    }

    public r1 a() {
        r1 r1Var = this.f9982h;
        if (r1Var == null) {
            return null;
        }
        if (r1Var == this.f9983i) {
            this.f9983i = r1Var.j();
        }
        this.f9982h.t();
        int i2 = this.f9985k - 1;
        this.f9985k = i2;
        if (i2 == 0) {
            this.f9984j = null;
            r1 r1Var2 = this.f9982h;
            this.f9986l = r1Var2.f9771b;
            this.f9987m = r1Var2.f9775f.f9801a.f7479d;
        }
        this.f9982h = this.f9982h.j();
        x();
        return this.f9982h;
    }

    public r1 b() {
        r1 r1Var = this.f9983i;
        c.f.a.b.j3.g.g((r1Var == null || r1Var.j() == null) ? false : true);
        this.f9983i = this.f9983i.j();
        x();
        return this.f9983i;
    }

    public final boolean c(long j2, long j3) {
        return j2 == -9223372036854775807L || j2 == j3;
    }

    public final boolean d(s1 s1Var, s1 s1Var2) {
        return s1Var.f9802b == s1Var2.f9802b && s1Var.f9801a.equals(s1Var2.f9801a);
    }

    public void e() {
        if (this.f9985k == 0) {
            return;
        }
        r1 r1VarJ = (r1) c.f.a.b.j3.g.i(this.f9982h);
        this.f9986l = r1VarJ.f9771b;
        this.f9987m = r1VarJ.f9775f.f9801a.f7479d;
        while (r1VarJ != null) {
            r1VarJ.t();
            r1VarJ = r1VarJ.j();
        }
        this.f9982h = null;
        this.f9984j = null;
        this.f9983i = null;
        this.f9985k = 0;
        x();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.f.a.b.r1 f(c.f.a.b.j2[] r12, c.f.a.b.g3.o r13, c.f.a.b.i3.f r14, c.f.a.b.v1 r15, c.f.a.b.s1 r16, c.f.a.b.g3.p r17) {
        /*
            r11 = this;
            r0 = r11
            r8 = r16
            c.f.a.b.r1 r1 = r0.f9984j
            if (r1 != 0) goto L1e
            c.f.a.b.e3.i0$a r1 = r8.f9801a
            boolean r1 = r1.b()
            if (r1 == 0) goto L1b
            long r1 = r8.f9803c
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto L1b
            goto L2c
        L1b:
            r1 = 0
            goto L2c
        L1e:
            long r1 = r1.l()
            c.f.a.b.r1 r3 = r0.f9984j
            c.f.a.b.s1 r3 = r3.f9775f
            long r3 = r3.f9805e
            long r1 = r1 + r3
            long r3 = r8.f9802b
            long r1 = r1 - r3
        L2c:
            r3 = r1
            c.f.a.b.r1 r10 = new c.f.a.b.r1
            r1 = r10
            r2 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r8 = r16
            r9 = r17
            r1.<init>(r2, r3, r5, r6, r7, r8, r9)
            c.f.a.b.r1 r1 = r0.f9984j
            if (r1 == 0) goto L43
            r1.w(r10)
            goto L47
        L43:
            r0.f9982h = r10
            r0.f9983i = r10
        L47:
            r1 = 0
            r0.f9986l = r1
            r0.f9984j = r10
            int r1 = r0.f9985k
            int r1 = r1 + 1
            r0.f9985k = r1
            r11.x()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.t1.f(c.f.a.b.j2[], c.f.a.b.g3.o, c.f.a.b.i3.f, c.f.a.b.v1, c.f.a.b.s1, c.f.a.b.g3.p):c.f.a.b.r1");
    }

    public final s1 g(y1 y1Var) {
        return j(y1Var.f10460b, y1Var.f10461c, y1Var.f10462d, y1Var.t);
    }

    public final s1 h(p2 p2Var, r1 r1Var, long j2) {
        long j3;
        s1 s1Var = r1Var.f9775f;
        long jL = (r1Var.l() + s1Var.f9805e) - j2;
        if (s1Var.f9807g) {
            long j4 = 0;
            int iD = p2Var.d(p2Var.b(s1Var.f9801a.f7476a), this.f9975a, this.f9976b, this.f9980f, this.f9981g);
            if (iD == -1) {
                return null;
            }
            int i2 = p2Var.g(iD, this.f9975a, true).f9704d;
            Object obj = this.f9975a.f9703c;
            long j5 = s1Var.f9801a.f7479d;
            if (p2Var.n(i2, this.f9976b).s == iD) {
                Pair<Object, Long> pairK = p2Var.k(this.f9976b, this.f9975a, i2, -9223372036854775807L, Math.max(0L, jL));
                if (pairK == null) {
                    return null;
                }
                obj = pairK.first;
                long jLongValue = ((Long) pairK.second).longValue();
                r1 r1VarJ = r1Var.j();
                if (r1VarJ == null || !r1VarJ.f9771b.equals(obj)) {
                    j5 = this.f9979e;
                    this.f9979e = 1 + j5;
                } else {
                    j5 = r1VarJ.f9775f.f9801a.f7479d;
                }
                j3 = jLongValue;
                j4 = -9223372036854775807L;
            } else {
                j3 = 0;
            }
            return j(p2Var, B(p2Var, obj, j3, j5, this.f9975a), j4, j3);
        }
        i0.a aVar = s1Var.f9801a;
        p2Var.h(aVar.f7476a, this.f9975a);
        if (!aVar.b()) {
            int iL = this.f9975a.l(aVar.f7480e);
            if (iL != this.f9975a.a(aVar.f7480e)) {
                return k(p2Var, aVar.f7476a, aVar.f7480e, iL, s1Var.f9805e, aVar.f7479d);
            }
            return l(p2Var, aVar.f7476a, m(p2Var, aVar.f7476a, aVar.f7480e), s1Var.f9805e, aVar.f7479d);
        }
        int i3 = aVar.f7477b;
        int iA = this.f9975a.a(i3);
        if (iA == -1) {
            return null;
        }
        int iM = this.f9975a.m(i3, aVar.f7478c);
        if (iM < iA) {
            return k(p2Var, aVar.f7476a, i3, iM, s1Var.f9803c, aVar.f7479d);
        }
        long jLongValue2 = s1Var.f9803c;
        if (jLongValue2 == -9223372036854775807L) {
            p2.c cVar = this.f9976b;
            p2.b bVar = this.f9975a;
            Pair<Object, Long> pairK2 = p2Var.k(cVar, bVar, bVar.f9704d, -9223372036854775807L, Math.max(0L, jL));
            if (pairK2 == null) {
                return null;
            }
            jLongValue2 = ((Long) pairK2.second).longValue();
        }
        return l(p2Var, aVar.f7476a, Math.max(m(p2Var, aVar.f7476a, aVar.f7477b), jLongValue2), s1Var.f9803c, aVar.f7479d);
    }

    public r1 i() {
        return this.f9984j;
    }

    public final s1 j(p2 p2Var, i0.a aVar, long j2, long j3) {
        p2Var.h(aVar.f7476a, this.f9975a);
        boolean zB = aVar.b();
        Object obj = aVar.f7476a;
        return zB ? k(p2Var, obj, aVar.f7477b, aVar.f7478c, j2, aVar.f7479d) : l(p2Var, obj, j3, j2, aVar.f7479d);
    }

    public final s1 k(p2 p2Var, Object obj, int i2, int i3, long j2, long j3) {
        i0.a aVar = new i0.a(obj, i2, i3, j3);
        long jB = p2Var.h(aVar.f7476a, this.f9975a).b(aVar.f7477b, aVar.f7478c);
        long jG = i3 == this.f9975a.l(i2) ? this.f9975a.g() : 0L;
        return new s1(aVar, (jB == -9223372036854775807L || jG < jB) ? jG : Math.max(0L, jB - 1), j2, -9223372036854775807L, jB, this.f9975a.r(aVar.f7477b), false, false, false);
    }

    public final s1 l(p2 p2Var, Object obj, long j2, long j3, long j4) {
        long jMax = j2;
        p2Var.h(obj, this.f9975a);
        int iD = this.f9975a.d(jMax);
        i0.a aVar = new i0.a(obj, j4, iD);
        boolean zR = r(aVar);
        boolean zT = t(p2Var, aVar);
        boolean zS = s(p2Var, aVar, zR);
        boolean z = iD != -1 && this.f9975a.r(iD);
        long jF = iD != -1 ? this.f9975a.f(iD) : -9223372036854775807L;
        long j5 = (jF == -9223372036854775807L || jF == Long.MIN_VALUE) ? this.f9975a.f9705e : jF;
        if (j5 != -9223372036854775807L && jMax >= j5) {
            jMax = Math.max(0L, j5 - 1);
        }
        return new s1(aVar, jMax, j3, jF, j5, z, zR, zT, zS);
    }

    public final long m(p2 p2Var, Object obj, int i2) {
        p2Var.h(obj, this.f9975a);
        long jF = this.f9975a.f(i2);
        return jF == Long.MIN_VALUE ? this.f9975a.f9705e : jF + this.f9975a.i(i2);
    }

    public s1 n(long j2, y1 y1Var) {
        r1 r1Var = this.f9984j;
        return r1Var == null ? g(y1Var) : h(y1Var.f10460b, r1Var, j2);
    }

    public r1 o() {
        return this.f9982h;
    }

    public r1 p() {
        return this.f9983i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public c.f.a.b.s1 q(c.f.a.b.p2 r19, c.f.a.b.s1 r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            c.f.a.b.e3.i0$a r3 = r2.f9801a
            boolean r12 = r0.r(r3)
            boolean r13 = r0.t(r1, r3)
            boolean r14 = r0.s(r1, r3, r12)
            c.f.a.b.e3.i0$a r4 = r2.f9801a
            java.lang.Object r4 = r4.f7476a
            c.f.a.b.p2$b r5 = r0.f9975a
            r1.h(r4, r5)
            boolean r1 = r3.b()
            r4 = -1
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L35
            int r1 = r3.f7480e
            if (r1 != r4) goto L2e
            goto L35
        L2e:
            c.f.a.b.p2$b r7 = r0.f9975a
            long r7 = r7.f(r1)
            goto L36
        L35:
            r7 = r5
        L36:
            boolean r1 = r3.b()
            if (r1 == 0) goto L48
            c.f.a.b.p2$b r1 = r0.f9975a
            int r5 = r3.f7477b
            int r6 = r3.f7478c
            long r5 = r1.b(r5, r6)
        L46:
            r9 = r5
            goto L5c
        L48:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 == 0) goto L55
            r5 = -9223372036854775808
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 != 0) goto L53
            goto L55
        L53:
            r9 = r7
            goto L5c
        L55:
            c.f.a.b.p2$b r1 = r0.f9975a
            long r5 = r1.k()
            goto L46
        L5c:
            boolean r1 = r3.b()
            if (r1 == 0) goto L6c
            c.f.a.b.p2$b r1 = r0.f9975a
            int r4 = r3.f7477b
            boolean r1 = r1.r(r4)
            r11 = r1
            goto L7d
        L6c:
            int r1 = r3.f7480e
            if (r1 == r4) goto L7b
            c.f.a.b.p2$b r4 = r0.f9975a
            boolean r1 = r4.r(r1)
            if (r1 == 0) goto L7b
            r1 = 1
            r11 = 1
            goto L7d
        L7b:
            r1 = 0
            r11 = 0
        L7d:
            c.f.a.b.s1 r15 = new c.f.a.b.s1
            long r4 = r2.f9802b
            long r1 = r2.f9803c
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.t1.q(c.f.a.b.p2, c.f.a.b.s1):c.f.a.b.s1");
    }

    public final boolean r(i0.a aVar) {
        return !aVar.b() && aVar.f7480e == -1;
    }

    public final boolean s(p2 p2Var, i0.a aVar, boolean z) {
        int iB = p2Var.b(aVar.f7476a);
        return !p2Var.n(p2Var.f(iB, this.f9975a).f9704d, this.f9976b).f9721m && p2Var.r(iB, this.f9975a, this.f9976b, this.f9980f, this.f9981g) && z;
    }

    public final boolean t(p2 p2Var, i0.a aVar) {
        if (r(aVar)) {
            return p2Var.n(p2Var.h(aVar.f7476a, this.f9975a).f9704d, this.f9976b).t == p2Var.b(aVar.f7476a);
        }
        return false;
    }

    public boolean u(c.f.a.b.e3.f0 f0Var) {
        r1 r1Var = this.f9984j;
        return r1Var != null && r1Var.f9770a == f0Var;
    }

    public final void x() {
        if (this.f9977c != null) {
            final t.a aVarB = c.f.b.b.t.B();
            for (r1 r1VarJ = this.f9982h; r1VarJ != null; r1VarJ = r1VarJ.j()) {
                aVarB.d(r1VarJ.f9775f.f9801a);
            }
            r1 r1Var = this.f9983i;
            final i0.a aVar = r1Var == null ? null : r1Var.f9775f.f9801a;
            this.f9978d.post(new Runnable() { // from class: c.f.a.b.g0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8389b.w(aVarB, aVar);
                }
            });
        }
    }

    public void y(long j2) {
        r1 r1Var = this.f9984j;
        if (r1Var != null) {
            r1Var.s(j2);
        }
    }

    public boolean z(r1 r1Var) {
        boolean z = false;
        c.f.a.b.j3.g.g(r1Var != null);
        if (r1Var.equals(this.f9984j)) {
            return false;
        }
        this.f9984j = r1Var;
        while (r1Var.j() != null) {
            r1Var = r1Var.j();
            if (r1Var == this.f9983i) {
                this.f9983i = this.f9982h;
                z = true;
            }
            r1Var.t();
            this.f9985k--;
        }
        this.f9984j.w(null);
        x();
        return z;
    }
}
