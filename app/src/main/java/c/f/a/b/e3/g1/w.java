package c.f.a.b.e3.g1;

import android.net.Uri;
import android.os.Handler;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.f0;
import c.f.a.b.e3.g1.l;
import c.f.a.b.e3.g1.m;
import c.f.a.b.e3.g1.t;
import c.f.a.b.e3.g1.y;
import c.f.a.b.e3.r0;
import c.f.a.b.e3.s0;
import c.f.a.b.e3.z0;
import c.f.a.b.i3.g0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.l1;
import c.f.a.b.m2;
import c.f.b.b.t;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements c.f.a.b.e3.f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.i3.f f7697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f7698c = x0.x();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f7699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f7700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e> f7701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<d> f7702g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f7703h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l.a f7704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f0.a f7705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c.f.b.b.t<z0> f7706k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public IOException f7707l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public RtspMediaSource.b f7708m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f7709n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f7710o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public boolean u;

    public final class b implements c.f.a.b.z2.l, g0.b<m>, r0.d, t.f, t.e {
        public b() {
        }

        @Override // c.f.a.b.e3.r0.d
        public void a(k1 k1Var) {
            Handler handler = w.this.f7698c;
            final w wVar = w.this;
            handler.post(new Runnable() { // from class: c.f.a.b.e3.g1.f
                @Override // java.lang.Runnable
                public final void run() {
                    wVar.P();
                }
            });
        }

        @Override // c.f.a.b.e3.g1.t.f
        public void b(String str, Throwable th) {
            w.this.f7707l = th == null ? new IOException(str) : new IOException(str, th);
        }

        @Override // c.f.a.b.e3.g1.t.e
        public void c(RtspMediaSource.b bVar) {
            w.this.f7708m = bVar;
        }

        @Override // c.f.a.b.e3.g1.t.e
        public void d() {
            w.this.f7700e.L0(0L);
        }

        @Override // c.f.a.b.z2.l
        public c.f.a.b.z2.a0 e(int i2, int i3) {
            return ((e) c.f.a.b.j3.g.e(w.this.f7701f.get(i2))).f7718c;
        }

        @Override // c.f.a.b.e3.g1.t.e
        public void f(long j2, c.f.b.b.t<h0> tVar) {
            ArrayList arrayList = new ArrayList(tVar.size());
            for (int i2 = 0; i2 < tVar.size(); i2++) {
                arrayList.add(c.f.a.b.j3.g.e(tVar.get(i2).f7525c.getPath()));
            }
            for (int i3 = 0; i3 < w.this.f7702g.size(); i3++) {
                d dVar = (d) w.this.f7702g.get(i3);
                if (!arrayList.contains(dVar.b().getPath())) {
                    w.this.f7708m = new RtspMediaSource.b("Server did not provide timing for track " + dVar.b());
                    return;
                }
            }
            for (int i4 = 0; i4 < tVar.size(); i4++) {
                h0 h0Var = tVar.get(i4);
                m mVarL = w.this.L(h0Var.f7525c);
                if (mVarL != null) {
                    mVarL.h(h0Var.f7523a);
                    mVarL.g(h0Var.f7524b);
                    if (w.this.O()) {
                        mVarL.f(j2, h0Var.f7523a);
                    }
                }
            }
            if (w.this.O()) {
                w.this.f7710o = -9223372036854775807L;
            }
        }

        @Override // c.f.a.b.e3.g1.t.f
        public void g(f0 f0Var, c.f.b.b.t<x> tVar) {
            for (int i2 = 0; i2 < tVar.size(); i2++) {
                x xVar = tVar.get(i2);
                w wVar = w.this;
                e eVar = wVar.new e(xVar, i2, wVar.f7704i);
                w.this.f7701f.add(eVar);
                eVar.i();
            }
            w.this.f7703h.a(f0Var);
        }

        @Override // c.f.a.b.z2.l
        public void i(c.f.a.b.z2.x xVar) {
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public void k(m mVar, long j2, long j3, boolean z) {
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void m(m mVar, long j2, long j3) {
            if (w.this.g() == 0) {
                if (w.this.u) {
                    return;
                }
                w.this.T();
                w.this.u = true;
                return;
            }
            for (int i2 = 0; i2 < w.this.f7701f.size(); i2++) {
                e eVar = (e) w.this.f7701f.get(i2);
                if (eVar.f7716a.f7713b == mVar) {
                    eVar.c();
                    return;
                }
            }
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public g0.c u(m mVar, long j2, long j3, IOException iOException, int i2) {
            if (!w.this.r) {
                w.this.f7707l = iOException;
            } else if (!(iOException.getCause() instanceof BindException)) {
                w.this.f7708m = new RtspMediaSource.b(mVar.f7585b.f7725b.toString(), iOException);
            } else if (w.a(w.this) < 3) {
                return c.f.a.b.i3.g0.f8875a;
            }
            return c.f.a.b.i3.g0.f8877c;
        }

        @Override // c.f.a.b.z2.l
        public void p() {
            Handler handler = w.this.f7698c;
            final w wVar = w.this;
            handler.post(new Runnable() { // from class: c.f.a.b.e3.g1.e
                @Override // java.lang.Runnable
                public final void run() {
                    wVar.P();
                }
            });
        }
    }

    public interface c {
        void a(f0 f0Var);
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f7712a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f7713b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f7714c;

        public d(x xVar, int i2, l.a aVar) {
            this.f7712a = xVar;
            this.f7713b = new m(i2, xVar, new m.a() { // from class: c.f.a.b.e3.g1.g
                @Override // c.f.a.b.e3.g1.m.a
                public final void a(String str, l lVar) {
                    this.f7518a.f(str, lVar);
                }
            }, w.this.f7699d, aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void f(String str, l lVar) {
            this.f7714c = str;
            y.b bVarK = lVar.k();
            if (bVarK != null) {
                w.this.f7700e.F0(lVar.e(), bVarK);
                w.this.u = true;
            }
            w.this.Q();
        }

        public Uri b() {
            return this.f7713b.f7585b.f7725b;
        }

        public String c() {
            c.f.a.b.j3.g.i(this.f7714c);
            return this.f7714c;
        }

        public boolean d() {
            return this.f7714c != null;
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f7716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c.f.a.b.i3.g0 f7717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r0 f7718c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7719d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f7720e;

        public e(x xVar, int i2, l.a aVar) {
            this.f7716a = w.this.new d(xVar, i2, aVar);
            this.f7717b = new c.f.a.b.i3.g0("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper " + i2);
            r0 r0VarK = r0.k(w.this.f7697b);
            this.f7718c = r0VarK;
            r0VarK.c0(w.this.f7699d);
        }

        public void c() {
            if (this.f7719d) {
                return;
            }
            this.f7716a.f7713b.c();
            this.f7719d = true;
            w.this.V();
        }

        public long d() {
            return this.f7718c.y();
        }

        public boolean e() {
            return this.f7718c.J(this.f7719d);
        }

        public int f(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
            return this.f7718c.R(l1Var, fVar, i2, this.f7719d);
        }

        public void g() {
            if (this.f7720e) {
                return;
            }
            this.f7717b.l();
            this.f7718c.S();
            this.f7720e = true;
        }

        public void h(long j2) {
            if (this.f7719d) {
                return;
            }
            this.f7716a.f7713b.e();
            this.f7718c.U();
            this.f7718c.a0(j2);
        }

        public void i() {
            this.f7717b.n(this.f7716a.f7713b, w.this.f7699d, 0);
        }
    }

    public final class f implements s0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7722b;

        public f(int i2) {
            this.f7722b = i2;
        }

        @Override // c.f.a.b.e3.s0
        public void a() throws RtspMediaSource.b {
            if (w.this.f7708m != null) {
                throw w.this.f7708m;
            }
        }

        @Override // c.f.a.b.e3.s0
        public boolean e() {
            return w.this.N(this.f7722b);
        }

        @Override // c.f.a.b.e3.s0
        public int i(l1 l1Var, c.f.a.b.v2.f fVar, int i2) {
            return w.this.R(this.f7722b, l1Var, fVar, i2);
        }

        @Override // c.f.a.b.e3.s0
        public int p(long j2) {
            return 0;
        }
    }

    public w(c.f.a.b.i3.f fVar, l.a aVar, Uri uri, c cVar, String str) {
        this.f7697b = fVar;
        this.f7704i = aVar;
        this.f7703h = cVar;
        b bVar = new b();
        this.f7699d = bVar;
        this.f7700e = new t(bVar, bVar, str, uri);
        this.f7701f = new ArrayList();
        this.f7702g = new ArrayList();
        this.f7710o = -9223372036854775807L;
    }

    public static c.f.b.b.t<z0> K(c.f.b.b.t<e> tVar) {
        t.a aVar = new t.a();
        for (int i2 = 0; i2 < tVar.size(); i2++) {
            aVar.d(new z0((k1) c.f.a.b.j3.g.e(tVar.get(i2).f7718c.E())));
        }
        return aVar.e();
    }

    public static /* synthetic */ int a(w wVar) {
        int i2 = wVar.t;
        wVar.t = i2 + 1;
        return i2;
    }

    public final m L(Uri uri) {
        for (int i2 = 0; i2 < this.f7701f.size(); i2++) {
            if (!this.f7701f.get(i2).f7719d) {
                d dVar = this.f7701f.get(i2).f7716a;
                if (dVar.b().equals(uri)) {
                    return dVar.f7713b;
                }
            }
        }
        return null;
    }

    @Override // c.f.a.b.e3.f0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public c.f.b.b.t<c.f.a.b.c3.i0> l(List<c.f.a.b.g3.h> list) {
        return c.f.b.b.t.J();
    }

    public boolean N(int i2) {
        return this.f7701f.get(i2).e();
    }

    public final boolean O() {
        return this.f7710o != -9223372036854775807L;
    }

    public final void P() {
        if (this.q || this.r) {
            return;
        }
        for (int i2 = 0; i2 < this.f7701f.size(); i2++) {
            if (this.f7701f.get(i2).f7718c.E() == null) {
                return;
            }
        }
        this.r = true;
        this.f7706k = K(c.f.b.b.t.D(this.f7701f));
        ((f0.a) c.f.a.b.j3.g.e(this.f7705j)).k(this);
    }

    public final void Q() {
        boolean zD = true;
        for (int i2 = 0; i2 < this.f7702g.size(); i2++) {
            zD &= this.f7702g.get(i2).d();
        }
        if (zD && this.s) {
            this.f7700e.J0(this.f7702g);
        }
    }

    public int R(int i2, l1 l1Var, c.f.a.b.v2.f fVar, int i3) {
        return this.f7701f.get(i2).f(l1Var, fVar, i3);
    }

    public void S() {
        for (int i2 = 0; i2 < this.f7701f.size(); i2++) {
            this.f7701f.get(i2).g();
        }
        x0.o(this.f7700e);
        this.q = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void T() {
        this.f7700e.G0();
        l.a aVarB = this.f7704i.b();
        if (aVarB == null) {
            this.f7708m = new RtspMediaSource.b("No fallback data channel factory for TCP retry");
            return;
        }
        ArrayList arrayList = new ArrayList(this.f7701f.size());
        ArrayList arrayList2 = new ArrayList(this.f7702g.size());
        for (int i2 = 0; i2 < this.f7701f.size(); i2++) {
            e eVar = this.f7701f.get(i2);
            if (eVar.f7719d) {
                arrayList.add(eVar);
            } else {
                e eVar2 = new e(eVar.f7716a.f7712a, i2, aVarB);
                arrayList.add(eVar2);
                eVar2.i();
                if (this.f7702g.contains(eVar.f7716a)) {
                    arrayList2.add(eVar2.f7716a);
                }
            }
        }
        c.f.b.b.t tVarD = c.f.b.b.t.D(this.f7701f);
        this.f7701f.clear();
        this.f7701f.addAll(arrayList);
        this.f7702g.clear();
        this.f7702g.addAll(arrayList2);
        for (int i3 = 0; i3 < tVarD.size(); i3++) {
            ((e) tVarD.get(i3)).c();
        }
    }

    public final boolean U(long j2) {
        for (int i2 = 0; i2 < this.f7701f.size(); i2++) {
            if (!this.f7701f.get(i2).f7718c.Y(j2, false)) {
                return false;
            }
        }
        return true;
    }

    public final void V() {
        this.p = true;
        for (int i2 = 0; i2 < this.f7701f.size(); i2++) {
            this.p &= this.f7701f.get(i2).f7719d;
        }
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long b() {
        return g();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean c(long j2) {
        return d();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean d() {
        return !this.p;
    }

    @Override // c.f.a.b.e3.f0
    public long f(long j2, m2 m2Var) {
        return j2;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long g() {
        if (this.p || this.f7701f.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (O()) {
            return this.f7710o;
        }
        long jMin = Long.MAX_VALUE;
        boolean z = true;
        for (int i2 = 0; i2 < this.f7701f.size(); i2++) {
            e eVar = this.f7701f.get(i2);
            if (!eVar.f7719d) {
                jMin = Math.min(jMin, eVar.d());
                z = false;
            }
        }
        return (z || jMin == Long.MIN_VALUE) ? this.f7709n : jMin;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public void h(long j2) {
    }

    @Override // c.f.a.b.e3.f0
    public void n() throws IOException {
        IOException iOException = this.f7707l;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // c.f.a.b.e3.f0
    public long o(long j2) {
        if (O()) {
            return this.f7710o;
        }
        if (U(j2)) {
            return j2;
        }
        this.f7709n = j2;
        this.f7710o = j2;
        this.f7700e.H0(j2);
        for (int i2 = 0; i2 < this.f7701f.size(); i2++) {
            this.f7701f.get(i2).h(j2);
        }
        return j2;
    }

    @Override // c.f.a.b.e3.f0
    public long q() {
        return -9223372036854775807L;
    }

    @Override // c.f.a.b.e3.f0
    public void r(f0.a aVar, long j2) {
        this.f7705j = aVar;
        try {
            this.f7700e.K0();
        } catch (IOException e2) {
            this.f7707l = e2;
            x0.o(this.f7700e);
        }
    }

    @Override // c.f.a.b.e3.f0
    public long s(c.f.a.b.g3.h[] hVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j2) {
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            if (s0VarArr[i2] != null && (hVarArr[i2] == null || !zArr[i2])) {
                s0VarArr[i2] = null;
            }
        }
        this.f7702g.clear();
        for (int i3 = 0; i3 < hVarArr.length; i3++) {
            c.f.a.b.g3.h hVar = hVarArr[i3];
            if (hVar != null) {
                z0 z0VarA = hVar.a();
                int iIndexOf = ((c.f.b.b.t) c.f.a.b.j3.g.e(this.f7706k)).indexOf(z0VarA);
                this.f7702g.add(((e) c.f.a.b.j3.g.e(this.f7701f.get(iIndexOf))).f7716a);
                if (this.f7706k.contains(z0VarA) && s0VarArr[i3] == null) {
                    s0VarArr[i3] = new f(iIndexOf);
                    zArr2[i3] = true;
                }
            }
        }
        for (int i4 = 0; i4 < this.f7701f.size(); i4++) {
            e eVar = this.f7701f.get(i4);
            if (!this.f7702g.contains(eVar.f7716a)) {
                eVar.c();
            }
        }
        this.s = true;
        Q();
        return j2;
    }

    @Override // c.f.a.b.e3.f0
    public a1 t() {
        c.f.a.b.j3.g.g(this.r);
        return new a1((z0[]) ((c.f.b.b.t) c.f.a.b.j3.g.e(this.f7706k)).toArray(new z0[0]));
    }

    @Override // c.f.a.b.e3.f0
    public void v(long j2, boolean z) {
        if (O()) {
            return;
        }
        for (int i2 = 0; i2 < this.f7701f.size(); i2++) {
            e eVar = this.f7701f.get(i2);
            if (!eVar.f7719d) {
                eVar.f7718c.p(j2, z, true);
            }
        }
    }
}
