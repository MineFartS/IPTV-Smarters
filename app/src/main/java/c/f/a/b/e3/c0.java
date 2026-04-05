package c.f.a.b.e3;

import c.f.a.b.e3.i0;
import c.f.a.b.p1;
import c.f.a.b.p2;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends s<Void> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i0 f6926k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6927l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p2.c f6928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p2.b f6929n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f6930o;
    public b0 p;
    public boolean q;
    public boolean r;
    public boolean s;

    public static final class a extends y {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Object f6931d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Object f6932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Object f6933f;

        public a(p2 p2Var, Object obj, Object obj2) {
            super(p2Var);
            this.f6932e = obj;
            this.f6933f = obj2;
        }

        public static a u(p1 p1Var) {
            return new a(new b(p1Var), p2.c.f9709a, f6931d);
        }

        public static a v(p2 p2Var, Object obj, Object obj2) {
            return new a(p2Var, obj, obj2);
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public int b(Object obj) {
            Object obj2;
            p2 p2Var = this.f8047c;
            if (f6931d.equals(obj) && (obj2 = this.f6933f) != null) {
                obj = obj2;
            }
            return p2Var.b(obj);
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public p2.b g(int i2, p2.b bVar, boolean z) {
            this.f8047c.g(i2, bVar, z);
            if (c.f.a.b.j3.x0.b(bVar.f9703c, this.f6933f) && z) {
                bVar.f9703c = f6931d;
            }
            return bVar;
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public Object m(int i2) {
            Object objM = this.f8047c.m(i2);
            return c.f.a.b.j3.x0.b(objM, this.f6933f) ? f6931d : objM;
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public p2.c o(int i2, p2.c cVar, long j2) {
            this.f8047c.o(i2, cVar, j2);
            if (c.f.a.b.j3.x0.b(cVar.f9713e, this.f6932e)) {
                cVar.f9713e = p2.c.f9709a;
            }
            return cVar;
        }

        public a t(p2 p2Var) {
            return new a(p2Var, this.f6932e, this.f6933f);
        }
    }

    public static final class b extends p2 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p1 f6934c;

        public b(p1 p1Var) {
            this.f6934c = p1Var;
        }

        @Override // c.f.a.b.p2
        public int b(Object obj) {
            return obj == a.f6931d ? 0 : -1;
        }

        @Override // c.f.a.b.p2
        public p2.b g(int i2, p2.b bVar, boolean z) {
            bVar.t(z ? 0 : null, z ? a.f6931d : null, 0, -9223372036854775807L, 0L, c.f.a.b.e3.c1.h.f6948a, true);
            return bVar;
        }

        @Override // c.f.a.b.p2
        public int i() {
            return 1;
        }

        @Override // c.f.a.b.p2
        public Object m(int i2) {
            return a.f6931d;
        }

        @Override // c.f.a.b.p2
        public p2.c o(int i2, p2.c cVar, long j2) {
            cVar.g(p2.c.f9709a, this.f6934c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.p = true;
            return cVar;
        }

        @Override // c.f.a.b.p2
        public int p() {
            return 1;
        }
    }

    public c0(i0 i0Var, boolean z) {
        this.f6926k = i0Var;
        this.f6927l = z && i0Var.n();
        this.f6928m = new p2.c();
        this.f6929n = new p2.b();
        p2 p2VarP = i0Var.p();
        if (p2VarP == null) {
            this.f6930o = a.u(i0Var.h());
        } else {
            this.f6930o = a.v(p2VarP, null, null);
            this.s = true;
        }
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.n
    public void B(c.f.a.b.i3.n0 n0Var) {
        super.B(n0Var);
        if (this.f6927l) {
            return;
        }
        this.q = true;
        K(null, this.f6926k);
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.n
    public void D() {
        this.r = false;
        this.q = false;
        super.D();
    }

    @Override // c.f.a.b.e3.i0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public b0 a(i0.a aVar, c.f.a.b.i3.f fVar, long j2) {
        b0 b0Var = new b0(aVar, fVar, j2);
        b0Var.y(this.f6926k);
        if (this.r) {
            b0Var.a(aVar.c(O(aVar.f7476a)));
        } else {
            this.p = b0Var;
            if (!this.q) {
                this.q = true;
                K(null, this.f6926k);
            }
        }
        return b0Var;
    }

    public final Object N(Object obj) {
        return (this.f6930o.f6933f == null || !this.f6930o.f6933f.equals(obj)) ? obj : a.f6931d;
    }

    public final Object O(Object obj) {
        return (this.f6930o.f6933f == null || !obj.equals(a.f6931d)) ? obj : this.f6930o.f6933f;
    }

    @Override // c.f.a.b.e3.s
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public i0.a E(Void r1, i0.a aVar) {
        return aVar.c(N(aVar.f7476a));
    }

    public p2 Q() {
        return this.f6930o;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // c.f.a.b.e3.s
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void I(java.lang.Void r13, c.f.a.b.e3.i0 r14, c.f.a.b.p2 r15) {
        /*
            r12 = this;
            boolean r13 = r12.r
            if (r13 == 0) goto L19
            c.f.a.b.e3.c0$a r13 = r12.f6930o
            c.f.a.b.e3.c0$a r13 = r13.t(r15)
            r12.f6930o = r13
            c.f.a.b.e3.b0 r13 = r12.p
            if (r13 == 0) goto Lae
            long r13 = r13.e()
            r12.S(r13)
            goto Lae
        L19:
            boolean r13 = r15.q()
            if (r13 == 0) goto L36
            boolean r13 = r12.s
            if (r13 == 0) goto L2a
            c.f.a.b.e3.c0$a r13 = r12.f6930o
            c.f.a.b.e3.c0$a r13 = r13.t(r15)
            goto L32
        L2a:
            java.lang.Object r13 = c.f.a.b.p2.c.f9709a
            java.lang.Object r14 = c.f.a.b.e3.c0.a.f6931d
            c.f.a.b.e3.c0$a r13 = c.f.a.b.e3.c0.a.v(r15, r13, r14)
        L32:
            r12.f6930o = r13
            goto Lae
        L36:
            c.f.a.b.p2$c r13 = r12.f6928m
            r14 = 0
            r15.n(r14, r13)
            c.f.a.b.p2$c r13 = r12.f6928m
            long r0 = r13.c()
            c.f.a.b.p2$c r13 = r12.f6928m
            java.lang.Object r13 = r13.f9713e
            c.f.a.b.e3.b0 r2 = r12.p
            if (r2 == 0) goto L74
            long r2 = r2.m()
            c.f.a.b.e3.c0$a r4 = r12.f6930o
            c.f.a.b.e3.b0 r5 = r12.p
            c.f.a.b.e3.i0$a r5 = r5.f6910b
            java.lang.Object r5 = r5.f7476a
            c.f.a.b.p2$b r6 = r12.f6929n
            r4.h(r5, r6)
            c.f.a.b.p2$b r4 = r12.f6929n
            long r4 = r4.o()
            long r4 = r4 + r2
            c.f.a.b.e3.c0$a r2 = r12.f6930o
            c.f.a.b.p2$c r3 = r12.f6928m
            c.f.a.b.p2$c r14 = r2.n(r14, r3)
            long r2 = r14.c()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 == 0) goto L74
            r10 = r4
            goto L75
        L74:
            r10 = r0
        L75:
            c.f.a.b.p2$c r7 = r12.f6928m
            c.f.a.b.p2$b r8 = r12.f6929n
            r9 = 0
            r6 = r15
            android.util.Pair r14 = r6.j(r7, r8, r9, r10)
            java.lang.Object r0 = r14.first
            java.lang.Object r14 = r14.second
            java.lang.Long r14 = (java.lang.Long) r14
            long r1 = r14.longValue()
            boolean r14 = r12.s
            if (r14 == 0) goto L94
            c.f.a.b.e3.c0$a r13 = r12.f6930o
            c.f.a.b.e3.c0$a r13 = r13.t(r15)
            goto L98
        L94:
            c.f.a.b.e3.c0$a r13 = c.f.a.b.e3.c0.a.v(r15, r13, r0)
        L98:
            r12.f6930o = r13
            c.f.a.b.e3.b0 r13 = r12.p
            if (r13 == 0) goto Lae
            r12.S(r1)
            c.f.a.b.e3.i0$a r13 = r13.f6910b
            java.lang.Object r14 = r13.f7476a
            java.lang.Object r14 = r12.O(r14)
            c.f.a.b.e3.i0$a r13 = r13.c(r14)
            goto Laf
        Lae:
            r13 = 0
        Laf:
            r14 = 1
            r12.s = r14
            r12.r = r14
            c.f.a.b.e3.c0$a r14 = r12.f6930o
            r12.C(r14)
            if (r13 == 0) goto Lc6
            c.f.a.b.e3.b0 r14 = r12.p
            java.lang.Object r14 = c.f.a.b.j3.g.e(r14)
            c.f.a.b.e3.b0 r14 = (c.f.a.b.e3.b0) r14
            r14.a(r13)
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.c0.I(java.lang.Void, c.f.a.b.e3.i0, c.f.a.b.p2):void");
    }

    @RequiresNonNull({"unpreparedMaskingMediaPeriod"})
    public final void S(long j2) {
        b0 b0Var = this.p;
        int iB = this.f6930o.b(b0Var.f6910b.f7476a);
        if (iB == -1) {
            return;
        }
        long j3 = this.f6930o.f(iB, this.f6929n).f9705e;
        if (j3 != -9223372036854775807L && j2 >= j3) {
            j2 = Math.max(0L, j3 - 1);
        }
        b0Var.w(j2);
    }

    @Override // c.f.a.b.e3.i0
    public p1 h() {
        return this.f6926k.h();
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.i0
    public void l() {
    }

    @Override // c.f.a.b.e3.i0
    public void o(f0 f0Var) {
        ((b0) f0Var).x();
        if (f0Var == this.p) {
            this.p = null;
        }
    }
}
