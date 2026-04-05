package c.f.b.b;

import com.google.errorprone.annotations.concurrent.LazyInit;

/* JADX INFO: loaded from: classes.dex */
public final class t0<E> extends x<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient E f15964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @LazyInit
    public transient int f15965e;

    public t0(E e2) {
        this.f15964d = (E) c.f.b.a.k.j(e2);
    }

    public t0(E e2, int i2) {
        this.f15964d = e2;
        this.f15965e = i2;
    }

    @Override // c.f.b.b.x
    public t<E> D() {
        return t.K(this.f15964d);
    }

    @Override // c.f.b.b.x
    public boolean F() {
        return this.f15965e != 0;
    }

    @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f15964d.equals(obj);
    }

    @Override // c.f.b.b.r
    public int e(Object[] objArr, int i2) {
        objArr[i2] = this.f15964d;
        return i2 + 1;
    }

    @Override // c.f.b.b.x, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i2 = this.f15965e;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.f15964d.hashCode();
        this.f15965e = iHashCode;
        return iHashCode;
    }

    @Override // c.f.b.b.r
    public boolean s() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // c.f.b.b.x, c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: t */
    public w0<E> iterator() {
        return z.l(this.f15964d);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f15964d.toString() + ']';
    }
}
