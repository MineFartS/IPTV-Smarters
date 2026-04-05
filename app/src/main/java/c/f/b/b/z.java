package c.f.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: loaded from: classes2.dex */
    public static class a<T> extends w0<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f15991c;

        public a(Object obj) {
            this.f15991c = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this.f15990b;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f15990b) {
                throw new NoSuchElementException();
            }
            this.f15990b = true;
            return (T) this.f15991c;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class b<T> extends c.f.b.b.a<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final x0<Object> f15992d = new b(new Object[0], 0, 0, 0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final T[] f15993e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f15994f;

        public b(T[] tArr, int i2, int i3, int i4) {
            super(i3, i4);
            this.f15993e = tArr;
            this.f15994f = i2;
        }

        @Override // c.f.b.b.a
        public T a(int i2) {
            return this.f15993e[this.f15994f + i2];
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public enum c implements Iterator<Object> {
        INSTANCE;

        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            throw new NoSuchElementException();
        }

        @Override // java.util.Iterator
        public void remove() {
            j.c(false);
        }
    }

    @CanIgnoreReturnValue
    public static <T> boolean a(Collection<T> collection, Iterator<? extends T> it) {
        c.f.b.a.k.j(collection);
        c.f.b.a.k.j(it);
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= collection.add(it.next());
        }
        return zAdd;
    }

    public static void b(Iterator<?> it) {
        c.f.b.a.k.j(it);
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    public static boolean c(Iterator<?> it, Iterator<?> it2) {
        while (it.hasNext()) {
            if (!it2.hasNext() || !c.f.b.a.h.a(it.next(), it2.next())) {
                return false;
            }
        }
        return !it2.hasNext();
    }

    public static <T> w0<T> d() {
        return e();
    }

    public static <T> x0<T> e() {
        return (x0<T>) b.f15992d;
    }

    public static <T> Iterator<T> f() {
        return c.INSTANCE;
    }

    public static <T> T g(Iterator<T> it) {
        T next;
        do {
            next = it.next();
        } while (it.hasNext());
        return next;
    }

    @NullableDecl
    public static <T> T h(Iterator<? extends T> it, @NullableDecl T t) {
        return it.hasNext() ? (T) g(it) : t;
    }

    @NullableDecl
    public static <T> T i(Iterator<? extends T> it, @NullableDecl T t) {
        return it.hasNext() ? it.next() : t;
    }

    @NullableDecl
    public static <T> T j(Iterator<T> it) {
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        it.remove();
        return next;
    }

    @CanIgnoreReturnValue
    public static boolean k(Iterator<?> it, Collection<?> collection) {
        c.f.b.a.k.j(collection);
        boolean z = false;
        while (it.hasNext()) {
            if (collection.contains(it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    public static <T> w0<T> l(@NullableDecl T t) {
        return new a(t);
    }

    public static String m(Iterator<?> it) {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        boolean z = true;
        while (it.hasNext()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(it.next());
        }
        sb.append(']');
        return sb.toString();
    }
}
