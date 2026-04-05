package c.f.a.b.e3;

import c.f.a.b.e3.f0;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.m2;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements f0, f0.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f7924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public f0.a f7925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a[] f7926d = new a[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f7927e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f7928f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f7929g;

    public final class a implements s0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final s0 f7930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7931c;

        public a(s0 s0Var) {
            this.f7930b = s0Var;
        }

        @Override // c.f.a.b.e3.s0
        public void a() {
            this.f7930b.a();
        }

        public void b() {
            this.f7931c = false;
        }

        @Override // c.f.a.b.e3.s0
        public boolean e() {
            return !q.this.e() && this.f7930b.e();
        }

        @Override // c.f.a.b.e3.s0
        public int i(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
            if (q.this.e()) {
                return -3;
            }
            if (this.f7931c) {
                fVar.setFlags(4);
                return -4;
            }
            int i3 = this.f7930b.i(l1Var, fVar, i2);
            if (i3 == -5) {
                k1 k1Var = (k1) c.f.a.b.j3.g.e(l1Var.f9575b);
                int i4 = k1Var.C;
                if (i4 != 0 || k1Var.D != 0) {
                    q qVar = q.this;
                    if (qVar.f7928f != 0) {
                        i4 = 0;
                    }
                    l1Var.f9575b = k1Var.b().M(i4).N(qVar.f7929g == Long.MIN_VALUE ? k1Var.D : 0).E();
                }
                return -5;
            }
            q qVar2 = q.this;
            long j2 = qVar2.f7929g;
            if (j2 == Long.MIN_VALUE || ((i3 != -4 || fVar.f10278e < j2) && !(i3 == -3 && qVar2.g() == Long.MIN_VALUE && !fVar.f10277d))) {
                return i3;
            }
            fVar.clear();
            fVar.setFlags(4);
            this.f7931c = true;
            return -4;
        }

        @Override // c.f.a.b.e3.s0
        public int p(long j2) {
            if (q.this.e()) {
                return -3;
            }
            return this.f7930b.p(j2);
        }
    }

    public q(f0 f0Var, boolean z, long j2, long j3) {
        this.f7924b = f0Var;
        this.f7927e = z ? j2 : -9223372036854775807L;
        this.f7928f = j2;
        this.f7929g = j3;
    }

    public static boolean p(long j2, c.f.a.b.g3.h[] hVarArr) {
        if (j2 != 0) {
            for (c.f.a.b.g3.h hVar : hVarArr) {
                if (hVar != null) {
                    k1 k1VarM = hVar.m();
                    if (!c.f.a.b.j3.d0.a(k1VarM.f9338m, k1VarM.f9335j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final m2 a(long j2, m2 m2Var) {
        long jS = c.f.a.b.j3.x0.s(m2Var.f9587f, 0L, j2 - this.f7928f);
        long j3 = m2Var.f9588g;
        long j4 = this.f7929g;
        long jS2 = c.f.a.b.j3.x0.s(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j2);
        return (jS == m2Var.f9587f && jS2 == m2Var.f9588g) ? m2Var : new m2(jS, jS2);
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long b() {
        long jB = this.f7924b.b();
        if (jB != Long.MIN_VALUE) {
            long j2 = this.f7929g;
            if (j2 == Long.MIN_VALUE || jB < j2) {
                return jB;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean c(long j2) {
        return this.f7924b.c(j2);
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean d() {
        return this.f7924b.d();
    }

    public boolean e() {
        return this.f7927e != -9223372036854775807L;
    }

    @Override // c.f.a.b.e3.f0
    public long f(long j2, m2 m2Var) {
        long j3 = this.f7928f;
        if (j2 == j3) {
            return j3;
        }
        return this.f7924b.f(j2, a(j2, m2Var));
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long g() {
        long jG = this.f7924b.g();
        if (jG != Long.MIN_VALUE) {
            long j2 = this.f7929g;
            if (j2 == Long.MIN_VALUE || jG < j2) {
                return jG;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public void h(long j2) {
        this.f7924b.h(j2);
    }

    @Override // c.f.a.b.e3.f0.a
    public void k(f0 f0Var) {
        ((f0.a) c.f.a.b.j3.g.e(this.f7925c)).k(this);
    }

    @Override // c.f.a.b.e3.f0
    public /* synthetic */ List l(List list) {
        return e0.a(this, list);
    }

    @Override // c.f.a.b.e3.t0.a
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void i(f0 f0Var) {
        ((f0.a) c.f.a.b.j3.g.e(this.f7925c)).i(this);
    }

    @Override // c.f.a.b.e3.f0
    public void n() {
        this.f7924b.n();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    @Override // c.f.a.b.e3.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long o(long r7) {
        /*
            r6 = this;
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.f7927e = r0
            c.f.a.b.e3.q$a[] r0 = r6.f7926d
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lc:
            if (r3 >= r1) goto L18
            r4 = r0[r3]
            if (r4 == 0) goto L15
            r4.b()
        L15:
            int r3 = r3 + 1
            goto Lc
        L18:
            c.f.a.b.e3.f0 r0 = r6.f7924b
            long r0 = r0.o(r7)
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 == 0) goto L34
            long r7 = r6.f7928f
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 < 0) goto L35
            long r7 = r6.f7929g
            r3 = -9223372036854775808
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            int r3 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r3 > 0) goto L35
        L34:
            r2 = 1
        L35:
            c.f.a.b.j3.g.g(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.q.o(long):long");
    }

    @Override // c.f.a.b.e3.f0
    public long q() {
        if (e()) {
            long j2 = this.f7927e;
            this.f7927e = -9223372036854775807L;
            long jQ = q();
            return jQ != -9223372036854775807L ? jQ : j2;
        }
        long jQ2 = this.f7924b.q();
        if (jQ2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        c.f.a.b.j3.g.g(jQ2 >= this.f7928f);
        long j3 = this.f7929g;
        if (j3 != Long.MIN_VALUE && jQ2 > j3) {
            z = false;
        }
        c.f.a.b.j3.g.g(z);
        return jQ2;
    }

    @Override // c.f.a.b.e3.f0
    public void r(f0.a aVar, long j2) {
        this.f7925c = aVar;
        this.f7924b.r(this, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    @Override // c.f.a.b.e3.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long s(c.f.a.b.g3.h[] r13, boolean[] r14, c.f.a.b.e3.s0[] r15, boolean[] r16, long r17) {
        /*
            r12 = this;
            r0 = r12
            r1 = r15
            int r2 = r1.length
            c.f.a.b.e3.q$a[] r2 = new c.f.a.b.e3.q.a[r2]
            r0.f7926d = r2
            int r2 = r1.length
            c.f.a.b.e3.s0[] r9 = new c.f.a.b.e3.s0[r2]
            r10 = 0
            r2 = 0
        Lc:
            int r3 = r1.length
            r11 = 0
            if (r2 >= r3) goto L25
            c.f.a.b.e3.q$a[] r3 = r0.f7926d
            r4 = r1[r2]
            c.f.a.b.e3.q$a r4 = (c.f.a.b.e3.q.a) r4
            r3[r2] = r4
            r4 = r3[r2]
            if (r4 == 0) goto L20
            r3 = r3[r2]
            c.f.a.b.e3.s0 r11 = r3.f7930b
        L20:
            r9[r2] = r11
            int r2 = r2 + 1
            goto Lc
        L25:
            c.f.a.b.e3.f0 r2 = r0.f7924b
            r3 = r13
            r4 = r14
            r5 = r9
            r6 = r16
            r7 = r17
            long r2 = r2.s(r3, r4, r5, r6, r7)
            boolean r4 = r12.e()
            if (r4 == 0) goto L47
            long r4 = r0.f7928f
            int r6 = (r17 > r4 ? 1 : (r17 == r4 ? 0 : -1))
            if (r6 != 0) goto L47
            r6 = r13
            boolean r4 = p(r4, r13)
            if (r4 == 0) goto L47
            r4 = r2
            goto L4c
        L47:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L4c:
            r0.f7927e = r4
            int r4 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r4 == 0) goto L67
            long r4 = r0.f7928f
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L65
            long r4 = r0.f7929g
            r6 = -9223372036854775808
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L67
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L65
            goto L67
        L65:
            r4 = 0
            goto L68
        L67:
            r4 = 1
        L68:
            c.f.a.b.j3.g.g(r4)
        L6b:
            int r4 = r1.length
            if (r10 >= r4) goto L97
            r4 = r9[r10]
            if (r4 != 0) goto L77
            c.f.a.b.e3.q$a[] r4 = r0.f7926d
            r4[r10] = r11
            goto L8e
        L77:
            c.f.a.b.e3.q$a[] r4 = r0.f7926d
            r5 = r4[r10]
            if (r5 == 0) goto L85
            r5 = r4[r10]
            c.f.a.b.e3.s0 r5 = r5.f7930b
            r6 = r9[r10]
            if (r5 == r6) goto L8e
        L85:
            c.f.a.b.e3.q$a r5 = new c.f.a.b.e3.q$a
            r6 = r9[r10]
            r5.<init>(r6)
            r4[r10] = r5
        L8e:
            c.f.a.b.e3.q$a[] r4 = r0.f7926d
            r4 = r4[r10]
            r1[r10] = r4
            int r10 = r10 + 1
            goto L6b
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.q.s(c.f.a.b.g3.h[], boolean[], c.f.a.b.e3.s0[], boolean[], long):long");
    }

    @Override // c.f.a.b.e3.f0
    public a1 t() {
        return this.f7924b.t();
    }

    public void u(long j2, long j3) {
        this.f7928f = j2;
        this.f7929g = j3;
    }

    @Override // c.f.a.b.e3.f0
    public void v(long j2, boolean z) {
        this.f7924b.v(j2, z);
    }
}
