package c.f.a.b;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import c.f.a.b.a2;
import c.f.a.b.d2;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.u0;
import c.f.a.b.f1;
import c.f.a.b.h1;
import c.f.a.b.j3.y;
import c.f.a.b.p2;
import c.f.a.b.v1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes.dex */
public final class g1 extends t0 implements f1 {
    public m2 A;
    public c.f.a.b.e3.u0 B;
    public boolean C;
    public a2.b D;
    public q1 E;
    public q1 F;
    public y1 G;
    public int H;
    public int I;
    public long J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.g3.p f8392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a2.b f8393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h2[] f8394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.g3.o f8395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c.f.a.b.j3.v f8396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h1.f f8397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h1 f8398h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c.f.a.b.j3.y<a2.c> f8399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CopyOnWriteArraySet<f1.a> f8400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p2.b f8401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<a> f8402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f8403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c.f.a.b.e3.k0 f8404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c.f.a.b.s2.h1 f8405o;
    public final Looper p;
    public final c.f.a.b.i3.i q;
    public final long r;
    public final long s;
    public final c.f.a.b.j3.i t;
    public int u;
    public boolean v;
    public int w;
    public int x;
    public boolean y;
    public int z;

    public static final class a implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f8406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p2 f8407b;

        public a(Object obj, p2 p2Var) {
            this.f8406a = obj;
            this.f8407b = p2Var;
        }

        @Override // c.f.a.b.u1
        public Object a() {
            return this.f8406a;
        }

