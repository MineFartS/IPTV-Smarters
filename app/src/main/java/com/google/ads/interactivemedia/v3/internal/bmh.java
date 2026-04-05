package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class bmh<E> extends bjr<E> implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bmh<Object> f21405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private E[] f21406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21407c;

    static {
        bmh<Object> bmhVar = new bmh<>(new Object[0], 0);
        f21405a = bmhVar;
        bmhVar.b();
    }

    public bmh() {
        this(new Object[10], 0);
    }

    private bmh(E[] eArr, int i2) {
        this.f21406b = eArr;
        this.f21407c = i2;
    }

    public static <E> bmh<E> e() {
        return (bmh<E>) f21405a;
    }

    private final String f(int i2) {
        int i3 = this.f21407c;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    private final void g(int i2) {
        if (i2 < 0 || i2 >= this.f21407c) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f21407c)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        E[] eArr = this.f21406b;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) new Object[((i3 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.f21406b, i2, eArr2, i2 + 1, this.f21407c - i2);
            this.f21406b = eArr2;
        }
        this.f21406b[i2] = e2;
        this.f21407c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        a();
        int i2 = this.f21407c;
        E[] eArr = this.f21406b;
        if (i2 == eArr.length) {
            this.f21406b = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f21406b;
        int i3 = this.f21407c;
        this.f21407c = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.blc
    public final /* bridge */ /* synthetic */ blc d(int i2) {
        if (i2 >= this.f21407c) {
            return new bmh(Arrays.copyOf(this.f21406b, i2), this.f21407c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        g(i2);
        return this.f21406b[i2];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        a();
        g(i2);
        E[] eArr = this.f21406b;
        E e2 = eArr[i2];
        if (i2 < this.f21407c - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.f21407c--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bjr, java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        a();
        g(i2);
        E[] eArr = this.f21406b;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21407c;
    }
}
