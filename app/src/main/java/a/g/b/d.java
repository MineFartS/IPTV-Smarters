package a.g.b;

import a.g.b.i;
import a.g.b.k.d;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f1334a = 1000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static e f1335b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f1336c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f1337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f1338e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f1341h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public a.g.b.b[] f1344k;
    public final c r;
    public a u;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1339f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HashMap<String, i> f1340g = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f1342i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f1343j = 32;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f1345l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f1346m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean[] f1347n = new boolean[32];

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f1348o = 1;
    public int p = 0;
    public int q = 32;
    public i[] s = new i[f1334a];
    public int t = 0;

    public interface a {
        void a(i iVar);

        i b(d dVar, boolean[] zArr);

        void c(a aVar);

        void clear();

        i getKey();
    }

    public class b extends a.g.b.b {
        public b(c cVar) {
            this.f1328e = new j(this, cVar);
        }
    }

    public d() {
        this.f1344k = null;
        this.f1344k = new a.g.b.b[32];
        C();
        c cVar = new c();
        this.r = cVar;
        this.f1341h = new h(cVar);
        this.u = f1336c ? new b(cVar) : new a.g.b.b(cVar);
    }

    public static a.g.b.b s(d dVar, i iVar, i iVar2, float f2) {
        return dVar.r().j(iVar, iVar2, f2);
    }

    public static e w() {
        return f1335b;
    }

    public void A(a aVar) {
        if (f1335b != null) {
            throw null;
        }
        u(aVar);
        B(aVar, false);
        n();
    }

    public final int B(a aVar, boolean z) {
        if (f1335b != null) {
            throw null;
        }
        for (int i2 = 0; i2 < this.f1348o; i2++) {
            this.f1347n[i2] = false;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (f1335b != null) {
                throw null;
            }
            i3++;
            if (i3 >= this.f1348o * 2) {
                return i3;
            }
            if (aVar.getKey() != null) {
                this.f1347n[aVar.getKey().f1365d] = true;
            }
            i iVarB = aVar.b(this, this.f1347n);
            if (iVarB != null) {
                boolean[] zArr = this.f1347n;
                int i4 = iVarB.f1365d;
                if (zArr[i4]) {
                    return i3;
                }
                zArr[i4] = true;
            }
            if (iVarB != null) {
                float f2 = Float.MAX_VALUE;
                int i5 = -1;
                for (int i6 = 0; i6 < this.p; i6++) {
                    a.g.b.b bVar = this.f1344k[i6];
                    if (bVar.f1324a.f1372k != i.a.UNRESTRICTED && !bVar.f1329f && bVar.t(iVarB)) {
                        float f3 = bVar.f1328e.f(iVarB);
                        if (f3 < 0.0f) {
                            float f4 = (-bVar.f1325b) / f3;
                            if (f4 < f2) {
                                i5 = i6;
                                f2 = f4;
                            }
                        }
                    }
                }
                if (i5 > -1) {
                    a.g.b.b bVar2 = this.f1344k[i5];
                    bVar2.f1324a.f1366e = -1;
                    if (f1335b != null) {
                        throw null;
                    }
                    bVar2.y(iVarB);
                    i iVar = bVar2.f1324a;
                    iVar.f1366e = i5;
                    iVar.g(bVar2);
                } else {
                    continue;
                }
            } else {
                z2 = true;
            }
        }
        return i3;
    }

    public final void C() {
        int i2 = 0;
        if (f1336c) {
            while (true) {
                a.g.b.b[] bVarArr = this.f1344k;
                if (i2 >= bVarArr.length) {
                    return;
                }
                a.g.b.b bVar = bVarArr[i2];
                if (bVar != null) {
                    this.r.f1330a.a(bVar);
                }
                this.f1344k[i2] = null;
                i2++;
            }
        } else {
            while (true) {
                a.g.b.b[] bVarArr2 = this.f1344k;
                if (i2 >= bVarArr2.length) {
                    return;
                }
                a.g.b.b bVar2 = bVarArr2[i2];
                if (bVar2 != null) {
                    this.r.f1331b.a(bVar2);
                }
                this.f1344k[i2] = null;
                i2++;
            }
        }
    }

    public void D() {
        c cVar;
        int i2 = 0;
        while (true) {
            cVar = this.r;
            i[] iVarArr = cVar.f1333d;
            if (i2 >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i2];
            if (iVar != null) {
                iVar.d();
            }
            i2++;
        }
        cVar.f1332c.c(this.s, this.t);
        this.t = 0;
        Arrays.fill(this.r.f1333d, (Object) null);
        HashMap<String, i> map = this.f1340g;
        if (map != null) {
            map.clear();
        }
        this.f1339f = 0;
        this.f1341h.clear();
        this.f1348o = 1;
        for (int i3 = 0; i3 < this.p; i3++) {
            this.f1344k[i3].f1326c = false;
        }
        C();
        this.p = 0;
        this.u = f1336c ? new b(this.r) : new a.g.b.b(this.r);
    }

    public final i a(i.a aVar, String str) {
        i iVarB = this.r.f1332c.b();
        if (iVarB == null) {
            iVarB = new i(aVar, str);
        } else {
            iVarB.d();
        }
        iVarB.f(aVar, str);
        int i2 = this.t;
        int i3 = f1334a;
        if (i2 >= i3) {
            int i4 = i3 * 2;
            f1334a = i4;
            this.s = (i[]) Arrays.copyOf(this.s, i4);
        }
        i[] iVarArr = this.s;
        int i5 = this.t;
        this.t = i5 + 1;
        iVarArr[i5] = iVarB;
        return iVarB;
    }

    public void b(a.g.b.k.e eVar, a.g.b.k.e eVar2, float f2, int i2) {
        d.b bVar = d.b.LEFT;
        i iVarQ = q(eVar.k(bVar));
        d.b bVar2 = d.b.TOP;
        i iVarQ2 = q(eVar.k(bVar2));
        d.b bVar3 = d.b.RIGHT;
        i iVarQ3 = q(eVar.k(bVar3));
        d.b bVar4 = d.b.BOTTOM;
        i iVarQ4 = q(eVar.k(bVar4));
        i iVarQ5 = q(eVar2.k(bVar));
        i iVarQ6 = q(eVar2.k(bVar2));
        i iVarQ7 = q(eVar2.k(bVar3));
        i iVarQ8 = q(eVar2.k(bVar4));
        a.g.b.b bVarR = r();
        double d2 = f2;
        double dSin = Math.sin(d2);
        double d3 = i2;
        Double.isNaN(d3);
        bVarR.q(iVarQ2, iVarQ4, iVarQ6, iVarQ8, (float) (dSin * d3));
        d(bVarR);
        a.g.b.b bVarR2 = r();
        double dCos = Math.cos(d2);
        Double.isNaN(d3);
        bVarR2.q(iVarQ, iVarQ3, iVarQ5, iVarQ7, (float) (dCos * d3));
        d(bVarR2);
    }

    public void c(i iVar, i iVar2, int i2, float f2, i iVar3, i iVar4, int i3, int i4) {
        a.g.b.b bVarR = r();
        bVarR.h(iVar, iVar2, i2, f2, iVar3, iVar4, i3);
        if (i4 != 8) {
            bVarR.d(this, i4);
        }
        d(bVarR);
    }

    public void d(a.g.b.b bVar) {
        i iVarW;
        if (bVar == null) {
            return;
        }
        if (f1335b != null) {
            throw null;
        }
        boolean z = true;
        if (this.p + 1 >= this.q || this.f1348o + 1 >= this.f1343j) {
            y();
        }
        boolean z2 = false;
        if (!bVar.f1329f) {
            bVar.D(this);
            if (bVar.u()) {
                return;
            }
            bVar.r();
            if (bVar.f(this)) {
                i iVarP = p();
                bVar.f1324a = iVarP;
                l(bVar);
                this.u.c(bVar);
                B(this.u, true);
                if (iVarP.f1366e == -1) {
                    if (bVar.f1324a == iVarP && (iVarW = bVar.w(iVarP)) != null) {
                        if (f1335b != null) {
                            throw null;
                        }
                        bVar.y(iVarW);
                    }
                    if (!bVar.f1329f) {
                        bVar.f1324a.g(bVar);
                    }
                    this.p--;
                }
            } else {
                z = false;
            }
            if (!bVar.s()) {
                return;
            } else {
                z2 = z;
            }
        }
        if (z2) {
            return;
        }
        l(bVar);
    }

    public a.g.b.b e(i iVar, i iVar2, int i2, int i3) {
        if (i3 == 8 && iVar2.f1369h && iVar.f1366e == -1) {
            iVar.e(this, iVar2.f1368g + i2);
            return null;
        }
        a.g.b.b bVarR = r();
        bVarR.n(iVar, iVar2, i2);
        if (i3 != 8) {
            bVarR.d(this, i3);
        }
        d(bVarR);
        return bVarR;
    }

    public void f(i iVar, int i2) {
        a.g.b.b bVarR;
        int i3 = iVar.f1366e;
        if (i3 == -1) {
            iVar.e(this, i2);
            return;
        }
        if (i3 != -1) {
            a.g.b.b bVar = this.f1344k[i3];
            if (!bVar.f1329f) {
                if (bVar.f1328e.a() == 0) {
                    bVar.f1329f = true;
                } else {
                    bVarR = r();
                    bVarR.m(iVar, i2);
                }
            }
            bVar.f1325b = i2;
            return;
        }
        bVarR = r();
        bVarR.i(iVar, i2);
        d(bVarR);
    }

    public void g(i iVar, i iVar2, int i2, boolean z) {
        a.g.b.b bVarR = r();
        i iVarT = t();
        iVarT.f1367f = 0;
        bVarR.o(iVar, iVar2, iVarT, i2);
        d(bVarR);
    }

    public void h(i iVar, i iVar2, int i2, int i3) {
        a.g.b.b bVarR = r();
        i iVarT = t();
        iVarT.f1367f = 0;
        bVarR.o(iVar, iVar2, iVarT, i2);
        if (i3 != 8) {
            m(bVarR, (int) (bVarR.f1328e.f(iVarT) * (-1.0f)), i3);
        }
        d(bVarR);
    }

    public void i(i iVar, i iVar2, int i2, boolean z) {
        a.g.b.b bVarR = r();
        i iVarT = t();
        iVarT.f1367f = 0;
        bVarR.p(iVar, iVar2, iVarT, i2);
        d(bVarR);
    }

    public void j(i iVar, i iVar2, int i2, int i3) {
        a.g.b.b bVarR = r();
        i iVarT = t();
        iVarT.f1367f = 0;
        bVarR.p(iVar, iVar2, iVarT, i2);
        if (i3 != 8) {
            m(bVarR, (int) (bVarR.f1328e.f(iVarT) * (-1.0f)), i3);
        }
        d(bVarR);
    }

    public void k(i iVar, i iVar2, i iVar3, i iVar4, float f2, int i2) {
        a.g.b.b bVarR = r();
        bVarR.k(iVar, iVar2, iVar3, iVar4, f2);
        if (i2 != 8) {
            bVarR.d(this, i2);
        }
        d(bVarR);
    }

    public final void l(a.g.b.b bVar) {
        f<a.g.b.b> fVar;
        a.g.b.b bVar2;
        if (f1336c) {
            a.g.b.b[] bVarArr = this.f1344k;
            int i2 = this.p;
            if (bVarArr[i2] != null) {
                fVar = this.r.f1330a;
                bVar2 = bVarArr[i2];
                fVar.a(bVar2);
            }
        } else {
            a.g.b.b[] bVarArr2 = this.f1344k;
            int i3 = this.p;
            if (bVarArr2[i3] != null) {
                fVar = this.r.f1331b;
                bVar2 = bVarArr2[i3];
                fVar.a(bVar2);
            }
        }
        a.g.b.b[] bVarArr3 = this.f1344k;
        int i4 = this.p;
        bVarArr3[i4] = bVar;
        i iVar = bVar.f1324a;
        iVar.f1366e = i4;
        this.p = i4 + 1;
        iVar.g(bVar);
    }

    public void m(a.g.b.b bVar, int i2, int i3) {
        bVar.e(o(i3, null), i2);
    }

    public final void n() {
        for (int i2 = 0; i2 < this.p; i2++) {
            a.g.b.b bVar = this.f1344k[i2];
            bVar.f1324a.f1368g = bVar.f1325b;
        }
    }

    public i o(int i2, String str) {
        if (f1335b != null) {
            throw null;
        }
        if (this.f1348o + 1 >= this.f1343j) {
            y();
        }
        i iVarA = a(i.a.ERROR, str);
        int i3 = this.f1339f + 1;
        this.f1339f = i3;
        this.f1348o++;
        iVarA.f1365d = i3;
        iVarA.f1367f = i2;
        this.r.f1333d[i3] = iVarA;
        this.f1341h.a(iVarA);
        return iVarA;
    }

    public i p() {
        if (f1335b != null) {
            throw null;
        }
        if (this.f1348o + 1 >= this.f1343j) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i2 = this.f1339f + 1;
        this.f1339f = i2;
        this.f1348o++;
        iVarA.f1365d = i2;
        this.r.f1333d[i2] = iVarA;
        return iVarA;
    }

    public i q(Object obj) {
        i iVarE = null;
        if (obj == null) {
            return null;
        }
        if (this.f1348o + 1 >= this.f1343j) {
            y();
        }
        if (obj instanceof a.g.b.k.d) {
            a.g.b.k.d dVar = (a.g.b.k.d) obj;
            iVarE = dVar.e();
            if (iVarE == null) {
                dVar.l(this.r);
                iVarE = dVar.e();
            }
            int i2 = iVarE.f1365d;
            if (i2 == -1 || i2 > this.f1339f || this.r.f1333d[i2] == null) {
                if (i2 != -1) {
                    iVarE.d();
                }
                int i3 = this.f1339f + 1;
                this.f1339f = i3;
                this.f1348o++;
                iVarE.f1365d = i3;
                iVarE.f1372k = i.a.UNRESTRICTED;
                this.r.f1333d[i3] = iVarE;
            }
        }
        return iVarE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0038 A[PHI: r0
  0x0038: PHI (r0v6 a.g.b.b) = (r0v4 a.g.b.b), (r0v11 a.g.b.b) binds: [B:8:0x0029, B:5:0x0010] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a.g.b.b r() {
        /*
            r5 = this;
            boolean r0 = a.g.b.d.f1336c
            r1 = 1
            if (r0 == 0) goto L1f
            a.g.b.c r0 = r5.r
            a.g.b.f<a.g.b.b> r0 = r0.f1330a
            java.lang.Object r0 = r0.b()
            a.g.b.b r0 = (a.g.b.b) r0
            if (r0 != 0) goto L38
            a.g.b.d$b r0 = new a.g.b.d$b
            a.g.b.c r3 = r5.r
            r0.<init>(r3)
            long r3 = a.g.b.d.f1338e
            long r3 = r3 + r1
            a.g.b.d.f1338e = r3
            goto L3b
        L1f:
            a.g.b.c r0 = r5.r
            a.g.b.f<a.g.b.b> r0 = r0.f1331b
            java.lang.Object r0 = r0.b()
            a.g.b.b r0 = (a.g.b.b) r0
            if (r0 != 0) goto L38
            a.g.b.b r0 = new a.g.b.b
            a.g.b.c r3 = r5.r
            r0.<init>(r3)
            long r3 = a.g.b.d.f1337d
            long r3 = r3 + r1
            a.g.b.d.f1337d = r3
            goto L3b
        L38:
            r0.z()
        L3b:
            a.g.b.i.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.b.d.r():a.g.b.b");
    }

    public i t() {
        if (f1335b != null) {
            throw null;
        }
        if (this.f1348o + 1 >= this.f1343j) {
            y();
        }
        i iVarA = a(i.a.SLACK, null);
        int i2 = this.f1339f + 1;
        this.f1339f = i2;
        this.f1348o++;
        iVarA.f1365d = i2;
        this.r.f1333d[i2] = iVarA;
        return iVarA;
    }

    public final int u(a aVar) {
        float f2;
        boolean z;
        int i2 = 0;
        while (true) {
            f2 = 0.0f;
            if (i2 >= this.p) {
                z = false;
                break;
            }
            a.g.b.b[] bVarArr = this.f1344k;
            if (bVarArr[i2].f1324a.f1372k != i.a.UNRESTRICTED && bVarArr[i2].f1325b < 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        if (!z) {
            return 0;
        }
        boolean z2 = false;
        int i3 = 0;
        while (!z2) {
            if (f1335b != null) {
                throw null;
            }
            i3++;
            float f3 = Float.MAX_VALUE;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            int i7 = 0;
            while (i4 < this.p) {
                a.g.b.b bVar = this.f1344k[i4];
                if (bVar.f1324a.f1372k != i.a.UNRESTRICTED && !bVar.f1329f && bVar.f1325b < f2) {
                    int i8 = 1;
                    while (i8 < this.f1348o) {
                        i iVar = this.r.f1333d[i8];
                        float f4 = bVar.f1328e.f(iVar);
                        if (f4 > f2) {
                            for (int i9 = 0; i9 < 9; i9++) {
                                float f5 = iVar.f1370i[i9] / f4;
                                if ((f5 < f3 && i9 == i7) || i9 > i7) {
                                    i7 = i9;
                                    f3 = f5;
                                    i5 = i4;
                                    i6 = i8;
                                }
                            }
                        }
                        i8++;
                        f2 = 0.0f;
                    }
                }
                i4++;
                f2 = 0.0f;
            }
            if (i5 != -1) {
                a.g.b.b bVar2 = this.f1344k[i5];
                bVar2.f1324a.f1366e = -1;
                if (f1335b != null) {
                    throw null;
                }
                bVar2.y(this.r.f1333d[i6]);
                i iVar2 = bVar2.f1324a;
                iVar2.f1366e = i5;
                iVar2.g(bVar2);
            } else {
                z2 = true;
            }
            if (i3 > this.f1348o / 2) {
                z2 = true;
            }
            f2 = 0.0f;
        }
        return i3;
    }

    public c v() {
        return this.r;
    }

    public int x(Object obj) {
        i iVarE = ((a.g.b.k.d) obj).e();
        if (iVarE != null) {
            return (int) (iVarE.f1368g + 0.5f);
        }
        return 0;
    }

    public final void y() {
        int i2 = this.f1342i * 2;
        this.f1342i = i2;
        this.f1344k = (a.g.b.b[]) Arrays.copyOf(this.f1344k, i2);
        c cVar = this.r;
        cVar.f1333d = (i[]) Arrays.copyOf(cVar.f1333d, this.f1342i);
        int i3 = this.f1342i;
        this.f1347n = new boolean[i3];
        this.f1343j = i3;
        this.q = i3;
        if (f1335b != null) {
            throw null;
        }
    }

    public void z() {
        e eVar = f1335b;
        if (eVar != null) {
            throw null;
        }
        if (this.f1345l || this.f1346m) {
            if (eVar != null) {
                throw null;
            }
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= this.p) {
                    z = true;
                    break;
                } else if (!this.f1344k[i2].f1329f) {
                    break;
                } else {
                    i2++;
                }
            }
            if (z) {
                if (f1335b != null) {
                    throw null;
                }
                n();
                return;
            }
        }
        A(this.f1341h);
    }
}
