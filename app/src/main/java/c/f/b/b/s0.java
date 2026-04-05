package c.f.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: loaded from: classes2.dex */
    public static class a<E> extends c<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Set f15955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Set f15956c;

        /* JADX INFO: renamed from: c.f.b.b.s0$a$a, reason: collision with other inner class name */
        public class C0189a extends c.f.b.b.b<E> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final Iterator<E> f15957d;

            public C0189a() {
                this.f15957d = a.this.f15955b.iterator();
            }

            @Override // c.f.b.b.b
            public E a() {
                while (this.f15957d.hasNext()) {
                    E next = this.f15957d.next();
                    if (a.this.f15956c.contains(next)) {
                        return next;
                    }
                }
                return b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Set set, Set set2) {
            super(null);
            this.f15955b = set;
            this.f15956c = set2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f15955b.contains(obj) && this.f15956c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return this.f15955b.containsAll(collection) && this.f15956c.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public w0<E> iterator() {
            return new C0189a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return Collections.disjoint(this.f15956c, this.f15955b);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Iterator<E> it = this.f15955b.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                if (this.f15956c.contains(it.next())) {
                    i2++;
                }
            }
            return i2;
        }
    }

    public static abstract class b<E> extends AbstractSet<E> {
        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return s0.g(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) c.f.b.a.k.j(collection));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class c<E> extends AbstractSet<E> {
        public c() {
        }

        public /* synthetic */ c(r0 r0Var) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean add(E e2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }
    }

    public static boolean a(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static int b(Set<?> set) {
        Iterator<?> it = set.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode = ((iHashCode + (next != null ? next.hashCode() : 0)) ^ (-1)) ^ (-1);
        }
        return iHashCode;
    }

    public static <E> c<E> c(Set<E> set, Set<?> set2) {
        c.f.b.a.k.k(set, "set1");
        c.f.b.a.k.k(set2, "set2");
        return new a(set, set2);
    }

    public static <E> HashSet<E> d() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> e(int i2) {
        return new HashSet<>(d0.a(i2));
    }

    public static <E> Set<E> f() {
        return Collections.newSetFromMap(d0.f());
    }

    public static boolean g(Set<?> set, Collection<?> collection) {
        c.f.b.a.k.j(collection);
        if (collection instanceof h0) {
            collection = ((h0) collection).q();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? h(set, collection.iterator()) : z.k(set.iterator(), collection);
    }

    public static boolean h(Set<?> set, Iterator<?> it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }
}
