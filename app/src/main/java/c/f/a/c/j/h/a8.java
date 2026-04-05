package c.f.a.c.j.h;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class a8<E> extends u4<E> implements RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a8<Object> f13198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E[] f13199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f13200e;

    static {
        a8<Object> a8Var = new a8<>(new Object[0], 0);
        f13198c = a8Var;
        a8Var.k();
    }

    public a8(E[] eArr, int i2) {
        this.f13199d = eArr;
        this.f13200e = i2;
    }

    public static <E> a8<E> f() {
        return (a8<E>) f13198c;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        int i3;
        d();
        if (i2 < 0 || i2 > (i3 = this.f13200e)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        E[] eArr = this.f13199d;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) new Object[((i3 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.f13199d, i2, eArr2, i2 + 1, this.f13200e - i2);
            this.f13199d = eArr2;
        }
        this.f13199d[i2] = e2;
        this.f13200e++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        d();
        int i2 = this.f13200e;
        E[] eArr = this.f13199d;
        if (i2 == eArr.length) {
            this.f13199d = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f13199d;
        int i3 = this.f13200e;
        this.f13200e = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void g(int i2) {
        if (i2 < 0 || i2 >= this.f13200e) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        g(i2);
        return this.f13199d[i2];
    }

    public final String h(int i2) {
        int i3 = this.f13200e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // c.f.a.c.j.h.t6
    public final /* bridge */ /* synthetic */ t6 n(int i2) {
        if (i2 >= this.f13200e) {
            return new a8(Arrays.copyOf(this.f13199d, i2), this.f13200e);
        }
        throw new IllegalArgumentException();
    }

    @Override // c.f.a.c.j.h.u4, java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        d();
        g(i2);
        E[] eArr = this.f13199d;
        E e2 = eArr[i2];
        if (i2 < this.f13200e - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.f13200e--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        d();
        g(i2);
        E[] eArr = this.f13199d;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f13200e;
    }
}
