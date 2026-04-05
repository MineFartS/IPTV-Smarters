package c.f.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class w<K, V> extends g<K, V> implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient v<K, ? extends r<V>> f15975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f15976g;

    /* JADX INFO: loaded from: classes2.dex */
    public class a extends w0<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<? extends Map.Entry<K, ? extends r<V>>> f15977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public K f15978c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Iterator<V> f15979d = z.d();

        public a() {
            this.f15977b = w.this.f15975f.entrySet().iterator();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f15979d.hasNext()) {
                Map.Entry<K, ? extends r<V>> next = this.f15977b.next();
                this.f15978c = next.getKey();
                this.f15979d = next.getValue().iterator();
            }
            return d0.c(this.f15978c, this.f15979d.next());
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15979d.hasNext() || this.f15977b.hasNext();
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class b extends w0<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Iterator<? extends r<V>> f15981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Iterator<V> f15982c = z.d();

        public b() {
            this.f15981b = w.this.f15975f.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15982c.hasNext() || this.f15981b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f15982c.hasNext()) {
                this.f15982c = this.f15981b.next().iterator();
            }
            return this.f15982c.next();
        }
    }

    public static class c<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Map<K, Collection<V>> f15984a = l0.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @MonotonicNonNullDecl
        public Comparator<? super K> f15985b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @MonotonicNonNullDecl
        public Comparator<? super V> f15986c;

        public w<K, V> a() {
            Collection collectionEntrySet = this.f15984a.entrySet();
            Comparator<? super K> comparator = this.f15985b;
            if (comparator != null) {
                collectionEntrySet = k0.a(comparator).d().b(collectionEntrySet);
            }
            return u.t(collectionEntrySet, this.f15986c);
        }

        public Collection<V> b() {
            return new ArrayList();
        }

        @CanIgnoreReturnValue
        public c<K, V> c(K k2, V v) {
            j.a(k2, v);
            Collection<V> collection = this.f15984a.get(k2);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f15984a;
                Collection<V> collectionB = b();
                map.put(k2, collectionB);
                collection = collectionB;
            }
            collection.add(v);
            return this;
        }

        @CanIgnoreReturnValue
        public c<K, V> d(K k2, Iterable<? extends V> iterable) {
            if (k2 == null) {
                throw new NullPointerException("null key in entry: null=" + y.g(iterable));
            }
            Collection<V> collection = this.f15984a.get(k2);
            Iterator<? extends V> it = iterable.iterator();
            if (collection != null) {
                while (it.hasNext()) {
                    V next = it.next();
                    j.a(k2, next);
                    collection.add(next);
                }
                return this;
            }
            if (!it.hasNext()) {
                return this;
            }
            Collection<V> collectionB = b();
            while (it.hasNext()) {
                V next2 = it.next();
                j.a(k2, next2);
                collectionB.add(next2);
            }
            this.f15984a.put(k2, collectionB);
            return this;
        }

        @CanIgnoreReturnValue
        public c<K, V> e(K k2, V... vArr) {
            return d(k2, Arrays.asList(vArr));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class d<K, V> extends r<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Weak
        public final w<K, V> f15987c;

        public d(w<K, V> wVar) {
            this.f15987c = wVar;
        }

        @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f15987c.c(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f15987c.size();
        }

        @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: t */
        public w0<Map.Entry<K, V>> iterator() {
            return this.f15987c.i();
        }
    }

    public static final class e<K, V> extends r<V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Weak
        public final transient w<K, V> f15988c;

        public e(w<K, V> wVar) {
            this.f15988c = wVar;
        }

        @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return this.f15988c.d(obj);
        }

        @Override // c.f.b.b.r
        public int e(Object[] objArr, int i2) {
            w0<? extends r<V>> it = this.f15988c.f15975f.values().iterator();
            while (it.hasNext()) {
                i2 = it.next().e(objArr, i2);
            }
            return i2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f15988c.size();
        }

        @Override // c.f.b.b.r, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: t */
        public w0<V> iterator() {
            return this.f15988c.j();
        }
    }

    public w(v<K, ? extends r<V>> vVar, int i2) {
        this.f15975f = vVar;
        this.f15976g = i2;
    }

    @Override // c.f.b.b.f, c.f.b.b.e0
    public /* bridge */ /* synthetic */ boolean c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.c(obj, obj2);
    }

    @Override // c.f.b.b.e0
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // c.f.b.b.f
    public boolean d(@NullableDecl Object obj) {
        return obj != null && super.d(obj);
    }

    @Override // c.f.b.b.f
    public Map<K, Collection<V>> e() {
        throw new AssertionError("should never be called");
    }

    @Override // c.f.b.b.f
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // c.f.b.b.f
    public Set<K> g() {
        throw new AssertionError("unreachable");
    }

    @Override // c.f.b.b.f
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // c.f.b.b.f, c.f.b.b.e0
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public v<K, Collection<V>> b() {
        return this.f15975f;
    }

    @Override // c.f.b.b.f
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public r<Map.Entry<K, V>> f() {
        return new d(this);
    }

    @Override // c.f.b.b.f
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public r<V> h() {
        return new e(this);
    }

    @Override // c.f.b.b.f, c.f.b.b.e0
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public r<Map.Entry<K, V>> a() {
        return (r) super.a();
    }

    @Override // c.f.b.b.f
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public w0<Map.Entry<K, V>> i() {
        return new a();
    }

    @Override // c.f.b.b.f, c.f.b.b.e0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public x<K> keySet() {
        return this.f15975f.keySet();
    }

    @Override // c.f.b.b.e0
    @CanIgnoreReturnValue
    @Deprecated
    public boolean put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // c.f.b.b.f
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public w0<V> j() {
        return new b();
    }

    @Override // c.f.b.b.f, c.f.b.b.e0
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public r<V> values() {
        return (r) super.values();
    }

    @Override // c.f.b.b.f, c.f.b.b.e0
    @CanIgnoreReturnValue
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // c.f.b.b.e0
    public int size() {
        return this.f15976g;
    }

    @Override // c.f.b.b.f
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }
}
