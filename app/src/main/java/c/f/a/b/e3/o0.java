package c.f.a.b.e3;

import android.net.Uri;
import android.os.Handler;
import c.f.a.b.e3.f0;
import c.f.a.b.e3.j0;
import c.f.a.b.e3.r0;
import c.f.a.b.e3.z;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.g0;
import c.f.a.b.i3.s;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.m2;
import c.f.a.b.w1;
import c.f.a.b.x2.a0;
import c.f.a.b.z2.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class o0 implements f0, c.f.a.b.z2.l, g0.b<a>, g0.f, r0.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f7867b = I();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k1 f7868c = new k1.b().S("icy").e0("application/x-icy").E();
    public e A;
    public c.f.a.b.z2.x B;
    public boolean D;
    public boolean F;
    public boolean G;
    public int H;
    public long J;
    public boolean L;
    public int M;
    public boolean N;
    public boolean O;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f7869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.i3.p f7870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.b.x2.c0 f7871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.b.i3.f0 f7872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j0.a f7873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0.a f7874i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f7875j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c.f.a.b.i3.f f7876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f7877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f7878m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final n0 f7880o;
    public f0.a t;
    public c.f.a.b.b3.l.b u;
    public boolean x;
    public boolean y;
    public boolean z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c.f.a.b.i3.g0 f7879n = new c.f.a.b.i3.g0("ProgressiveMediaPeriod");
    public final c.f.a.b.j3.l p = new c.f.a.b.j3.l();
    public final Runnable q = new Runnable() { // from class: c.f.a.b.e3.h
        @Override // java.lang.Runnable
        public final void run() {
            this.f7745b.T();
        }
    };
    public final Runnable r = new Runnable() { // from class: c.f.a.b.e3.j
        @Override // java.lang.Runnable
        public final void run() {
            this.f7830b.Q();
        }
    };
    public final Handler s = c.f.a.b.j3.x0.x();
    public d[] w = new d[0];
    public r0[] v = new r0[0];
    public long K = -9223372036854775807L;
    public long I = -1;
    public long C = -9223372036854775807L;
    public int E = 1;

    public final class a implements g0.e, z.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f7882b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.f.a.b.i3.l0 f7883c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n0 f7884d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final c.f.a.b.z2.l f7885e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c.f.a.b.j3.l f7886f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f7888h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f7890j;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public c.f.a.b.z2.a0 f7893m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f7894n;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c.f.a.b.z2.w f7887g = new c.f.a.b.z2.w();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f7889i = true;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f7892l = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f7881a = a0.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public c.f.a.b.i3.s f7891k = j(0);

        public a(Uri uri, c.f.a.b.i3.p pVar, n0 n0Var, c.f.a.b.z2.l lVar, c.f.a.b.j3.l lVar2) {
            this.f7882b = uri;
            this.f7883c = new c.f.a.b.i3.l0(pVar);
            this.f7884d = n0Var;
            this.f7885e = lVar;
            this.f7886f = lVar2;
        }

        @Override // c.f.a.b.i3.g0.e
        public void a() {
            int iC = 0;
            while (iC == 0 && !this.f7888h) {
                try {
                    long j2 = this.f7887g.f11506a;
                    c.f.a.b.i3.s sVarJ = j(j2);
                    this.f7891k = sVarJ;
                    long jG = this.f7883c.g(sVarJ);
                    this.f7892l = jG;
                    if (jG != -1) {
                        this.f7892l = jG + j2;
                    }
                    o0.this.u = c.f.a.b.b3.l.b.b(this.f7883c.q());
                    c.f.a.b.i3.l zVar = this.f7883c;
                    if (o0.this.u != null && o0.this.u.f6546g != -1) {
                        zVar = new z(this.f7883c, o0.this.u.f6546g, this);
                        c.f.a.b.z2.a0 a0VarL = o0.this.L();
                        this.f7893m = a0VarL;
                        a0VarL.e(o0.f7868c);
                    }
                    long jD = j2;
                    this.f7884d.b(zVar, this.f7882b, this.f7883c.q(), j2, this.f7892l, this.f7885e);
                    if (o0.this.u != null) {
                        this.f7884d.e();
                    }
                    if (this.f7889i) {
                        this.f7884d.a(jD, this.f7890j);
                        this.f7889i = false;
                    }
                    while (true) {
                        long j3 = jD;
                        while (iC == 0 && !this.f7888h) {
                            try {
                                this.f7886f.a();
                                iC = this.f7884d.c(this.f7887g);
                                jD = this.f7884d.d();
                                if (jD > o0.this.f7878m + j3) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f7886f.d();
                        o0.this.s.post(o0.this.r);
                    }
                    if (iC == 1) {
                        iC = 0;
                    } else if (this.f7884d.d() != -1) {
                        this.f7887g.f11506a = this.f7884d.d();
                    }
                    c.f.a.b.j3.x0.n(this.f7883c);
                } catch (Throwable th) {
                    if (iC != 1 && this.f7884d.d() != -1) {
                        this.f7887g.f11506a = this.f7884d.d();
                    }
                    c.f.a.b.j3.x0.n(this.f7883c);
                    throw th;
                }
            }
        }

        @Override // c.f.a.b.e3.z.a
        public void b(c.f.a.b.j3.i0 i0Var) {
            long jMax = !this.f7894n ? this.f7890j : Math.max(o0.this.K(), this.f7890j);
            int iA = i0Var.a();
            c.f.a.b.z2.a0 a0Var = (c.f.a.b.z2.a0) c.f.a.b.j3.g.e(this.f7893m);
            a0Var.c(i0Var, iA);
            a0Var.d(jMax, 1, iA, 0, null);
            this.f7894n = true;
        }

        @Override // c.f.a.b.i3.g0.e
        public void c() {
            this.f7888h = true;
        }

        public final c.f.a.b.i3.s j(long j2) {
            return new s.b().i(this.f7882b).h(j2).f(o0.this.f7877l).b(6).e(o0.f7867b).a();
        }

        public final void k(long j2, long j3) {
            this.f7887g.f11506a = j2;
            this.f7890j = j3;
            this.f7889i = true;
            this.f7894n = false;
        }
    }

    public interface b {
        void g(long j2, boolean z, boolean z2);
    }

    public final class c implements s0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7896b;

        public c(int i2) {
            this.f7896b = i2;
        }

        @Override // c.f.a.b.e3.s0
        public void a() throws IOException {
            o0.this.X(this.f7896b);
        }

        @Override // c.f.a.b.e3.s0
        public boolean e() {
            return o0.this.N(this.f7896b);
        }

        @Override // c.f.a.b.e3.s0
        public int i(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
            return o0.this.c0(this.f7896b, l1Var, fVar, i2);
        }

        @Override // c.f.a.b.e3.s0
        public int p(long j2) {
            return o0.this.g0(this.f7896b, j2);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f7899b;

        public d(int i2, boolean z) {
            this.f7898a = i2;
            this.f7899b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f7898a == dVar.f7898a && this.f7899b == dVar.f7899b;
        }

        public int hashCode() {
            return (this.f7898a * 31) + (this.f7899b ? 1 : 0);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a1 f7900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f7901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f7902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f7903d;

        public e(a1 a1Var, boolean[] zArr) {
            this.f7900a = a1Var;
            this.f7901b = zArr;
            int i2 = a1Var.f6903c;
            this.f7902c = new boolean[i2];
            this.f7903d = new boolean[i2];
        }
    }

    public o0(Uri uri, c.f.a.b.i3.p pVar, n0 n0Var, c.f.a.b.x2.c0 c0Var, a0.a aVar, c.f.a.b.i3.f0 f0Var, j0.a aVar2, b bVar, c.f.a.b.i3.f fVar, String str, int i2) {
        this.f7869d = uri;
        this.f7870e = pVar;
        this.f7871f = c0Var;
        this.f7874i = aVar;
        this.f7872g = f0Var;
        this.f7873h = aVar2;
        this.f7875j = bVar;
        this.f7876k = fVar;
        this.f7877l = str;
        this.f7878m = i2;
        this.f7880o = n0Var;
    }

    public static Map<String, String> I() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void Q() {
        if (this.O) {
            return;
        }
        ((f0.a) c.f.a.b.j3.g.e(this.t)).i(this);
    }

    @EnsuresNonNull({"trackState", "seekMap"})
    public final void F() {
        c.f.a.b.j3.g.g(this.y);
        c.f.a.b.j3.g.e(this.A);
        c.f.a.b.j3.g.e(this.B);
    }

    public final boolean G(a aVar, int i2) {
        c.f.a.b.z2.x xVar;
        if (this.I != -1 || ((xVar = this.B) != null && xVar.i() != -9223372036854775807L)) {
            this.M = i2;
            return true;
        }
        if (this.y && !i0()) {
            this.L = true;
            return false;
        }
        this.G = this.y;
        this.J = 0L;
        this.M = 0;
        for (r0 r0Var : this.v) {
            r0Var.U();
        }
        aVar.k(0L, 0L);
        return true;
    }

    public final void H(a aVar) {
        if (this.I == -1) {
            this.I = aVar.f7892l;
        }
    }

    public final int J() {
        int iF = 0;
        for (r0 r0Var : this.v) {
            iF += r0Var.F();
        }
        return iF;
    }

    public final long K() {
        long jMax = Long.MIN_VALUE;
        for (r0 r0Var : this.v) {
            jMax = Math.max(jMax, r0Var.y());
        }
        return jMax;
    }

    public c.f.a.b.z2.a0 L() {
        return b0(new d(0, true));
    }

    public final boolean M() {
        return this.K != -9223372036854775807L;
    }

    public boolean N(int i2) {
        return !i0() && this.v[i2].J(this.N);
    }

    public final void T() {
        if (this.O || this.y || !this.x || this.B == null) {
            return;
        }
        for (r0 r0Var : this.v) {
            if (r0Var.E() == null) {
                return;
            }
        }
        this.p.d();
        int length = this.v.length;
        z0[] z0VarArr = new z0[length];
        boolean[] zArr = new boolean[length];
        for (int i2 = 0; i2 < length; i2++) {
            k1 k1VarE = (k1) c.f.a.b.j3.g.e(this.v[i2].E());
            String str = k1VarE.f9338m;
            boolean zP = c.f.a.b.j3.d0.p(str);
            boolean z = zP || c.f.a.b.j3.d0.s(str);
            zArr[i2] = z;
            this.z = z | this.z;
            c.f.a.b.b3.l.b bVar = this.u;
            if (bVar != null) {
                if (zP || this.w[i2].f7899b) {
                    c.f.a.b.b3.a aVar = k1VarE.f9336k;
                    k1VarE = k1VarE.b().X(aVar == null ? new c.f.a.b.b3.a(bVar) : aVar.b(bVar)).E();
                }
                if (zP && k1VarE.f9332g == -1 && k1VarE.f9333h == -1 && bVar.f6541b != -1) {
                    k1VarE = k1VarE.b().G(bVar.f6541b).E();
                }
            }
            z0VarArr[i2] = new z0(k1VarE.c(this.f7871f.c(k1VarE)));
        }
        this.A = new e(new a1(z0VarArr), zArr);
        this.y = true;
        ((f0.a) c.f.a.b.j3.g.e(this.t)).k(this);
    }

    public final void U(int i2) {
        F();
        e eVar = this.A;
        boolean[] zArr = eVar.f7903d;
        if (zArr[i2]) {
            return;
        }
        k1 k1VarB = eVar.f7900a.b(i2).b(0);
        this.f7873h.c(c.f.a.b.j3.d0.l(k1VarB.f9338m), k1VarB, 0, null, this.J);
        zArr[i2] = true;
    }

    public final void V(int i2) {
        F();
        boolean[] zArr = this.A.f7901b;
        if (this.L && zArr[i2]) {
            if (this.v[i2].J(false)) {
                return;
            }
            this.K = 0L;
            this.L = false;
            this.G = true;
            this.J = 0L;
            this.M = 0;
            for (r0 r0Var : this.v) {
                r0Var.U();
            }
            ((f0.a) c.f.a.b.j3.g.e(this.t)).i(this);
        }
    }

    public void W() throws IOException {
        this.f7879n.k(this.f7872g.d(this.E));
    }

    public void X(int i2) throws IOException {
        this.v[i2].M();
        W();
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void k(a aVar, long j2, long j3, boolean z) {
        c.f.a.b.i3.l0 l0Var = aVar.f7883c;
        a0 a0Var = new a0(aVar.f7881a, aVar.f7891k, l0Var.v(), l0Var.w(), j2, j3, l0Var.f());
        this.f7872g.c(aVar.f7881a);
        this.f7873h.r(a0Var, 1, -1, null, 0, null, aVar.f7890j, this.C);
        if (z) {
            return;
        }
        H(aVar);
        for (r0 r0Var : this.v) {
            r0Var.U();
        }
        if (this.H > 0) {
            ((f0.a) c.f.a.b.j3.g.e(this.t)).i(this);
        }
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void m(a aVar, long j2, long j3) {
        c.f.a.b.z2.x xVar;
        if (this.C == -9223372036854775807L && (xVar = this.B) != null) {
            boolean zF = xVar.f();
            long jK = K();
            long j4 = jK == Long.MIN_VALUE ? 0L : jK + 10000;
            this.C = j4;
            this.f7875j.g(j4, zF, this.D);
        }
        c.f.a.b.i3.l0 l0Var = aVar.f7883c;
        a0 a0Var = new a0(aVar.f7881a, aVar.f7891k, l0Var.v(), l0Var.w(), j2, j3, l0Var.f());
        this.f7872g.c(aVar.f7881a);
        this.f7873h.u(a0Var, 1, -1, null, 0, null, aVar.f7890j, this.C);
        H(aVar);
        this.N = true;
        ((f0.a) c.f.a.b.j3.g.e(this.t)).i(this);
    }

    @Override // c.f.a.b.e3.r0.d
    public void a(k1 k1Var) {
        this.s.post(this.q);
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: a0, reason: merged with bridge method [inline-methods] */
    public g0.c u(a aVar, long j2, long j3, IOException iOException, int i2) {
        boolean z;
        a aVar2;
        g0.c cVarH;
        H(aVar);
        c.f.a.b.i3.l0 l0Var = aVar.f7883c;
        a0 a0Var = new a0(aVar.f7881a, aVar.f7891k, l0Var.v(), l0Var.w(), j2, j3, l0Var.f());
        long jA = this.f7872g.a(new f0.c(a0Var, new d0(1, -1, null, 0, null, c.f.a.b.w0.e(aVar.f7890j), c.f.a.b.w0.e(this.C)), iOException, i2));
        if (jA == -9223372036854775807L) {
            cVarH = c.f.a.b.i3.g0.f8878d;
        } else {
            int iJ = J();
            if (iJ > this.M) {
                aVar2 = aVar;
                z = true;
            } else {
                z = false;
                aVar2 = aVar;
            }
            cVarH = G(aVar2, iJ) ? c.f.a.b.i3.g0.h(z, jA) : c.f.a.b.i3.g0.f8877c;
        }
        boolean z2 = !cVarH.c();
        this.f7873h.w(a0Var, 1, -1, null, 0, null, aVar.f7890j, this.C, iOException, z2);
        if (z2) {
            this.f7872g.c(aVar.f7881a);
        }
        return cVarH;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long b() {
        if (this.H == 0) {
            return Long.MIN_VALUE;
        }
        return g();
    }

    public final c.f.a.b.z2.a0 b0(d dVar) {
        int length = this.v.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (dVar.equals(this.w[i2])) {
                return this.v[i2];
            }
        }
        r0 r0VarJ = r0.j(this.f7876k, this.s.getLooper(), this.f7871f, this.f7874i);
        r0VarJ.c0(this);
        int i3 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.w, i3);
        dVarArr[length] = dVar;
        this.w = (d[]) c.f.a.b.j3.x0.j(dVarArr);
        r0[] r0VarArr = (r0[]) Arrays.copyOf(this.v, i3);
        r0VarArr[length] = r0VarJ;
        this.v = (r0[]) c.f.a.b.j3.x0.j(r0VarArr);
        return r0VarJ;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean c(long j2) {
        if (this.N || this.f7879n.i() || this.L) {
            return false;
        }
        if (this.y && this.H == 0) {
            return false;
        }
        boolean zF = this.p.f();
        if (this.f7879n.j()) {
            return zF;
        }
        h0();
        return true;
    }

    public int c0(int i2, l1 l1Var, c.f.a.b.v2.f fVar, int i3) {
        if (i0()) {
            return -3;
        }
        U(i2);
        int iR = this.v[i2].R(l1Var, fVar, i3, this.N);
        if (iR == -3) {
            V(i2);
        }
        return iR;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean d() {
        return this.f7879n.j() && this.p.e();
    }

    public void d0() {
        if (this.y) {
            for (r0 r0Var : this.v) {
                r0Var.Q();
            }
        }
        this.f7879n.m(this);
        this.s.removeCallbacksAndMessages(null);
        this.t = null;
        this.O = true;
    }

    @Override // c.f.a.b.z2.l
    public c.f.a.b.z2.a0 e(int i2, int i3) {
        return b0(new d(i2, false));
    }

    public final boolean e0(boolean[] zArr, long j2) {
        int length = this.v.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (!this.v[i2].Y(j2, false) && (zArr[i2] || !this.z)) {
                return false;
            }
        }
        return true;
    }

    @Override // c.f.a.b.e3.f0
    public long f(long j2, m2 m2Var) {
        F();
        if (!this.B.f()) {
            return 0L;
        }
        x.a aVarH = this.B.h(j2);
        return m2Var.a(j2, aVarH.f11507a.f11512b, aVarH.f11508b.f11512b);
    }

    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public final void S(c.f.a.b.z2.x xVar) {
        this.B = this.u == null ? xVar : new x.b(-9223372036854775807L);
        this.C = xVar.i();
        boolean z = this.I == -1 && xVar.i() == -9223372036854775807L;
        this.D = z;
        this.E = z ? 7 : 1;
        this.f7875j.g(this.C, xVar.f(), this.D);
        if (this.y) {
            return;
        }
        T();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long g() {
        long jK;
        F();
        boolean[] zArr = this.A.f7901b;
        if (this.N) {
            return Long.MIN_VALUE;
        }
        if (M()) {
            return this.K;
        }
        if (this.z) {
            int length = this.v.length;
            jK = Long.MAX_VALUE;
            for (int i2 = 0; i2 < length; i2++) {
                if (zArr[i2] && !this.v[i2].I()) {
                    jK = Math.min(jK, this.v[i2].y());
                }
            }
        } else {
            jK = Long.MAX_VALUE;
        }
        if (jK == Long.MAX_VALUE) {
            jK = K();
        }
        return jK == Long.MIN_VALUE ? this.J : jK;
    }

    public int g0(int i2, long j2) {
        if (i0()) {
            return 0;
        }
        U(i2);
        r0 r0Var = this.v[i2];
        int iD = r0Var.D(j2, this.N);
        r0Var.d0(iD);
        if (iD == 0) {
            V(i2);
        }
        return iD;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public void h(long j2) {
    }

    public final void h0() {
        a aVar = new a(this.f7869d, this.f7870e, this.f7880o, this, this.p);
        if (this.y) {
            c.f.a.b.j3.g.g(M());
            long j2 = this.C;
            if (j2 != -9223372036854775807L && this.K > j2) {
                this.N = true;
                this.K = -9223372036854775807L;
                return;
            }
            aVar.k(((c.f.a.b.z2.x) c.f.a.b.j3.g.e(this.B)).h(this.K).f11507a.f11513c, this.K);
            for (r0 r0Var : this.v) {
                r0Var.a0(this.K);
            }
            this.K = -9223372036854775807L;
        }
        this.M = J();
        this.f7873h.A(new a0(aVar.f7881a, aVar.f7891k, this.f7879n.n(aVar, this, this.f7872g.d(this.E))), 1, -1, null, 0, null, aVar.f7890j, this.C);
    }

    @Override // c.f.a.b.z2.l
    public void i(final c.f.a.b.z2.x xVar) {
        this.s.post(new Runnable() { // from class: c.f.a.b.e3.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f7828b.S(xVar);
            }
        });
    }

    public final boolean i0() {
        return this.G || M();
    }

    @Override // c.f.a.b.i3.g0.f
    public void j() {
        for (r0 r0Var : this.v) {
            r0Var.S();
        }
        this.f7880o.release();
    }

    @Override // c.f.a.b.e3.f0
    public /* synthetic */ List l(List list) {
        return e0.a(this, list);
    }

    @Override // c.f.a.b.e3.f0
    public void n() throws IOException {
        W();
        if (this.N && !this.y) {
            throw w1.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // c.f.a.b.e3.f0
    public long o(long j2) {
        F();
        boolean[] zArr = this.A.f7901b;
        if (!this.B.f()) {
            j2 = 0;
        }
        int i2 = 0;
        this.G = false;
        this.J = j2;
        if (M()) {
            this.K = j2;
            return j2;
        }
        if (this.E != 7 && e0(zArr, j2)) {
            return j2;
        }
        this.L = false;
        this.K = j2;
        this.N = false;
        if (this.f7879n.j()) {
            r0[] r0VarArr = this.v;
            int length = r0VarArr.length;
            while (i2 < length) {
                r0VarArr[i2].q();
                i2++;
            }
            this.f7879n.f();
        } else {
            this.f7879n.g();
            r0[] r0VarArr2 = this.v;
            int length2 = r0VarArr2.length;
            while (i2 < length2) {
                r0VarArr2[i2].U();
                i2++;
            }
        }
        return j2;
    }

    @Override // c.f.a.b.z2.l
    public void p() {
        this.x = true;
        this.s.post(this.q);
    }

    @Override // c.f.a.b.e3.f0
    public long q() {
        if (!this.G) {
            return -9223372036854775807L;
        }
        if (!this.N && J() <= this.M) {
            return -9223372036854775807L;
        }
        this.G = false;
        return this.J;
    }

    @Override // c.f.a.b.e3.f0
    public void r(f0.a aVar, long j2) {
        this.t = aVar;
        this.p.f();
        h0();
    }

    @Override // c.f.a.b.e3.f0
    public long s(c.f.a.b.g3.h[] hVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j2) {
        F();
        e eVar = this.A;
        a1 a1Var = eVar.f7900a;
        boolean[] zArr3 = eVar.f7902c;
        int i2 = this.H;
        int i3 = 0;
        for (int i4 = 0; i4 < hVarArr.length; i4++) {
            if (s0VarArr[i4] != null && (hVarArr[i4] == null || !zArr[i4])) {
                int i5 = ((c) s0VarArr[i4]).f7896b;
                c.f.a.b.j3.g.g(zArr3[i5]);
                this.H--;
                zArr3[i5] = false;
                s0VarArr[i4] = null;
            }
        }
        boolean z = !this.F ? j2 == 0 : i2 != 0;
        for (int i6 = 0; i6 < hVarArr.length; i6++) {
            if (s0VarArr[i6] == null && hVarArr[i6] != null) {
                c.f.a.b.g3.h hVar = hVarArr[i6];
                c.f.a.b.j3.g.g(hVar.length() == 1);
                c.f.a.b.j3.g.g(hVar.h(0) == 0);
                int iC = a1Var.c(hVar.a());
                c.f.a.b.j3.g.g(!zArr3[iC]);
                this.H++;
                zArr3[iC] = true;
                s0VarArr[i6] = new c(iC);
                zArr2[i6] = true;
                if (!z) {
                    r0 r0Var = this.v[iC];
                    z = (r0Var.Y(j2, true) || r0Var.B() == 0) ? false : true;
                }
            }
        }
        if (this.H == 0) {
            this.L = false;
            this.G = false;
            if (this.f7879n.j()) {
                r0[] r0VarArr = this.v;
                int length = r0VarArr.length;
                while (i3 < length) {
                    r0VarArr[i3].q();
                    i3++;
                }
                this.f7879n.f();
            } else {
                r0[] r0VarArr2 = this.v;
                int length2 = r0VarArr2.length;
                while (i3 < length2) {
                    r0VarArr2[i3].U();
                    i3++;
                }
            }
        } else if (z) {
            j2 = o(j2);
            while (i3 < s0VarArr.length) {
                if (s0VarArr[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.F = true;
        return j2;
    }

    @Override // c.f.a.b.e3.f0
    public a1 t() {
        F();
        return this.A.f7900a;
    }

    @Override // c.f.a.b.e3.f0
    public void v(long j2, boolean z) {
        F();
        if (M()) {
            return;
        }
        boolean[] zArr = this.A.f7902c;
        int length = this.v.length;
        for (int i2 = 0; i2 < length; i2++) {
            this.v[i2].p(j2, z, zArr[i2]);
        }
    }
}
