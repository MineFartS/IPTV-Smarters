package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class bky extends bjr<Integer> implements RandomAccess, blb, bmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bky f21336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f21337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21338c;

    static {
        bky bkyVar = new bky(new int[0], 0);
        f21336a = bkyVar;
        bkyVar.b();
    }

    public bky() {
        this(new int[10], 0);
    }

    private bky(int[] iArr, int i2) {
        this.f21337b = iArr;
        this.f21338c = i2;
    }

    public static bky f() {
        return f21336a;
    }

    private final String h(int i2) {
        int i3 = this.f21338c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    private final void i(int i2) {
        if (i2 < 0 || i2 >= this.f21338c) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f21338c)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        int[] iArr = this.f21337b;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f21337b, i2, iArr2, i2 + 1, this.f21338c - i2);
            this.f21337b = iArr2;
        }
        this.f21337b[i2] = iIntValue;
        this.f21338c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        bld.i(collection);
        if (!(collection instanceof bky)) {
            return super.addAll(collection);
        }
        bky bkyVar = (bky) collection;
        int i2 = bkyVar.f21338c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21338c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f21337b;
        if (i4 > iArr.length) {
            this.f21337b = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(bkyVar.f21337b, 0, this.f21337b, this.f21338c, bkyVar.f21338c);
        this.f21338c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blc
    public final /* bridge */ /* synthetic */ blc<Integer> d(int i2) {
        if (i2 >= this.f21338c) {
            return new bky(Arrays.copyOf(this.f21337b, i2), this.f21338c);
        }
        throw new IllegalArgumentException();
    }

    public final int e(int i2) {
        i(i2);
        return this.f21337b[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bky)) {
            return super.equals(obj);
        }
        bky bkyVar = (bky) obj;
        if (this.f21338c != bkyVar.f21338c) {
            return false;
        }
        int[] iArr = bkyVar.f21337b;
        for (int i2 = 0; i2 < this.f21338c; i2++) {
            if (this.f21337b[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void g(int i2) {
        a();
        int i3 = this.f21338c;
        int[] iArr = this.f21337b;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f21337b = iArr2;
        }
        int[] iArr3 = this.f21337b;
        int i4 = this.f21338c;
        this.f21338c = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return Integer.valueOf(e(i2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f21338c; i3++) {
            i2 = (i2 * 31) + this.f21337b[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f21338c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21337b[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        i(i2);
        int[] iArr = this.f21337b;
        int i3 = iArr[i2];
        if (i2 < this.f21338c - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f21338c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f21337b;
        System.arraycopy(iArr, i3, iArr, i2, this.f21338c - i3);
        this.f21338c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        i(i2);
        int[] iArr = this.f21337b;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21338c;
    }
}
