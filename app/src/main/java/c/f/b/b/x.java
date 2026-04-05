package c.f.b.b;

import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class x<E> extends r<E> implements Set<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @RetainedWith
    @NullableDecl
    @LazyInit
    public transient t<E> f15989c;

    public static <E> x<E> B(Collection<? extends E> collection) {
        if ((collection instanceof x) && !(collection instanceof SortedSet)) {
            x<E> xVar = (x) collection;
            if (!xVar.s()) {
                return xVar;
            }
        }
        Object[] array = collection.toArray();
        return x(array.length, array);
    }

    public static <E> x<E> C(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? x(eArr.length, (Object[]) eArr.clone()) : J(eArr[0]) : I();
    }

    public static <E> x<E> I() {
        return o0.f15910d;
    }

    public static <E> x<E> J(E e2) {
        return new t0(e2);
    }

    public static <E> x<E> K(E e2, E e3) {
        return x(2, e2, e3);
    }

    public static <E> x<E> L(E e2, E e3, E e4) {
        return x(3, e2, e3, e4);
    }

    public static boolean M(int i2, int i3) {
        return i2 < (i3 >> 1) + (i3 >> 2);
    }

    public static int v(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            c.f.b.a.k.e(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (true) {
            double d2 = iHighestOneBit;
            Double.isNaN(d2);
            if (d2 * 0.7d >= iMax) {
                return iHighestOneBit;
            }
            iHighestOneBit <<= 1;
        }
    }

    public static <E> x<E> x(int i2, Object... objArr) {
        if (i2 == 0) {
            return I();
        }
        if (i2 == 1) {
            return J(objArr[0]);
        }
        int iV = v(i2);
        Object[] objArr2 = new Object[iV];
        int i3 = iV - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object objA = j0.a(objArr[i6], i6);
            int iHashCode = objA.hashCode();
            int iB = q.b(iHashCode);
            while (true) {
                int i7 = iB & i3;
                Object obj = objArr2[i7];
                if (obj == null) {
                    objArr[i5] = objA;
                    objArr2[i7] = objA;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj.equals(objA)) {
                    break;
                }
                iB++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            return new t0(objArr[0], i4);
        }
        if (v(i5) < iV / 2) {
            return x(i5, objArr);
        }
        if (M(i5, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new o0(objArr, i4, objArr2, i3, i5);
    }

    public t<E> D() {
        return t.v(toArray());
    }

    public boolean F() {
        return false;
    }

    @Override // c.f.b.b.r
    public t<E> d() {
        t<E> tVar = this.f15989c;
        if (tVar != null) {
            return tVar;
        }
        t<E> tVarD = D();
        this.f15989c = tVarD;
        return tVarD;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof x) && F() && ((x) obj).F() && hashCode() != obj.hashCode()) {
            return false;
        }
        return s0.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return s0.b(this);
    }

    @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
