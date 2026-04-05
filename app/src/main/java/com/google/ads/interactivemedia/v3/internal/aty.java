package com.google.ads.interactivemedia.v3.internal;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public abstract class aty<E> extends ats<E> implements List<E>, RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final avu<Object> f20557a = new atv(avf.f20599a, 0);

    public static <E> atu<E> i() {
        return new atu<>();
    }

    public static <E> aty<E> j(Object[] objArr) {
        return k(objArr, objArr.length);
    }

    public static <E> aty<E> k(Object[] objArr, int i2) {
        return i2 == 0 ? (aty<E>) avf.f20599a : new avf(objArr, i2);
    }

    public static <E> aty<E> l(Collection<? extends E> collection) {
        if (!(collection instanceof ats)) {
            return u(collection.toArray());
        }
        aty<E> atyVarD = ((ats) collection).d();
        return atyVarD.f() ? j(atyVarD.toArray()) : atyVarD;
    }

    public static <E> aty<E> m(E[] eArr) {
        return eArr.length == 0 ? (aty<E>) avf.f20599a : u((Object[]) eArr.clone());
    }

    public static <E> aty<E> n() {
        return (aty<E>) avf.f20599a;
    }

    public static <E> aty<E> o(E e2) {
        return u(e2);
    }

    public static <E> aty<E> p(E e2, E e3) {
        return u(e2, e3);
    }

    public static <E> aty<E> q(E e2, E e3, E e4, E e5, E e6) {
        return u(e2, e3, e4, e5, e6);
    }

    public static <E> aty<E> r(E e2, E e3, E e4, E e5, E e6, E e7) {
        return u(e2, e3, e4, e5, e6, e7);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    private static <E> aty<E> u(Object... objArr) {
        int length = objArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            avq.l(objArr[i2], i2);
        }
        return j(objArr);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public int a(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    @Deprecated
    public final aty<E> d() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    /* JADX INFO: renamed from: e */
    public final avt<E> listIterator() {
        return iterator();
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (auv.w(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !auv.w(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public aty<E> subList(int i2, int i3) {
        ars.d(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? (aty<E>) avf.f20599a : new atx(this, i2, i4);
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final avu<E> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public final avu<E> listIterator(int i2) {
        ars.h(i2, size());
        return isEmpty() ? (avu<E>) f20557a : new atv(this, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ats
    public Object writeReplace() {
        return new atw(toArray());
    }
}
