package c.f.b.b;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class y {
    public static <E> Collection<E> a(Iterable<E> iterable) {
        return iterable instanceof Collection ? (Collection) iterable : b0.j(iterable.iterator());
    }

    @NullableDecl
    public static <T> T b(Iterable<? extends T> iterable, @NullableDecl T t) {
        return (T) z.i(iterable.iterator(), t);
    }

    public static <T> T c(Iterable<T> iterable) {
        if (!(iterable instanceof List)) {
            return (T) z.g(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return (T) e(list);
    }

    @NullableDecl
    public static <T> T d(Iterable<? extends T> iterable, @NullableDecl T t) {
        if (iterable instanceof Collection) {
            if (k.a(iterable).isEmpty()) {
                return t;
            }
            if (iterable instanceof List) {
                return (T) e(b0.a(iterable));
            }
        }
        return (T) z.h(iterable.iterator(), t);
    }

    public static <T> T e(List<T> list) {
        return list.get(list.size() - 1);
    }

    public static Object[] f(Iterable<?> iterable) {
        return a(iterable).toArray();
    }

    public static String g(Iterable<?> iterable) {
        return z.m(iterable.iterator());
    }
}
