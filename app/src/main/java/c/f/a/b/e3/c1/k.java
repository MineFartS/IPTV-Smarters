package c.f.a.b.e3.c1;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import c.f.a.b.e3.a0;
import c.f.a.b.e3.b0;
import c.f.a.b.e3.c1.h;
import c.f.a.b.e3.c1.j;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.k0;
import c.f.a.b.e3.s;
import c.f.a.b.h3.f0;
import c.f.a.b.i3.n0;
import c.f.a.b.j3.x0;
import c.f.a.b.p1;
import c.f.a.b.p2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends s<i0.a> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final i0.a f6965k = new i0.a(new Object());

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final i0 f6966l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k0 f6967m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j f6968n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f0 f6969o;
    public final c.f.a.b.i3.s p;
    public final Object q;
    public d t;
    public p2 u;
    public h v;
    public final Handler r = new Handler(Looper.getMainLooper());
    public final p2.b s = new p2.b();
    public b[][] w = new b[0][];

    public static final class a extends IOException {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6970b;

        public a(int i2, Exception exc) {
            super(exc);
            this.f6970b = i2;
        }

        public static a a(Exception exc) {
            return new a(0, exc);
        }

        public static a b(Exception exc, int i2) {
            return new a(1, new IOException("Failed to load ad group " + i2, exc));
        }

        public static a c(Exception exc) {
            return new a(2, exc);
        }

        public static a d(RuntimeException runtimeException) {
            return new a(3, runtimeException);
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i0.a f6971a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List<b0> f6972b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f6973c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i0 f6974d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public p2 f6975e;

        public b(i0.a aVar) {
            this.f6971a = aVar;
        }

        public c.f.a.b.e3.f0 a(i0.a aVar, c.f.a.b.i3.f fVar, long j2) {
            b0 b0Var = new b0(aVar, fVar, j2);
            this.f6972b.add(b0Var);
            i0 i0Var = this.f6974d;
            if (i0Var != null) {
                b0Var.y(i0Var);
                b0Var.z(k.this.new c((Uri) c.f.a.b.j3.g.e(this.f6973c)));
            }
            p2 p2Var = this.f6975e;
            if (p2Var != null) {
                b0Var.a(new i0.a(p2Var.m(0), aVar.f7479d));
            }
            return b0Var;
        }

        public long b() {
            p2 p2Var = this.f6975e;
            if (p2Var == null) {
                return -9223372036854775807L;
            }
            return p2Var.f(0, k.this.s).k();
        }

        public void c(p2 p2Var) {
            c.f.a.b.j3.g.a(p2Var.i() == 1);
            if (this.f6975e == null) {
                Object objM = p2Var.m(0);
                for (int i2 = 0; i2 < this.f6972b.size(); i2++) {
                    b0 b0Var = this.f6972b.get(i2);
                    b0Var.a(new i0.a(objM, b0Var.f6910b.f7479d));
                }
            }
            this.f6975e = p2Var;
        }

        public boolean d() {
            return this.f6974d != null;
        }

        public void e(i0 i0Var, Uri uri) {
            this.f6974d = i0Var;
            this.f6973c = uri;
            for (int i2 = 0; i2 < this.f6972b.size(); i2++) {
                b0 b0Var = this.f6972b.get(i2);
                b0Var.y(i0Var);
                b0Var.z(k.this.new c(uri));
            }
            k.this.K(this.f6971a, i0Var);
        }

        public boolean f() {
            return this.f6972b.isEmpty();
        }

        public void g() {
            if (d()) {
                k.this.L(this.f6971a);
            }
        }

        public void h(b0 b0Var) {
            this.f6972b.remove(b0Var);
            b0Var.x();
        }
    }

    public final class c implements b0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f6977a;

        public c(Uri uri) {
            this.f6977a = uri;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void d(i0.a aVar) {
            k.this.f6968n.c(k.this, aVar.f7477b, aVar.f7478c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void f(i0.a aVar, IOException iOException) {
            k.this.f6968n.k(k.this, aVar.f7477b, aVar.f7478c, iOException);
        }

        @Override // c.f.a.b.e3.b0.a
        public void a(final i0.a aVar) {
            k.this.r.post(new Runnable() { // from class: c.f.a.b.e3.c1.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6942b.d(aVar);
                }
            });
        }

        @Override // c.f.a.b.e3.b0.a
        public void b(final i0.a aVar, final IOException iOException) {
            k.this.w(aVar).x(new a0(a0.a(), new c.f.a.b.i3.s(this.f6977a), SystemClock.elapsedRealtime()), 6, a.a(iOException), true);
            k.this.r.post(new Runnable() { // from class: c.f.a.b.e3.c1.d
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6939b.f(aVar, iOException);
                }
            });
        }
    }

    public final class d implements j.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f6979a = x0.x();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile boolean f6980b;

        public d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void f(h hVar) {
            if (this.f6980b) {
                return;
            }
            k.this.c0(hVar);
        }

        @Override // c.f.a.b.e3.c1.j.a
        public void a(final h hVar) {
            if (this.f6980b) {
                return;
            }
            this.f6979a.post(new Runnable() { // from class: c.f.a.b.e3.c1.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6946b.f(hVar);
                }
            });
        }

        @Override // c.f.a.b.e3.c1.j.a
        public /* synthetic */ void b() {
            i.a(this);
        }

        @Override // c.f.a.b.e3.c1.j.a
        public void c(a aVar, c.f.a.b.i3.s sVar) {
            if (this.f6980b) {
                return;
            }
            k.this.w(null).x(new a0(a0.a(), sVar, SystemClock.elapsedRealtime()), 6, aVar, true);
        }

        @Override // c.f.a.b.e3.c1.j.a
        public /* synthetic */ void d() {
            i.b(this);
        }

        public void g() {
            this.f6980b = true;
            this.f6979a.removeCallbacksAndMessages(null);
        }
    }

    public k(i0 i0Var, c.f.a.b.i3.s sVar, Object obj, k0 k0Var, j jVar, f0 f0Var) {
        this.f6966l = i0Var;
        this.f6967m = k0Var;
        this.f6968n = jVar;
        this.f6969o = f0Var;
        this.p = sVar;
        this.q = obj;
        jVar.n(k0Var.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void X(d dVar) {
        this.f6968n.j(this, this.p, this.q, this.f6969o, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void Z(d dVar) {
        this.f6968n.m(this, dVar);
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.n
    public void B(n0 n0Var) {
        super.B(n0Var);
        final d dVar = new d();
        this.t = dVar;
        K(f6965k, this.f6966l);
        this.r.post(new Runnable() { // from class: c.f.a.b.e3.c1.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f6937b.X(dVar);
            }
        });
    }

    @Override // c.f.a.b.e3.s, c.f.a.b.e3.n
    public void D() {
        super.D();
        final d dVar = (d) c.f.a.b.j3.g.e(this.t);
        this.t = null;
        dVar.g();
        this.u = null;
        this.v = null;
        this.w = new b[0][];
        this.r.post(new Runnable() { // from class: c.f.a.b.e3.c1.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f6944b.Z(dVar);
            }
        });
    }

    public final long[][] U() {
        long[][] jArr = new long[this.w.length][];
        int i2 = 0;
        while (true) {
            b[][] bVarArr = this.w;
            if (i2 >= bVarArr.length) {
                return jArr;
            }
            jArr[i2] = new long[bVarArr[i2].length];
            int i3 = 0;
            while (true) {
                b[][] bVarArr2 = this.w;
                if (i3 < bVarArr2[i2].length) {
                    b bVar = bVarArr2[i2][i3];
                    jArr[i2][i3] = bVar == null ? -9223372036854775807L : bVar.b();
                    i3++;
                }
            }
            i2++;
        }
    }

    @Override // c.f.a.b.e3.s
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public i0.a E(i0.a aVar, i0.a aVar2) {
        return aVar.b() ? aVar : aVar2;
    }

    @Override // c.f.a.b.e3.i0
    public c.f.a.b.e3.f0 a(i0.a aVar, c.f.a.b.i3.f fVar, long j2) {
        if (((h) c.f.a.b.j3.g.e(this.v)).f6952e <= 0 || !aVar.b()) {
            b0 b0Var = new b0(aVar, fVar, j2);
            b0Var.y(this.f6966l);
            b0Var.a(aVar);
            return b0Var;
        }
        int i2 = aVar.f7477b;
        int i3 = aVar.f7478c;
        b[][] bVarArr = this.w;
        if (bVarArr[i2].length <= i3) {
            bVarArr[i2] = (b[]) Arrays.copyOf(bVarArr[i2], i3 + 1);
        }
        b bVar = this.w[i2][i3];
        if (bVar == null) {
            bVar = new b(aVar);
            this.w[i2][i3] = bVar;
            a0();
        }
        return bVar.a(aVar, fVar, j2);
    }

    public final void a0() {
        Uri uri;
        p1.e eVar;
        h hVar = this.v;
        if (hVar == null) {
            return;
        }
        for (int i2 = 0; i2 < this.w.length; i2++) {
            int i3 = 0;
            while (true) {
                b[][] bVarArr = this.w;
                if (i3 < bVarArr[i2].length) {
                    b bVar = bVarArr[i2][i3];
                    h.a aVarB = hVar.b(i2);
                    if (bVar != null && !bVar.d()) {
                        Uri[] uriArr = aVarB.f6960d;
                        if (i3 < uriArr.length && (uri = uriArr[i3]) != null) {
                            p1.c cVarB = new p1.c().B(uri);
                            p1.g gVar = this.f6966l.h().f9643d;
                            if (gVar != null && (eVar = gVar.f9687c) != null) {
                                cVarB.p(eVar.f9670a);
                                cVarB.i(eVar.a());
                                cVarB.k(eVar.f9671b);
                                cVarB.h(eVar.f9675f);
                                cVarB.j(eVar.f9672c);
                                cVarB.m(eVar.f9673d);
                                cVarB.n(eVar.f9674e);
                                cVarB.o(eVar.f9676g);
                            }
                            bVar.e(this.f6967m.a(cVarB.a()), uri);
                        }
                    }
                    i3++;
                }
            }
        }
    }

    public final void b0() {
        p2 p2Var = this.u;
        h hVar = this.v;
        if (hVar == null || p2Var == null) {
            return;
        }
        if (hVar.f6952e == 0) {
            C(p2Var);
        } else {
            this.v = hVar.h(U());
            C(new l(p2Var, this.v));
        }
    }

    public final void c0(h hVar) {
        h hVar2 = this.v;
        if (hVar2 == null) {
            b[][] bVarArr = new b[hVar.f6952e][];
            this.w = bVarArr;
            Arrays.fill(bVarArr, new b[0]);
        } else {
            c.f.a.b.j3.g.g(hVar.f6952e == hVar2.f6952e);
        }
        this.v = hVar;
        a0();
        b0();
    }

    @Override // c.f.a.b.e3.s
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public void I(i0.a aVar, i0 i0Var, p2 p2Var) {
        if (aVar.b()) {
            ((b) c.f.a.b.j3.g.e(this.w[aVar.f7477b][aVar.f7478c])).c(p2Var);
        } else {
            c.f.a.b.j3.g.a(p2Var.i() == 1);
            this.u = p2Var;
        }
        b0();
    }

    @Override // c.f.a.b.e3.i0
    public p1 h() {
        return this.f6966l.h();
    }

    @Override // c.f.a.b.e3.i0
    public void o(c.f.a.b.e3.f0 f0Var) {
        b0 b0Var = (b0) f0Var;
        i0.a aVar = b0Var.f6910b;
        if (!aVar.b()) {
            b0Var.x();
            return;
        }
        b bVar = (b) c.f.a.b.j3.g.e(this.w[aVar.f7477b][aVar.f7478c]);
        bVar.h(b0Var);
        if (bVar.f()) {
            bVar.g();
            this.w[aVar.f7477b][aVar.f7478c] = null;
        }
    }
}
