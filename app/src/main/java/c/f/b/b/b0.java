package c.f.b.b;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {
    public static <T> List<T> a(Iterable<T> iterable) {
        return (List) iterable;
    }

    public static int b(int i2) {
        j.b(i2, "arraySize");
        return c.f.b.f.c.i(((long) i2) + 5 + ((long) (i2 / 10)));
    }

    public static boolean c(List<?> list, @NullableDecl Object obj) {
        if (obj == c.f.b.a.k.j(list)) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list2 = (List) obj;
        int size = list.size();
        if (size != list2.size()) {
            return false;
        }
        if (!(list instanceof RandomAccess) || !(list2 instanceof RandomAccess)) {
            return z.c(list.iterator(), list2.iterator());
        }
        for (int i2 = 0; i2 < size; i2++) {
            if (!c.f.b.a.h.a(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static int d(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return e(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (c.f.b.a.h.a(obj, listIterator.next())) {
                return listIterator.previousIndex();
            }
        }
        return -1;
    }

    public static int e(List<?> list, @NullableDecl Object obj) {
        int size = list.size();
        int i2 = 0;
        if (obj == null) {
            while (i2 < size) {
                if (list.get(i2) == null) {
                    return i2;
                }
                i2++;
            }
            return -1;
        }
        while (i2 < size) {
            if (obj.equals(list.get(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int f(List<?> list, @NullableDecl Object obj) {
        if (list instanceof RandomAccess) {
            return g(list, obj);
        }
        ListIterator<?> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (c.f.b.a.h.a(obj, listIterator.previous())) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public static int g(List<?> list, @NullableDecl Object obj) {
        if (obj == null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                if (list.get(size) == null) {
                    return size;
                }
            }
            return -1;
        }
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            if (obj.equals(list.get(size2))) {
                return size2;
            }
        }
        return -1;
    }

    public static <E> ArrayList<E> h() {
        return new ArrayList<>();
    }

    public static <E> ArrayList<E> i(Iterable<? extends E> iterable) {
        c.f.b.a.k.j(iterable);
        return iterable instanceof Collection ? new ArrayList<>(k.a(iterable)) : j(iterable.iterator());
    }

    public static <E> ArrayList<E> j(Iterator<? extends E> it) {
        ArrayList<E> arrayListH = h();
        z.a(arrayListH, it);
        return arrayListH;
    }

    @SafeVarargs
    public static <E> ArrayList<E> k(E... eArr) {
        c.f.b.a.k.j(eArr);
        ArrayList<E> arrayList = new ArrayList<>(b(eArr.length));
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }
}
