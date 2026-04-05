package c.f.b.b;

import c.f.b.b.r;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class t<E> extends r<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final x0<Object> f15959c = new b(m0.f15888d, 0);

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a<E> extends r.a<E> {
        public a() {
            this(4);
        }

        public a(int i2) {
            super(i2);
        }

        @CanIgnoreReturnValue
        public a<E> d(E e2) {
            super.b(e2);
            return this;
        }

        public t<E> e() {
            this.f15952c = true;
            return t.x(this.f15950a, this.f15951b);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class b<E> extends c.f.b.b.a<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final t<E> f15960d;

        public b(t<E> tVar, int i2) {
            super(tVar.size(), i2);
            this.f15960d = tVar;
        }

        @Override // c.f.b.b.a
        public E a(int i2) {
            return this.f15960d.get(i2);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class c extends t<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient int f15961d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final transient int f15962e;

        public c(int i2, int i3) {
            this.f15961d = i2;
            this.f15962e = i3;
        }

        @Override // c.f.b.b.t, java.util.List
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public t<E> subList(int i2, int i3) {
            c.f.b.a.k.n(i2, i3, this.f15962e);
            t tVar = t.this;
            int i4 = this.f15961d;
            return tVar.subList(i2 + i4, i3 + i4);
        }

        @Override // c.f.b.b.r
        public Object[] f() {
            return t.this.f();
        }

        @Override // c.f.b.b.r
        public int g() {
            return t.this.i() + this.f15961d + this.f15962e;
        }

        @Override // java.util.List
        public E get(int i2) {
            c.f.b.a.k.h(i2, this.f15962e);
            return t.this.get(i2 + this.f15961d);
        }

        @Override // c.f.b.b.r
        public int i() {
            return t.this.i() + this.f15961d;
        }

        @Override // c.f.b.b.t, c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // c.f.b.b.t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // c.f.b.b.t, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i2) {
            return super.listIterator(i2);
        }

        @Override // c.f.b.b.r
        public boolean s() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f15962e;
        }
    }

    public static <E> a<E> B() {
        return new a<>();
    }

    public static <E> t<E> C(Object... objArr) {
        return v(j0.b(objArr));
    }

    public static <E> t<E> D(Collection<? extends E> collection) {
        if (!(collection instanceof r)) {
            return C(collection.toArray());
        }
        t<E> tVarD = ((r) collection).d();
        return tVarD.s() ? v(tVarD.toArray()) : tVarD;
    }

    public static <E> t<E> J() {
        return (t<E>) m0.f15888d;
    }

    public static <E> t<E> K(E e2) {
        return C(e2);
    }

    public static <E> t<E> L(E e2, E e3) {
        return C(e2, e3);
    }

    public static <E> t<E> M(E e2, E e3, E e4) {
        return C(e2, e3, e4);
    }

    public static <E> t<E> N(E e2, E e3, E e4, E e5, E e6) {
        return C(e2, e3, e4, e5, e6);
    }

    public static <E> t<E> O(E e2, E e3, E e4, E e5, E e6, E e7) {
        return C(e2, e3, e4, e5, e6, e7);
    }

    public static <E> t<E> P(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        c.f.b.a.k.j(comparator);
        Object[] objArrF = y.f(iterable);
        j0.b(objArrF);
        Arrays.sort(objArrF, comparator);
        return v(objArrF);
    }

    public static <E> t<E> v(Object[] objArr) {
        return x(objArr, objArr.length);
    }

    public static <E> t<E> x(Object[] objArr, int i2) {
        return i2 == 0 ? J() : new m0(objArr, i2);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public x0<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public x0<E> listIterator(int i2) {
        c.f.b.a.k.l(i2, size());
        return isEmpty() ? (x0<E>) f15959c : new b(this, i2);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: Q */
    public t<E> subList(int i2, int i3) {
        c.f.b.a.k.n(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? J() : R(i2, i3);
    }

    public t<E> R(int i2, int i3) {
        return new c(i2, i3 - i2);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // c.f.b.b.r
    public final t<E> d() {
        return this;
    }

    @Override // c.f.b.b.r
    public int e(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(@NullableDecl Object obj) {
        return b0.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (((iHashCode * 31) + get(i2).hashCode()) ^ (-1)) ^ (-1);
        }
        return iHashCode;
    }

    @Override // java.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return b0.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        return b0.f(this, obj);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public w0<E> iterator() {
        return listIterator();
    }
}
