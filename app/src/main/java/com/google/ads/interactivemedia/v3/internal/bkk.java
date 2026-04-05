package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class bkk extends bjr<Double> implements RandomAccess, blc, bmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bkk f21287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double[] f21288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21289c;

    static {
        bkk bkkVar = new bkk(new double[0], 0);
        f21287a = bkkVar;
        bkkVar.b();
    }

    public bkk() {
        this(new double[10], 0);
    }

    private bkk(double[] dArr, int i2) {
        this.f21288b = dArr;
        this.f21289c = i2;
    }

    private final String f(int i2) {
        int i3 = this.f21289c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    private final void g(int i2) {
        if (i2 < 0 || i2 >= this.f21289c) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f21289c)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        double[] dArr = this.f21288b;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f21288b, i2, dArr2, i2 + 1, this.f21289c - i2);
            this.f21288b = dArr2;
        }
        this.f21288b[i2] = dDoubleValue;
        this.f21289c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Double) obj).doubleValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        bld.i(collection);
        if (!(collection instanceof bkk)) {
            return super.addAll(collection);
        }
        bkk bkkVar = (bkk) collection;
        int i2 = bkkVar.f21289c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21289c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f21288b;
        if (i4 > dArr.length) {
            this.f21288b = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(bkkVar.f21288b, 0, this.f21288b, this.f21289c, bkkVar.f21289c);
        this.f21289c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blc
    public final /* bridge */ /* synthetic */ blc d(int i2) {
        if (i2 >= this.f21289c) {
            return new bkk(Arrays.copyOf(this.f21288b, i2), this.f21289c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(double d2) {
        a();
        int i2 = this.f21289c;
        double[] dArr = this.f21288b;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f21288b = dArr2;
        }
        double[] dArr3 = this.f21288b;
        int i3 = this.f21289c;
        this.f21289c = i3 + 1;
        dArr3[i3] = d2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bkk)) {
            return super.equals(obj);
        }
        bkk bkkVar = (bkk) obj;
        if (this.f21289c != bkkVar.f21289c) {
            return false;
        }
        double[] dArr = bkkVar.f21288b;
        for (int i2 = 0; i2 < this.f21289c; i2++) {
            if (Double.doubleToLongBits(this.f21288b[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        g(i2);
        return Double.valueOf(this.f21288b[i2]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i2 = 0; i2 < this.f21289c; i2++) {
            iC = (iC * 31) + bld.c(Double.doubleToLongBits(this.f21288b[i2]));
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.f21289c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21288b[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        g(i2);
        double[] dArr = this.f21288b;
        double d2 = dArr[i2];
        if (i2 < this.f21289c - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f21289c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f21288b;
        System.arraycopy(dArr, i3, dArr, i2, this.f21289c - i3);
        this.f21289c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        g(i2);
        double[] dArr = this.f21288b;
        double d2 = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21289c;
    }
}
