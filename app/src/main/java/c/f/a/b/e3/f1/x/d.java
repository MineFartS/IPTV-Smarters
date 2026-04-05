package c.f.a.b.e3.f1.x;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import c.f.a.b.e3.a0;
import c.f.a.b.e3.d0;
import c.f.a.b.e3.f1.x.f;
import c.f.a.b.e3.f1.x.g;
import c.f.a.b.e3.f1.x.i;
import c.f.a.b.e3.f1.x.k;
import c.f.a.b.e3.j0;
import c.f.a.b.i3.c0;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.g0;
import c.f.a.b.i3.i0;
import c.f.a.b.i3.p;
import c.f.a.b.j3.x0;
import c.f.a.b.w0;
import c.f.a.b.w1;
import c.f.b.b.y;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements k, g0.b<i0<h>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k.a f7366b = new k.a() { // from class: c.f.a.b.e3.f1.x.b
        @Override // c.f.a.b.e3.f1.x.k.a
        public final k a(c.f.a.b.e3.f1.k kVar, f0 f0Var, j jVar) {
            return new d(kVar, f0Var, jVar);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.e3.f1.k f7367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f7368d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f0 f7369e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap<Uri, c> f7370f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CopyOnWriteArrayList<k.b> f7371g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final double f7372h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j0.a f7373i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public g0 f7374j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Handler f7375k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k.e f7376l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f7377m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Uri f7378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public g f7379o;
    public boolean p;
    public long q;

    public class b implements k.b {
        public b() {
        }

        @Override // c.f.a.b.e3.f1.x.k.b
        public void a() {
            d.this.f7371g.remove(this);
        }

        @Override // c.f.a.b.e3.f1.x.k.b
        public boolean e(Uri uri, f0.c cVar, boolean z) {
            c cVar2;
            if (d.this.f7379o == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List<f.b> list = ((f) x0.i(d.this.f7377m)).f7396f;
                int i2 = 0;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    c cVar3 = (c) d.this.f7370f.get(list.get(i3).f7409a);
                    if (cVar3 != null && jElapsedRealtime < cVar3.f7388i) {
                        i2++;
                    }
                }
                f0.b bVarB = d.this.f7369e.b(new f0.a(1, 0, d.this.f7377m.f7396f.size(), i2), cVar);
                if (bVarB != null && bVarB.f8864a == 2 && (cVar2 = (c) d.this.f7370f.get(uri)) != null) {
                    cVar2.g(bVarB.f8865b);
                }
            }
            return false;
        }
    }

    public final class c implements g0.b<i0<h>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f7381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g0 f7382c = new g0("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final p f7383d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public g f7384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f7385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f7386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f7387h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public long f7388i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f7389j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public IOException f7390k;

        public c(Uri uri) {
            this.f7381b = uri;
            this.f7383d = d.this.f7367c.a(4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void n(Uri uri) {
            this.f7389j = false;
            p(uri);
        }

        public final boolean g(long j2) {
            this.f7388i = SystemClock.elapsedRealtime() + j2;
            return this.f7381b.equals(d.this.f7378n) && !d.this.L();
        }

        public final Uri h() {
            g gVar = this.f7384e;
            if (gVar != null) {
                g.f fVar = gVar.v;
                if (fVar.f7445a != -9223372036854775807L || fVar.f7449e) {
                    Uri.Builder builderBuildUpon = this.f7381b.buildUpon();
                    g gVar2 = this.f7384e;
                    if (gVar2.v.f7449e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(gVar2.f7422k + ((long) gVar2.r.size())));
                        g gVar3 = this.f7384e;
                        if (gVar3.f7425n != -9223372036854775807L) {
                            List<g.b> list = gVar3.s;
                            int size = list.size();
                            if (!list.isEmpty() && ((g.b) y.c(list)).f7428n) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    g.f fVar2 = this.f7384e.v;
                    if (fVar2.f7445a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", fVar2.f7446b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f7381b;
        }

        public g i() {
            return this.f7384e;
        }

        public boolean j() {
            int i2;
            if (this.f7384e == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, w0.e(this.f7384e.u));
            g gVar = this.f7384e;
            return gVar.f7426o || (i2 = gVar.f7415d) == 2 || i2 == 1 || this.f7385f + jMax > jElapsedRealtime;
        }

        public void o() {
            q(this.f7381b);
        }

        public final void p(Uri uri) {
            i0 i0Var = new i0(this.f7383d, uri, 4, d.this.f7368d.a(d.this.f7377m, this.f7384e));
            d.this.f7373i.z(new a0(i0Var.f8899a, i0Var.f8900b, this.f7382c.n(i0Var, this, d.this.f7369e.d(i0Var.f8901c))), i0Var.f8901c);
        }

        public final void q(final Uri uri) {
            this.f7388i = 0L;
            if (this.f7389j || this.f7382c.j() || this.f7382c.i()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f7387h) {
                p(uri);
            } else {
                this.f7389j = true;
                d.this.f7375k.postDelayed(new Runnable() { // from class: c.f.a.b.e3.f1.x.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f7363b.n(uri);
                    }
                }, this.f7387h - jElapsedRealtime);
            }
        }

        public void r() throws IOException {
            this.f7382c.a();
            IOException iOException = this.f7390k;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void k(i0<h> i0Var, long j2, long j3, boolean z) {
            a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
            d.this.f7369e.c(i0Var.f8899a);
            d.this.f7373i.q(a0Var, 4);
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void m(i0<h> i0Var, long j2, long j3) {
            h hVarE = i0Var.e();
            a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
            if (hVarE instanceof g) {
                w((g) hVarE, a0Var);
                d.this.f7373i.t(a0Var, 4);
            } else {
                this.f7390k = w1.c("Loaded playlist has unexpected type.", null);
                d.this.f7373i.x(a0Var, 4, this.f7390k, true);
            }
            d.this.f7369e.c(i0Var.f8899a);
        }

        @Override // c.f.a.b.i3.g0.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public g0.c u(i0<h> i0Var, long j2, long j3, IOException iOException, int i2) {
            g0.c cVarH;
            a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
            boolean z = iOException instanceof i.a;
            if ((i0Var.f().getQueryParameter("_HLS_msn") != null) || z) {
                int i3 = iOException instanceof c0.e ? ((c0.e) iOException).f8849e : Integer.MAX_VALUE;
                if (z || i3 == 400 || i3 == 503) {
                    this.f7387h = SystemClock.elapsedRealtime();
                    o();
                    ((j0.a) x0.i(d.this.f7373i)).x(a0Var, i0Var.f8901c, iOException, true);
                    return g0.f8877c;
                }
            }
            f0.c cVar = new f0.c(a0Var, new d0(i0Var.f8901c), iOException, i2);
            if (d.this.N(this.f7381b, cVar, false)) {
                long jA = d.this.f7369e.a(cVar);
                cVarH = jA != -9223372036854775807L ? g0.h(false, jA) : g0.f8878d;
            } else {
                cVarH = g0.f8877c;
            }
            boolean zC = true ^ cVarH.c();
            d.this.f7373i.x(a0Var, i0Var.f8901c, iOException, zC);
            if (zC) {
                d.this.f7369e.c(i0Var.f8899a);
            }
            return cVarH;
        }

        public final void w(g gVar, a0 a0Var) {
            IOException dVar;
            boolean z;
            g gVar2 = this.f7384e;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f7385f = jElapsedRealtime;
            g gVarG = d.this.G(gVar2, gVar);
            this.f7384e = gVarG;
            if (gVarG != gVar2) {
                this.f7390k = null;
                this.f7386g = jElapsedRealtime;
                d.this.R(this.f7381b, gVarG);
            } else if (!gVarG.f7426o) {
                long size = gVar.f7422k + ((long) gVar.r.size());
                g gVar3 = this.f7384e;
                if (size < gVar3.f7422k) {
                    dVar = new k.c(this.f7381b);
                    z = true;
                } else {
                    double d2 = jElapsedRealtime - this.f7386g;
                    double dE = w0.e(gVar3.f7424m);
                    double d3 = d.this.f7372h;
                    Double.isNaN(dE);
                    dVar = d2 > dE * d3 ? new k.d(this.f7381b) : null;
                    z = false;
                }
                if (dVar != null) {
                    this.f7390k = dVar;
                    d.this.N(this.f7381b, new f0.c(a0Var, new d0(4), dVar, 1), z);
                }
            }
            long j2 = 0;
            g gVar4 = this.f7384e;
            if (!gVar4.v.f7449e) {
                j2 = gVar4.f7424m;
                if (gVar4 == gVar2) {
                    j2 /= 2;
                }
            }
            this.f7387h = jElapsedRealtime + w0.e(j2);
            if (!(this.f7384e.f7425n != -9223372036854775807L || this.f7381b.equals(d.this.f7378n)) || this.f7384e.f7426o) {
                return;
            }
            q(h());
        }

        public void x() {
            this.f7382c.l();
        }
    }

    public d(c.f.a.b.e3.f1.k kVar, f0 f0Var, j jVar) {
        this(kVar, f0Var, jVar, 3.5d);
    }

    public d(c.f.a.b.e3.f1.k kVar, f0 f0Var, j jVar, double d2) {
        this.f7367c = kVar;
        this.f7368d = jVar;
        this.f7369e = f0Var;
        this.f7372h = d2;
        this.f7371g = new CopyOnWriteArrayList<>();
        this.f7370f = new HashMap<>();
        this.q = -9223372036854775807L;
    }

    public static g.d F(g gVar, g gVar2) {
        int i2 = (int) (gVar2.f7422k - gVar.f7422k);
        List<g.d> list = gVar.r;
        if (i2 < list.size()) {
            return list.get(i2);
        }
        return null;
    }

    public final void E(List<Uri> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Uri uri = list.get(i2);
            this.f7370f.put(uri, new c(uri));
        }
    }

    public final g G(g gVar, g gVar2) {
        return !gVar2.f(gVar) ? gVar2.f7426o ? gVar.d() : gVar : gVar2.c(I(gVar, gVar2), H(gVar, gVar2));
    }

    public final int H(g gVar, g gVar2) {
        g.d dVarF;
        if (gVar2.f7420i) {
            return gVar2.f7421j;
        }
        g gVar3 = this.f7379o;
        int i2 = gVar3 != null ? gVar3.f7421j : 0;
        return (gVar == null || (dVarF = F(gVar, gVar2)) == null) ? i2 : (gVar.f7421j + dVarF.f7437e) - gVar2.r.get(0).f7437e;
    }

    public final long I(g gVar, g gVar2) {
        if (gVar2.p) {
            return gVar2.f7419h;
        }
        g gVar3 = this.f7379o;
        long j2 = gVar3 != null ? gVar3.f7419h : 0L;
        if (gVar == null) {
            return j2;
        }
        int size = gVar.r.size();
        g.d dVarF = F(gVar, gVar2);
        return dVarF != null ? gVar.f7419h + dVarF.f7438f : ((long) size) == gVar2.f7422k - gVar.f7422k ? gVar.e() : j2;
    }

    public final Uri J(Uri uri) {
        g.c cVar;
        g gVar = this.f7379o;
        if (gVar == null || !gVar.v.f7449e || (cVar = gVar.t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar.f7430b));
        int i2 = cVar.f7431c;
        if (i2 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i2));
        }
        return builderBuildUpon.build();
    }

    public final boolean K(Uri uri) {
        List<f.b> list = this.f7377m.f7396f;
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (uri.equals(list.get(i2).f7409a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean L() {
        List<f.b> list = this.f7377m.f7396f;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i2 = 0; i2 < size; i2++) {
            c cVar = (c) c.f.a.b.j3.g.e(this.f7370f.get(list.get(i2).f7409a));
            if (jElapsedRealtime > cVar.f7388i) {
                Uri uri = cVar.f7381b;
                this.f7378n = uri;
                cVar.q(J(uri));
                return true;
            }
        }
        return false;
    }

    public final void M(Uri uri) {
        if (uri.equals(this.f7378n) || !K(uri)) {
            return;
        }
        g gVar = this.f7379o;
        if (gVar == null || !gVar.f7426o) {
            this.f7378n = uri;
            c cVar = this.f7370f.get(uri);
            g gVar2 = cVar.f7384e;
            if (gVar2 == null || !gVar2.f7426o) {
                cVar.q(J(uri));
            } else {
                this.f7379o = gVar2;
                this.f7376l.c(gVar2);
            }
        }
    }

    public final boolean N(Uri uri, f0.c cVar, boolean z) {
        Iterator<k.b> it = this.f7371g.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= !it.next().e(uri, cVar, z);
        }
        return z2;
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public void k(i0<h> i0Var, long j2, long j3, boolean z) {
        a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
        this.f7369e.c(i0Var.f8899a);
        this.f7373i.q(a0Var, 4);
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void m(i0<h> i0Var, long j2, long j3) {
        h hVarE = i0Var.e();
        boolean z = hVarE instanceof g;
        f fVarE = z ? f.e(hVarE.f7450a) : (f) hVarE;
        this.f7377m = fVarE;
        this.f7378n = fVarE.f7396f.get(0).f7409a;
        this.f7371g.add(new b());
        E(fVarE.f7395e);
        a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
        c cVar = this.f7370f.get(this.f7378n);
        if (z) {
            cVar.w((g) hVarE, a0Var);
        } else {
            cVar.o();
        }
        this.f7369e.c(i0Var.f8899a);
        this.f7373i.t(a0Var, 4);
    }

    @Override // c.f.a.b.i3.g0.b
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public g0.c u(i0<h> i0Var, long j2, long j3, IOException iOException, int i2) {
        a0 a0Var = new a0(i0Var.f8899a, i0Var.f8900b, i0Var.f(), i0Var.d(), j2, j3, i0Var.b());
        long jA = this.f7369e.a(new f0.c(a0Var, new d0(i0Var.f8901c), iOException, i2));
        boolean z = jA == -9223372036854775807L;
        this.f7373i.x(a0Var, i0Var.f8901c, iOException, z);
        if (z) {
            this.f7369e.c(i0Var.f8899a);
        }
        return z ? g0.f8878d : g0.h(false, jA);
    }

    public final void R(Uri uri, g gVar) {
        if (uri.equals(this.f7378n)) {
            if (this.f7379o == null) {
                this.p = !gVar.f7426o;
                this.q = gVar.f7419h;
            }
            this.f7379o = gVar;
            this.f7376l.c(gVar);
        }
        Iterator<k.b> it = this.f7371g.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // c.f.a.b.e3.f1.x.k
    public boolean a(Uri uri) {
        return this.f7370f.get(uri).j();
    }

    @Override // c.f.a.b.e3.f1.x.k
    public void b(k.b bVar) {
        this.f7371g.remove(bVar);
    }

    @Override // c.f.a.b.e3.f1.x.k
    public void c(Uri uri) throws IOException {
        this.f7370f.get(uri).r();
    }

    @Override // c.f.a.b.e3.f1.x.k
    public long d() {
        return this.q;
    }

    @Override // c.f.a.b.e3.f1.x.k
    public boolean e() {
        return this.p;
    }

    @Override // c.f.a.b.e3.f1.x.k
    public boolean f(Uri uri, long j2) {
        if (this.f7370f.get(uri) != null) {
            return !r2.g(j2);
        }
        return false;
    }

    @Override // c.f.a.b.e3.f1.x.k
    public f g() {
        return this.f7377m;
    }

    @Override // c.f.a.b.e3.f1.x.k
    public void h(Uri uri, j0.a aVar, k.e eVar) {
        this.f7375k = x0.x();
        this.f7373i = aVar;
        this.f7376l = eVar;
        i0 i0Var = new i0(this.f7367c.a(4), uri, 4, this.f7368d.b());
        c.f.a.b.j3.g.g(this.f7374j == null);
        g0 g0Var = new g0("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.f7374j = g0Var;
        aVar.z(new a0(i0Var.f8899a, i0Var.f8900b, g0Var.n(i0Var, this, this.f7369e.d(i0Var.f8901c))), i0Var.f8901c);
    }

    @Override // c.f.a.b.e3.f1.x.k
    public void i() throws IOException {
        g0 g0Var = this.f7374j;
        if (g0Var != null) {
            g0Var.a();
        }
        Uri uri = this.f7378n;
        if (uri != null) {
            c(uri);
        }
    }

    @Override // c.f.a.b.e3.f1.x.k
    public void j(Uri uri) {
        this.f7370f.get(uri).o();
    }

    @Override // c.f.a.b.e3.f1.x.k
    public void l(k.b bVar) {
        c.f.a.b.j3.g.e(bVar);
        this.f7371g.add(bVar);
    }

    @Override // c.f.a.b.e3.f1.x.k
    public g n(Uri uri, boolean z) {
        g gVarI = this.f7370f.get(uri).i();
        if (gVarI != null && z) {
            M(uri);
        }
        return gVarI;
    }

    @Override // c.f.a.b.e3.f1.x.k
    public void stop() {
        this.f7378n = null;
        this.f7379o = null;
        this.f7377m = null;
        this.q = -9223372036854775807L;
        this.f7374j.l();
        this.f7374j = null;
        Iterator<c> it = this.f7370f.values().iterator();
        while (it.hasNext()) {
            it.next().x();
        }
        this.f7375k.removeCallbacksAndMessages(null);
        this.f7375k = null;
        this.f7370f.clear();
    }
}
