package c.f.a.b.e3.h1;

import android.net.Uri;
import c.f.a.b.e3.d1.f;
import c.f.a.b.e3.d1.g;
import c.f.a.b.e3.d1.k;
import c.f.a.b.e3.d1.n;
import c.f.a.b.e3.h1.d;
import c.f.a.b.e3.h1.f.a;
import c.f.a.b.g3.h;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.h0;
import c.f.a.b.i3.n0;
import c.f.a.b.i3.p;
import c.f.a.b.i3.s;
import c.f.a.b.k1;
import c.f.a.b.m2;
import c.f.a.b.z2.j0.i;
import c.f.a.b.z2.j0.o;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f7748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g[] f7750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f7751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public h f7752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c.f.a.b.e3.h1.f.a f7753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IOException f7755h;

    public static final class a implements d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p.a f7756a;

        public a(p.a aVar) {
            this.f7756a = aVar;
        }

        @Override // c.f.a.b.e3.h1.d.a
        public d a(h0 h0Var, c.f.a.b.e3.h1.f.a aVar, int i2, h hVar, n0 n0Var) {
            p pVarA = this.f7756a.a();
            if (n0Var != null) {
                pVarA.h(n0Var);
            }
            return new c(h0Var, aVar, i2, hVar, pVarA);
        }
    }

    public static final class b extends c.f.a.b.e3.d1.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a.b f7757e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7758f;

        public b(a.b bVar, int i2, int i3) {
            super(i3, bVar.f7794k - 1);
            this.f7757e = bVar;
            this.f7758f = i2;
        }

        @Override // c.f.a.b.e3.d1.o
        public long a() {
            c();
            return this.f7757e.e((int) d());
        }

        @Override // c.f.a.b.e3.d1.o
        public long b() {
            return a() + this.f7757e.c((int) d());
        }
    }

    public c(h0 h0Var, c.f.a.b.e3.h1.f.a aVar, int i2, h hVar, p pVar) {
        this.f7748a = h0Var;
        this.f7753f = aVar;
        this.f7749b = i2;
        this.f7752e = hVar;
        this.f7751d = pVar;
        a.b bVar = aVar.f7778f[i2];
        this.f7750c = new g[hVar.length()];
        int i3 = 0;
        while (i3 < this.f7750c.length) {
            int iH = hVar.h(i3);
            k1 k1Var = bVar.f7793j[iH];
            c.f.a.b.z2.j0.p[] pVarArr = k1Var.p != null ? ((a.C0128a) c.f.a.b.j3.g.e(aVar.f7777e)).f7783c : null;
            int i4 = bVar.f7784a;
            int i5 = i3;
            this.f7750c[i5] = new c.f.a.b.e3.d1.e(new i(3, null, new o(iH, i4, bVar.f7786c, -9223372036854775807L, aVar.f7779g, k1Var, 0, pVarArr, i4 == 2 ? 4 : 0, null, null)), bVar.f7784a, k1Var);
            i3 = i5 + 1;
        }
    }

    public static n k(k1 k1Var, p pVar, Uri uri, int i2, long j2, long j3, long j4, int i3, Object obj, g gVar) {
        return new k(pVar, new s(uri), k1Var, i3, obj, j2, j3, j4, -9223372036854775807L, i2, 1, j2, gVar);
    }

    @Override // c.f.a.b.e3.d1.j
    public void a() throws IOException {
        IOException iOException = this.f7755h;
        if (iOException != null) {
            throw iOException;
        }
        this.f7748a.a();
    }

    @Override // c.f.a.b.e3.h1.d
    public void b(h hVar) {
        this.f7752e = hVar;
    }

    @Override // c.f.a.b.e3.d1.j
    public boolean c(long j2, f fVar, List<? extends n> list) {
        if (this.f7755h != null) {
            return false;
        }
        return this.f7752e.e(j2, fVar, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    @Override // c.f.a.b.e3.h1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(c.f.a.b.e3.h1.f.a r9) {
        /*
            r8 = this;
            c.f.a.b.e3.h1.f.a r0 = r8.f7753f
            c.f.a.b.e3.h1.f.a$b[] r0 = r0.f7778f
            int r1 = r8.f7749b
            r0 = r0[r1]
            int r2 = r0.f7794k
            c.f.a.b.e3.h1.f.a$b[] r3 = r9.f7778f
            r1 = r3[r1]
            if (r2 == 0) goto L34
            int r3 = r1.f7794k
            if (r3 != 0) goto L15
            goto L34
        L15:
            int r3 = r2 + (-1)
            long r4 = r0.e(r3)
            long r6 = r0.c(r3)
            long r4 = r4 + r6
            r3 = 0
            long r6 = r1.e(r3)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 > 0) goto L2a
            goto L34
        L2a:
            int r1 = r8.f7754g
            int r0 = r0.d(r6)
            int r1 = r1 + r0
            r8.f7754g = r1
            goto L39
        L34:
            int r0 = r8.f7754g
            int r0 = r0 + r2
            r8.f7754g = r0
        L39:
            r8.f7753f = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.h1.c.d(c.f.a.b.e3.h1.f.a):void");
    }

    @Override // c.f.a.b.e3.d1.j
    public long f(long j2, m2 m2Var) {
        a.b bVar = this.f7753f.f7778f[this.f7749b];
        int iD = bVar.d(j2);
        long jE = bVar.e(iD);
        return m2Var.a(j2, jE, (jE >= j2 || iD >= bVar.f7794k + (-1)) ? jE : bVar.e(iD + 1));
    }

    @Override // c.f.a.b.e3.d1.j
    public int g(long j2, List<? extends n> list) {
        return (this.f7755h != null || this.f7752e.length() < 2) ? list.size() : this.f7752e.i(j2, list);
    }

    @Override // c.f.a.b.e3.d1.j
    public void h(f fVar) {
    }

    @Override // c.f.a.b.e3.d1.j
    public boolean i(f fVar, boolean z, f0.c cVar, f0 f0Var) {
        f0.b bVarB = f0Var.b(c.f.a.b.g3.n.a(this.f7752e), cVar);
        if (z && bVarB != null && bVarB.f8864a == 2) {
            h hVar = this.f7752e;
            if (hVar.c(hVar.j(fVar.f7025d), bVarB.f8865b)) {
                return true;
            }
        }
        return false;
    }

    @Override // c.f.a.b.e3.d1.j
    public final void j(long j2, long j3, List<? extends n> list, c.f.a.b.e3.d1.h hVar) {
        int iG;
        long j4 = j3;
        if (this.f7755h != null) {
            return;
        }
        a.b bVar = this.f7753f.f7778f[this.f7749b];
        if (bVar.f7794k == 0) {
            hVar.f7032b = !r4.f7776d;
            return;
        }
        if (list.isEmpty()) {
            iG = bVar.d(j4);
        } else {
            iG = (int) (list.get(list.size() - 1).g() - ((long) this.f7754g));
            if (iG < 0) {
                this.f7755h = new c.f.a.b.e3.o();
                return;
            }
        }
        if (iG >= bVar.f7794k) {
            hVar.f7032b = !this.f7753f.f7776d;
            return;
        }
        long j5 = j4 - j2;
        long jL = l(j2);
        int length = this.f7752e.length();
        c.f.a.b.e3.d1.o[] oVarArr = new c.f.a.b.e3.d1.o[length];
        for (int i2 = 0; i2 < length; i2++) {
            oVarArr[i2] = new b(bVar, this.f7752e.h(i2), iG);
        }
        this.f7752e.k(j2, j5, jL, list, oVarArr);
        long jE = bVar.e(iG);
        long jC = jE + bVar.c(iG);
        if (!list.isEmpty()) {
            j4 = -9223372036854775807L;
        }
        long j6 = j4;
        int i3 = iG + this.f7754g;
        int iB = this.f7752e.b();
        hVar.f7031a = k(this.f7752e.m(), this.f7751d, bVar.a(this.f7752e.h(iB), iG), i3, jE, jC, j6, this.f7752e.n(), this.f7752e.p(), this.f7750c[iB]);
    }

    public final long l(long j2) {
        c.f.a.b.e3.h1.f.a aVar = this.f7753f;
        if (!aVar.f7776d) {
            return -9223372036854775807L;
        }
        a.b bVar = aVar.f7778f[this.f7749b];
        int i2 = bVar.f7794k - 1;
        return (bVar.e(i2) + bVar.c(i2)) - j2;
    }

    @Override // c.f.a.b.e3.d1.j
    public void release() {
        for (g gVar : this.f7750c) {
            gVar.release();
        }
    }
}
