package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class bjv extends bjr<Boolean> implements RandomAccess, blc, bmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bjv f21252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean[] f21253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21254c;

    static {
        bjv bjvVar = new bjv(new boolean[0], 0);
        f21252a = bjvVar;
        bjvVar.b();
    }

    public bjv() {
        this(new boolean[10], 0);
    }

    private bjv(boolean[] zArr, int i2) {
        this.f21253b = zArr;
        this.f21254c = i2;
    }

    private final String f(int i2) {
        int i3 = this.f21254c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    private final void g(int i2) {
        if (i2 < 0 || i2 >= this.f21254c) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f21254c)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        boolean[] zArr = this.f21253b;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f21253b, i2, zArr2, i2 + 1, this.f21254c - i2);
            this.f21253b = zArr2;
        }
        this.f21253b[i2] = zBooleanValue;
        this.f21254c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        bld.i(collection);
        if (!(collection instanceof bjv)) {
            return super.addAll(collection);
        }
        bjv bjvVar = (bjv) collection;
        int i2 = bjvVar.f21254c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21254c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f21253b;
        if (i4 > zArr.length) {
            this.f21253b = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(bjvVar.f21253b, 0, this.f21253b, this.f21254c, bjvVar.f21254c);
        this.f21254c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blc
    public final /* bridge */ /* synthetic */ blc d(int i2) {
        if (i2 >= this.f21254c) {
            return new bjv(Arrays.copyOf(this.f21253b, i2), this.f21254c);
        }
        throw new IllegalArgumentException();
    }

    public final void e(boolean z) {
        a();
        int i2 = this.f21254c;
        boolean[] zArr = this.f21253b;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f21253b = zArr2;
        }
        boolean[] zArr3 = this.f21253b;
        int i3 = this.f21254c;
        this.f21254c = i3 + 1;
        zArr3[i3] = z;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjv)) {
            return super.equals(obj);
        }
        bjv bjvVar = (bjv) obj;
        if (this.f21254c != bjvVar.f21254c) {
            return false;
        }
        boolean[] zArr = bjvVar.f21253b;
        for (int i2 = 0; i2 < this.f21254c; i2++) {
            if (this.f21253b[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        g(i2);
        return Boolean.valueOf(this.f21253b[i2]);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iA = 1;
        for (int i2 = 0; i2 < this.f21254c; i2++) {
            iA = (iA * 31) + bld.a(this.f21253b[i2]);
        }
        return iA;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f21254c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21253b[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        g(i2);
        boolean[] zArr = this.f21253b;
        boolean z = zArr[i2];
        if (i2 < this.f21254c - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f21254c--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f21253b;
        System.arraycopy(zArr, i3, zArr, i2, this.f21254c - i3);
        this.f21254c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        g(i2);
        boolean[] zArr = this.f21253b;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21254c;
    }
}
