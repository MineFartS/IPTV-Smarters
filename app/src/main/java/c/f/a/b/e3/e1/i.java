package c.f.a.b.e3.e1;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import c.f.a.b.c3.i0;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.d1.i;
import c.f.a.b.e3.e1.g;
import c.f.a.b.e3.e1.o;
import c.f.a.b.e3.f0;
import c.f.a.b.e3.j0;
import c.f.a.b.e3.s0;
import c.f.a.b.e3.t0;
import c.f.a.b.e3.u;
import c.f.a.b.e3.x;
import c.f.a.b.e3.z0;
import c.f.a.b.i3.h0;
import c.f.a.b.i3.n0;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.m2;
import c.f.a.b.x2.a0;
import c.f.a.b.x2.c0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class i implements f0, t0.a<c.f.a.b.e3.d1.i<g>>, i.b<g> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f7073b = Pattern.compile("CC([1-4])=(.+)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f7074c = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g.a f7076e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f7077f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c0 f7078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c.f.a.b.i3.f0 f7079h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f7080i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f7081j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h0 f7082k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c.f.a.b.i3.f f7083l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final a1 f7084m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a[] f7085n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u f7086o;
    public final o p;
    public final j0.a r;
    public final a0.a s;
    public f0.a t;
    public t0 w;
    public c.f.a.b.e3.e1.p.c x;
    public int y;
    public List<c.f.a.b.e3.e1.p.f> z;
    public c.f.a.b.e3.d1.i<g>[] u = F(0);
    public n[] v = new n[0];
    public final IdentityHashMap<c.f.a.b.e3.d1.i<g>, o.c> q = new IdentityHashMap<>();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f7087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7088b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f7089c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7090d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f7092f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f7093g;

        public a(int i2, int i3, int[] iArr, int i4, int i5, int i6, int i7) {
            this.f7088b = i2;
            this.f7087a = iArr;
            this.f7089c = i3;
            this.f7091e = i4;
            this.f7092f = i5;
            this.f7093g = i6;
            this.f7090d = i7;
        }

        public static a a(int[] iArr, int i2) {
            return new a(3, 1, iArr, i2, -1, -1, -1);
        }

        public static a b(int[] iArr, int i2) {
            return new a(5, 1, iArr, i2, -1, -1, -1);
        }

        public static a c(int i2) {
            return new a(5, 2, new int[0], -1, -1, -1, i2);
        }

        public static a d(int i2, int[] iArr, int i3, int i4, int i5) {
            return new a(i2, 0, iArr, i3, i4, i5, -1);
        }
    }

    public i(int i2, c.f.a.b.e3.e1.p.c cVar, f fVar, int i3, g.a aVar, n0 n0Var, c0 c0Var, a0.a aVar2, c.f.a.b.i3.f0 f0Var, j0.a aVar3, long j2, h0 h0Var, c.f.a.b.i3.f fVar2, u uVar, o.b bVar) {
        this.f7075d = i2;
        this.x = cVar;
        this.f7080i = fVar;
        this.y = i3;
        this.f7076e = aVar;
        this.f7077f = n0Var;
        this.f7078g = c0Var;
        this.s = aVar2;
        this.f7079h = f0Var;
        this.r = aVar3;
        this.f7081j = j2;
        this.f7082k = h0Var;
        this.f7083l = fVar2;
        this.f7086o = uVar;
        this.p = new o(cVar, bVar, fVar2);
        this.w = uVar.a(this.u);
        c.f.a.b.e3.e1.p.g gVarD = cVar.d(i3);
        List<c.f.a.b.e3.e1.p.f> list = gVarD.f7192d;
        this.z = list;
        Pair<a1, a[]> pairU = u(c0Var, gVarD.f7191c, list);
        this.f7084m = (a1) pairU.first;
        this.f7085n = (a[]) pairU.second;
    }

    public static int[][] A(List<c.f.a.b.e3.e1.p.a> list) {
        int iMin;
        c.f.a.b.e3.e1.p.e eVarW;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i2 = 0; i2 < size; i2++) {
            sparseIntArray.put(list.get(i2).f7146a, i2);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i2));
            arrayList.add(arrayList2);
            sparseArray.put(i2, arrayList2);
        }
        for (int i3 = 0; i3 < size; i3++) {
            c.f.a.b.e3.e1.p.a aVar = list.get(i3);
            c.f.a.b.e3.e1.p.e eVarY = y(aVar.f7150e);
            if (eVarY == null) {
                eVarY = y(aVar.f7151f);
            }
            if (eVarY == null || (iMin = sparseIntArray.get(Integer.parseInt(eVarY.f7182b), -1)) == -1) {
                iMin = i3;
            }
            if (iMin == i3 && (eVarW = w(aVar.f7151f)) != null) {
                for (String str : x0.U0(eVarW.f7182b, ",")) {
                    int i4 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i4 != -1) {
                        iMin = Math.min(iMin, i4);
                    }
                }
            }
            if (iMin != i3) {
                List list2 = (List) sparseArray.get(i3);
                List list3 = (List) sparseArray.get(iMin);
                list3.addAll(list2);
                sparseArray.put(i3, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i5 = 0; i5 < size2; i5++) {
            iArr[i5] = c.f.b.f.c.j((Collection) arrayList.get(i5));
            Arrays.sort(iArr[i5]);
        }
        return iArr;
    }

    public static boolean D(List<c.f.a.b.e3.e1.p.a> list, int[] iArr) {
        for (int i2 : iArr) {
            List<c.f.a.b.e3.e1.p.j> list2 = list.get(i2).f7148c;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                if (!list2.get(i3).f7207e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int E(int i2, List<c.f.a.b.e3.e1.p.a> list, int[][] iArr, boolean[] zArr, k1[][] k1VarArr) {
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if (D(list, iArr[i4])) {
                zArr[i4] = true;
                i3++;
            }
            k1VarArr[i4] = z(list, iArr[i4]);
            if (k1VarArr[i4].length != 0) {
                i3++;
            }
        }
        return i3;
    }

    public static c.f.a.b.e3.d1.i<g>[] F(int i2) {
        return new c.f.a.b.e3.d1.i[i2];
    }

    public static k1[] H(c.f.a.b.e3.e1.p.e eVar, Pattern pattern, k1 k1Var) {
        String str = eVar.f7182b;
        if (str == null) {
            return new k1[]{k1Var};
        }
        String[] strArrU0 = x0.U0(str, ";");
        k1[] k1VarArr = new k1[strArrU0.length];
        for (int i2 = 0; i2 < strArrU0.length; i2++) {
            Matcher matcher = pattern.matcher(strArrU0[i2]);
            if (!matcher.matches()) {
                return new k1[]{k1Var};
            }
            int i3 = Integer.parseInt(matcher.group(1));
            k1VarArr[i2] = k1Var.b().S(k1Var.f9327b + ":" + i3).F(i3).V(matcher.group(2)).E();
        }
        return k1VarArr;
    }

    public static void e(List<c.f.a.b.e3.e1.p.f> list, z0[] z0VarArr, a[] aVarArr, int i2) {
        int i3 = 0;
        while (i3 < list.size()) {
            z0VarArr[i2] = new z0(new k1.b().S(list.get(i3).a()).e0("application/x-emsg").E());
            aVarArr[i2] = a.c(i3);
            i3++;
            i2++;
        }
    }

    public static int m(c0 c0Var, List<c.f.a.b.e3.e1.p.a> list, int[][] iArr, int i2, boolean[] zArr, k1[][] k1VarArr, z0[] z0VarArr, a[] aVarArr) {
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            int[] iArr2 = iArr[i5];
            ArrayList arrayList = new ArrayList();
            for (int i7 : iArr2) {
                arrayList.addAll(list.get(i7).f7148c);
            }
            int size = arrayList.size();
            k1[] k1VarArr2 = new k1[size];
            for (int i8 = 0; i8 < size; i8++) {
                k1 k1Var = ((c.f.a.b.e3.e1.p.j) arrayList.get(i8)).f7204b;
                k1VarArr2[i8] = k1Var.c(c0Var.c(k1Var));
            }
            c.f.a.b.e3.e1.p.a aVar = list.get(iArr2[0]);
            int i9 = i6 + 1;
            if (zArr[i5]) {
                i3 = i9 + 1;
            } else {
                i3 = i9;
                i9 = -1;
            }
            if (k1VarArr[i5].length != 0) {
                i4 = i3 + 1;
            } else {
                i4 = i3;
                i3 = -1;
            }
            z0VarArr[i6] = new z0(k1VarArr2);
            aVarArr[i6] = a.d(aVar.f7147b, iArr2, i6, i9, i3);
            if (i9 != -1) {
                z0VarArr[i9] = new z0(new k1.b().S(aVar.f7146a + ":emsg").e0("application/x-emsg").E());
                aVarArr[i9] = a.b(iArr2, i6);
            }
            if (i3 != -1) {
                z0VarArr[i3] = new z0(k1VarArr[i5]);
                aVarArr[i3] = a.a(iArr2, i6);
            }
            i5++;
            i6 = i4;
        }
        return i6;
    }

    public static Pair<a1, a[]> u(c0 c0Var, List<c.f.a.b.e3.e1.p.a> list, List<c.f.a.b.e3.e1.p.f> list2) {
        int[][] iArrA = A(list);
        int length = iArrA.length;
        boolean[] zArr = new boolean[length];
        k1[][] k1VarArr = new k1[length][];
        int iE = E(length, list, iArrA, zArr, k1VarArr) + length + list2.size();
        z0[] z0VarArr = new z0[iE];
        a[] aVarArr = new a[iE];
        e(list2, z0VarArr, aVarArr, m(c0Var, list, iArrA, length, zArr, k1VarArr, z0VarArr, aVarArr));
        return Pair.create(new a1(z0VarArr), aVarArr);
    }

    public static c.f.a.b.e3.e1.p.e w(List<c.f.a.b.e3.e1.p.e> list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    public static c.f.a.b.e3.e1.p.e x(List<c.f.a.b.e3.e1.p.e> list, String str) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            c.f.a.b.e3.e1.p.e eVar = list.get(i2);
            if (str.equals(eVar.f7181a)) {
                return eVar;
            }
        }
        return null;
    }

    public static c.f.a.b.e3.e1.p.e y(List<c.f.a.b.e3.e1.p.e> list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    public static k1[] z(List<c.f.a.b.e3.e1.p.a> list, int[] iArr) {
        k1 k1VarE;
        Pattern pattern;
        for (int i2 : iArr) {
            c.f.a.b.e3.e1.p.a aVar = list.get(i2);
            List<c.f.a.b.e3.e1.p.e> list2 = list.get(i2).f7149d;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                c.f.a.b.e3.e1.p.e eVar = list2.get(i3);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f7181a)) {
                    k1VarE = new k1.b().e0("application/cea-608").S(aVar.f7146a + ":cea608").E();
                    pattern = f7073b;
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f7181a)) {
                    k1VarE = new k1.b().e0("application/cea-708").S(aVar.f7146a + ":cea708").E();
                    pattern = f7074c;
                }
                return H(eVar, pattern, k1VarE);
            }
        }
        return new k1[0];
    }

    public final int B(int i2, int[] iArr) {
        int i3 = iArr[i2];
        if (i3 == -1) {
            return -1;
        }
        int i4 = this.f7085n[i3].f7091e;
        for (int i5 = 0; i5 < iArr.length; i5++) {
            int i6 = iArr[i5];
            if (i6 == i4 && this.f7085n[i6].f7089c == 0) {
                return i5;
            }
        }
        return -1;
    }

    public final int[] C(c.f.a.b.g3.h[] hVarArr) {
        int[] iArr = new int[hVarArr.length];
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            if (hVarArr[i2] != null) {
                iArr[i2] = this.f7084m.c(hVarArr[i2].a());
            } else {
                iArr[i2] = -1;
            }
        }
        return iArr;
    }

    @Override // c.f.a.b.e3.t0.a
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void i(c.f.a.b.e3.d1.i<g> iVar) {
        this.t.i(this);
    }

    public void I() {
        this.p.o();
        for (c.f.a.b.e3.d1.i<g> iVar : this.u) {
            iVar.R(this);
        }
        this.t = null;
    }

    public final void J(c.f.a.b.g3.h[] hVarArr, boolean[] zArr, s0[] s0VarArr) {
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            if (hVarArr[i2] == null || !zArr[i2]) {
                if (s0VarArr[i2] instanceof c.f.a.b.e3.d1.i) {
                    ((c.f.a.b.e3.d1.i) s0VarArr[i2]).R(this);
                } else if (s0VarArr[i2] instanceof i.a) {
                    ((i.a) s0VarArr[i2]).c();
                }
                s0VarArr[i2] = null;
            }
        }
    }

    public final void K(c.f.a.b.g3.h[] hVarArr, s0[] s0VarArr, int[] iArr) {
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            if ((s0VarArr[i2] instanceof x) || (s0VarArr[i2] instanceof i.a)) {
                int iB = B(i2, iArr);
                if (!(iB == -1 ? s0VarArr[i2] instanceof x : (s0VarArr[i2] instanceof i.a) && ((i.a) s0VarArr[i2]).f7047b == s0VarArr[iB])) {
                    if (s0VarArr[i2] instanceof i.a) {
                        ((i.a) s0VarArr[i2]).c();
                    }
                    s0VarArr[i2] = null;
                }
            }
        }
    }

    public final void L(c.f.a.b.g3.h[] hVarArr, s0[] s0VarArr, boolean[] zArr, long j2, int[] iArr) {
        for (int i2 = 0; i2 < hVarArr.length; i2++) {
            c.f.a.b.g3.h hVar = hVarArr[i2];
            if (hVar != null) {
                if (s0VarArr[i2] == null) {
                    zArr[i2] = true;
                    a aVar = this.f7085n[iArr[i2]];
                    int i3 = aVar.f7089c;
                    if (i3 == 0) {
                        s0VarArr[i2] = p(aVar, hVar, j2);
                    } else if (i3 == 2) {
                        s0VarArr[i2] = new n(this.z.get(aVar.f7090d), hVar.a().b(0), this.x.f7159d);
                    }
                } else if (s0VarArr[i2] instanceof c.f.a.b.e3.d1.i) {
                    ((g) ((c.f.a.b.e3.d1.i) s0VarArr[i2]).F()).b(hVar);
                }
            }
        }
        for (int i4 = 0; i4 < hVarArr.length; i4++) {
            if (s0VarArr[i4] == null && hVarArr[i4] != null) {
                a aVar2 = this.f7085n[iArr[i4]];
                if (aVar2.f7089c == 1) {
                    int iB = B(i4, iArr);
                    if (iB == -1) {
                        s0VarArr[i4] = new x();
                    } else {
                        s0VarArr[i4] = ((c.f.a.b.e3.d1.i) s0VarArr[iB]).U(j2, aVar2.f7088b);
                    }
                }
            }
        }
    }

    public void M(c.f.a.b.e3.e1.p.c cVar, int i2) {
        this.x = cVar;
        this.y = i2;
        this.p.q(cVar);
        c.f.a.b.e3.d1.i<g>[] iVarArr = this.u;
        if (iVarArr != null) {
            for (c.f.a.b.e3.d1.i<g> iVar : iVarArr) {
                ((g) iVar.F()).e(cVar, i2);
            }
            this.t.i(this);
        }
        this.z = cVar.d(i2).f7192d;
        for (n nVar : this.v) {
            Iterator<c.f.a.b.e3.e1.p.f> it = this.z.iterator();
            while (true) {
                if (it.hasNext()) {
                    c.f.a.b.e3.e1.p.f next = it.next();
                    if (next.a().equals(nVar.b())) {
                        nVar.d(next, cVar.f7159d && i2 == cVar.e() - 1);
                    }
                }
            }
        }
    }

    @Override // c.f.a.b.e3.d1.i.b
    public synchronized void a(c.f.a.b.e3.d1.i<g> iVar) {
        o.c cVarRemove = this.q.remove(iVar);
        if (cVarRemove != null) {
            cVarRemove.n();
        }
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long b() {
        return this.w.b();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean c(long j2) {
        return this.w.c(j2);
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public boolean d() {
        return this.w.d();
    }

    @Override // c.f.a.b.e3.f0
    public long f(long j2, m2 m2Var) {
        for (c.f.a.b.e3.d1.i<g> iVar : this.u) {
            if (iVar.f7033b == 2) {
                return iVar.f(j2, m2Var);
            }
        }
        return j2;
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public long g() {
        return this.w.g();
    }

    @Override // c.f.a.b.e3.f0, c.f.a.b.e3.t0
    public void h(long j2) {
        this.w.h(j2);
    }

    @Override // c.f.a.b.e3.f0
    public List<i0> l(List<c.f.a.b.g3.h> list) {
        List<c.f.a.b.e3.e1.p.a> list2 = this.x.d(this.y).f7191c;
        ArrayList arrayList = new ArrayList();
        for (c.f.a.b.g3.h hVar : list) {
            a aVar = this.f7085n[this.f7084m.c(hVar.a())];
            if (aVar.f7089c == 0) {
                int[] iArr = aVar.f7087a;
                int length = hVar.length();
                int[] iArr2 = new int[length];
                for (int i2 = 0; i2 < hVar.length(); i2++) {
                    iArr2[i2] = hVar.h(i2);
                }
                Arrays.sort(iArr2);
                int size = list2.get(iArr[0]).f7148c.size();
                int i3 = 0;
                int i4 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    int i6 = iArr2[i5];
                    while (true) {
                        int i7 = i4 + size;
                        if (i6 >= i7) {
                            i3++;
                            size = list2.get(iArr[i3]).f7148c.size();
                            i4 = i7;
                        }
                    }
                    arrayList.add(new i0(this.y, iArr[i3], i6 - i4));
                }
            }
        }
        return arrayList;
    }

    @Override // c.f.a.b.e3.f0
    public void n() {
        this.f7082k.a();
    }

    @Override // c.f.a.b.e3.f0
    public long o(long j2) {
        for (c.f.a.b.e3.d1.i<g> iVar : this.u) {
            iVar.T(j2);
        }
        for (n nVar : this.v) {
            nVar.c(j2);
        }
        return j2;
    }

    public final c.f.a.b.e3.d1.i<g> p(a aVar, c.f.a.b.g3.h hVar, long j2) {
        z0 z0VarB;
        int i2;
        z0 z0VarB2;
        int i3;
        int i4 = aVar.f7092f;
        boolean z = i4 != -1;
        o.c cVarK = null;
        if (z) {
            z0VarB = this.f7084m.b(i4);
            i2 = 1;
        } else {
            z0VarB = null;
            i2 = 0;
        }
        int i5 = aVar.f7093g;
        boolean z2 = i5 != -1;
        if (z2) {
            z0VarB2 = this.f7084m.b(i5);
            i2 += z0VarB2.f8056b;
        } else {
            z0VarB2 = null;
        }
        k1[] k1VarArr = new k1[i2];
        int[] iArr = new int[i2];
        if (z) {
            k1VarArr[0] = z0VarB.b(0);
            iArr[0] = 5;
            i3 = 1;
        } else {
            i3 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z2) {
            for (int i6 = 0; i6 < z0VarB2.f8056b; i6++) {
                k1VarArr[i3] = z0VarB2.b(i6);
                iArr[i3] = 3;
                arrayList.add(k1VarArr[i3]);
                i3++;
            }
        }
        if (this.x.f7159d && z) {
            cVarK = this.p.k();
        }
        o.c cVar = cVarK;
        c.f.a.b.e3.d1.i<g> iVar = new c.f.a.b.e3.d1.i<>(aVar.f7088b, iArr, k1VarArr, this.f7076e.a(this.f7082k, this.x, this.f7080i, this.y, aVar.f7087a, hVar, aVar.f7088b, this.f7081j, z, arrayList, cVar, this.f7077f), this, this.f7083l, j2, this.f7078g, this.s, this.f7079h, this.r);
        synchronized (this) {
            this.q.put(iVar, cVar);
        }
        return iVar;
    }

    @Override // c.f.a.b.e3.f0
    public long q() {
        return -9223372036854775807L;
    }

    @Override // c.f.a.b.e3.f0
    public void r(f0.a aVar, long j2) {
        this.t = aVar;
        aVar.k(this);
    }

    @Override // c.f.a.b.e3.f0
    public long s(c.f.a.b.g3.h[] hVarArr, boolean[] zArr, s0[] s0VarArr, boolean[] zArr2, long j2) {
        int[] iArrC = C(hVarArr);
        J(hVarArr, zArr, s0VarArr);
        K(hVarArr, s0VarArr, iArrC);
        L(hVarArr, s0VarArr, zArr2, j2, iArrC);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (s0 s0Var : s0VarArr) {
            if (s0Var instanceof c.f.a.b.e3.d1.i) {
                arrayList.add((c.f.a.b.e3.d1.i) s0Var);
            } else if (s0Var instanceof n) {
                arrayList2.add((n) s0Var);
            }
        }
        c.f.a.b.e3.d1.i<g>[] iVarArrF = F(arrayList.size());
        this.u = iVarArrF;
        arrayList.toArray(iVarArrF);
        n[] nVarArr = new n[arrayList2.size()];
        this.v = nVarArr;
        arrayList2.toArray(nVarArr);
        this.w = this.f7086o.a(this.u);
        return j2;
    }

    @Override // c.f.a.b.e3.f0
    public a1 t() {
        return this.f7084m;
    }

    @Override // c.f.a.b.e3.f0
    public void v(long j2, boolean z) {
        for (c.f.a.b.e3.d1.i<g> iVar : this.u) {
            iVar.v(j2, z);
        }
    }
}
