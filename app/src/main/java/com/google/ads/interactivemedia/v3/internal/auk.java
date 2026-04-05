package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public abstract class auk<E> extends ats<E> implements Set<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient aty<E> f20577a;

    public static int h(int i2) {
        double d2;
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            ars.b(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1);
        do {
            iHighestOneBit += iHighestOneBit;
            d2 = iHighestOneBit;
            Double.isNaN(d2);
        } while (d2 * 0.7d < iMax);
        return iHighestOneBit;
    }

    public static <E> auk<E> j(Collection<? extends E> collection) {
        if ((collection instanceof auk) && !(collection instanceof SortedSet)) {
            auk<E> aukVar = (auk) collection;
            if (!aukVar.f()) {
                return aukVar;
            }
        }
        Object[] array = collection.toArray();
        return n(array.length, array);
    }

    public static <E> auk<E> k(E[] eArr) {
        int length = eArr.length;
        return length != 0 ? length != 1 ? n(length, (Object[]) eArr.clone()) : l(eArr[0]) : avl.f20615a;
    }

    public static <E> auk<E> l(E e2) {
        return new avr(e2);
    }

    private static <E> auk<E> n(int i2, Object... objArr) {
        if (i2 == 0) {
            return avl.f20615a;
        }
        if (i2 == 1) {
            Object obj = objArr[0];
            obj.getClass();
            return l(obj);
        }
        int iH = h(i2);
        Object[] objArr2 = new Object[iH];
        int i3 = iH - 1;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            Object obj2 = objArr[i6];
            avq.l(obj2, i6);
            int iHashCode = obj2.hashCode();
            int iT = auv.t(iHashCode);
            while (true) {
                int i7 = iT & i3;
                Object obj3 = objArr2[i7];
                if (obj3 == null) {
                    objArr[i5] = obj2;
                    objArr2[i7] = obj2;
                    i4 += iHashCode;
                    i5++;
                    break;
                }
                if (obj3.equals(obj2)) {
                    break;
                }
                iT++;
            }
        }
        Arrays.fill(objArr, i5, i2, (Object) null);
        if (i5 == 1) {
            Object obj4 = objArr[0];
            obj4.getClass();
            return new avr(obj4, i4);
        }
        if (h(i5) < iH / 2) {
            return n(i5, objArr);
        }
        int length = objArr.length;
        if (i5 < (length >> 1) + (length >> 2)) {
            objArr = Arrays.copyOf(objArr, i5);
        }
        return new avl(objArr, i4, objArr2, i3, i5);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public aty<E> d() {
        aty<E> atyVar = this.f20577a;
        if (atyVar != null) {
            return atyVar;
        }
        aty<E> atyVarI = i();
        this.f20577a = atyVarI;
        return atyVarI;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: e */
    public abstract avt<E> listIterator();

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof auk) && m() && ((auk) obj).m() && hashCode() != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    if (containsAll(set)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return avq.a(this);
    }

    public aty<E> i() {
        return aty.j(toArray());
    }

    public boolean m() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public Object writeReplace() {
        return new auj(toArray());
    }
}
