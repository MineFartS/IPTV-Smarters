package c.f.a.b.i3.p0;

import android.net.Uri;
import c.f.a.b.i3.a0;
import c.f.a.b.i3.j0;
import c.f.a.b.i3.m0;
import c.f.a.b.i3.n;
import c.f.a.b.i3.n0;
import c.f.a.b.i3.p;
import c.f.a.b.i3.p0.b;
import c.f.a.b.i3.p0.c;
import c.f.a.b.i3.z;
import c.f.a.b.j3.k0;
import c.f.a.b.j3.x0;
import com.facebook.ads.AdError;
import java.io.File;
import java.io.InterruptedIOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements c.f.a.b.i3.p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.i3.p0.b f8961b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.i3.p f8962c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.f.a.b.i3.p f8963d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.f.a.b.i3.p f8964e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f8965f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f8966g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f8967h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8968i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f8969j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Uri f8970k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c.f.a.b.i3.s f8971l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c.f.a.b.i3.s f8972m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c.f.a.b.i3.p f8973n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f8974o;
    public long p;
    public long q;
    public j r;
    public boolean s;
    public boolean t;
    public long u;
    public long v;

    public interface b {
        void a(int i2);

        void b(long j2, long j3);
    }

    public static final class c implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.f.a.b.i3.p0.b f8975a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n.a f8977c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f8979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public p.a f8980f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public k0 f8981g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f8982h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f8983i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public b f8984j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p.a f8976b = new a0.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i f8978d = i.f8990a;

        @Override // c.f.a.b.i3.p.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a() {
            p.a aVar = this.f8980f;
            return e(aVar != null ? aVar.a() : null, this.f8983i, this.f8982h);
        }

        public d c() {
            p.a aVar = this.f8980f;
            return e(aVar != null ? aVar.a() : null, this.f8983i | 1, -1000);
        }

        public d d() {
            return e(null, this.f8983i | 1, -1000);
        }

        public final d e(c.f.a.b.i3.p pVar, int i2, int i3) {
            c.f.a.b.i3.n nVarA;
            c.f.a.b.i3.p0.b bVar = (c.f.a.b.i3.p0.b) c.f.a.b.j3.g.e(this.f8975a);
            if (this.f8979e || pVar == null) {
                nVarA = null;
            } else {
                n.a aVar = this.f8977c;
                nVarA = aVar != null ? aVar.a() : new c.b().b(bVar).a();
            }
            return new d(bVar, pVar, this.f8976b.a(), nVarA, this.f8978d, i2, this.f8981g, i3, this.f8984j);
        }

        public c.f.a.b.i3.p0.b f() {
            return this.f8975a;
        }

        public i g() {
            return this.f8978d;
        }

        public k0 h() {
            return this.f8981g;
        }

        public c i(c.f.a.b.i3.p0.b bVar) {
            this.f8975a = bVar;
            return this;
        }

        public c j(n.a aVar) {
            this.f8977c = aVar;
            this.f8979e = aVar == null;
            return this;
        }

        public c k(int i2) {
            this.f8983i = i2;
            return this;
        }

        public c l(p.a aVar) {
            this.f8980f = aVar;
            return this;
        }
    }

    public d(c.f.a.b.i3.p0.b bVar, c.f.a.b.i3.p pVar, c.f.a.b.i3.p pVar2, c.f.a.b.i3.n nVar, i iVar, int i2, k0 k0Var, int i3, b bVar2) {
        this.f8961b = bVar;
        this.f8962c = pVar2;
        this.f8965f = iVar == null ? i.f8990a : iVar;
        this.f8967h = (i2 & 1) != 0;
        this.f8968i = (i2 & 2) != 0;
        this.f8969j = (i2 & 4) != 0;
        m0 m0Var = null;
        if (pVar != null) {
            pVar = k0Var != null ? new j0(pVar, k0Var, i3) : pVar;
            this.f8964e = pVar;
            if (nVar != null) {
                m0Var = new m0(pVar, nVar);
            }
        } else {
            this.f8964e = z.f9143b;
        }
        this.f8963d = m0Var;
        this.f8966g = bVar2;
    }

    public static Uri x(c.f.a.b.i3.p0.b bVar, String str, Uri uri) {
        Uri uriB = n.b(bVar.b(str));
        return uriB != null ? uriB : uri;
    }

    public final boolean A() {
        return this.f8973n == this.f8962c;
    }

    public final boolean B() {
        return !A();
    }

    public final boolean C() {
        return this.f8973n == this.f8963d;
    }

    public final void D() {
        b bVar = this.f8966g;
        if (bVar == null || this.u <= 0) {
            return;
        }
        bVar.b(this.f8961b.j(), this.u);
        this.u = 0L;
    }

    public final void E(int i2) {
        b bVar = this.f8966g;
        if (bVar != null) {
            bVar.a(i2);
        }
    }

    public final void F(c.f.a.b.i3.s sVar, boolean z) throws InterruptedIOException {
        j jVarG;
        long jMin;
        c.f.a.b.i3.s sVarA;
        c.f.a.b.i3.p pVar;
        String str = (String) x0.i(sVar.f9069i);
        if (this.t) {
            jVarG = null;
        } else if (this.f8967h) {
            try {
                jVarG = this.f8961b.g(str, this.p, this.q);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
            }
        } else {
            jVarG = this.f8961b.e(str, this.p, this.q);
        }
        if (jVarG == null) {
            pVar = this.f8964e;
            sVarA = sVar.a().h(this.p).g(this.q).a();
        } else if (jVarG.f8994e) {
            Uri uriFromFile = Uri.fromFile((File) x0.i(jVarG.f8995f));
            long j2 = jVarG.f8992c;
            long j3 = this.p - j2;
            long jMin2 = jVarG.f8993d - j3;
            long j4 = this.q;
            if (j4 != -1) {
                jMin2 = Math.min(jMin2, j4);
            }
            sVarA = sVar.a().i(uriFromFile).k(j2).h(j3).g(jMin2).a();
            pVar = this.f8962c;
        } else {
            if (jVarG.g()) {
                jMin = this.q;
            } else {
                jMin = jVarG.f8993d;
                long j5 = this.q;
                if (j5 != -1) {
                    jMin = Math.min(jMin, j5);
                }
            }
            sVarA = sVar.a().h(this.p).g(jMin).a();
            pVar = this.f8963d;
            if (pVar == null) {
                pVar = this.f8964e;
                this.f8961b.k(jVarG);
                jVarG = null;
            }
        }
        this.v = (this.t || pVar != this.f8964e) ? Long.MAX_VALUE : this.p + 102400;
        if (z) {
            c.f.a.b.j3.g.g(z());
            if (pVar == this.f8964e) {
                return;
            }
            try {
                f();
            } finally {
            }
        }
        if (jVarG != null && jVarG.d()) {
            this.r = jVarG;
        }
        this.f8973n = pVar;
        this.f8972m = sVarA;
        this.f8974o = 0L;
        long jG = pVar.g(sVarA);
        p pVar2 = new p();
        if (sVarA.f9068h == -1 && jG != -1) {
            this.q = jG;
            p.g(pVar2, this.p + jG);
        }
        if (B()) {
            Uri uriA = pVar.a();
            this.f8970k = uriA;
            p.h(pVar2, sVar.f9061a.equals(uriA) ^ true ? this.f8970k : null);
        }
        if (C()) {
            this.f8961b.c(str, pVar2);
        }
    }

    public final void G(String str) {
        this.q = 0L;
        if (C()) {
            p pVar = new p();
            p.g(pVar, this.p);
            this.f8961b.c(str, pVar);
        }
    }

    public final int H(c.f.a.b.i3.s sVar) {
        if (this.f8968i && this.s) {
            return 0;
        }
        return (this.f8969j && sVar.f9068h == -1) ? 1 : -1;
    }

    @Override // c.f.a.b.i3.p
    public Uri a() {
        return this.f8970k;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0079 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:8:0x001e, B:10:0x0026, B:11:0x002a, B:13:0x003a, B:15:0x0040, B:16:0x0046, B:18:0x0057, B:19:0x005b, B:21:0x0061, B:23:0x0067, B:25:0x006d, B:26:0x0079, B:32:0x0085), top: B:37:0x001e }] */
    @Override // c.f.a.b.i3.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int b(byte[] r13, int r14, int r15) {
        /*
            r12 = this;
            c.f.a.b.i3.s r0 = r12.f8971l
            java.lang.Object r0 = c.f.a.b.j3.g.e(r0)
            c.f.a.b.i3.s r0 = (c.f.a.b.i3.s) r0
            c.f.a.b.i3.s r1 = r12.f8972m
            java.lang.Object r1 = c.f.a.b.j3.g.e(r1)
            c.f.a.b.i3.s r1 = (c.f.a.b.i3.s) r1
            r2 = 0
            if (r15 != 0) goto L14
            return r2
        L14:
            long r3 = r12.q
            r5 = -1
            r6 = 0
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L1e
            return r5
        L1e:
            long r3 = r12.p     // Catch: java.lang.Throwable -> L90
            long r8 = r12.v     // Catch: java.lang.Throwable -> L90
            int r10 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r10 < 0) goto L2a
            r3 = 1
            r12.F(r0, r3)     // Catch: java.lang.Throwable -> L90
        L2a:
            c.f.a.b.i3.p r3 = r12.f8973n     // Catch: java.lang.Throwable -> L90
            java.lang.Object r3 = c.f.a.b.j3.g.e(r3)     // Catch: java.lang.Throwable -> L90
            c.f.a.b.i3.p r3 = (c.f.a.b.i3.p) r3     // Catch: java.lang.Throwable -> L90
            int r3 = r3.b(r13, r14, r15)     // Catch: java.lang.Throwable -> L90
            r8 = -1
            if (r3 == r5) goto L5b
            boolean r13 = r12.A()     // Catch: java.lang.Throwable -> L90
            if (r13 == 0) goto L46
            long r13 = r12.u     // Catch: java.lang.Throwable -> L90
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L90
            long r13 = r13 + r0
            r12.u = r13     // Catch: java.lang.Throwable -> L90
        L46:
            long r13 = r12.p     // Catch: java.lang.Throwable -> L90
            long r0 = (long) r3     // Catch: java.lang.Throwable -> L90
            long r13 = r13 + r0
            r12.p = r13     // Catch: java.lang.Throwable -> L90
            long r13 = r12.f8974o     // Catch: java.lang.Throwable -> L90
            long r13 = r13 + r0
            r12.f8974o = r13     // Catch: java.lang.Throwable -> L90
            long r13 = r12.q     // Catch: java.lang.Throwable -> L90
            int r15 = (r13 > r8 ? 1 : (r13 == r8 ? 0 : -1))
            if (r15 == 0) goto L84
            long r13 = r13 - r0
            r12.q = r13     // Catch: java.lang.Throwable -> L90
            goto L84
        L5b:
            boolean r4 = r12.B()     // Catch: java.lang.Throwable -> L90
            if (r4 == 0) goto L79
            long r4 = r1.f9068h     // Catch: java.lang.Throwable -> L90
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 == 0) goto L6d
            long r10 = r12.f8974o     // Catch: java.lang.Throwable -> L90
            int r1 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r1 >= 0) goto L79
        L6d:
            java.lang.String r13 = r0.f9069i     // Catch: java.lang.Throwable -> L90
            java.lang.Object r13 = c.f.a.b.j3.x0.i(r13)     // Catch: java.lang.Throwable -> L90
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Throwable -> L90
            r12.G(r13)     // Catch: java.lang.Throwable -> L90
            goto L84
        L79:
            long r4 = r12.q     // Catch: java.lang.Throwable -> L90
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L85
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L84
            goto L85
        L84:
            return r3
        L85:
            r12.f()     // Catch: java.lang.Throwable -> L90
            r12.F(r0, r2)     // Catch: java.lang.Throwable -> L90
            int r13 = r12.b(r13, r14, r15)     // Catch: java.lang.Throwable -> L90
            return r13
        L90:
            r13 = move-exception
            r12.y(r13)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.i3.p0.d.b(byte[], int, int):int");
    }

    @Override // c.f.a.b.i3.p
    public void close() {
        this.f8971l = null;
        this.f8970k = null;
        this.p = 0L;
        D();
        try {
            f();
        } catch (Throwable th) {
            y(th);
            throw th;
        }
    }

    public final void f() {
        c.f.a.b.i3.p pVar = this.f8973n;
        if (pVar == null) {
            return;
        }
        try {
            pVar.close();
        } finally {
            this.f8972m = null;
            this.f8973n = null;
            j jVar = this.r;
            if (jVar != null) {
                this.f8961b.k(jVar);
                this.r = null;
            }
        }
    }

    @Override // c.f.a.b.i3.p
    public long g(c.f.a.b.i3.s sVar) {
        try {
            String strA = this.f8965f.a(sVar);
            c.f.a.b.i3.s sVarA = sVar.a().f(strA).a();
            this.f8971l = sVarA;
            this.f8970k = x(this.f8961b, strA, sVarA.f9061a);
            this.p = sVar.f9067g;
            int iH = H(sVar);
            boolean z = iH != -1;
            this.t = z;
            if (z) {
                E(iH);
            }
            if (this.t) {
                this.q = -1L;
            } else {
                long jA = n.a(this.f8961b.b(strA));
                this.q = jA;
                if (jA != -1) {
                    long j2 = jA - sVar.f9067g;
                    this.q = j2;
                    if (j2 < 0) {
                        throw new c.f.a.b.i3.q(AdError.REMOTE_ADS_SERVICE_ERROR);
                    }
                }
            }
            long jMin = sVar.f9068h;
            if (jMin != -1) {
                long j3 = this.q;
                if (j3 != -1) {
                    jMin = Math.min(j3, jMin);
                }
                this.q = jMin;
            }
            long j4 = this.q;
            if (j4 > 0 || j4 == -1) {
                F(sVarA, false);
            }
            long j5 = sVar.f9068h;
            return j5 != -1 ? j5 : this.q;
        } catch (Throwable th) {
            y(th);
            throw th;
        }
    }

    @Override // c.f.a.b.i3.p
    public void h(n0 n0Var) {
        c.f.a.b.j3.g.e(n0Var);
        this.f8962c.h(n0Var);
        this.f8964e.h(n0Var);
    }

    @Override // c.f.a.b.i3.p
    public Map<String, List<String>> q() {
        return B() ? this.f8964e.q() : Collections.emptyMap();
    }

    public c.f.a.b.i3.p0.b v() {
        return this.f8961b;
    }

    public i w() {
        return this.f8965f;
    }

    public final void y(Throwable th) {
        if (A() || (th instanceof b.a)) {
            this.s = true;
        }
    }

    public final boolean z() {
        return this.f8973n == this.f8964e;
    }
}
