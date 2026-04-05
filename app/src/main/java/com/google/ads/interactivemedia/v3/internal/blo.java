package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class blo extends bjr<Long> implements RandomAccess, blc, bmf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final blo f21362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long[] f21363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21364c;

    static {
        blo bloVar = new blo(new long[0], 0);
        f21362a = bloVar;
        bloVar.b();
    }

    public blo() {
        this(new long[10], 0);
    }

    private blo(long[] jArr, int i2) {
        this.f21363b = jArr;
        this.f21364c = i2;
    }

    private final String g(int i2) {
        int i3 = this.f21364c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    private final void h(int i2) {
        if (i2 < 0 || i2 >= this.f21364c) {
            throw new IndexOutOfBoundsException(g(i2));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f21364c)) {
            throw new IndexOutOfBoundsException(g(i2));
        }
        long[] jArr = this.f21363b;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f21363b, i2, jArr2, i2 + 1, this.f21364c - i2);
            this.f21363b = jArr2;
        }
        this.f21363b[i2] = jLongValue;
        this.f21364c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        bld.i(collection);
        if (!(collection instanceof blo)) {
            return super.addAll(collection);
        }
        blo bloVar = (blo) collection;
        int i2 = bloVar.f21364c;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f21364c;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f21363b;
        if (i4 > jArr.length) {
            this.f21363b = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(bloVar.f21363b, 0, this.f21363b, this.f21364c, bloVar.f21364c);
        this.f21364c = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blc
    public final /* bridge */ /* synthetic */ blc d(int i2) {
        if (i2 >= this.f21364c) {
            return new blo(Arrays.copyOf(this.f21363b, i2), this.f21364c);
        }
        throw new IllegalArgumentException();
    }

    public final long e(int i2) {
        h(i2);
        return this.f21363b[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blo)) {
            return super.equals(obj);
        }
        blo bloVar = (blo) obj;
        if (this.f21364c != bloVar.f21364c) {
            return false;
        }
        long[] jArr = bloVar.f21363b;
        for (int i2 = 0; i2 < this.f21364c; i2++) {
            if (this.f21363b[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j2) {
        a();
        int i2 = this.f21364c;
        long[] jArr = this.f21363b;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f21363b = jArr2;
        }
        long[] jArr3 = this.f21363b;
        int i3 = this.f21364c;
        this.f21364c = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        return Long.valueOf(e(i2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int iC = 1;
        for (int i2 = 0; i2 < this.f21364c; i2++) {
            iC = (iC * 31) + bld.c(this.f21363b[i2]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i2 = this.f21364c;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f21363b[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        h(i2);
        long[] jArr = this.f21363b;
        long j2 = jArr[i2];
        if (i2 < this.f21364c - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f21364c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f21363b;
        System.arraycopy(jArr, i3, jArr, i2, this.f21364c - i3);
        this.f21364c -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        h(i2);
        long[] jArr = this.f21363b;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21364c;
    }
}