        @Override // c.f.a.b.u1
        public p2 b() {
            return this.f8407b;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public g1(h2[] h2VarArr, c.f.a.b.g3.o oVar, c.f.a.b.e3.k0 k0Var, o1 o1Var, c.f.a.b.i3.i iVar, c.f.a.b.s2.h1 h1Var, boolean z, m2 m2Var, long j2, long j3, n1 n1Var, long j4, boolean z2, c.f.a.b.j3.i iVar2, Looper looper, a2 a2Var, a2.b bVar) {
        c.f.a.b.j3.z.g("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.0] [" + c.f.a.b.j3.x0.f9300e + "]");
        c.f.a.b.j3.g.g(h2VarArr.length > 0);
        this.f8394d = (h2[]) c.f.a.b.j3.g.e(h2VarArr);
        this.f8395e = (c.f.a.b.g3.o) c.f.a.b.j3.g.e(oVar);
        this.f8404n = k0Var;
        this.q = iVar;
        this.f8405o = h1Var;
        this.f8403m = z;
        this.A = m2Var;
        this.r = j2;
        this.s = j3;
        this.C = z2;
        this.p = looper;
        this.t = iVar2;
        this.u = 0;
        final a2 a2Var2 = a2Var != null ? a2Var : this;
        this.f8399i = new c.f.a.b.j3.y<>(looper, iVar2, new y.b() { // from class: c.f.a.b.n
            @Override // c.f.a.b.j3.y.b
            public final void a(Object obj, c.f.a.b.j3.t tVar) {
                ((a2.c) obj).E(a2Var2, new a2.d(tVar));
            }
        });
        this.f8400j = new CopyOnWriteArraySet<>();
        this.f8402l = new ArrayList();
        this.B = new u0.a(0);
        c.f.a.b.g3.p pVar = new c.f.a.b.g3.p(new k2[h2VarArr.length], new c.f.a.b.g3.h[h2VarArr.length], null);
        this.f8392b = pVar;
        this.f8401k = new p2.b();
        a2.b bVarE = new a2.b.a().c(1, 2, 12, 13, 14, 15, 16, 17, 18, 19).b(bVar).e();
        this.f8393c = bVarE;
        this.D = new a2.b.a().b(bVarE).a(3).a(9).e();
        q1 q1Var = q1.f9729a;
        this.E = q1Var;
        this.F = q1Var;
        this.H = -1;
        this.f8396f = iVar2.d(looper, null);
        h1.f fVar = new h1.f() { // from class: c.f.a.b.r
            @Override // c.f.a.b.h1.f
            public final void a(h1.e eVar) {
                this.f9763a.E0(eVar);
            }
        };
        this.f8397g = fVar;
        this.G = y1.k(pVar);
        if (h1Var != null) {
            h1Var.H1(a2Var2, looper);
            y(h1Var);
            iVar.h(new Handler(looper), h1Var);
        }
        this.f8398h = new h1(h2VarArr, oVar, pVar, o1Var, iVar, this.u, this.v, h1Var, m2Var, n1Var, j4, z2, looper, iVar2, fVar);
    }

    public static boolean B0(y1 y1Var) {
        return y1Var.f10464f == 3 && y1Var.f10471m && y1Var.f10472n == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void E0(final h1.e eVar) {
        this.f8396f.b(new Runnable() { // from class: c.f.a.b.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f9972b.G0(eVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void I0(a2.c cVar) {
        cVar.z(this.E);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void N0(a2.c cVar) {
        cVar.t(this.D);
    }

    public static /* synthetic */ void U0(y1 y1Var, a2.c cVar) {
        cVar.h(y1Var.f10466h);
        cVar.p(y1Var.f10466h);
    }

    public static /* synthetic */ void c1(int i2, a2.f fVar, a2.f fVar2, a2.c cVar) {
        cVar.i(i2);
        cVar.f(fVar, fVar2, i2);
    }

    public static long z0(y1 y1Var) {
        p2.c cVar = new p2.c();
        p2.b bVar = new p2.b();
        y1Var.f10460b.h(y1Var.f10461c.f7476a, bVar);
        return y1Var.f10462d == -9223372036854775807L ? y1Var.f10460b.n(bVar.f9704d, cVar).c() : bVar.o() + y1Var.f10462d;
    }

    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public final void G0(h1.e eVar) {
        long j2;
        boolean z;
        long jF1;
        int i2 = this.w - eVar.f8557c;
        this.w = i2;
        boolean z2 = true;
        if (eVar.f8558d) {
            this.x = eVar.f8559e;
            this.y = true;
        }
        if (eVar.f8560f) {
            this.z = eVar.f8561g;
        }
        if (i2 == 0) {
            p2 p2Var = eVar.f8556b.f10460b;
            if (!this.G.f10460b.q() && p2Var.q()) {
                this.H = -1;
                this.J = 0L;
                this.I = 0;
            }
            if (!p2Var.q()) {
                List<p2> listE = ((e2) p2Var).E();
                c.f.a.b.j3.g.g(listE.size() == this.f8402l.size());
                for (int i3 = 0; i3 < listE.size(); i3++) {
                    this.f8402l.get(i3).f8407b = listE.get(i3);
                }
            }
            if (this.y) {
                if (eVar.f8556b.f10461c.equals(this.G.f10461c) && eVar.f8556b.f10463e == this.G.t) {
                    z2 = false;
                }
                if (z2) {
                    if (p2Var.q() || eVar.f8556b.f10461c.b()) {
                        jF1 = eVar.f8556b.f10463e;
                    } else {
                        y1 y1Var = eVar.f8556b;
                        jF1 = f1(p2Var, y1Var.f10461c, y1Var.f10463e);
                    }
                    j2 = jF1;
                } else {
                    j2 = -9223372036854775807L;
                }
                z = z2;
            } else {
                j2 = -9223372036854775807L;
                z = false;
            }
            this.y = false;
            q1(eVar.f8556b, 1, this.z, false, z, this.x, j2, -1);
        }
    }

    @Override // c.f.a.b.a2
    public int B() {
        if (e()) {
            return this.G.f10461c.f7477b;
        }
        return -1;
    }

    @Override // c.f.a.b.a2
    public void D(SurfaceView surfaceView) {
    }

    @Override // c.f.a.b.a2
    public int E() {
        return this.G.f10472n;
    }

    @Override // c.f.a.b.a2
    public c.f.a.b.e3.a1 F() {
        return this.G.f10467i;
    }

    @Override // c.f.a.b.a2
    public p2 G() {
        return this.G.f10460b;
    }

    @Override // c.f.a.b.a2
    public Looper H() {
        return this.p;
    }

    @Override // c.f.a.b.a2
    public boolean I() {
        return this.v;
    }

    @Override // c.f.a.b.a2
    public long J() {
        if (this.G.f10460b.q()) {
            return this.J;
        }
        y1 y1Var = this.G;
        if (y1Var.f10470l.f7479d != y1Var.f10461c.f7479d) {
            return y1Var.f10460b.n(s(), this.f9974a).d();
        }
        long j2 = y1Var.r;
        if (this.G.f10470l.b()) {
            y1 y1Var2 = this.G;
            p2.b bVarH = y1Var2.f10460b.h(y1Var2.f10470l.f7476a, this.f8401k);
            long jF = bVarH.f(this.G.f10470l.f7477b);
            j2 = jF == Long.MIN_VALUE ? bVarH.f9705e : jF;
        }
        y1 y1Var3 = this.G;
        return w0.e(f1(y1Var3.f10460b, y1Var3.f10470l, j2));
    }

    @Override // c.f.a.b.a2
    public void M(TextureView textureView) {
    }

    @Override // c.f.a.b.a2
    public c.f.a.b.g3.l N() {
        return new c.f.a.b.g3.l(this.G.f10468j.f8524c);
    }

    @Override // c.f.a.b.a2
    public q1 P() {
        return this.E;
    }

    @Override // c.f.a.b.a2
    public long Q() {
        return this.r;
    }

    @Override // c.f.a.b.f1
    public c.f.a.b.g3.o a() {
        return this.f8395e;
    }

    @Override // c.f.a.b.a2
    public z1 c() {
        return this.G.f10473o;
    }

    @Override // c.f.a.b.a2
    public void d(z1 z1Var) {
        if (z1Var == null) {
            z1Var = z1.f10620a;
        }
        if (this.G.f10473o.equals(z1Var)) {
            return;
        }
        y1 y1VarG = this.G.g(z1Var);
        this.w++;
        this.f8398h.S0(z1Var);
        q1(y1VarG, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public final y1 d1(y1 y1Var, p2 p2Var, Pair<Object, Long> pair) {
        long jB;
        c.f.a.b.j3.g.a(p2Var.q() || pair != null);
        p2 p2Var2 = y1Var.f10460b;
        y1 y1VarJ = y1Var.j(p2Var);
        if (p2Var.q()) {
            i0.a aVarL = y1.l();
            long jD = w0.d(this.J);
            y1 y1VarB = y1VarJ.c(aVarL, jD, jD, jD, 0L, c.f.a.b.e3.a1.f6902b, this.f8392b, c.f.b.b.t.J()).b(aVarL);
            y1VarB.r = y1VarB.t;
            return y1VarB;
        }
        Object obj = y1VarJ.f10461c.f7476a;
        boolean z = !obj.equals(((Pair) c.f.a.b.j3.x0.i(pair)).first);
        i0.a aVar = z ? new i0.a(pair.first) : y1VarJ.f10461c;
        long jLongValue = ((Long) pair.second).longValue();
        long jD2 = w0.d(x());
        if (!p2Var2.q()) {
            jD2 -= p2Var2.h(obj, this.f8401k).o();
        }
        if (z || jLongValue < jD2) {
            c.f.a.b.j3.g.g(!aVar.b());
            y1 y1VarB2 = y1VarJ.c(aVar, jLongValue, jLongValue, jLongValue, 0L, z ? c.f.a.b.e3.a1.f6902b : y1VarJ.f10467i, z ? this.f8392b : y1VarJ.f10468j, z ? c.f.b.b.t.J() : y1VarJ.f10469k).b(aVar);
            y1VarB2.r = jLongValue;
            return y1VarB2;
        }
        if (jLongValue == jD2) {
            int iB = p2Var.b(y1VarJ.f10470l.f7476a);
            if (iB == -1 || p2Var.f(iB, this.f8401k).f9704d != p2Var.h(aVar.f7476a, this.f8401k).f9704d) {
                p2Var.h(aVar.f7476a, this.f8401k);
                jB = aVar.b() ? this.f8401k.b(aVar.f7477b, aVar.f7478c) : this.f8401k.f9705e;
                y1VarJ = y1VarJ.c(aVar, y1VarJ.t, y1VarJ.t, y1VarJ.f10463e, jB - y1VarJ.t, y1VarJ.f10467i, y1VarJ.f10468j, y1VarJ.f10469k).b(aVar);
            }
            return y1VarJ;
        }
        c.f.a.b.j3.g.g(!aVar.b());
        long jMax = Math.max(0L, y1VarJ.s - (jLongValue - jD2));
        jB = y1VarJ.r;
        if (y1VarJ.f10470l.equals(y1VarJ.f10461c)) {
            jB = jLongValue + jMax;
        }
        y1VarJ = y1VarJ.c(aVar, jLongValue, jLongValue, jLongValue, jMax, y1VarJ.f10467i, y1VarJ.f10468j, y1VarJ.f10469k);
        y1VarJ.r = jB;
        return y1VarJ;
    }

    @Override // c.f.a.b.a2
    public boolean e() {
        return this.G.f10461c.b();
    }

    public void e1(c.f.a.b.b3.a aVar) {
        q1 q1VarF = this.E.a().H(aVar).F();
        if (q1VarF.equals(this.E)) {
            return;
        }
        this.E = q1VarF;
        this.f8399i.j(15, new y.a() { // from class: c.f.a.b.s
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                this.f9789a.I0((a2.c) obj);
            }
        });
    }

    @Override // c.f.a.b.a2
    public long f() {
        return w0.e(this.G.s);
    }

    public final long f1(p2 p2Var, i0.a aVar, long j2) {
        p2Var.h(aVar.f7476a, this.f8401k);
        return j2 + this.f8401k.o();
    }

    @Override // c.f.a.b.a2
    public void g(int i2, long j2) {
        p2 p2Var = this.G.f10460b;
        if (i2 < 0 || (!p2Var.q() && i2 >= p2Var.p())) {
            throw new m1(p2Var, i2, j2);
        }
        this.w++;
        if (e()) {
            c.f.a.b.j3.z.i("ExoPlayerImpl", "seekTo ignored because an ad is playing");
            h1.e eVar = new h1.e(this.G);
            eVar.b(1);
            this.f8397g.a(eVar);
            return;
        }
        int i3 = getPlaybackState() != 1 ? 2 : 1;
        int iS = s();
        y1 y1VarD1 = d1(this.G.h(i3), p2Var, v0(p2Var, i2, j2));
        this.f8398h.B0(p2Var, i2, w0.d(j2));
        q1(y1VarD1, 0, 1, true, true, 1, s0(y1VarD1), iS);
    }

    public void g1() {
        c.f.a.b.j3.z.g("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.15.0] [" + c.f.a.b.j3.x0.f9300e + "] [" + i1.b() + "]");
        if (!this.f8398h.l0()) {
            this.f8399i.j(11, new y.a() { // from class: c.f.a.b.u
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).s(d1.g(new j1(1), 1003));
                }
            });
        }
        this.f8399i.h();
        this.f8396f.k(null);
        c.f.a.b.s2.h1 h1Var = this.f8405o;
        if (h1Var != null) {
            this.q.e(h1Var);
        }
        y1 y1VarH = this.G.h(1);
        this.G = y1VarH;
        y1 y1VarB = y1VarH.b(y1VarH.f10461c);
        this.G = y1VarB;
        y1VarB.r = y1VarB.t;
        this.G.s = 0L;
    }

    @Override // c.f.a.b.a2
    public long getCurrentPosition() {
        return w0.e(s0(this.G));
    }

    @Override // c.f.a.b.a2
    public long getDuration() {
        if (!e()) {
            return S();
        }
        y1 y1Var = this.G;
        i0.a aVar = y1Var.f10461c;
        y1Var.f10460b.h(aVar.f7476a, this.f8401k);
        return w0.e(this.f8401k.b(aVar.f7477b, aVar.f7478c));
    }

    @Override // c.f.a.b.a2
    public int getPlaybackState() {
        return this.G.f10464f;
    }

    @Override // c.f.a.b.a2
    public int getRepeatMode() {
        return this.u;
    }

    @Override // c.f.a.b.a2
    public float getVolume() {
        return 1.0f;
    }

    @Override // c.f.a.b.a2
    public a2.b h() {
        return this.D;
    }

    public void h0(f1.a aVar) {
        this.f8400j.add(aVar);
    }

    public void h1(a2.c cVar) {
        this.f8399i.i(cVar);
    }

    @Override // c.f.a.b.a2
    public boolean i() {
        return this.G.f10471m;
    }

    public void i0(a2.c cVar) {
        this.f8399i.a(cVar);
    }

    public final y1 i1(int i2, int i3) {
        boolean z = false;
        c.f.a.b.j3.g.a(i2 >= 0 && i3 >= i2 && i3 <= this.f8402l.size());
        int iS = s();
        p2 p2VarG = G();
        int size = this.f8402l.size();
        this.w++;
        j1(i2, i3);
        p2 p2VarL0 = l0();
        y1 y1VarD1 = d1(this.G, p2VarL0, u0(p2VarG, p2VarL0));
        int i4 = y1VarD1.f10464f;
        if (i4 != 1 && i4 != 4 && i2 < i3 && i3 == size && iS >= y1VarD1.f10460b.p()) {
            z = true;
        }
        if (z) {
            y1VarD1 = y1VarD1.h(4);
        }
        this.f8398h.o0(i2, i3, this.B);
        return y1VarD1;
    }

    @Override // c.f.a.b.a2
    public void j(final boolean z) {
        if (this.v != z) {
            this.v = z;
            this.f8398h.X0(z);
            this.f8399i.g(10, new y.a() { // from class: c.f.a.b.f
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).C(z);
                }
            });
            p1();
            this.f8399i.c();
        }
    }

    public final List<v1.c> j0(int i2, List<c.f.a.b.e3.i0> list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            v1.c cVar = new v1.c(list.get(i3), this.f8403m);
            arrayList.add(cVar);
            this.f8402l.add(i3 + i2, new a(cVar.f10248b, cVar.f10247a.Q()));
        }
        this.B = this.B.e(i2, arrayList.size());
        return arrayList;
    }

    public final void j1(int i2, int i3) {
        for (int i4 = i3 - 1; i4 >= i2; i4--) {
            this.f8402l.remove(i4);
        }
        this.B = this.B.a(i2, i3);
    }

    @Override // c.f.a.b.a2
    public int k() {
        return 3000;
    }

    public void k0(int i2, List<c.f.a.b.e3.i0> list) {
        c.f.a.b.j3.g.a(i2 >= 0);
        p2 p2VarG = G();
        this.w++;
        List<v1.c> listJ0 = j0(i2, list);
        p2 p2VarL0 = l0();
        y1 y1VarD1 = d1(this.G, p2VarL0, u0(p2VarG, p2VarL0));
        this.f8398h.h(i2, listJ0, this.B);
        q1(y1VarD1, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    public void k1(List<p1> list, boolean z) {
        l1(m0(list), z);
    }

    @Override // c.f.a.b.a2
    public int l() {
        if (this.G.f10460b.q()) {
            return this.I;
        }
        y1 y1Var = this.G;
        return y1Var.f10460b.b(y1Var.f10461c.f7476a);
    }

    public final p2 l0() {
        return new e2(this.f8402l, this.B);
    }

    public void l1(List<c.f.a.b.e3.i0> list, boolean z) {
        m1(list, -1, -9223372036854775807L, z);
    }

    public final List<c.f.a.b.e3.i0> m0(List<p1> list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(this.f8404n.a(list.get(i2)));
        }
        return arrayList;
    }

    public final void m1(List<c.f.a.b.e3.i0> list, int i2, long j2, boolean z) {
        int iA;
        long j3;
        int iT0 = t0();
        long currentPosition = getCurrentPosition();
        this.w++;
        if (!this.f8402l.isEmpty()) {
            j1(0, this.f8402l.size());
        }
        List<v1.c> listJ0 = j0(0, list);
        p2 p2VarL0 = l0();
        if (!p2VarL0.q() && i2 >= p2VarL0.p()) {
            throw new m1(p2VarL0, i2, j2);
        }
        if (z) {
            j3 = -9223372036854775807L;
            iA = p2VarL0.a(this.v);
        } else if (i2 == -1) {
            iA = iT0;
            j3 = currentPosition;
        } else {
            iA = i2;
            j3 = j2;
        }
        y1 y1VarD1 = d1(this.G, p2VarL0, v0(p2VarL0, iA, j3));
        int i3 = y1VarD1.f10464f;
        if (iA != -1 && i3 != 1) {
            i3 = (p2VarL0.q() || iA >= p2VarL0.p()) ? 4 : 2;
        }
        y1 y1VarH = y1VarD1.h(i3);
        this.f8398h.N0(listJ0, iA, w0.d(j3), this.B);
        q1(y1VarH, 0, 1, false, (this.G.f10461c.f7476a.equals(y1VarH.f10461c.f7476a) || this.G.f10460b.q()) ? false : true, 4, s0(y1VarH), -1);
    }

    @Override // c.f.a.b.a2
    public void n(TextureView textureView) {
    }

    public d2 n0(d2.b bVar) {
        return new d2(this.f8398h, bVar, this.G.f10460b, s(), this.t, this.f8398h.A());
    }

    public void n1(boolean z, int i2, int i3) {
        y1 y1Var = this.G;
        if (y1Var.f10471m == z && y1Var.f10472n == i2) {
            return;
        }
        this.w++;
        y1 y1VarE = y1Var.e(z, i2);
        this.f8398h.Q0(z, i2);
        q1(y1VarE, 0, i3, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // c.f.a.b.a2
    public c.f.a.b.k3.e0 o() {
        return c.f.a.b.k3.e0.f9369a;
    }

    public final Pair<Boolean, Integer> o0(y1 y1Var, y1 y1Var2, boolean z, int i2, boolean z2) {
        p2 p2Var = y1Var2.f10460b;
        p2 p2Var2 = y1Var.f10460b;
        if (p2Var2.q() && p2Var.q()) {
            return new Pair<>(Boolean.FALSE, -1);
        }
        int i3 = 3;
        if (p2Var2.q() != p2Var.q()) {
            return new Pair<>(Boolean.TRUE, 3);
        }
        if (p2Var.n(p2Var.h(y1Var2.f10461c.f7476a, this.f8401k).f9704d, this.f9974a).f9713e.equals(p2Var2.n(p2Var2.h(y1Var.f10461c.f7476a, this.f8401k).f9704d, this.f9974a).f9713e)) {
            return (z && i2 == 0 && y1Var2.f10461c.f7479d < y1Var.f10461c.f7479d) ? new Pair<>(Boolean.TRUE, 0) : new Pair<>(Boolean.FALSE, -1);
        }
        if (z && i2 == 0) {
            i3 = 1;
        } else if (z && i2 == 1) {
            i3 = 2;
        } else if (!z2) {
            throw new IllegalStateException();
        }
        return new Pair<>(Boolean.TRUE, Integer.valueOf(i3));
    }

    public void o1(boolean z, d1 d1Var) {
        y1 y1VarB;
        if (z) {
            y1VarB = i1(0, this.f8402l.size()).f(null);
        } else {
            y1 y1Var = this.G;
            y1VarB = y1Var.b(y1Var.f10461c);
            y1VarB.r = y1VarB.t;
            y1VarB.s = 0L;
        }
        y1 y1VarH = y1VarB.h(1);
        if (d1Var != null) {
            y1VarH = y1VarH.f(d1Var);
        }
        y1 y1Var2 = y1VarH;
        this.w++;
        this.f8398h.h1();
        q1(y1Var2, 0, 1, false, y1Var2.f10460b.q() && !this.G.f10460b.q(), 4, s0(y1Var2), -1);
    }

    @Override // c.f.a.b.a2
    public void p(a2.e eVar) {
        h1(eVar);
    }

    public boolean p0() {
        return this.G.q;
    }

    public final void p1() {
        a2.b bVar = this.D;
        a2.b bVarR = R(this.f8393c);
        this.D = bVarR;
        if (bVarR.equals(bVar)) {
            return;
        }
        this.f8399i.g(14, new y.a() { // from class: c.f.a.b.w
            @Override // c.f.a.b.j3.y.a
            public final void a(Object obj) {
                this.f10303a.N0((a2.c) obj);
            }
        });
    }

    @Override // c.f.a.b.a2
    public void prepare() {
        y1 y1Var = this.G;
        if (y1Var.f10464f != 1) {
            return;
        }
        y1 y1VarF = y1Var.f(null);
        y1 y1VarH = y1VarF.h(y1VarF.f10460b.q() ? 4 : 2);
        this.w++;
        this.f8398h.j0();
        q1(y1VarH, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // c.f.a.b.a2
    public int q() {
        if (e()) {
            return this.G.f10461c.f7478c;
        }
        return -1;
    }

    public void q0(long j2) {
        this.f8398h.t(j2);
    }

    public final void q1(final y1 y1Var, final int i2, final int i3, boolean z, boolean z2, final int i4, long j2, int i5) {
        y1 y1Var2 = this.G;
        this.G = y1Var;
        Pair<Boolean, Integer> pairO0 = o0(y1Var, y1Var2, z2, i4, !y1Var2.f10460b.equals(y1Var.f10460b));
        boolean zBooleanValue = ((Boolean) pairO0.first).booleanValue();
        final int iIntValue = ((Integer) pairO0.second).intValue();
        q1 q1VarF = this.E;
        if (zBooleanValue) {
            p1Var = y1Var.f10460b.q() ? null : y1Var.f10460b.n(y1Var.f10460b.h(y1Var.f10461c.f7476a, this.f8401k).f9704d, this.f9974a).f9715g;
            q1VarF = p1Var != null ? p1Var.f9645f : q1.f9729a;
        }
        if (!y1Var2.f10469k.equals(y1Var.f10469k)) {
            q1VarF = q1VarF.a().I(y1Var.f10469k).F();
        }
        boolean z3 = !q1VarF.equals(this.E);
        this.E = q1VarF;
        if (!y1Var2.f10460b.equals(y1Var.f10460b)) {
            this.f8399i.g(0, new y.a() { // from class: c.f.a.b.q
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    a2.c cVar = (a2.c) obj;
                    cVar.v(y1Var.f10460b, i2);
                }
            });
        }
        if (z2) {
            final a2.f fVarY0 = y0(i4, y1Var2, i5);
            final a2.f fVarX0 = x0(j2);
            this.f8399i.g(12, new y.a() { // from class: c.f.a.b.o
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    g1.c1(i4, fVarY0, fVarX0, (a2.c) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.f8399i.g(1, new y.a() { // from class: c.f.a.b.m
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).O(p1Var, iIntValue);
                }
            });
        }
        if (y1Var2.f10465g != y1Var.f10465g) {
            this.f8399i.g(11, new y.a() { // from class: c.f.a.b.h
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).h0(y1Var.f10465g);
                }
            });
            if (y1Var.f10465g != null) {
                this.f8399i.g(11, new y.a() { // from class: c.f.a.b.e
                    @Override // c.f.a.b.j3.y.a
                    public final void a(Object obj) {
                        ((a2.c) obj).s(y1Var.f10465g);
                    }
                });
            }
        }
        c.f.a.b.g3.p pVar = y1Var2.f10468j;
        c.f.a.b.g3.p pVar2 = y1Var.f10468j;
        if (pVar != pVar2) {
            this.f8395e.d(pVar2.f8525d);
            final c.f.a.b.g3.l lVar = new c.f.a.b.g3.l(y1Var.f10468j.f8524c);
            this.f8399i.g(2, new y.a() { // from class: c.f.a.b.l
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    a2.c cVar = (a2.c) obj;
                    cVar.b0(y1Var.f10467i, lVar);
                }
            });
        }
        if (!y1Var2.f10469k.equals(y1Var.f10469k)) {
            this.f8399i.g(3, new y.a() { // from class: c.f.a.b.i
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).l(y1Var.f10469k);
                }
            });
        }
        if (z3) {
            final q1 q1Var = this.E;
            this.f8399i.g(15, new y.a() { // from class: c.f.a.b.v
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).z(q1Var);
                }
            });
        }
        if (y1Var2.f10466h != y1Var.f10466h) {
            this.f8399i.g(4, new y.a() { // from class: c.f.a.b.x
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    g1.U0(y1Var, (a2.c) obj);
                }
            });
        }
        if (y1Var2.f10464f != y1Var.f10464f || y1Var2.f10471m != y1Var.f10471m) {
            this.f8399i.g(-1, new y.a() { // from class: c.f.a.b.g
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    y1 y1Var3 = y1Var;
                    ((a2.c) obj).H(y1Var3.f10471m, y1Var3.f10464f);
                }
            });
        }
        if (y1Var2.f10464f != y1Var.f10464f) {
            this.f8399i.g(5, new y.a() { // from class: c.f.a.b.z
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).x(y1Var.f10464f);
                }
            });
        }
        if (y1Var2.f10471m != y1Var.f10471m) {
            this.f8399i.g(6, new y.a() { // from class: c.f.a.b.k
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    a2.c cVar = (a2.c) obj;
                    cVar.Z(y1Var.f10471m, i3);
                }
            });
        }
        if (y1Var2.f10472n != y1Var.f10472n) {
            this.f8399i.g(7, new y.a() { // from class: c.f.a.b.y
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).g(y1Var.f10472n);
                }
            });
        }
        if (B0(y1Var2) != B0(y1Var)) {
            this.f8399i.g(8, new y.a() { // from class: c.f.a.b.j
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).m0(g1.B0(y1Var));
                }
            });
        }
        if (!y1Var2.f10473o.equals(y1Var.f10473o)) {
            this.f8399i.g(13, new y.a() { // from class: c.f.a.b.p
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).d(y1Var.f10473o);
                }
            });
        }
        if (z) {
            this.f8399i.g(-1, new y.a() { // from class: c.f.a.b.a
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).r();
                }
            });
        }
        p1();
        this.f8399i.c();
        if (y1Var2.p != y1Var.p) {
            Iterator<f1.a> it = this.f8400j.iterator();
            while (it.hasNext()) {
                it.next().K(y1Var.p);
            }
        }
        if (y1Var2.q != y1Var.q) {
            Iterator<f1.a> it2 = this.f8400j.iterator();
            while (it2.hasNext()) {
                it2.next().q(y1Var.q);
            }
        }
    }

    @Override // c.f.a.b.a2
    public void r(SurfaceView surfaceView) {
    }

    @Override // c.f.a.b.a2
    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public c.f.b.b.t<c.f.a.b.f3.c> A() {
        return c.f.b.b.t.J();
    }

    @Override // c.f.a.b.a2
    public int s() {
        int iT0 = t0();
        if (iT0 == -1) {
            return 0;
        }
        return iT0;
    }

    public final long s0(y1 y1Var) {
        return y1Var.f10460b.q() ? w0.d(this.J) : y1Var.f10461c.b() ? y1Var.t : f1(y1Var.f10460b, y1Var.f10461c, y1Var.t);
    }

    @Override // c.f.a.b.a2
    public void setRepeatMode(final int i2) {
        if (this.u != i2) {
            this.u = i2;
            this.f8398h.U0(i2);
            this.f8399i.g(9, new y.a() { // from class: c.f.a.b.d
                @Override // c.f.a.b.j3.y.a
                public final void a(Object obj) {
                    ((a2.c) obj).onRepeatModeChanged(i2);
                }
            });
            p1();
            this.f8399i.c();
        }
    }

    public final int t0() {
        if (this.G.f10460b.q()) {
            return this.H;
        }
        y1 y1Var = this.G;
        return y1Var.f10460b.h(y1Var.f10461c.f7476a, this.f8401k).f9704d;
    }

    public final Pair<Object, Long> u0(p2 p2Var, p2 p2Var2) {
        long jX = x();
        if (p2Var.q() || p2Var2.q()) {
            boolean z = !p2Var.q() && p2Var2.q();
            int iT0 = z ? -1 : t0();
            if (z) {
                jX = -9223372036854775807L;
            }
            return v0(p2Var2, iT0, jX);
        }
        Pair<Object, Long> pairJ = p2Var.j(this.f9974a, this.f8401k, s(), w0.d(jX));
        Object obj = ((Pair) c.f.a.b.j3.x0.i(pairJ)).first;
        if (p2Var2.b(obj) != -1) {
            return pairJ;
        }
        Object objZ0 = h1.z0(this.f9974a, this.f8401k, this.u, this.v, obj, p2Var, p2Var2);
        if (objZ0 == null) {
            return v0(p2Var2, -1, -9223372036854775807L);
        }
        p2Var2.h(objZ0, this.f8401k);
        int i2 = this.f8401k.f9704d;
        return v0(p2Var2, i2, p2Var2.n(i2, this.f9974a).b());
    }

    @Override // c.f.a.b.a2
    public void v(boolean z) {
        n1(z, 0, 1);
    }

    public final Pair<Object, Long> v0(p2 p2Var, int i2, long j2) {
        if (p2Var.q()) {
            this.H = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.J = j2;
            this.I = 0;
            return null;
        }
        if (i2 == -1 || i2 >= p2Var.p()) {
            i2 = p2Var.a(this.v);
            j2 = p2Var.n(i2, this.f9974a).b();
        }
        return p2Var.j(this.f9974a, this.f8401k, i2, w0.d(j2));
    }

    @Override // c.f.a.b.a2
    public long w() {
        return this.s;
    }

    @Override // c.f.a.b.a2
    /* JADX INFO: renamed from: w0, reason: merged with bridge method [inline-methods] */
    public d1 u() {
        return this.G.f10465g;
    }

    @Override // c.f.a.b.a2
    public long x() {
        if (!e()) {
            return getCurrentPosition();
        }
        y1 y1Var = this.G;
        y1Var.f10460b.h(y1Var.f10461c.f7476a, this.f8401k);
        y1 y1Var2 = this.G;
        return y1Var2.f10462d == -9223372036854775807L ? y1Var2.f10460b.n(s(), this.f9974a).b() : this.f8401k.n() + w0.e(this.G.f10462d);
    }

    public final a2.f x0(long j2) {
        Object obj;
        int iB;
        int iS = s();
        Object obj2 = null;
        if (this.G.f10460b.q()) {
            obj = null;
            iB = -1;
        } else {
            y1 y1Var = this.G;
            Object obj3 = y1Var.f10461c.f7476a;
            y1Var.f10460b.h(obj3, this.f8401k);
            iB = this.G.f10460b.b(obj3);
            obj = obj3;
            obj2 = this.G.f10460b.n(iS, this.f9974a).f9713e;
        }
        long jE = w0.e(j2);
        long jE2 = this.G.f10461c.b() ? w0.e(z0(this.G)) : jE;
        i0.a aVar = this.G.f10461c;
        return new a2.f(obj2, iS, obj, iB, jE, jE2, aVar.f7477b, aVar.f7478c);
    }

    @Override // c.f.a.b.a2
    public void y(a2.e eVar) {
        i0(eVar);
    }

    public final a2.f y0(int i2, y1 y1Var, int i3) {
        int i4;
        Object obj;
        Object obj2;
        int iB;
        long jZ0;
        long jZ02;
        p2.b bVar = new p2.b();
        if (y1Var.f10460b.q()) {
            i4 = i3;
            obj = null;
            obj2 = null;
            iB = -1;
        } else {
            Object obj3 = y1Var.f10461c.f7476a;
            y1Var.f10460b.h(obj3, bVar);
            int i5 = bVar.f9704d;
            i4 = i5;
            obj2 = obj3;
            iB = y1Var.f10460b.b(obj3);
            obj = y1Var.f10460b.n(i5, this.f9974a).f9713e;
        }
        if (i2 == 0) {
            jZ02 = bVar.f9706f + bVar.f9705e;
            if (y1Var.f10461c.b()) {
                i0.a aVar = y1Var.f10461c;
                jZ02 = bVar.b(aVar.f7477b, aVar.f7478c);
                jZ0 = z0(y1Var);
            } else {
                if (y1Var.f10461c.f7480e != -1 && this.G.f10461c.b()) {
                    jZ02 = z0(this.G);
                }
                jZ0 = jZ02;
            }
        } else if (y1Var.f10461c.b()) {
            jZ02 = y1Var.t;
            jZ0 = z0(y1Var);
        } else {
            jZ0 = bVar.f9706f + y1Var.t;
            jZ02 = jZ0;
        }
        long jE = w0.e(jZ02);
        long jE2 = w0.e(jZ0);
        i0.a aVar2 = y1Var.f10461c;
        return new a2.f(obj, i4, obj2, iB, jE, jE2, aVar2.f7477b, aVar2.f7478c);
    }

    @Override // c.f.a.b.a2
    public void z(int i2, List<p1> list) {
        k0(Math.min(i2, this.f8402l.size()), m0(list));
    }
}
