package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import c.f.a.b.e3.a0;
import c.f.a.b.e3.d0;
import c.f.a.b.e3.h1.c;
import c.f.a.b.e3.h1.d;
import c.f.a.b.e3.h1.e;
import c.f.a.b.e3.h1.f.a;
import c.f.a.b.e3.h1.f.b;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.j0;
import c.f.a.b.e3.k0;
import c.f.a.b.e3.n;
import c.f.a.b.e3.u;
import c.f.a.b.e3.v0;
import c.f.a.b.i1;
import c.f.a.b.i3.f;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.g0;
import c.f.a.b.i3.h0;
import c.f.a.b.i3.i0;
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
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SsMediaSource extends n implements g0.b<i0<c.f.a.b.e3.h1.f.a>> {
    public Handler A;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f23986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Uri f23987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p1.g f23988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p1 f23989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final p.a f23990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d.a f23991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f23992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c0 f23993o;
    public final f0 p;
    public final long q;
    public final j0.a r;
    public final i0.a<? extends c.f.a.b.e3.h1.f.a> s;
    public final ArrayList<e> t;
    public p u;
    public g0 v;
    public h0 w;
    public n0 x;
    public long y;
    public c.f.a.b.e3.h1.f.a z;

    public static final class Factory implements k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d.a f23994a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p.a f23995b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f23996c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23997d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e0 f23998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public f0 f23999f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f24000g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public i0.a<? extends c.f.a.b.e3.h1.f.a> f24001h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public List<c.f.a.b.c3.i0> f24002i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f24003j;

        public Factory(d.a aVar, p.a aVar2) {
            this.f23994a = (d.a) g.e(aVar);
            this.f23995b = aVar2;
            this.f23998e = new v();
            this.f23999f = new y();
            this.f24000g = 30000L;
            this.f23996c = new c.f.a.b.e3.v();
            this.f24002i = Collections.emptyList();
        }

        public Factory(p.a aVar) {
            this(new c.a(aVar), aVar);
        }

        public static /* synthetic */ c0 e(c0 c0Var, p1 p1Var) {
            return c0Var;
        }

        @Override // c.f.a.b.e3.k0
        public int[] b() {
            return new int[]{1};
        }

        @Override // c.f.a.b.e3.k0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public SsMediaSource a(p1 p1Var) {
            p1.c cVarA;
            p1.c cVarA2;
            p1 p1VarA = p1Var;
            g.e(p1VarA.f9643d);
            i0.a bVar = this.f24001h;
            if (bVar == null) {
                bVar = new b();
            }
            List<c.f.a.b.c3.i0> list = !p1VarA.f9643d.f9689e.isEmpty() ? p1VarA.f9643d.f9689e : this.f24002i;
            i0.a f0Var = !list.isEmpty() ? new c.f.a.b.c3.f0(bVar, list) : bVar;
            p1.g gVar = p1VarA.f9643d;
            boolean z = gVar.f9692h == null && this.f24003j != null;
            boolean z2 = gVar.f9689e.isEmpty() && !list.isEmpty();
            if (!z || !z2) {
                if (z) {
                    cVarA2 = p1Var.a().A(this.f24003j);
                    p1VarA = cVarA2.a();
                    p1 p1Var2 = p1VarA;
                    return new SsMediaSource(p1Var2, null, this.f23995b, f0Var, this.f23994a, this.f23996c, this.f23998e.a(p1Var2), this.f23999f, this.f24000g);
                }
                if (z2) {
                    cVarA = p1Var.a();
                }
                p1 p1Var22 = p1VarA;
                return new SsMediaSource(p1Var22, null, this.f23995b, f0Var, this.f23994a, this.f23996c, this.f23998e.a(p1Var22), this.f23999f, this.f24000g);
            }
            cVarA = p1Var.a().A(this.f24003j);
            cVarA2 = cVarA.y(list);
            p1VarA = cVarA2.a();
            p1 p1Var222 = p1VarA;
            return new SsMediaSource(p1Var222, null, this.f23995b, f0Var, this.f23994a, this.f23996c, this.f23998e.a(p1Var222), this.f23999f, this.f24000g);
        }

        @Override // c.f.a.b.e3.k0
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Factory c(final c0 c0Var) {
            if (c0Var == null) {
                g(null);
            } else {
                g(new e0() { // from class: c.f.a.b.e3.h1.a
                    @Override // c.f.a.b.x2.e0
                    public final c0 a(p1 p1Var) {
                        c0 c0Var2 = c0Var;
                        SsMediaSource.Factory.e(c0Var2, p1Var);
                        return c0Var2;
                    }
                });
            }
            return this;
        }

        public Factory g(e0 e0Var) {
            boolean z;
            if (e0Var != null) {
                this.f23998e = e0Var;
                z = true;
            } else {
                this.f23998e = new v();
                z = false;
            }
            this.f23997d = z;
            return this;
        }
    }

    static {
        i1.a("goog.exo.smoothstreaming");
    }

    public SsMediaSource(p1 p1Var, c.f.a.b.e3.h1.f.a aVar, p.a aVar2, i0.a<? extends c.f.a.b.e3.h1.f.a> aVar3, d.a aVar4, u uVar, c0 c0Var, f0 f0Var, long j2) {
        g.g(aVar == null || !aVar.f7776d);
        this.f23989k = p1Var;
        p1.g gVar = (p1.g) g.e(p1Var.f9643d);
        this.f23988j = gVar;
        this.z = aVar;
        this.f23987i = gVar.f9685a.equals(Uri.EMPTY) ? null : x0.C(gVar.f9685a);
        this.f23990l = aVar2;
        this.s = aVar3;
        this.f23991m = aVar4;
        this.f23992n = uVar;
        this.f23993o = c0Var;
        this.p = f0Var;
        this.q = j2;
        this.r = w(null);
        this.f23986h = aVar != null;
        this.t = new ArrayList<>();
    }

    @Override // c.f.a.b.e3.n
    public void B(n0 n0Var) {
        this.x = n0Var;
        this.f23993o.prepare();
        if (this.f23986h) {
            this.w = new h0.a();
            I();
            return;
        }
        this.u = this.f23990l.a();
        g0 g0Var = new g0("SsMediaSource");
        this.v = g0Var;
        this.w = g0Var;
        this.A = x0.x();
        K();
    }

    @Override // c.f.a.b.e3.n
    public void D() {
        this.z = this.f23986h ? this.z : null;
        this.u = null;
        this.y = 0L;
        g0 g0Var = this.v;
        if (g0Var != null) {
            g0Var.l();
            this.v = null;
        }
        Handler handler = this.A;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.A = null;
        }
        this.f23993o.release();
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void k(i0<c.f.a.b.e3.h1.f.a> i0Var, long j2, long j3, boolean z) {
        a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
        this.p.c(i0Var.f8899a);
        this.r.q(a0Var, i0Var.f8901c);
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void m(i0<c.f.a.b.e3.h1.f.a> i0Var, long j2, long j3) {
        a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
        this.p.c(i0Var.f8899a);
        this.r.t(a0Var, i0Var.f8901c);
        this.z = i0Var.e();
        this.y = j2 - j3;
        I();
        J();
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public g0.c u(i0<c.f.a.b.e3.h1.f.a> i0Var, long j2, long j3, IOException iOException, int i2) {
        a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
        long jA = this.p.a(new f0.c(a0Var, new d0(i0Var.f8901c), iOException, i2));
        g0.c cVarH = jA == -9223372036854775807L ? g0.f8878d : g0.h(false, jA);
        boolean z = !cVarH.c();
        this.r.x(a0Var, i0Var.f8901c, iOException, z);
        if (z) {
            this.p.c(i0Var.f8899a);
        }
        return cVarH;
    }

    public final void I() {
        v0 v0Var;
        for (int i2 = 0; i2 < this.t.size(); i2++) {
            this.t.get(i2).w(this.z);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (a.b bVar : this.z.f7778f) {
            if (bVar.f7794k > 0) {
                jMax2 = Math.min(jMax2, bVar.e(0));
                jMax = Math.max(jMax, bVar.e(bVar.f7794k - 1) + bVar.c(bVar.f7794k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j2 = this.z.f7776d ? -9223372036854775807L : 0L;
            c.f.a.b.e3.h1.f.a aVar = this.z;
            boolean z = aVar.f7776d;
            v0Var = new v0(j2, 0L, 0L, 0L, true, z, z, aVar, this.f23989k);
        } else {
            c.f.a.b.e3.h1.f.a aVar2 = this.z;
            if (aVar2.f7776d) {
                long j3 = aVar2.f7780h;
                if (j3 != -9223372036854775807L && j3 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j3);
                }
                long j4 = jMax2;
                long j5 = jMax - j4;
                long jD = j5 - w0.d(this.q);
                if (jD < 5000000) {
                    jD = Math.min(5000000L, j5 / 2);
                }
                v0Var = new v0(-9223372036854775807L, j5, j4, jD, true, true, true, this.z, this.f23989k);
            } else {
                long j6 = aVar2.f7779g;
                long j7 = j6 != -9223372036854775807L ? j6 : jMax - jMax2;
                v0Var = new v0(jMax2 + j7, j7, jMax2, 0L, true, false, false, this.z, this.f23989k);
            }
        }
        C(v0Var);
    }

    public final void J() {
        if (this.z.f7776d) {
            this.A.postDelayed(new Runnable() { // from class: c.f.a.b.e3.h1.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7747b.K();
                }
            }, Math.max(0L, (this.y + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void K() {
        if (this.v.i()) {
            return;
        }
        i0 i0Var = new i0(this.u, this.f23987i, 4, this.s);
        this.r.z(new a0(i0Var.f8899a, i0Var.f8900b, this.v.n(i0Var, this, this.p.d(i0Var.f8901c))), i0Var.f8901c);
    }

    @Override // c.f.a.b.e3.i0
    public c.f.a.b.e3.f0 a(i0.a aVar, f fVar, long j2) {
        j0.a aVarW = w(aVar);
        e eVar = new e(this.z, this.f23991m, this.x, this.f23992n, this.f23993o, t(aVar), this.p, aVarW, this.w, fVar);
        this.t.add(eVar);
        return eVar;
    }

    @Override // c.f.a.b.e3.i0
    public p1 h() {
        return this.f23989k;
    }

    @Override // c.f.a.b.e3.i0
    public void l() {
        this.w.a();
    }

    @Override // c.f.a.b.e3.i0
    public void o(c.f.a.b.e3.f0 f0Var) {
        ((e) f0Var).u();
        this.t.remove(f0Var);
    }
}
