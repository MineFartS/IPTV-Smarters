package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class avq {
    public static int a(Set<?> set) {
        Iterator<?> it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }

    public static <E> HashSet<E> b() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> c(int i2) {
        return new HashSet<>(auv.a(i2));
    }

    public static boolean d(Set<?> set, Collection<?> collection) {
        ars.g(collection);
        if (collection instanceof avc) {
            collection = ((avc) collection).a();
        }
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            return e(set, collection.iterator());
        }
        Iterator<?> it = set.iterator();
        ars.g(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static boolean e(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static int f(boolean z, boolean z2) {
        if (z == z2) {
            return 0;
        }
        return !z ? -1 : 1;
    }

    public static bfl g(bjj bjjVar) {
        boolean z;
        try {
            try {
                bjjVar.p();
                try {
                    return bjc.V.read(bjjVar);
                } catch (EOFException e2) {
                    e = e2;
                    z = false;
                    if (z) {
                        return bfn.f21046a;
                    }
                    throw new bfs(e);
                }
            } catch (bjm e3) {
                throw new bfs(e3);
            } catch (IOException e4) {
                throw new bfm(e4);
            } catch (NumberFormatException e5) {
                throw new bfs(e5);
            }
        } catch (EOFException e6) {
            e = e6;
            z = true;
        }
    }

    public static Writer h(Appendable appendable) {
        return (Writer) appendable;
    }

    public static void i(bfl bflVar, bjl bjlVar) {
        bjc.V.write(bjlVar, bflVar);
    }

    public static <T> avo<T> j(Class<T> cls, String str) {
        try {
            return new avo<>(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e2) {
            throw new AssertionError(e2);
        }
    }

    public static <T> T[] k(T[] tArr, int i2) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
    }

    public static void l(Object obj, int i2) {
        if (obj != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append("at index ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}
