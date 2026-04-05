package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aia extends aio {
    public final boolean A;
    public final boolean B;
    private final SparseArray<Map<act, aid>> J;
    private final SparseBooleanArray K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f19781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19782d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f19784f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19785g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f19786h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f19787i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f19788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f19790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f19791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f19792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f19793o;
    public final aty<String> p;
    public final int q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final aty<String> w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final aia f19779a = new aib().a();
    public static final Parcelable.Creator<aia> CREATOR = new aic(1);

    public aia(int i2, int i3, int i4, int i5, boolean z, boolean z2, int i6, int i7, boolean z3, aty<String> atyVar, aty<String> atyVar2, int i8, int i9, boolean z4, aty<String> atyVar3, aty<String> atyVar4, int i10, boolean z5, boolean z6, SparseArray<Map<act, aid>> sparseArray, SparseBooleanArray sparseBooleanArray) {
        super(atyVar2, atyVar4, i10);
        this.f19780b = i2;
        this.f19781c = i3;
        this.f19782d = i4;
        this.f19783e = i5;
        this.f19784f = 0;
        this.f19785g = 0;
        this.f19786h = 0;
        this.f19787i = 0;
        this.f19788j = z;
        this.f19789k = false;
        this.f19790l = z2;
        this.f19791m = i6;
        this.f19792n = i7;
        this.f19793o = z3;
        this.p = atyVar;
        this.q = i8;
        this.r = i9;
        this.s = z4;
        this.t = false;
        this.u = false;
        this.v = false;
        this.w = atyVar3;
        this.x = false;
        this.y = false;
        this.z = z5;
        this.A = false;
        this.B = z6;
        this.J = sparseArray;
        this.K = sparseBooleanArray;
    }

    public aia(Parcel parcel) {
        super(parcel);
        this.f19780b = parcel.readInt();
        this.f19781c = parcel.readInt();
        this.f19782d = parcel.readInt();
        this.f19783e = parcel.readInt();
        this.f19784f = parcel.readInt();
        this.f19785g = parcel.readInt();
        this.f19786h = parcel.readInt();
        this.f19787i = parcel.readInt();
        this.f19788j = amn.V(parcel);
        this.f19789k = amn.V(parcel);
        this.f19790l = amn.V(parcel);
        this.f19791m = parcel.readInt();
        this.f19792n = parcel.readInt();
        this.f19793o = amn.V(parcel);
        ArrayList arrayList = new ArrayList();
        parcel.readList(arrayList, null);
        this.p = aty.l(arrayList);
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = amn.V(parcel);
        this.t = amn.V(parcel);
        this.u = amn.V(parcel);
        this.v = amn.V(parcel);
        ArrayList arrayList2 = new ArrayList();
        parcel.readList(arrayList2, null);
        this.w = aty.l(arrayList2);
        this.x = amn.V(parcel);
        this.y = amn.V(parcel);
        this.z = amn.V(parcel);
        this.A = amn.V(parcel);
        this.B = amn.V(parcel);
        int i2 = parcel.readInt();
        SparseArray<Map<act, aid>> sparseArray = new SparseArray<>(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            int i4 = parcel.readInt();
            int i5 = parcel.readInt();
            HashMap map = new HashMap(i5);
            for (int i6 = 0; i6 < i5; i6++) {
                act actVar = (act) parcel.readParcelable(act.class.getClassLoader());
                ajr.b(actVar);
                map.put(actVar, (aid) parcel.readParcelable(aid.class.getClassLoader()));
            }
            sparseArray.put(i4, map);
        }
        this.J = sparseArray;
        this.K = parcel.readSparseBooleanArray();
    }

    public static aia a(Context context) {
        return new aib(context).a();
    }

    public final aid b(int i2, act actVar) {
        Map<act, aid> map = this.J.get(i2);
        if (map != null) {
            return map.get(actVar);
        }
        return null;
    }

    public final boolean c(int i2) {
        return this.K.get(i2);
    }

    public final boolean d(int i2, act actVar) {
        Map<act, aid> map = this.J.get(i2);
        return map != null && map.containsKey(actVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aio, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aio
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aia.class == obj.getClass()) {
            aia aiaVar = (aia) obj;
            if (super.equals(obj) && this.f19780b == aiaVar.f19780b && this.f19781c == aiaVar.f19781c && this.f19782d == aiaVar.f19782d && this.f19783e == aiaVar.f19783e && this.f19784f == aiaVar.f19784f && this.f19785g == aiaVar.f19785g && this.f19786h == aiaVar.f19786h && this.f19787i == aiaVar.f19787i && this.f19788j == aiaVar.f19788j && this.f19789k == aiaVar.f19789k && this.f19790l == aiaVar.f19790l && this.f19793o == aiaVar.f19793o && this.f19791m == aiaVar.f19791m && this.f19792n == aiaVar.f19792n && this.p.equals(aiaVar.p) && this.q == aiaVar.q && this.r == aiaVar.r && this.s == aiaVar.s && this.t == aiaVar.t && this.u == aiaVar.u && this.v == aiaVar.v && this.w.equals(aiaVar.w) && this.x == aiaVar.x && this.y == aiaVar.y && this.z == aiaVar.z && this.A == aiaVar.A && this.B == aiaVar.B) {
                SparseBooleanArray sparseBooleanArray = this.K;
                SparseBooleanArray sparseBooleanArray2 = aiaVar.K;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            SparseArray<Map<act, aid>> sparseArray = this.J;
                            SparseArray<Map<act, aid>> sparseArray2 = aiaVar.J;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i3 = 0; i3 < size2; i3++) {
                                    int iIndexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i3));
                                    if (iIndexOfKey >= 0) {
                                        Map<act, aid> mapValueAt = sparseArray.valueAt(i3);
                                        Map<act, aid> mapValueAt2 = sparseArray2.valueAt(iIndexOfKey);
                                        if (mapValueAt2.size() == mapValueAt.size()) {
                                            for (Map.Entry<act, aid> entry : mapValueAt.entrySet()) {
                                                act key = entry.getKey();
                                                if (!mapValueAt2.containsKey(key) || !amn.O(entry.getValue(), mapValueAt2.get(key))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i2)) < 0) {
                                break;
                            }
                            i2++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aio
    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f19780b) * 31) + this.f19781c) * 31) + this.f19782d) * 31) + this.f19783e) * 31) + this.f19784f) * 31) + this.f19785g) * 31) + this.f19786h) * 31) + this.f19787i) * 31) + (this.f19788j ? 1 : 0)) * 31) + (this.f19789k ? 1 : 0)) * 31) + (this.f19790l ? 1 : 0)) * 31) + (this.f19793o ? 1 : 0)) * 31) + this.f19791m) * 31) + this.f19792n) * 31) + this.p.hashCode()) * 31) + this.q) * 31) + this.r) * 31) + (this.s ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + this.w.hashCode()) * 31) + (this.x ? 1 : 0)) * 31) + (this.y ? 1 : 0)) * 31) + (this.z ? 1 : 0)) * 31) + (this.A ? 1 : 0)) * 31) + (this.B ? 1 : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.aio, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.f19780b);
        parcel.writeInt(this.f19781c);
        parcel.writeInt(this.f19782d);
        parcel.writeInt(this.f19783e);
        parcel.writeInt(this.f19784f);
        parcel.writeInt(this.f19785g);
        parcel.writeInt(this.f19786h);
        parcel.writeInt(this.f19787i);
        amn.N(parcel, this.f19788j);
        amn.N(parcel, this.f19789k);
        amn.N(parcel, this.f19790l);
        parcel.writeInt(this.f19791m);
        parcel.writeInt(this.f19792n);
        amn.N(parcel, this.f19793o);
        parcel.writeList(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        amn.N(parcel, this.s);
        amn.N(parcel, this.t);
        amn.N(parcel, this.u);
        amn.N(parcel, this.v);
        parcel.writeList(this.w);
        amn.N(parcel, this.x);
        amn.N(parcel, this.y);
        amn.N(parcel, this.z);
        amn.N(parcel, this.A);
        amn.N(parcel, this.B);
        SparseArray<Map<act, aid>> sparseArray = this.J;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            int iKeyAt = sparseArray.keyAt(i3);
            Map<act, aid> mapValueAt = sparseArray.valueAt(i3);
            int size2 = mapValueAt.size();
            parcel.writeInt(iKeyAt);
            parcel.writeInt(size2);
            for (Map.Entry<act, aid> entry : mapValueAt.entrySet()) {
                parcel.writeParcelable(entry.getKey(), 0);
                parcel.writeParcelable(entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.K);
    }
}
