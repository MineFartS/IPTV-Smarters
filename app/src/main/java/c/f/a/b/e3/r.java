package c.f.a.b.e3;

import c.f.a.b.e3.i0;
import c.f.a.b.p1;
import c.f.a.b.p2;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends s<Void> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i0 f7945k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f7946l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f7947m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7948n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f7949o;
    public final boolean p;
    public final ArrayList<q> q;
    public final p2.c r;
    public a s;
    public b t;
    public long u;
    public long v;

    public static final class a extends y {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f7950d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f7951e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f7952f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f7953g;

        public a(p2 p2Var, long j2, long j3) throws b {
            super(p2Var);
            boolean z = false;
            if (p2Var.i() != 1) {
                throw new b(0);
            }
            p2.c cVarN = p2Var.n(0, new p2.c());
            long jMax = Math.max(0L, j2);
            if (!cVarN.p && jMax != 0 && !cVarN.f9720l) {
                throw new b(1);
            }
            long jMax2 = j3 == Long.MIN_VALUE ? cVarN.r : Math.max(0L, j3);
            long j4 = cVarN.r;
            if (j4 != -9223372036854775807L) {
                jMax2 = jMax2 > j4 ? j4 : jMax2;
                if (jMax > jMax2) {
                    throw new b(2);
                }
            }
            this.f7950d = jMax;
            this.f7951e = jMax2;
            this.f7952f = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (cVarN.f9721m && (jMax2 == -9223372036854775807L || (j4 != -9223372036854775807L && jMax2 == j4))) {
                z = true;
            }
            this.f7953g = z;
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public p2.b g(int i2, p2.b bVar, boolean z) {
            this.f8047c.g(0, bVar, z);
            long jO = bVar.o() - this.f7950d;
            long j2 = this.f7952f;
            return bVar.s(bVar.f9702b, bVar.f9703c, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - jO, jO);
        }

        @Override // c.f.a.b.e3.y, c.f.a.b.p2
        public p2.c o(int i2, p2.c cVar, long j2) {
            this.f8047c.o(0, cVar, 0L);
            long j3 = cVar.u;
            long j4 = this.f7950d;
            cVar.u = j3 + j4;
            cVar.r = this.f7952f;
            cVar.f9721m = this.f7953g;
            long j5 = cVar.q;
            if (j5 != -9223372036854775807L) {
                long jMax = Math.max(j5, j4);
                cVar.q = jMax;
                long j6 = this.f7951e;
                if (j6 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j6);
                }
                cVar.q = jMax;
                cVar.q = jMax - this.f7950d;
            }
            long jE = c.f.a.b.w0.e(this.f7950d);
            long j7 = cVar.f9717i;
            if (j7 != -9223372036854775807L) {
                cVar.f9717i = j7 + jE;
            }
            long j8 = cVar.f9718j;
            if (j8 != -9223372036854775807L) {
                cVar.f9718j = j8 + jE;
            }
            return cVar;
        }
    }

    public static final class b extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7954b;

        public b(int i2) {
            super("Illegal clipping: " + a(i2));
            this.f7954b = i2;
        }

        public static String a(int i2) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    public r(i0 i0Var, long j2, long j3, boolean z, boolean z2, boolean z3) {
        c.f.a.b.j3.g.a(j2 >= 0);
        this.f7945k = (i0) c.f.a.b.j3.g.e(i0Var);
        this.f7946l = j2;
        this.f7947m = j3;
        this.f7948n = z;
        this.f7949o = z2;
        this.p = z3;
        this.q = new ArrayList<>();
        this.r = new p2.c();
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.n
    public void B(c.f.a.b.i3.n0 n0Var) {
        super.B(n0Var);
        K(null, this.f7945k);
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.n
    public void D() {
        super.D();
        this.t = null;
        this.s = null;
    }

    @Override // c.f.a.b.e3.s
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public void I(Void r1, i0 i0Var, p2 p2Var) {
        if (this.t != null) {
            return;
        }
        N(p2Var);
    }

    public final void N(p2 p2Var) {
        long j2;
        long j3;
        p2Var.n(0, this.r);
        long jE = this.r.e();
        if (this.s == null || this.q.isEmpty() || this.f7949o) {
            long j4 = this.f7946l;
            long j5 = this.f7947m;
            if (this.p) {
                long jC = this.r.c();
                j4 += jC;
                j5 += jC;
            }
            this.u = jE + j4;
            this.v = this.f7947m != Long.MIN_VALUE ? jE + j5 : Long.MIN_VALUE;
            int size = this.q.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.q.get(i2).u(this.u, this.v);
            }
            j2 = j4;
            j3 = j5;
        } else {
            long j6 = this.u - jE;
            j3 = this.f7947m != Long.MIN_VALUE ? this.v - jE : Long.MIN_VALUE;
            j2 = j6;
        }
        try {
            a aVar = new a(p2Var, j2, j3);
            this.s = aVar;
            C(aVar);
        } catch (b e2) {
            this.t = e2;
        }
    }

    @Override // c.f.a.b.e3.i0
    public f0 a(i0.a aVar, c.f.a.b.i3.f fVar, long j2) {
        q qVar = new q(this.f7945k.a(aVar, fVar, j2), this.f7948n, this.u, this.v);
        this.q.add(qVar);
        return qVar;
    }

    @Override // c.f.a.b.e3.i0
    public p1 h() {
        return this.f7945k.h();
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.i0
    public void l() throws b {
        b bVar = this.t;
        if (bVar != null) {
            throw bVar;
        }
        super.l();
    }

    @Override // c.f.a.b.e3.i0
    public void o(f0 f0Var) {
        c.f.a.b.j3.g.g(this.q.remove(f0Var));
        this.f7945k.o(((q) f0Var).f7924b);
        if (!this.q.isEmpty() || this.f7949o) {
            return;
        }
        N(((a) c.f.a.b.j3.g.e(this.s)).f8047c);
    }
}
