package c.f.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class r<E> extends AbstractCollection<E> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f15949b = new Object[0];

    public static abstract class a<E> extends b<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object[] f15950a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15952c;

        public a(int i2) {
            j.b(i2, "initialCapacity");
            this.f15950a = new Object[i2];
            this.f15951b = 0;
        }

        @CanIgnoreReturnValue
        public a<E> b(E e2) {
            c.f.b.a.k.j(e2);
            c(this.f15951b + 1);
            Object[] objArr = this.f15950a;
            int i2 = this.f15951b;
            this.f15951b = i2 + 1;
            objArr[i2] = e2;
            return this;
        }

        public final void c(int i2) {
            Object[] objArr = this.f15950a;
            if (objArr.length < i2) {
                this.f15950a = Arrays.copyOf(objArr, b.a(objArr.length, i2));
            } else if (!this.f15952c) {
                return;
            } else {
                this.f15950a = (Object[]) objArr.clone();
            }
            this.f15952c = false;
        }
    }

    public static abstract class b<E> {
        public static int a(int i2, int i3) {
            if (i3 < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int iHighestOneBit = i2 + (i2 >> 1) + 1;
            if (iHighestOneBit < i3) {
                iHighestOneBit = Integer.highestOneBit(i3 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    public t<E> d() {
        return isEmpty() ? t.J() : t.v(toArray());
    }

    @CanIgnoreReturnValue
    public int e(Object[] objArr, int i2) {
        w0<E> it = iterator();
        while (it.hasNext()) {
            objArr[i2] = it.next();
            i2++;
        }
        return i2;
    }

    public Object[] f() {
        return null;
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public abstract boolean s();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: t */
    public abstract w0<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f15949b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        c.f.b.a.k.j(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrF = f();
            if (objArrF != null) {
                return (T[]) l0.a(objArrF, i(), g(), tArr);
            }
            tArr = (T[]) j0.d(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        e(tArr, 0);
        return tArr;
    }
}
