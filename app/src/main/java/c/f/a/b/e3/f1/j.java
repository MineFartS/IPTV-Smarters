package c.f.a.b.e3.f1;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import c.f.a.b.e3.f1.x.g;
import c.f.a.b.e3.z0;
import c.f.a.b.i3.n0;
import c.f.a.b.i3.s;
import c.f.a.b.j3.w0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.b.b.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f7271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.b.i3.p f7272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.i3.p f7273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f7274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f7275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k1[] f7276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c.f.a.b.e3.f1.x.k f7277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z0 f7278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<k1> f7279i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7281k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IOException f7283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Uri f7284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f7285o;
    public c.f.a.b.g3.h p;
    public boolean r;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i f7280j = new i(4);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public byte[] f7282l = x0.f9301f;
    public long q = -9223372036854775807L;

    public static final class a extends c.f.a.b.e3.d1.l {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f7286l;

        public a(c.f.a.b.i3.p pVar, c.f.a.b.i3.s sVar, k1 k1Var, int i2, Object obj, byte[] bArr) {
            super(pVar, sVar, 3, k1Var, i2, obj, bArr);
        }

        @Override // c.f.a.b.e3.d1.l
        public void g(byte[] bArr, int i2) {
            this.f7286l = Arrays.copyOf(bArr, i2);
        }

        public byte[] j() {
            return this.f7286l;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public c.f.a.b.e3.d1.f f7287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f7288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f7289c;

        public b() {
            a();
        }

        public void a() {
            this.f7287a = null;
            this.f7288b = false;
            this.f7289c = null;
        }
    }

    public static final class c extends c.f.a.b.e3.d1.c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<g.e> f7290e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f7291f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f7292g;

        public c(String str, long j2, List<g.e> list) {
            super(0L, list.size() - 1);
            this.f7292g = str;
            this.f7291f = j2;
            this.f7290e = list;
        }

        @Override // c.f.a.b.e3.d1.o
        public long a() {
            c();
            return this.f7291f + this.f7290e.get((int) d()).f7438f;
        }

        @Override // c.f.a.b.e3.d1.o
        public long b() {
            c();
            g.e eVar = this.f7290e.get((int) d());
            return this.f7291f + eVar.f7438f + eVar.f7436d;
        }
    }

    public static final class d extends c.f.a.b.g3.e {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7293h;

        public d(z0 z0Var, int[] iArr) {
            super(z0Var, iArr);
            this.f7293h = j(z0Var.b(iArr[0]));
        }

        @Override // c.f.a.b.g3.h
        public int b() {
            return this.f7293h;
        }

        @Override // c.f.a.b.g3.h
        public void k(long j2, long j3, long j4, List<? extends c.f.a.b.e3.d1.n> list, c.f.a.b.e3.d1.o[] oVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (d(this.f7293h, jElapsedRealtime)) {
                for (int i2 = this.f8428b - 1; i2 >= 0; i2--) {
                    if (!d(i2, jElapsedRealtime)) {
                        this.f7293h = i2;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // c.f.a.b.g3.h
        public int n() {
            return 0;
        }

        @Override // c.f.a.b.g3.h
        public Object p() {
            return null;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g.e f7294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f7297d;

        public e(g.e eVar, long j2, int i2) {
            this.f7294a = eVar;
            this.f7295b = j2;
            this.f7296c = i2;
            this.f7297d = (eVar instanceof g.b) && ((g.b) eVar).f7428n;
        }
    }

    public j(l lVar, c.f.a.b.e3.f1.x.k kVar, Uri[] uriArr, k1[] k1VarArr, k kVar2, n0 n0Var, u uVar, List<k1> list) {
        this.f7271a = lVar;
        this.f7277g = kVar;
        this.f7275e = uriArr;
        this.f7276f = k1VarArr;
        this.f7274d = uVar;
        this.f7279i = list;
        c.f.a.b.i3.p pVarA = kVar2.a(1);
        this.f7272b = pVarA;
        if (n0Var != null) {
            pVarA.h(n0Var);
        }
        this.f7273c = kVar2.a(3);
        this.f7278h = new z0(k1VarArr);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < uriArr.length; i2++) {
            if ((k1VarArr[i2].f9331f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        this.p = new d(this.f7278h, c.f.b.f.c.j(arrayList));
    }

    public static Uri c(c.f.a.b.e3.f1.x.g gVar, g.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f7440h) == null) {
            return null;
        }
        return w0.e(gVar.f7450a, str);
    }

    public static e f(c.f.a.b.e3.f1.x.g gVar, long j2, int i2) {
        int i3 = (int) (j2 - gVar.f7422k);
        if (i3 == gVar.r.size()) {
            if (i2 == -1) {
                i2 = 0;
            }
            if (i2 < gVar.s.size()) {
                return new e(gVar.s.get(i2), j2, i2);
            }
            return null;
        }
        g.d dVar = gVar.r.get(i3);
        if (i2 == -1) {
            return new e(dVar, j2, -1);
        }
        if (i2 < dVar.f7433n.size()) {
            return new e(dVar.f7433n.get(i2), j2, i2);
        }
        int i4 = i3 + 1;
        if (i4 < gVar.r.size()) {
            return new e(gVar.r.get(i4), j2 + 1, -1);
        }
        if (gVar.s.isEmpty()) {
            return null;
        }
        return new e(gVar.s.get(0), j2 + 1, 0);
    }

    public static List<g.e> h(c.f.a.b.e3.f1.x.g gVar, long j2, int i2) {
        int i3 = (int) (j2 - gVar.f7422k);
        if (i3 < 0 || gVar.r.size() < i3) {
            return c.f.b.b.t.J();
        }
        ArrayList arrayList = new ArrayList();
        if (i3 < gVar.r.size()) {
            if (i2 != -1) {
                g.d dVar = gVar.r.get(i3);
                if (i2 == 0) {
                    arrayList.add(dVar);
                } else if (i2 < dVar.f7433n.size()) {
                    List<g.b> list = dVar.f7433n;
                    arrayList.addAll(list.subList(i2, list.size()));
                }
                i3++;
            }
            List<g.d> list2 = gVar.r;
            arrayList.addAll(list2.subList(i3, list2.size()));
            i2 = 0;
        }
        if (gVar.f7425n != -9223372036854775807L) {
            int i4 = i2 != -1 ? i2 : 0;
            if (i4 < gVar.s.size()) {
                List<g.b> list3 = gVar.s;
                arrayList.addAll(list3.subList(i4, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public c.f.a.b.e3.d1.o[] a(n nVar, long j2) {
        int i2;
        int iC = nVar == null ? -1 : this.f7278h.c(nVar.f7025d);
        int length = this.p.length();
        c.f.a.b.e3.d1.o[] oVarArr = new c.f.a.b.e3.d1.o[length];
        boolean z = false;
        int i3 = 0;
        while (i3 < length) {
            int iH = this.p.h(i3);
            Uri uri = this.f7275e[iH];
            if (this.f7277g.a(uri)) {
                c.f.a.b.e3.f1.x.g gVarN = this.f7277g.n(uri, z);
                c.f.a.b.j3.g.e(gVarN);
                long jD = gVarN.f7419h - this.f7277g.d();
                i2 = i3;
                Pair<Long, Integer> pairE = e(nVar, iH != iC, gVarN, jD, j2);
                oVarArr[i2] = new c(gVarN.f7450a, jD, h(gVarN, ((Long) pairE.first).longValue(), ((Integer) pairE.second).intValue()));
            } else {
                oVarArr[i3] = c.f.a.b.e3.d1.o.f7060a;
                i2 = i3;
            }
            i3 = i2 + 1;
            z = false;
        }
        return oVarArr;
    }

    public int b(n nVar) {
        if (nVar.p == -1) {
            return 1;
        }
        c.f.a.b.e3.f1.x.g gVar = (c.f.a.b.e3.f1.x.g) c.f.a.b.j3.g.e(this.f7277g.n(this.f7275e[this.f7278h.c(nVar.f7025d)], false));
        int i2 = (int) (nVar.f7059j - gVar.f7422k);
        if (i2 < 0) {
            return 1;
        }
        List<g.b> list = i2 < gVar.r.size() ? gVar.r.get(i2).f7433n : gVar.s;
        if (nVar.p >= list.size()) {
            return 2;
        }
        g.b bVar = list.get(nVar.p);
        if (bVar.f7428n) {
            return 0;
        }
        return x0.b(Uri.parse(w0.d(gVar.f7450a, bVar.f7434b)), nVar.f7023b.f9061a) ? 1 : 2;
    }

    public void d(long j2, long j3, List<n> list, boolean z, b bVar) {
        c.f.a.b.e3.f1.x.g gVar;
        long jD;
        Uri uri;
        int i2;
        n nVar = list.isEmpty() ? null : (n) y.c(list);
        int iC = nVar == null ? -1 : this.f7278h.c(nVar.f7025d);
        long jMax = j3 - j2;
        long jR = r(j2);
        if (nVar != null && !this.f7285o) {
            long jD2 = nVar.d();
            jMax = Math.max(0L, jMax - jD2);
            if (jR != -9223372036854775807L) {
                jR = Math.max(0L, jR - jD2);
            }
        }
        this.p.k(j2, jMax, jR, list, a(nVar, j3));
        int iL = this.p.l();
        boolean z2 = iC != iL;
        Uri uri2 = this.f7275e[iL];
        if (!this.f7277g.a(uri2)) {
            bVar.f7289c = uri2;
            this.r &= uri2.equals(this.f7284n);
            this.f7284n = uri2;
            return;
        }
        c.f.a.b.e3.f1.x.g gVarN = this.f7277g.n(uri2, true);
        c.f.a.b.j3.g.e(gVarN);
        this.f7285o = gVarN.f7452c;
        v(gVarN);
        long jD3 = gVarN.f7419h - this.f7277g.d();
        Pair<Long, Integer> pairE = e(nVar, z2, gVarN, jD3, j3);
        long jLongValue = ((Long) pairE.first).longValue();
        int iIntValue = ((Integer) pairE.second).intValue();
        if (jLongValue >= gVarN.f7422k || nVar == null || !z2) {
            gVar = gVarN;
            jD = jD3;
            uri = uri2;
            i2 = iL;
        } else {
            Uri uri3 = this.f7275e[iC];
            c.f.a.b.e3.f1.x.g gVarN2 = this.f7277g.n(uri3, true);
            c.f.a.b.j3.g.e(gVarN2);
            jD = gVarN2.f7419h - this.f7277g.d();
            Pair<Long, Integer> pairE2 = e(nVar, false, gVarN2, jD, j3);
            jLongValue = ((Long) pairE2.first).longValue();
            iIntValue = ((Integer) pairE2.second).intValue();
            i2 = iC;
            uri = uri3;
            gVar = gVarN2;
        }
        if (jLongValue < gVar.f7422k) {
            this.f7283m = new c.f.a.b.e3.o();
            return;
        }
        e eVarF = f(gVar, jLongValue, iIntValue);
        if (eVarF == null) {
            if (!gVar.f7426o) {
                bVar.f7289c = uri;
                this.r &= uri.equals(this.f7284n);
                this.f7284n = uri;
                return;
            } else {
                if (z || gVar.r.isEmpty()) {
                    bVar.f7288b = true;
                    return;
                }
                eVarF = new e((g.e) y.c(gVar.r), (gVar.f7422k + ((long) gVar.r.size())) - 1, -1);
            }
        }
        this.r = false;
        this.f7284n = null;
        Uri uriC = c(gVar, eVarF.f7294a.f7435c);
        c.f.a.b.e3.d1.f fVarK = k(uriC, i2);
        bVar.f7287a = fVarK;
        if (fVarK != null) {
            return;
        }
        Uri uriC2 = c(gVar, eVarF.f7294a);
        c.f.a.b.e3.d1.f fVarK2 = k(uriC2, i2);
        bVar.f7287a = fVarK2;
        if (fVarK2 != null) {
            return;
        }
        boolean zW = n.w(nVar, uri, gVar, eVarF, jD);
        if (zW && eVarF.f7297d) {
            return;
        }
        bVar.f7287a = n.j(this.f7271a, this.f7272b, this.f7276f[i2], jD, gVar, eVarF, uri, this.f7279i, this.p.n(), this.p.p(), this.f7281k, this.f7274d, nVar, this.f7280j.a(uriC2), this.f7280j.a(uriC), zW);
    }

    public final Pair<Long, Integer> e(n nVar, boolean z, c.f.a.b.e3.f1.x.g gVar, long j2, long j3) {
        if (nVar != null && !z) {
            if (!nVar.h()) {
                return new Pair<>(Long.valueOf(nVar.f7059j), Integer.valueOf(nVar.p));
            }
            Long lValueOf = Long.valueOf(nVar.p == -1 ? nVar.g() : nVar.f7059j);
            int i2 = nVar.p;
            return new Pair<>(lValueOf, Integer.valueOf(i2 != -1 ? i2 + 1 : -1));
        }
        long j4 = gVar.u + j2;
        if (nVar != null && !this.f7285o) {
            j3 = nVar.f7028g;
        }
        if (!gVar.f7426o && j3 >= j4) {
            return new Pair<>(Long.valueOf(gVar.f7422k + ((long) gVar.r.size())), -1);
        }
        long j5 = j3 - j2;
        int i3 = 0;
        int iF = x0.f(gVar.r, Long.valueOf(j5), true, !this.f7277g.e() || nVar == null);
        long j6 = ((long) iF) + gVar.f7422k;
        if (iF >= 0) {
            g.d dVar = gVar.r.get(iF);
            List<g.b> list = j5 < dVar.f7438f + dVar.f7436d ? dVar.f7433n : gVar.s;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                }
                g.b bVar = list.get(i3);
                if (j5 >= bVar.f7438f + bVar.f7436d) {
                    i3++;
                } else if (bVar.f7427m) {
                    j6 += list == gVar.s ? 1L : 0L;
                    i = i3;
                }
            }
        }
        return new Pair<>(Long.valueOf(j6), Integer.valueOf(i));
    }

    public int g(long j2, List<? extends c.f.a.b.e3.d1.n> list) {
        return (this.f7283m != null || this.p.length() < 2) ? list.size() : this.p.i(j2, list);
    }

    public z0 i() {
        return this.f7278h;
    }

    public c.f.a.b.g3.h j() {
        return this.p;
    }

    public final c.f.a.b.e3.d1.f k(Uri uri, int i2) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.f7280j.c(uri);
        if (bArrC != null) {
            this.f7280j.b(uri, bArrC);
            return null;
        }
        return new a(this.f7273c, new s.b().i(uri).b(1).a(), this.f7276f[i2], this.p.n(), this.p.p(), this.f7282l);
    }

    public boolean l(c.f.a.b.e3.d1.f fVar, long j2) {
        c.f.a.b.g3.h hVar = this.p;
        return hVar.c(hVar.s(this.f7278h.c(fVar.f7025d)), j2);
    }

    public void m() throws IOException {
        IOException iOException = this.f7283m;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f7284n;
        if (uri == null || !this.r) {
            return;
        }
        this.f7277g.c(uri);
    }

    public boolean n(Uri uri) {
        return x0.t(this.f7275e, uri);
    }

    public void o(c.f.a.b.e3.d1.f fVar) {
        if (fVar instanceof a) {
            a aVar = (a) fVar;
            this.f7282l = aVar.h();
            this.f7280j.b(aVar.f7023b.f9061a, (byte[]) c.f.a.b.j3.g.e(aVar.j()));
        }
    }

    public boolean p(Uri uri, long j2) {
        int iS;
        int i2 = 0;
        while (true) {
            Uri[] uriArr = this.f7275e;
            if (i2 >= uriArr.length) {
                i2 = -1;
                break;
            }
            if (uriArr[i2].equals(uri)) {
                break;
            }
            i2++;
        }
        if (i2 == -1 || (iS = this.p.s(i2)) == -1) {
            return true;
        }
        this.r |= uri.equals(this.f7284n);
        return j2 == -9223372036854775807L || (this.p.c(iS, j2) && this.f7277g.f(uri, j2));
    }

    public void q() {
        this.f7283m = null;
    }

    public final long r(long j2) {
        long j3 = this.q;
        if (j3 != -9223372036854775807L) {
            return j3 - j2;
        }
        return -9223372036854775807L;
    }

    public void s(boolean z) {
        this.f7281k = z;
    }

    public void t(c.f.a.b.g3.h hVar) {
        this.p = hVar;
    }

    public boolean u(long j2, c.f.a.b.e3.d1.f fVar, List<? extends c.f.a.b.e3.d1.n> list) {
        if (this.f7283m != null) {
            return false;
        }
        return this.p.e(j2, fVar, list);
    }

    public final void v(c.f.a.b.e3.f1.x.g gVar) {
        this.q = gVar.f7426o ? -9223372036854775807L : gVar.e() - this.f7277g.d();
    }
}
