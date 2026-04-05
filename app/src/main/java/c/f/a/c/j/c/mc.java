package c.f.a.c.j.c;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class mc<E> extends g9<E> implements RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc<Object> f12946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public E[] f12947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12948e;

    static {
        mc<Object> mcVar = new mc<>(new Object[0], 0);
        f12946c = mcVar;
        mcVar.l();
    }

    public mc(E[] eArr, int i2) {
        this.f12947d = eArr;
        this.f12948e = i2;
    }

    public static <E> mc<E> i() {
        return (mc<E>) f12946c;
    }

    @Override // c.f.a.c.j.c.xa
    public final /* synthetic */ xa E(int i2) {
        if (i2 >= this.f12948e) {
            return new mc(Arrays.copyOf(this.f12947d, i2), this.f12948e);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i2, E e2) {
        int i3;
        d();
        if (i2 < 0 || i2 > (i3 = this.f12948e)) {
            throw new IndexOutOfBoundsException(g(i2));
        }
        E[] eArr = this.f12947d;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) new Object[((i3 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.f12947d, i2, eArr2, i2 + 1, this.f12948e - i2);
            this.f12947d = eArr2;
        }
        this.f12947d[i2] = e2;
        this.f12948e++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.f.a.c.j.c.g9, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        d();
        int i2 = this.f12948e;
        E[] eArr = this.f12947d;
        if (i2 == eArr.length) {
            this.f12947d = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f12947d;
        int i3 = this.f12948e;
        this.f12948e = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void e(int i2) {
        if (i2 < 0 || i2 >= this.f12948e) {
            throw new IndexOutOfBoundsException(g(i2));
        }
    }

    public final String g(int i2) {
        int i3 = this.f12948e;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i2) {
        e(i2);
        return this.f12947d[i2];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i2) {
        d();
        e(i2);
        E[] eArr = this.f12947d;
        E e2 = eArr[i2];
        if (i2 < this.f12948e - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.f12948e--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i2, E e2) {
        d();
        e(i2);
        E[] eArr = this.f12947d;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f12948e;
    }
}
