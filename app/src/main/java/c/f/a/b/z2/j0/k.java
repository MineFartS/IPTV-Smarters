package c.f.a.b.z2.j0;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import c.f.a.b.b3.a;
import c.f.a.b.j3.e0;
import c.f.a.b.j3.i0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.w1;
import c.f.a.b.z2.a0;
import c.f.a.b.z2.j0.e;
import c.f.a.b.z2.t;
import c.f.a.b.z2.w;
import c.f.a.b.z2.x;
import c.f.a.b.z2.y;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements c.f.a.b.z2.j, x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.f.a.b.z2.o f10964a = new c.f.a.b.z2.o() { // from class: c.f.a.b.z2.j0.c
        @Override // c.f.a.b.z2.o
        public final c.f.a.b.z2.j[] a() {
            return k.p();
        }

        @Override // c.f.a.b.z2.o
        public /* synthetic */ c.f.a.b.z2.j[] b(Uri uri, Map map) {
            return c.f.a.b.z2.n.a(this, uri, map);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f10966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i0 f10967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f10968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i0 f10969f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque<e.a> f10970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m f10971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List<a.b> f10972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f10975l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10976m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i0 f10977n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10978o;
    public int p;
    public int q;
    public int r;
    public c.f.a.b.z2.l s;
    public a[] t;
    public long[][] u;
    public int v;
    public long w;
    public int x;
    public c.f.a.b.b3.n.c y;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f10979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final r f10980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a0 f10981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10982d;

        public a(o oVar, r rVar, a0 a0Var) {
            this.f10979a = oVar;
            this.f10980b = rVar;
            this.f10981c = a0Var;
        }
    }

    public k() {
        this(0);
    }

    public k(int i2) {
        this.f10965b = i2;
        this.f10973j = (i2 & 4) != 0 ? 3 : 0;
        this.f10971h = new m();
        this.f10972i = new ArrayList();
        this.f10969f = new i0(16);
        this.f10970g = new ArrayDeque<>();
        this.f10966c = new i0(e0.f9165a);
        this.f10967d = new i0(4);
        this.f10968e = new i0();
        this.f10978o = -1;
    }

    public static boolean B(int i2) {
        return i2 == 1836019574 || i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086 || i2 == 1937007212 || i2 == 1701082227 || i2 == 1835365473;
    }

    public static boolean C(int i2) {
        return i2 == 1835296868 || i2 == 1836476516 || i2 == 1751411826 || i2 == 1937011556 || i2 == 1937011827 || i2 == 1937011571 || i2 == 1668576371 || i2 == 1701606260 || i2 == 1937011555 || i2 == 1937011578 || i2 == 1937013298 || i2 == 1937007471 || i2 == 1668232756 || i2 == 1953196132 || i2 == 1718909296 || i2 == 1969517665 || i2 == 1801812339 || i2 == 1768715124;
    }

    public static int j(int i2) {
        if (i2 != 1751476579) {
            return i2 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    public static long[][] k(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i2 = 0; i2 < aVarArr.length; i2++) {
            jArr[i2] = new long[aVarArr[i2].f10980b.f11027b];
            jArr2[i2] = aVarArr[i2].f10980b.f11031f[0];
        }
        long j2 = 0;
        int i3 = 0;
        while (i3 < aVarArr.length) {
            long j3 = Long.MAX_VALUE;
            int i4 = -1;
            for (int i5 = 0; i5 < aVarArr.length; i5++) {
                if (!zArr[i5] && jArr2[i5] <= j3) {
                    j3 = jArr2[i5];
                    i4 = i5;
                }
            }
            int i6 = iArr[i4];
            jArr[i4][i6] = j2;
            j2 += (long) aVarArr[i4].f10980b.f11029d[i6];
            int i7 = i6 + 1;
            iArr[i4] = i7;
            if (i7 < jArr[i4].length) {
                jArr2[i4] = aVarArr[i4].f10980b.f11031f[i7];
            } else {
                zArr[i4] = true;
                i3++;
            }
        }
        return jArr;
    }

    public static int m(r rVar, long j2) {
        int iA = rVar.a(j2);
        return iA == -1 ? rVar.b(j2) : iA;
    }

    public static /* synthetic */ o o(o oVar) {
        return oVar;
    }

    public static /* synthetic */ c.f.a.b.z2.j[] p() {
        return new c.f.a.b.z2.j[]{new k()};
    }

    public static long q(r rVar, long j2, long j3) {
        int iM = m(rVar, j2);
        return iM == -1 ? j3 : Math.min(rVar.f11028c[iM], j3);
    }

    public static int u(i0 i0Var) {
        i0Var.P(8);
        int iJ = j(i0Var.n());
        if (iJ != 0) {
            return iJ;
        }
        i0Var.Q(4);
        while (i0Var.a() > 0) {
            int iJ2 = j(i0Var.n());
            if (iJ2 != 0) {
                return iJ2;
            }
        }
        return 0;
    }

    public final int A(c.f.a.b.z2.k kVar, w wVar) throws w1 {
        int iC = this.f10971h.c(kVar, wVar, this.f10972i);
        if (iC == 1 && wVar.f11506a == 0) {
            l();
        }
        return iC;
    }

    @RequiresNonNull({"tracks"})
    public final void D(long j2) {
        for (a aVar : this.t) {
            r rVar = aVar.f10980b;
            int iA = rVar.a(j2);
            if (iA == -1) {
                iA = rVar.b(j2);
            }
            aVar.f10982d = iA;
        }
    }

    @Override // c.f.a.b.z2.j
    public void a(long j2, long j3) {
        this.f10970g.clear();
        this.f10976m = 0;
        this.f10978o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        if (j2 != 0) {
            if (this.t != null) {
                D(j3);
            }
        } else if (this.f10973j != 3) {
            l();
        } else {
            this.f10971h.g();
            this.f10972i.clear();
        }
    }

    @Override // c.f.a.b.z2.j
    public void c(c.f.a.b.z2.l lVar) {
        this.s = lVar;
    }

    @Override // c.f.a.b.z2.j
    public boolean e(c.f.a.b.z2.k kVar) {
        return n.d(kVar, (this.f10965b & 2) != 0);
    }

    @Override // c.f.a.b.z2.x
    public boolean f() {
        return true;
    }

    @Override // c.f.a.b.z2.j
    public int g(c.f.a.b.z2.k kVar, w wVar) {
        while (true) {
            int i2 = this.f10973j;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        return z(kVar, wVar);
                    }
                    if (i2 == 3) {
                        return A(kVar, wVar);
                    }
                    throw new IllegalStateException();
                }
                if (y(kVar, wVar)) {
                    return 1;
                }
            } else if (!x(kVar)) {
                return -1;
            }
        }
    }

    @Override // c.f.a.b.z2.x
    public x.a h(long j2) {
        long j3;
        long jQ;
        long j4;
        long j5;
        int iB;
        if (((a[]) c.f.a.b.j3.g.e(this.t)).length == 0) {
            return new x.a(y.f11511a);
        }
        int i2 = this.v;
        if (i2 != -1) {
            r rVar = this.t[i2].f10980b;
            int iM = m(rVar, j2);
            if (iM == -1) {
                return new x.a(y.f11511a);
            }
            long j6 = rVar.f11031f[iM];
            j3 = rVar.f11028c[iM];
            if (j6 >= j2 || iM >= rVar.f11027b - 1 || (iB = rVar.b(j2)) == -1 || iB == iM) {
                j5 = -1;
                j4 = -9223372036854775807L;
            } else {
                j4 = rVar.f11031f[iB];
                j5 = rVar.f11028c[iB];
            }
            jQ = j5;
            j2 = j6;
        } else {
            j3 = Long.MAX_VALUE;
            jQ = -1;
            j4 = -9223372036854775807L;
        }
        int i3 = 0;
        while (true) {
            a[] aVarArr = this.t;
            if (i3 >= aVarArr.length) {
                break;
            }
            if (i3 != this.v) {
                r rVar2 = aVarArr[i3].f10980b;
                long jQ2 = q(rVar2, j2, j3);
                if (j4 != -9223372036854775807L) {
                    jQ = q(rVar2, j4, jQ);
                }
                j3 = jQ2;
            }
            i3++;
        }
        y yVar = new y(j2, j3);
        return j4 == -9223372036854775807L ? new x.a(yVar) : new x.a(yVar, new y(j4, jQ));
    }

    @Override // c.f.a.b.z2.x
    public long i() {
        return this.w;
    }

    public final void l() {
        this.f10973j = 0;
        this.f10976m = 0;
    }

    public final int n(long j2) {
        int i2 = -1;
        int i3 = -1;
        long j3 = Long.MAX_VALUE;
        boolean z = true;
        long j4 = Long.MAX_VALUE;
        boolean z2 = true;
        long j5 = Long.MAX_VALUE;
        for (int i4 = 0; i4 < ((a[]) x0.i(this.t)).length; i4++) {
            a aVar = this.t[i4];
            int i5 = aVar.f10982d;
            r rVar = aVar.f10980b;
            if (i5 != rVar.f11027b) {
                long j6 = rVar.f11028c[i5];
                long j7 = ((long[][]) x0.i(this.u))[i4][i5];
                long j8 = j6 - j2;
                boolean z3 = j8 < 0 || j8 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
                if ((!z3 && z2) || (z3 == z2 && j8 < j5)) {
                    z2 = z3;
                    j5 = j8;
                    i3 = i4;
                    j4 = j7;
                }
                if (j7 < j3) {
                    z = z3;
                    i2 = i4;
                    j3 = j7;
                }
            }
        }
        return (j3 == Long.MAX_VALUE || !z || j4 < j3 + 10485760) ? i3 : i2;
    }

    public final void r(c.f.a.b.z2.k kVar) {
        this.f10968e.L(8);
        kVar.u(this.f10968e.d(), 0, 8);
        f.d(this.f10968e);
        kVar.s(this.f10968e.e());
        kVar.r();
    }

    @Override // c.f.a.b.z2.j
    public void release() {
    }

    public final void s(long j2) {
        while (!this.f10970g.isEmpty() && this.f10970g.peek().f10895b == j2) {
            e.a aVarPop = this.f10970g.pop();
            if (aVarPop.f10894a == 1836019574) {
                v(aVarPop);
                this.f10970g.clear();
                this.f10973j = 2;
            } else if (!this.f10970g.isEmpty()) {
                this.f10970g.peek().d(aVarPop);
            }
        }
        if (this.f10973j != 2) {
            l();
        }
    }

    public final void t() {
        if (this.x != 2 || (this.f10965b & 2) == 0) {
            return;
        }
        c.f.a.b.z2.l lVar = (c.f.a.b.z2.l) c.f.a.b.j3.g.e(this.s);
        lVar.e(0, 4).e(new k1.b().X(this.y == null ? null : new c.f.a.b.b3.a(this.y)).E());
        lVar.p();
        lVar.i(new x.b(-9223372036854775807L));
    }

    public final void v(e.a aVar) {
        c.f.a.b.b3.a aVar2;
        c.f.a.b.b3.a aVar3;
        ArrayList arrayList;
        List<r> list;
        int i2;
        int i3;
        ArrayList arrayList2 = new ArrayList();
        boolean z = this.x == 1;
        t tVar = new t();
        e.b bVarG = aVar.g(1969517665);
        if (bVarG != null) {
            Pair<c.f.a.b.b3.a, c.f.a.b.b3.a> pairA = f.A(bVarG);
            c.f.a.b.b3.a aVar4 = (c.f.a.b.b3.a) pairA.first;
            c.f.a.b.b3.a aVar5 = (c.f.a.b.b3.a) pairA.second;
            if (aVar4 != null) {
                tVar.c(aVar4);
            }
            aVar2 = aVar5;
            aVar3 = aVar4;
        } else {
            aVar2 = null;
            aVar3 = null;
        }
        e.a aVarF = aVar.f(1835365473);
        c.f.a.b.b3.a aVarM = aVarF != null ? f.m(aVarF) : null;
        List<r> listZ = f.z(aVar, tVar, -9223372036854775807L, null, (this.f10965b & 1) != 0, z, new c.f.b.a.f() { // from class: c.f.a.b.z2.j0.b
            @Override // c.f.b.a.f
            public final Object apply(Object obj) {
                o oVar = (o) obj;
                k.o(oVar);
                return oVar;
            }
        });
        c.f.a.b.z2.l lVar = (c.f.a.b.z2.l) c.f.a.b.j3.g.e(this.s);
        int size = listZ.size();
        int i4 = 0;
        int size2 = -1;
        long j2 = -9223372036854775807L;
        while (i4 < size) {
            r rVar = listZ.get(i4);
            if (rVar.f11027b == 0) {
                list = listZ;
                i2 = size;
                arrayList = arrayList2;
            } else {
                o oVar = rVar.f11026a;
                int i5 = size2;
                arrayList = arrayList2;
                long j3 = oVar.f10999e;
                if (j3 == -9223372036854775807L) {
                    j3 = rVar.f11033h;
                }
                long jMax = Math.max(j2, j3);
                list = listZ;
                i2 = size;
                a aVar6 = new a(oVar, rVar, lVar.e(i4, oVar.f10996b));
                int i6 = rVar.f11030e + 30;
                k1.b bVarB = oVar.f11000f.b();
                bVarB.W(i6);
                if (oVar.f10996b == 2 && j3 > 0 && (i3 = rVar.f11027b) > 1) {
                    bVarB.P(i3 / (j3 / 1000000.0f));
                }
                j.k(oVar.f10996b, tVar, bVarB);
                int i7 = oVar.f10996b;
                c.f.a.b.b3.a[] aVarArr = new c.f.a.b.b3.a[2];
                aVarArr[0] = aVar2;
                aVarArr[1] = this.f10972i.isEmpty() ? null : new c.f.a.b.b3.a(this.f10972i);
                j.l(i7, aVar3, aVarM, bVarB, aVarArr);
                aVar6.f10981c.e(bVarB.E());
                size2 = (oVar.f10996b == 2 && i5 == -1) ? arrayList.size() : i5;
                arrayList.add(aVar6);
                j2 = jMax;
            }
            i4++;
            arrayList2 = arrayList;
            listZ = list;
            size = i2;
        }
        this.v = size2;
        this.w = j2;
        a[] aVarArr2 = (a[]) arrayList2.toArray(new a[0]);
        this.t = aVarArr2;
        this.u = k(aVarArr2);
        lVar.p();
        lVar.i(this);
    }

    public final void w(long j2) {
        if (this.f10974k == 1836086884) {
            int i2 = this.f10976m;
            this.y = new c.f.a.b.b3.n.c(0L, j2, -9223372036854775807L, j2 + ((long) i2), this.f10975l - ((long) i2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean x(c.f.a.b.z2.k r9) throws c.f.a.b.w1 {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.z2.j0.k.x(c.f.a.b.z2.k):boolean");
    }

    public final boolean y(c.f.a.b.z2.k kVar, w wVar) {
        boolean z;
        long j2 = this.f10975l - ((long) this.f10976m);
        long position = kVar.getPosition() + j2;
        i0 i0Var = this.f10977n;
        if (i0Var != null) {
            kVar.l(i0Var.d(), this.f10976m, (int) j2);
            if (this.f10974k == 1718909296) {
                this.x = u(i0Var);
            } else if (!this.f10970g.isEmpty()) {
                this.f10970g.peek().e(new e.b(this.f10974k, i0Var));
            }
        } else {
            if (j2 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
                wVar.f11506a = kVar.getPosition() + j2;
                z = true;
                s(position);
                return (z || this.f10973j == 2) ? false : true;
            }
            kVar.s((int) j2);
        }
        z = false;
        s(position);
        if (z) {
        }
    }

    public final int z(c.f.a.b.z2.k kVar, w wVar) throws w1 {
        long position = kVar.getPosition();
        if (this.f10978o == -1) {
            int iN = n(position);
            this.f10978o = iN;
            if (iN == -1) {
                return -1;
            }
        }
        a aVar = ((a[]) x0.i(this.t))[this.f10978o];
        a0 a0Var = aVar.f10981c;
        int i2 = aVar.f10982d;
        r rVar = aVar.f10980b;
        long j2 = rVar.f11028c[i2];
        int i3 = rVar.f11029d[i2];
        long j3 = (j2 - position) + ((long) this.p);
        if (j3 < 0 || j3 >= PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            wVar.f11506a = j2;
            return 1;
        }
        if (aVar.f10979a.f11001g == 1) {
            j3 += 8;
            i3 -= 8;
        }
        kVar.s((int) j3);
        o oVar = aVar.f10979a;
        if (oVar.f11004j == 0) {
            if ("audio/ac4".equals(oVar.f11000f.f9338m)) {
                if (this.q == 0) {
                    c.f.a.b.t2.o.a(i3, this.f10968e);
                    a0Var.c(this.f10968e, 7);
                    this.q += 7;
                }
                i3 += 7;
            }
            while (true) {
                int i4 = this.q;
                if (i4 >= i3) {
                    break;
                }
                int iB = a0Var.b(kVar, i3 - i4, false);
                this.p += iB;
                this.q += iB;
                this.r -= iB;
            }
        } else {
            byte[] bArrD = this.f10967d.d();
            bArrD[0] = 0;
            bArrD[1] = 0;
            bArrD[2] = 0;
            int i5 = aVar.f10979a.f11004j;
            int i6 = 4 - i5;
            while (this.q < i3) {
                int i7 = this.r;
                if (i7 == 0) {
                    kVar.l(bArrD, i6, i5);
                    this.p += i5;
                    this.f10967d.P(0);
                    int iN2 = this.f10967d.n();
                    if (iN2 < 0) {
                        throw w1.a("Invalid NAL length", null);
                    }
                    this.r = iN2;
                    this.f10966c.P(0);
                    a0Var.c(this.f10966c, 4);
                    this.q += 4;
                    i3 += i6;
                } else {
                    int iB2 = a0Var.b(kVar, i7, false);
                    this.p += iB2;
                    this.q += iB2;
                    this.r -= iB2;
                }
            }
        }
        r rVar2 = aVar.f10980b;
        a0Var.d(rVar2.f11031f[i2], rVar2.f11032g[i2], i3, 0, null);
        aVar.f10982d++;
        this.f10978o = -1;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        return 0;
    }
}
