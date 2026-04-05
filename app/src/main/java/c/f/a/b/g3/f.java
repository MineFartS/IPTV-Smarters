package c.f.a.b.g3;

import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import c.f.a.b.e3.a1;
import c.f.a.b.e3.i0;
import c.f.a.b.e3.z0;
import c.f.a.b.g3.d;
import c.f.a.b.g3.h;
import c.f.a.b.g3.j;
import c.f.a.b.g3.m;
import c.f.a.b.i2;
import c.f.a.b.j3.x0;
import c.f.a.b.k1;
import c.f.a.b.k2;
import c.f.a.b.p2;
import c.f.b.b.k0;
import c.f.b.b.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes2.dex */
public class f extends j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f8434d = new int[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k0<Integer> f8435e = k0.a(new Comparator() { // from class: c.f.a.b.g3.c
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f.x((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k0<Integer> f8436f = k0.a(new Comparator() { // from class: c.f.a.b.g3.b
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f.y((Integer) obj, (Integer) obj2);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h.b f8437g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<d> f8438h;

    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8439b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f8440c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final d f8441d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f8442e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8443f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8444g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f8445h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f8446i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f8447j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f8448k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f8449l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final int f8450m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f8451n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f8452o;

        public b(k1 k1Var, d dVar, int i2) {
            int i3;
            int iQ;
            int iQ2;
            this.f8441d = dVar;
            this.f8440c = f.A(k1Var.f9329d);
            int i4 = 0;
            this.f8442e = f.u(i2, false);
            int i5 = 0;
            while (true) {
                i3 = Integer.MAX_VALUE;
                if (i5 >= dVar.p.size()) {
                    i5 = Integer.MAX_VALUE;
                    iQ = 0;
                    break;
                } else {
                    iQ = f.q(k1Var, dVar.p.get(i5), false);
                    if (iQ > 0) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            this.f8444g = i5;
            this.f8443f = iQ;
            this.f8445h = Integer.bitCount(k1Var.f9331f & dVar.q);
            boolean z = true;
            this.f8448k = (k1Var.f9330e & 1) != 0;
            int i6 = k1Var.z;
            this.f8449l = i6;
            this.f8450m = k1Var.A;
            int i7 = k1Var.f9334i;
            this.f8451n = i7;
            if ((i7 != -1 && i7 > dVar.s) || (i6 != -1 && i6 > dVar.r)) {
                z = false;
            }
            this.f8439b = z;
            String[] strArrG0 = x0.g0();
            int i8 = 0;
            while (true) {
                if (i8 >= strArrG0.length) {
                    i8 = Integer.MAX_VALUE;
                    iQ2 = 0;
                    break;
                } else {
                    iQ2 = f.q(k1Var, strArrG0[i8], false);
                    if (iQ2 > 0) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            this.f8446i = i8;
            this.f8447j = iQ2;
            while (true) {
                if (i4 < dVar.t.size()) {
                    String str = k1Var.f9338m;
                    if (str != null && str.equals(dVar.t.get(i4))) {
                        i3 = i4;
                        break;
                    }
                    i4++;
                } else {
                    break;
                }
            }
            this.f8452o = i3;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(b bVar) {
            k0 k0VarF = (this.f8439b && this.f8442e) ? f.f8435e : f.f8435e.f();
            c.f.b.b.n nVarF = c.f.b.b.n.j().g(this.f8442e, bVar.f8442e).f(Integer.valueOf(this.f8444g), Integer.valueOf(bVar.f8444g), k0.c().f()).d(this.f8443f, bVar.f8443f).d(this.f8445h, bVar.f8445h).g(this.f8439b, bVar.f8439b).f(Integer.valueOf(this.f8452o), Integer.valueOf(bVar.f8452o), k0.c().f()).f(Integer.valueOf(this.f8451n), Integer.valueOf(bVar.f8451n), this.f8441d.x ? f.f8435e.f() : f.f8436f).g(this.f8448k, bVar.f8448k).f(Integer.valueOf(this.f8446i), Integer.valueOf(bVar.f8446i), k0.c().f()).d(this.f8447j, bVar.f8447j).f(Integer.valueOf(this.f8449l), Integer.valueOf(bVar.f8449l), k0VarF).f(Integer.valueOf(this.f8450m), Integer.valueOf(bVar.f8450m), k0VarF);
            Integer numValueOf = Integer.valueOf(this.f8451n);
            Integer numValueOf2 = Integer.valueOf(bVar.f8451n);
            if (!x0.b(this.f8440c, bVar.f8440c)) {
                k0VarF = f.f8436f;
            }
            return nVarF.f(numValueOf, numValueOf2, k0VarF).i();
        }
    }

    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8453b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f8454c;

        public c(k1 k1Var, int i2) {
            this.f8453b = (k1Var.f9330e & 1) != 0;
            this.f8454c = f.u(i2, false);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(c cVar) {
            return c.f.b.b.n.j().g(this.f8454c, cVar.f8454c).g(this.f8453b, cVar.f8453b).i();
        }
    }

    public static final class d extends m implements Parcelable {

        @Deprecated
        public static final d A;
        public static final Parcelable.Creator<d> CREATOR;
        public static final d z;
        public final int B;
        public final boolean C;
        public final boolean D;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final boolean H;
        public final boolean I;
        public final boolean J;
        public final boolean K;
        public final boolean L;
        public final SparseArray<Map<a1, C0135f>> M;
        public final SparseBooleanArray N;

        public static class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d[] newArray(int i2) {
                return new d[i2];
            }
        }

        static {
            d dVarW = new e().w();
            z = dVarW;
            A = dVarW;
            CREATOR = new a();
        }

        public d(Parcel parcel) {
            super(parcel);
            this.C = x0.L0(parcel);
            this.D = x0.L0(parcel);
            this.E = x0.L0(parcel);
            this.F = x0.L0(parcel);
            this.G = x0.L0(parcel);
            this.H = x0.L0(parcel);
            this.I = x0.L0(parcel);
            this.B = parcel.readInt();
            this.J = x0.L0(parcel);
            this.K = x0.L0(parcel);
            this.L = x0.L0(parcel);
            this.M = n(parcel);
            this.N = (SparseBooleanArray) x0.i(parcel.readSparseBooleanArray());
        }

        public d(e eVar) {
            super(eVar);
            this.C = eVar.w;
            this.D = eVar.x;
            this.E = eVar.y;
            this.F = eVar.z;
            this.G = eVar.A;
            this.H = eVar.B;
            this.I = eVar.C;
            this.B = eVar.D;
            this.J = eVar.E;
            this.K = eVar.F;
            this.L = eVar.G;
            this.M = eVar.H;
            this.N = eVar.I;
        }

        public static boolean d(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                    return false;
                }
            }
            return true;
        }

        public static boolean e(SparseArray<Map<a1, C0135f>> sparseArray, SparseArray<Map<a1, C0135f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i2 = 0; i2 < size; i2++) {
                int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                if (iIndexOfKey < 0 || !f(sparseArray.valueAt(i2), sparseArray2.valueAt(iIndexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        public static boolean f(Map<a1, C0135f> map, Map<a1, C0135f> map2) {
            if (map2.size() != map.size()) {
                return false;
            }
            for (Map.Entry<a1, C0135f> entry : map.entrySet()) {
                a1 key = entry.getKey();
                if (!map2.containsKey(key) || !x0.b(entry.getValue(), map2.get(key))) {
                    return false;
                }
            }
            return true;
        }

        public static d j(Context context) {
            return new e(context).w();
        }

        public static SparseArray<Map<a1, C0135f>> n(Parcel parcel) {
            int i2 = parcel.readInt();
            SparseArray<Map<a1, C0135f>> sparseArray = new SparseArray<>(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = parcel.readInt();
                int i5 = parcel.readInt();
                HashMap map = new HashMap(i5);
                for (int i6 = 0; i6 < i5; i6++) {
                    map.put((a1) c.f.a.b.j3.g.e(parcel.readParcelable(a1.class.getClassLoader())), (C0135f) parcel.readParcelable(C0135f.class.getClassLoader()));
                }
                sparseArray.put(i4, map);
            }
            return sparseArray;
        }

        public static void o(Parcel parcel, SparseArray<Map<a1, C0135f>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                Map<a1, C0135f> mapValueAt = sparseArray.valueAt(i2);
                int size2 = mapValueAt.size();
                parcel.writeInt(iKeyAt);
                parcel.writeInt(size2);
                for (Map.Entry<a1, C0135f> entry : mapValueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // c.f.a.b.g3.m, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // c.f.a.b.g3.m
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(dVar) && this.C == dVar.C && this.D == dVar.D && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H == dVar.H && this.I == dVar.I && this.B == dVar.B && this.J == dVar.J && this.K == dVar.K && this.L == dVar.L && d(this.N, dVar.N) && e(this.M, dVar.M);
        }

        public e h() {
            return new e(this);
        }

        @Override // c.f.a.b.g3.m
        public int hashCode() {
            return ((((((((((((((((((((((super.hashCode() + 31) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + (this.H ? 1 : 0)) * 31) + (this.I ? 1 : 0)) * 31) + this.B) * 31) + (this.J ? 1 : 0)) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0);
        }

        public final boolean k(int i2) {
            return this.N.get(i2);
        }

        public final C0135f l(int i2, a1 a1Var) {
            Map<a1, C0135f> map = this.M.get(i2);
            if (map != null) {
                return map.get(a1Var);
            }
            return null;
        }

        public final boolean m(int i2, a1 a1Var) {
            Map<a1, C0135f> map = this.M.get(i2);
            return map != null && map.containsKey(a1Var);
        }

        @Override // c.f.a.b.g3.m, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            x0.g1(parcel, this.C);
            x0.g1(parcel, this.D);
            x0.g1(parcel, this.E);
            x0.g1(parcel, this.F);
            x0.g1(parcel, this.G);
            x0.g1(parcel, this.H);
            x0.g1(parcel, this.I);
            parcel.writeInt(this.B);
            x0.g1(parcel, this.J);
            x0.g1(parcel, this.K);
            x0.g1(parcel, this.L);
            o(parcel, this.M);
            parcel.writeSparseBooleanArray(this.N);
        }
    }

    public static final class e extends m.b {
        public boolean A;
        public boolean B;
        public boolean C;
        public int D;
        public boolean E;
        public boolean F;
        public boolean G;
        public final SparseArray<Map<a1, C0135f>> H;
        public final SparseBooleanArray I;
        public boolean w;
        public boolean x;
        public boolean y;
        public boolean z;

        @Deprecated
        public e() {
            this.H = new SparseArray<>();
            this.I = new SparseBooleanArray();
            S();
        }

        public e(Context context) {
            super(context);
            this.H = new SparseArray<>();
            this.I = new SparseBooleanArray();
            S();
        }

        public e(d dVar) {
            super(dVar);
            this.D = dVar.B;
            this.w = dVar.C;
            this.x = dVar.D;
            this.y = dVar.E;
            this.z = dVar.F;
            this.A = dVar.G;
            this.B = dVar.H;
            this.C = dVar.I;
            this.E = dVar.J;
            this.F = dVar.K;
            this.G = dVar.L;
            this.H = R(dVar.M);
            this.I = dVar.N.clone();
        }

        public static SparseArray<Map<a1, C0135f>> R(SparseArray<Map<a1, C0135f>> sparseArray) {
            SparseArray<Map<a1, C0135f>> sparseArray2 = new SparseArray<>();
            for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                sparseArray2.put(sparseArray.keyAt(i2), new HashMap(sparseArray.valueAt(i2)));
            }
            return sparseArray2;
        }

        @Override // c.f.a.b.g3.m.b
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        public d w() {
            return new d(this);
        }

        public final e Q(int i2) {
            Map<a1, C0135f> map = this.H.get(i2);
            if (map != null && !map.isEmpty()) {
                this.H.remove(i2);
            }
            return this;
        }

        public final void S() {
            this.w = true;
            this.x = false;
            this.y = true;
            this.z = true;
            this.A = false;
            this.B = false;
            this.C = false;
            this.D = 0;
            this.E = true;
            this.F = false;
            this.G = true;
        }

        public e T(int i2) {
            this.D = i2;
            return this;
        }

        public e U(boolean z) {
            super.x(z);
            return this;
        }

        @Override // c.f.a.b.g3.m.b
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public e y(Context context) {
            super.y(context);
            return this;
        }

        public final e W(int i2, boolean z) {
            if (this.I.get(i2) == z) {
                return this;
            }
            if (z) {
                this.I.put(i2, true);
            } else {
                this.I.delete(i2);
            }
            return this;
        }

        public final e X(int i2, a1 a1Var, C0135f c0135f) {
            Map<a1, C0135f> map = this.H.get(i2);
            if (map == null) {
                map = new HashMap<>();
                this.H.put(i2, map);
            }
            if (map.containsKey(a1Var) && x0.b(map.get(a1Var), c0135f)) {
                return this;
            }
            map.put(a1Var, c0135f);
            return this;
        }

        @Override // c.f.a.b.g3.m.b
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public e A(int i2, int i3, boolean z) {
            super.A(i2, i3, z);
            return this;
        }

        @Override // c.f.a.b.g3.m.b
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public e B(Context context, boolean z) {
            super.B(context, z);
            return this;
        }
    }

    /* JADX INFO: renamed from: c.f.a.b.g3.f$f, reason: collision with other inner class name */
    public static final class C0135f implements Parcelable {
        public static final Parcelable.Creator<C0135f> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8455b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f8456c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f8457d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f8458e;

        /* JADX INFO: renamed from: c.f.a.b.g3.f$f$a */
        public static class a implements Parcelable.Creator<C0135f> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0135f createFromParcel(Parcel parcel) {
                return new C0135f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0135f[] newArray(int i2) {
                return new C0135f[i2];
            }
        }

        public C0135f(int i2, int... iArr) {
            this(i2, iArr, 0);
        }

        public C0135f(int i2, int[] iArr, int i3) {
            this.f8455b = i2;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            this.f8456c = iArrCopyOf;
            this.f8457d = iArr.length;
            this.f8458e = i3;
            Arrays.sort(iArrCopyOf);
        }

        public C0135f(Parcel parcel) {
            this.f8455b = parcel.readInt();
            int i2 = parcel.readByte();
            this.f8457d = i2;
            int[] iArr = new int[i2];
            this.f8456c = iArr;
            parcel.readIntArray(iArr);
            this.f8458e = parcel.readInt();
        }

        public boolean b(int i2) {
            for (int i3 : this.f8456c) {
                if (i3 == i2) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0135f.class != obj.getClass()) {
                return false;
            }
            C0135f c0135f = (C0135f) obj;
            return this.f8455b == c0135f.f8455b && Arrays.equals(this.f8456c, c0135f.f8456c) && this.f8458e == c0135f.f8458e;
        }

        public int hashCode() {
            return (((this.f8455b * 31) + Arrays.hashCode(this.f8456c)) * 31) + this.f8458e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f8455b);
            parcel.writeInt(this.f8456c.length);
            parcel.writeIntArray(this.f8456c);
            parcel.writeInt(this.f8458e);
        }
    }

    public static final class g implements Comparable<g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8459b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f8460c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f8461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f8462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8464g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f8465h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f8466i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f8467j;

        public g(k1 k1Var, d dVar, int i2, String str) {
            int iQ;
            boolean z = false;
            this.f8460c = f.u(i2, false);
            int i3 = k1Var.f9330e & (dVar.B ^ (-1));
            this.f8461d = (i3 & 1) != 0;
            this.f8462e = (i3 & 2) != 0;
            int i4 = Integer.MAX_VALUE;
            t<String> tVarK = dVar.u.isEmpty() ? t.K(BuildConfig.FLAVOR) : dVar.u;
            int i5 = 0;
            while (true) {
                if (i5 >= tVarK.size()) {
                    iQ = 0;
                    break;
                }
                iQ = f.q(k1Var, tVarK.get(i5), dVar.w);
                if (iQ > 0) {
                    i4 = i5;
                    break;
                }
                i5++;
            }
            this.f8463f = i4;
            this.f8464g = iQ;
            int iBitCount = Integer.bitCount(k1Var.f9331f & dVar.v);
            this.f8465h = iBitCount;
            this.f8467j = (k1Var.f9331f & 1088) != 0;
            int iQ2 = f.q(k1Var, str, f.A(str) == null);
            this.f8466i = iQ2;
            if (iQ > 0 || ((dVar.u.isEmpty() && iBitCount > 0) || this.f8461d || (this.f8462e && iQ2 > 0))) {
                z = true;
            }
            this.f8459b = z;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(g gVar) {
            c.f.b.b.n nVarD = c.f.b.b.n.j().g(this.f8460c, gVar.f8460c).f(Integer.valueOf(this.f8463f), Integer.valueOf(gVar.f8463f), k0.c().f()).d(this.f8464g, gVar.f8464g).d(this.f8465h, gVar.f8465h).g(this.f8461d, gVar.f8461d).f(Boolean.valueOf(this.f8462e), Boolean.valueOf(gVar.f8462e), this.f8464g == 0 ? k0.c() : k0.c().f()).d(this.f8466i, gVar.f8466i);
            if (this.f8465h == 0) {
                nVarD = nVarD.h(this.f8467j, gVar.f8467j);
            }
            return nVarD.i();
        }
    }

    public static final class h implements Comparable<h> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f8469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f8470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f8471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f8472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f8473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f8474h;

        /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x005e  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(c.f.a.b.k1 r7, c.f.a.b.g3.f.d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f8469c = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.r
                if (r4 == r3) goto L14
                int r5 = r8.f8493d
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.s
                if (r4 == r3) goto L1c
                int r5 = r8.f8494e
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.t
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f8495f
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f9334i
                if (r4 == r3) goto L31
                int r5 = r8.f8496g
                if (r4 > r5) goto L33
            L31:
                r4 = 1
                goto L34
            L33:
                r4 = 0
            L34:
                r6.f8468b = r4
                if (r10 == 0) goto L5e
                int r10 = r7.r
                if (r10 == r3) goto L40
                int r4 = r8.f8497h
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.s
                if (r10 == r3) goto L48
                int r4 = r8.f8498i
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.t
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.f8499j
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f9334i
                if (r10 == r3) goto L5f
                int r0 = r8.f8500k
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = 0
            L5f:
                r6.f8470d = r1
                boolean r9 = c.f.a.b.g3.f.u(r9, r2)
                r6.f8471e = r9
                int r9 = r7.f9334i
                r6.f8472f = r9
                int r9 = r7.d()
                r6.f8473g = r9
                r9 = 2147483647(0x7fffffff, float:NaN)
            L74:
                c.f.b.b.t<java.lang.String> r10 = r8.f8504o
                int r10 = r10.size()
                if (r2 >= r10) goto L91
                java.lang.String r10 = r7.f9338m
                if (r10 == 0) goto L8e
                c.f.b.b.t<java.lang.String> r0 = r8.f8504o
                java.lang.Object r0 = r0.get(r2)
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L8e
                r9 = r2
                goto L91
            L8e:
                int r2 = r2 + 1
                goto L74
            L91:
                r6.f8474h = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.g3.f.h.<init>(c.f.a.b.k1, c.f.a.b.g3.f$d, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(h hVar) {
            k0 k0VarF = (this.f8468b && this.f8471e) ? f.f8435e : f.f8435e.f();
            return c.f.b.b.n.j().g(this.f8471e, hVar.f8471e).g(this.f8468b, hVar.f8468b).g(this.f8470d, hVar.f8470d).f(Integer.valueOf(this.f8474h), Integer.valueOf(hVar.f8474h), k0.c().f()).f(Integer.valueOf(this.f8472f), Integer.valueOf(hVar.f8472f), this.f8469c.x ? f.f8435e.f() : f.f8436f).f(Integer.valueOf(this.f8473g), Integer.valueOf(hVar.f8473g), k0VarF).f(Integer.valueOf(this.f8472f), Integer.valueOf(hVar.f8472f), k0VarF).i();
        }
    }

    @Deprecated
    public f() {
        this(d.z, new d.b());
    }

    public f(Context context) {
        this(context, new d.b());
    }

    public f(Context context, h.b bVar) {
        this(d.j(context), bVar);
    }

    public f(d dVar, h.b bVar) {
        this.f8437g = bVar;
        this.f8438h = new AtomicReference<>(dVar);
    }

    public static String A(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    public static boolean B(int[][] iArr, a1 a1Var, c.f.a.b.g3.h hVar) {
        if (hVar == null) {
            return false;
        }
        int iC = a1Var.c(hVar.a());
        for (int i2 = 0; i2 < hVar.length(); i2++) {
            if (i2.e(iArr[iC][hVar.h(i2)]) != 32) {
                return false;
            }
        }
        return true;
    }

    public static h.a C(a1 a1Var, int[][] iArr, int i2, d dVar) {
        a1 a1Var2 = a1Var;
        d dVar2 = dVar;
        int i3 = dVar2.E ? 24 : 16;
        boolean z = dVar2.D && (i2 & i3) != 0;
        int i4 = 0;
        while (i4 < a1Var2.f6903c) {
            z0 z0VarB = a1Var2.b(i4);
            int i5 = i4;
            int[] iArrP = p(z0VarB, iArr[i4], z, i3, dVar2.f8493d, dVar2.f8494e, dVar2.f8495f, dVar2.f8496g, dVar2.f8497h, dVar2.f8498i, dVar2.f8499j, dVar2.f8500k, dVar2.f8501l, dVar2.f8502m, dVar2.f8503n);
            if (iArrP.length > 0) {
                return new h.a(z0VarB, iArrP);
            }
            i4 = i5 + 1;
            a1Var2 = a1Var;
            dVar2 = dVar;
        }
        return null;
    }

    public static h.a F(a1 a1Var, int[][] iArr, d dVar) {
        int i2 = -1;
        z0 z0Var = null;
        h hVar = null;
        for (int i3 = 0; i3 < a1Var.f6903c; i3++) {
            z0 z0VarB = a1Var.b(i3);
            List<Integer> listT = t(z0VarB, dVar.f8501l, dVar.f8502m, dVar.f8503n);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < z0VarB.f8056b; i4++) {
                k1 k1VarB = z0VarB.b(i4);
                if ((k1VarB.f9331f & 16384) == 0 && u(iArr2[i4], dVar.J)) {
                    h hVar2 = new h(k1VarB, dVar, iArr2[i4], listT.contains(Integer.valueOf(i4)));
                    if ((hVar2.f8468b || dVar.C) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        z0Var = z0VarB;
                        i2 = i4;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (z0Var == null) {
            return null;
        }
        return new h.a(z0Var, i2);
    }

    public static void m(z0 z0Var, int[] iArr, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int iIntValue = list.get(size).intValue();
            if (!w(z0Var.b(iIntValue), str, iArr[iIntValue], i2, i3, i4, i5, i6, i7, i8, i9, i10)) {
                list.remove(size);
            }
        }
    }

    public static int[] n(z0 z0Var, int[] iArr, int i2, int i3, boolean z, boolean z2, boolean z3) {
        k1 k1VarB = z0Var.b(i2);
        int[] iArr2 = new int[z0Var.f8056b];
        int i4 = 0;
        for (int i5 = 0; i5 < z0Var.f8056b; i5++) {
            if (i5 == i2 || v(z0Var.b(i5), iArr[i5], k1VarB, i3, z, z2, z3)) {
                iArr2[i4] = i5;
                i4++;
            }
        }
        return Arrays.copyOf(iArr2, i4);
    }

    public static int o(z0 z0Var, int[] iArr, int i2, String str, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, List<Integer> list) {
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            int iIntValue = list.get(i12).intValue();
            if (w(z0Var.b(iIntValue), str, iArr[iIntValue], i2, i3, i4, i5, i6, i7, i8, i9, i10)) {
                i11++;
            }
        }
        return i11;
    }

    public static int[] p(z0 z0Var, int[] iArr, boolean z, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, boolean z2) {
        String str;
        int i13;
        int i14;
        HashSet hashSet;
        if (z0Var.f8056b < 2) {
            return f8434d;
        }
        List<Integer> listT = t(z0Var, i11, i12, z2);
        if (listT.size() < 2) {
            return f8434d;
        }
        if (z) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i15 = 0;
            int i16 = 0;
            while (i16 < listT.size()) {
                String str3 = z0Var.b(listT.get(i16).intValue()).f9338m;
                if (hashSet2.add(str3)) {
                    i13 = i15;
                    i14 = i16;
                    hashSet = hashSet2;
                    int iO = o(z0Var, iArr, i2, str3, i3, i4, i5, i6, i7, i8, i9, i10, listT);
                    if (iO > i13) {
                        i15 = iO;
                        str2 = str3;
                    }
                    i16 = i14 + 1;
                    hashSet2 = hashSet;
                } else {
                    i13 = i15;
                    i14 = i16;
                    hashSet = hashSet2;
                }
                i15 = i13;
                i16 = i14 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        m(z0Var, iArr, i2, str, i3, i4, i5, i6, i7, i8, i9, i10, listT);
        return listT.size() < 2 ? f8434d : c.f.b.f.c.j(listT);
    }

    public static int q(k1 k1Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(k1Var.f9329d)) {
            return 4;
        }
        String strA = A(str);
        String strA2 = A(k1Var.f9329d);
        if (strA2 == null || strA == null) {
            return (z && strA2 == null) ? 1 : 0;
        }
        if (strA2.startsWith(strA) || strA.startsWith(strA2)) {
            return 3;
        }
        return x0.V0(strA2, "-")[0].equals(x0.V0(strA, "-")[0]) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static android.graphics.Point r(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = c.f.a.b.j3.x0.k(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = c.f.a.b.j3.x0.k(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.b.g3.f.r(boolean, int, int, int, int):android.graphics.Point");
    }

    public static List<Integer> t(z0 z0Var, int i2, int i3, boolean z) {
        int i4;
        ArrayList arrayList = new ArrayList(z0Var.f8056b);
        for (int i5 = 0; i5 < z0Var.f8056b; i5++) {
            arrayList.add(Integer.valueOf(i5));
        }
        if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
            int i6 = Integer.MAX_VALUE;
            for (int i7 = 0; i7 < z0Var.f8056b; i7++) {
                k1 k1VarB = z0Var.b(i7);
                int i8 = k1VarB.r;
                if (i8 > 0 && (i4 = k1VarB.s) > 0) {
                    Point pointR = r(z, i2, i3, i8, i4);
                    int i9 = k1VarB.r;
                    int i10 = k1VarB.s;
                    int i11 = i9 * i10;
                    if (i9 >= ((int) (pointR.x * 0.98f)) && i10 >= ((int) (pointR.y * 0.98f)) && i11 < i6) {
                        i6 = i11;
                    }
                }
            }
            if (i6 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int iD = z0Var.b(((Integer) arrayList.get(size)).intValue()).d();
                    if (iD == -1 || iD > i6) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    public static boolean u(int i2, boolean z) {
        int iD = i2.d(i2);
        return iD == 4 || (z && iD == 3);
    }

    public static boolean v(k1 k1Var, int i2, k1 k1Var2, int i3, boolean z, boolean z2, boolean z3) {
        int i4;
        int i5;
        String str;
        int i6;
        if (!u(i2, false) || (i4 = k1Var.f9334i) == -1 || i4 > i3) {
            return false;
        }
        if (!z3 && ((i6 = k1Var.z) == -1 || i6 != k1Var2.z)) {
            return false;
        }
        if (z || ((str = k1Var.f9338m) != null && TextUtils.equals(str, k1Var2.f9338m))) {
            return z2 || ((i5 = k1Var.A) != -1 && i5 == k1Var2.A);
        }
        return false;
    }

    public static boolean w(k1 k1Var, String str, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        int i12;
        if ((k1Var.f9331f & 16384) != 0 || !u(i2, false) || (i2 & i3) == 0) {
            return false;
        }
        if (str != null && !x0.b(k1Var.f9338m, str)) {
            return false;
        }
        int i13 = k1Var.r;
        if (i13 != -1 && (i8 > i13 || i13 > i4)) {
            return false;
        }
        int i14 = k1Var.s;
        if (i14 != -1 && (i9 > i14 || i14 > i5)) {
            return false;
        }
        float f2 = k1Var.t;
        return (f2 == -1.0f || (((float) i10) <= f2 && f2 <= ((float) i6))) && (i12 = k1Var.f9334i) != -1 && i11 <= i12 && i12 <= i7;
    }

    public static /* synthetic */ int x(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static /* synthetic */ int y(Integer num, Integer num2) {
        return 0;
    }

    public static void z(j.a aVar, int[][][] iArr, k2[] k2VarArr, c.f.a.b.g3.h[] hVarArr) {
        boolean z;
        boolean z2 = false;
        int i2 = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < aVar.c(); i4++) {
            int iF = aVar.f(i4);
            c.f.a.b.g3.h hVar = hVarArr[i4];
            if ((iF == 1 || iF == 2) && hVar != null && B(iArr[i4], aVar.g(i4), hVar)) {
                if (iF == 1) {
                    if (i3 != -1) {
                        z = false;
                        break;
                    }
                    i3 = i4;
                } else {
                    if (i2 != -1) {
                        z = false;
                        break;
                    }
                    i2 = i4;
                }
            }
        }
        z = true;
        if (i3 != -1 && i2 != -1) {
            z2 = true;
        }
        if (z && z2) {
            k2 k2Var = new k2(true);
            k2VarArr[i3] = k2Var;
            k2VarArr[i2] = k2Var;
        }
    }

    public h.a[] D(j.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        int i2;
        String str;
        int i3;
        b bVar;
        String str2;
        int i4;
        int iC = aVar.c();
        h.a[] aVarArr = new h.a[iC];
        int i5 = 0;
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (i6 >= iC) {
                break;
            }
            if (2 == aVar.f(i6)) {
                if (!z) {
                    aVarArr[i6] = I(aVar.g(i6), iArr[i6], iArr2[i6], dVar, true);
                    z = aVarArr[i6] != null;
                }
                i7 |= aVar.g(i6).f6903c <= 0 ? 0 : 1;
            }
            i6++;
        }
        b bVar2 = null;
        String str3 = null;
        int i8 = -1;
        int i9 = 0;
        while (i9 < iC) {
            if (i2 == aVar.f(i9)) {
                i3 = i8;
                bVar = bVar2;
                str2 = str3;
                i4 = i9;
                Pair<h.a, b> pairE = E(aVar.g(i9), iArr[i9], iArr2[i9], dVar, dVar.L || i7 == 0);
                if (pairE != null && (bVar == null || ((b) pairE.second).compareTo(bVar) > 0)) {
                    if (i3 != -1) {
                        aVarArr[i3] = null;
                    }
                    h.a aVar2 = (h.a) pairE.first;
                    aVarArr[i4] = aVar2;
                    str3 = aVar2.f8475a.b(aVar2.f8476b[0]).f9329d;
                    bVar2 = (b) pairE.second;
                    i8 = i4;
                }
                i9 = i4 + 1;
                i2 = 1;
            } else {
                i3 = i8;
                bVar = bVar2;
                str2 = str3;
                i4 = i9;
            }
            i8 = i3;
            bVar2 = bVar;
            str3 = str2;
            i9 = i4 + 1;
            i2 = 1;
        }
        String str4 = str3;
        g gVar = null;
        int i10 = -1;
        while (i5 < iC) {
            int iF = aVar.f(i5);
            if (iF == 1) {
                str = str4;
            } else if (iF == 2) {
                str = str4;
            } else if (iF != 3) {
                aVarArr[i5] = G(iF, aVar.g(i5), iArr[i5], dVar);
                str = str4;
            } else {
                str = str4;
                Pair<h.a, g> pairH = H(aVar.g(i5), iArr[i5], dVar, str);
                if (pairH != null && (gVar == null || ((g) pairH.second).compareTo(gVar) > 0)) {
                    if (i10 != -1) {
                        aVarArr[i10] = null;
                    }
                    aVarArr[i5] = (h.a) pairH.first;
                    gVar = (g) pairH.second;
                    i10 = i5;
                }
            }
            i5++;
            str4 = str;
        }
        return aVarArr;
    }

    public Pair<h.a, b> E(a1 a1Var, int[][] iArr, int i2, d dVar, boolean z) {
        h.a aVar = null;
        b bVar = null;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < a1Var.f6903c; i5++) {
            z0 z0VarB = a1Var.b(i5);
            int[] iArr2 = iArr[i5];
            for (int i6 = 0; i6 < z0VarB.f8056b; i6++) {
                if (u(iArr2[i6], dVar.J)) {
                    b bVar2 = new b(z0VarB.b(i6), dVar, iArr2[i6]);
                    if ((bVar2.f8439b || dVar.F) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i3 = i5;
                        i4 = i6;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i3 == -1) {
            return null;
        }
        z0 z0VarB2 = a1Var.b(i3);
        if (!dVar.y && !dVar.x && z) {
            int[] iArrN = n(z0VarB2, iArr[i3], i4, dVar.s, dVar.G, dVar.H, dVar.I);
            if (iArrN.length > 1) {
                aVar = new h.a(z0VarB2, iArrN);
            }
        }
        if (aVar == null) {
            aVar = new h.a(z0VarB2, i4);
        }
        return Pair.create(aVar, c.f.a.b.j3.g.e(bVar));
    }

    public h.a G(int i2, a1 a1Var, int[][] iArr, d dVar) {
        z0 z0Var = null;
        c cVar = null;
        int i3 = 0;
        for (int i4 = 0; i4 < a1Var.f6903c; i4++) {
            z0 z0VarB = a1Var.b(i4);
            int[] iArr2 = iArr[i4];
            for (int i5 = 0; i5 < z0VarB.f8056b; i5++) {
                if (u(iArr2[i5], dVar.J)) {
                    c cVar2 = new c(z0VarB.b(i5), iArr2[i5]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        z0Var = z0VarB;
                        i3 = i5;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (z0Var == null) {
            return null;
        }
        return new h.a(z0Var, i3);
    }

    public Pair<h.a, g> H(a1 a1Var, int[][] iArr, d dVar, String str) {
        int i2 = -1;
        z0 z0Var = null;
        g gVar = null;
        for (int i3 = 0; i3 < a1Var.f6903c; i3++) {
            z0 z0VarB = a1Var.b(i3);
            int[] iArr2 = iArr[i3];
            for (int i4 = 0; i4 < z0VarB.f8056b; i4++) {
                if (u(iArr2[i4], dVar.J)) {
                    g gVar2 = new g(z0VarB.b(i4), dVar, iArr2[i4], str);
                    if (gVar2.f8459b && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        z0Var = z0VarB;
                        i2 = i4;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (z0Var == null) {
            return null;
        }
        return Pair.create(new h.a(z0Var, i2), c.f.a.b.j3.g.e(gVar));
    }

    public h.a I(a1 a1Var, int[][] iArr, int i2, d dVar, boolean z) {
        h.a aVarC = (dVar.y || dVar.x || !z) ? null : C(a1Var, iArr, i2, dVar);
        return aVarC == null ? F(a1Var, iArr, dVar) : aVarC;
    }

    public void J(d dVar) {
        c.f.a.b.j3.g.e(dVar);
        if (this.f8438h.getAndSet(dVar).equals(dVar)) {
            return;
        }
        c();
    }

    public void K(e eVar) {
        J(eVar.w());
    }

    @Override // c.f.a.b.g3.j
    public final Pair<k2[], c.f.a.b.g3.h[]> j(j.a aVar, int[][][] iArr, int[] iArr2, i0.a aVar2, p2 p2Var) {
        d dVar = this.f8438h.get();
        int iC = aVar.c();
        h.a[] aVarArrD = D(aVar, iArr, iArr2, dVar);
        int i2 = 0;
        while (true) {
            if (i2 >= iC) {
                break;
            }
            if (dVar.k(i2)) {
                aVarArrD[i2] = null;
            } else {
                a1 a1VarG = aVar.g(i2);
                if (dVar.m(i2, a1VarG)) {
                    C0135f c0135fL = dVar.l(i2, a1VarG);
                    aVarArrD[i2] = c0135fL != null ? new h.a(a1VarG.b(c0135fL.f8455b), c0135fL.f8456c, c0135fL.f8458e) : null;
                }
            }
            i2++;
        }
        c.f.a.b.g3.h[] hVarArrA = this.f8437g.a(aVarArrD, a(), aVar2, p2Var);
        k2[] k2VarArr = new k2[iC];
        for (int i3 = 0; i3 < iC; i3++) {
            k2VarArr[i3] = !dVar.k(i3) && (aVar.f(i3) == 7 || hVarArrA[i3] != null) ? k2.f9356a : null;
        }
        if (dVar.K) {
            z(aVar, iArr, k2VarArr, hVarArrA);
        }
        return Pair.create(k2VarArr, hVarArrA);
    }

    public d s() {
        return this.f8438h.get();
    }
}
