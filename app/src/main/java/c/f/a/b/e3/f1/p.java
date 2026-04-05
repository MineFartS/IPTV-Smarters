package c.f.a.b.e3.f1;

import android.net.Uri;
import android.text.TextUtils;
import c.f.a.b.c3.i0;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.f0;
import c.f.a.b.e3.f1.r;
import c.f.a.b.e3.f1.x.f;
import c.f.a.b.e3.f1.x.k;
import c.f.a.b.e3.j0;
import c.f.a.b.e3.s0;
import c.f.a.b.e3.t0;
import c.f.a.b.e3.z0;
import c.f.a.b.i3.f0;
import c.f.a.b.i3.n0;
import c.f.a.b.j3.d0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.m2;
import c.f.a.b.w1;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.c0;
import c.f.a.b.x2.w;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements f0, r.b, k.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f7306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c.f.a.b.e3.f1.x.k f7307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f7308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n0 f7309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c0 f7310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a0.a f7311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.f.a.b.i3.f0 f7312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j0.a f7313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final c.f.a.b.i3.f f7314j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c.f.a.b.e3.u f7317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f7318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f7319o;
    public final boolean p;
    public f0.a q;
    public int r;
    public a1 s;
    public int w;
    public t0 x;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IdentityHashMap<s0, Integer> f7315k = new IdentityHashMap<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final u f7316l = new u();
    public r[] t = new r[0];
    public r[] u = new r[0];
    public int[][] v = new int[0][];

    public p(l lVar, c.f.a.b.e3.f1.x.k kVar, k kVar2, n0 n0Var, c0 c0Var, a0.a aVar, c.f.a.b.i3.f0 f0Var, j0.a aVar2, c.f.a.b.i3.f fVar, c.f.a.b.e3.u uVar, boolean z, int i2, boolean z2) {
        this.f7306b = lVar;
        this.f7307c = kVar;
        this.f7308d = kVar2;
        this.f7309e = n0Var;
        this.f7310f = c0Var;
        this.f7311g = aVar;
        this.f7312h = f0Var;
        this.f7313i = aVar2;
        this.f7314j = fVar;
        this.f7317m = uVar;
        this.f7318n = z;
        this.f7319o = i2;
        this.p = z2;
        this.x = uVar.a(new t0[0]);
    }

    public static k1 x(k1 k1Var, k1 k1Var2, boolean z) {
        String str;
        c.f.a.b.b3.a aVar;
        int i2;
        int i3;
        int i4;
        String str2;
        String str3;
        if (k1Var2 != null) {
            str2 = k1Var2.f9335j;
            aVar = k1Var2.f9336k;
            int i5 = k1Var2.z;
            i3 = k1Var2.f9330e;
            int i6 = k1Var2.f9331f;
            String str4 = k1Var2.f9329d;
            str3 = k1Var2.f9328c;
            i4 = i5;
            i2 = i6;
            str = str4;
        } else {
            String strL = x0.L(k1Var.f9335j, 1);
            c.f.a.b.b3.a aVar2 = k1Var.f9336k;
            if (z) {
                int i7 = k1Var.z;
                int i8 = k1Var.f9330e;
                int i9 = k1Var.f9331f;
                str = k1Var.f9329d;
                str2 = strL;
                str3 = k1Var.f9328c;
                i4 = i7;
                i3 = i8;
                aVar = aVar2;
                i2 = i9;
            } else {
                str = null;
                aVar = aVar2;
                i2 = 0;
                i3 = 0;
                i4 = -1;
                str2 = strL;
                str3 = null;
            }
        }
        return new k1.b().S(k1Var.f9327b).U(str3).K(k1Var.f9337l).e0(d0.g(str2)).I(str2).X(aVar).G(z ? k1Var.f9332g : -1).Z(z ? k1Var.f9333h : -1).H(i4).g0(i3).c0(i2).V(str).E();
    }

    public static Map<String, w> y(List<w> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap map = new HashMap();
        int i2 = 0;
        while (i2 < arrayList.size()) {
            w wVarH = list.get(i2);
            String str = wVarH.f10447d;
            i2++;
            int i3 = i2;
            while (i3 < arrayList.size()) {
                w wVar = (w) arrayList.get(i3);
                if (TextUtils.equals(wVar.f10447d, str)) {
                    wVarH = wVarH.h(wVar);
                    arrayList.remove(i3);
                } else {
                    i3++;
                }
            }
            map.put(str, wVarH);
        }
        return map;
    }

    public static k1 z(k1 k1Var) {
        String strL = x0.L(k1Var.f9335j, 2);
        return new k1.b().S(k1Var.f9327b).U(k1Var.f9328c).K(k1Var.f9337l).e0(d0.g(strL)).I(strL).X(k1Var.f9336k).G(k1Var.f9332g).Z(k1Var.f9333h).j0(k1Var.r).Q(k1Var.s).P(k1Var.t).g0(k1Var.f9330e).c0(k1Var.f9331f).E();
    }

    @Override // c.f.a.b.e3.t0.a
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void i(r rVar) {
        this.q.i(this);
    }

    public void B() {
        this.f7307c.b(this);
        for (r rVar : this.t) {
            rVar.g0();
        }
        this.q = null;
    }

    @Override // c.f.a.b.e3.f1.x.k.b
    public void a() {
        for (r rVar : this.t) {
            rVar.c0();
        }
        this.q.i(this);
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long b() {
        return this.x.b();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean c(long j2) {
        if (this.s != null) {
            return this.x.c(j2);
        }
        for (r rVar : this.t) {
            rVar.A();
        }
        return false;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean d() {
        return this.x.d();
    }

    @Override // c.f.a.b.e3.f1.x.k.b
    public boolean e(Uri uri, f0.c cVar, boolean z) {
        boolean zB0 = true;
        for (r rVar : this.t) {
            zB0 &= rVar.b0(uri, cVar, z);
        }
        this.q.i(this);
        return zB0;
    }

    @Override // c.f.a.b.e3.f0
    public long f(long j2, m2 m2Var) {
        return j2;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long g() {
        return this.x.g();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public void h(long j2) {
        this.x.h(j2);
    }

    @Override // c.f.a.b.e3.f1.r.b
    public void j(Uri uri) {
        this.f7307c.j(uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v7 */
    @Override // c.f.a.b.e3.f0
    public List<i0> l(List<c.f.a.b.g3.h> list) {
        int[] iArr;
        a1 a1VarT;
        int iL;
        p pVar = this;
        c.f.a.b.e3.f1.x.f fVar = (c.f.a.b.e3.f1.x.f) c.f.a.b.j3.g.e(pVar.f7307c.g());
        boolean z = !fVar.f7396f.isEmpty();
        int length = pVar.t.length - fVar.f7399i.size();
        int i2 = 0;
        if (z) {
            r rVar = pVar.t[0];
            iArr = pVar.v[0];
            a1VarT = rVar.t();
            iL = rVar.L();
        } else {
            iArr = new int[0];
            a1VarT = a1.f6902b;
            iL = 0;
        }
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        boolean z3 = false;
        for (c.f.a.b.g3.h hVar : list) {
            z0 z0VarA = hVar.a();
            int iC = a1VarT.c(z0VarA);
            if (iC == -1) {
                ?? r15 = z;
                while (true) {
                    r[] rVarArr = pVar.t;
                    if (r15 >= rVarArr.length) {
                        break;
                    }
                    if (rVarArr[r15].t().c(z0VarA) != -1) {
                        int i3 = r15 < length ? 1 : 2;
                        int[] iArr2 = pVar.v[r15];
                        for (int i4 = 0; i4 < hVar.length(); i4++) {
                            arrayList.add(new i0(i3, iArr2[hVar.h(i4)]));
                        }
                    } else {
                        pVar = this;
                        r15++;
                    }
                }
            } else if (iC == iL) {
                for (int i5 = 0; i5 < hVar.length(); i5++) {
                    arrayList.add(new i0(i2, iArr[hVar.h(i5)]));
                }
                z3 = true;
            } else {
                z2 = true;
            }
            pVar = this;
            i2 = 0;
        }
        if (z2 && !z3) {
            int i6 = iArr[0];
            int i7 = fVar.f7396f.get(iArr[0]).f7410b.f9334i;
            for (int i8 = 1; i8 < iArr.length; i8++) {
                int i9 = fVar.f7396f.get(iArr[i8]).f7410b.f9334i;
                if (i9 < i7) {
                    i6 = iArr[i8];
                    i7 = i9;
                }
            }
            arrayList.add(new i0(0, i6));
        }
        return arrayList;
    }

    public final void m(long j2, List<f.a> list, List<r> list2, List<int[]> list3, Map<String, w> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2).f7408d;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z = true;
                for (int i3 = 0; i3 < list.size(); i3++) {
                    if (x0.b(str, list.get(i3).f7408d)) {
                        f.a aVar = list.get(i3);
                        arrayList3.add(Integer.valueOf(i3));
                        arrayList.add(aVar.f7405a);
                        arrayList2.add(aVar.f7406b);
                        z &= x0.K(aVar.f7406b.f9335j, 1) == 1;
                    }
                }
                r rVarW = w(1, (Uri[]) arrayList.toArray(x0.j(new Uri[0])), (k1[]) arrayList2.toArray(new k1[0]), null, Collections.emptyList(), map, j2);
                list3.add(c.f.b.f.c.j(arrayList3));
                list2.add(rVarW);
                if (this.f7318n && z) {
                    rVarW.e0(new z0[]{new z0((k1[]) arrayList2.toArray(new k1[0]))}, 0, new int[0]);
                }
            }
        }
    }

    @Override // c.f.a.b.e3.f0
    public void n() throws w1 {
        for (r rVar : this.t) {
            rVar.n();
        }
    }

    @Override // c.f.a.b.e3.f0
    public long o(long j2) {
        r[] rVarArr = this.u;
        if (rVarArr.length > 0) {
            boolean zJ0 = rVarArr[0].j0(j2, false);
            int i2 = 1;
            while (true) {
                r[] rVarArr2 = this.u;
                if (i2 >= rVarArr2.length) {
                    break;
                }
                rVarArr2[i2].j0(j2, zJ0);
                i2++;
            }
            if (zJ0) {
                this.f7316l.b();
            }
        }
        return j2;
    }

    @Override // c.f.a.b.e3.f1.r.b
    public void onPrepared() {
        int i2 = this.r - 1;
        this.r = i2;
        if (i2 > 0) {
            return;
        }
        int i3 = 0;
        for (r rVar : this.t) {
            i3 += rVar.t().f6903c;
        }
        z0[] z0VarArr = new z0[i3];
        int i4 = 0;
        for (r rVar2 : this.t) {
            int i5 = rVar2.t().f6903c;
            int i6 = 0;
            while (i6 < i5) {
                z0VarArr[i4] = rVar2.t().b(i6);
                i6++;
                i4++;
            }
        }
        this.s = new a1(z0VarArr);
        this.q.k(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void p(c.f.a.b.e3.f1.x.f r20, long r21, java.util.List<c.f.a.b.e3.f1.r> r23, java.util.List<int[]> r24, java.util.Map<java.lang.String, c.f.a.b.x2.w> r25) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.f1.p.p(c.f.a.b.e3.f1.x.f, long, java.util.List, java.util.List, java.util.Map):void");
    }

    @Override // c.f.a.b.e3.f0
    public long q() {
        return -9223372036854775807L;
    }

    @Override // c.f.a.b.e3.f0
    public void r(f0.a aVar, long j2) {
        this.q = aVar;
        this.f7307c.l(this);
        u(j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2  */
    @Override // c.f.a.b.e3.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long s(c.f.a.b.g3.h[] r22, boolean[] r23, c.f.a.b.e3.s0[] r24, boolean[] r25, long r26) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.e3.f1.p.s(c.f.a.b.g3.h[], boolean[], c.f.a.b.e3.s0[], boolean[], long):long");
    }

    @Override // c.f.a.b.e3.f0
    public a1 t() {
        return (a1) c.f.a.b.j3.g.e(this.s);
    }

    public final void u(long j2) {
        c.f.a.b.e3.f1.x.f fVar = (c.f.a.b.e3.f1.x.f) c.f.a.b.j3.g.e(this.f7307c.g());
        Map<String, w> mapY = this.p ? y(fVar.f7404n) : Collections.emptyMap();
        boolean z = !fVar.f7396f.isEmpty();
        List<f.a> list = fVar.f7398h;
        List<f.a> list2 = fVar.f7399i;
        this.r = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z) {
            p(fVar, j2, arrayList, arrayList2, mapY);
        }
        m(j2, list, arrayList, arrayList2, mapY);
        this.w = arrayList.size();
        int i2 = 0;
        while (i2 < list2.size()) {
            f.a aVar = list2.get(i2);
            int i3 = i2;
            r rVarW = w(3, new Uri[]{aVar.f7405a}, new k1[]{aVar.f7406b}, null, Collections.emptyList(), mapY, j2);
            arrayList2.add(new int[]{i3});
            arrayList.add(rVarW);
            rVarW.e0(new z0[]{new z0(aVar.f7406b)}, 0, new int[0]);
            i2 = i3 + 1;
        }
        this.t = (r[]) arrayList.toArray(new r[0]);
        this.v = (int[][]) arrayList2.toArray(new int[0][]);
        r[] rVarArr = this.t;
        this.r = rVarArr.length;
        rVarArr[0].n0(true);
        for (r rVar : this.t) {
            rVar.A();
        }
        this.u = this.t;
    }

    @Override // c.f.a.b.e3.f0
    public void v(long j2, boolean z) {
        for (r rVar : this.u) {
            rVar.v(j2, z);
        }
    }

    public final r w(int i2, Uri[] uriArr, k1[] k1VarArr, k1 k1Var, List<k1> list, Map<String, w> map, long j2) {
        return new r(i2, this, new j(this.f7306b, this.f7307c, uriArr, k1VarArr, this.f7308d, this.f7309e, this.f7316l, list), map, this.f7314j, j2, k1Var, this.f7310f, this.f7311g, this.f7312h, this.f7313i, this.f7319o);
    }
}
