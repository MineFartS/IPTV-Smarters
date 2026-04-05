package c.f.b.b;

import c.f.b.b.g0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class f<K, V> implements e0<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Collection<Map.Entry<K, V>> f15848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Set<K> f15849c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Collection<V> f15850d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @MonotonicNonNullDecl
    public transient Map<K, Collection<V>> f15851e;

    public class a extends g0.b<K, V> {
        public a() {
        }

        @Override // c.f.b.b.g0.b
        public e0<K, V> d() {
            return f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return f.this.i();
        }
    }

    public class b extends AbstractCollection<V> {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return f.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return f.this.size();
        }
    }

    @Override // c.f.b.b.e0
    public Collection<Map.Entry<K, V>> a() {
        Collection<Map.Entry<K, V>> collection = this.f15848b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionF = f();
        this.f15848b = collectionF;
        return collectionF;
    }

    @Override // c.f.b.b.e0
    public Map<K, Collection<V>> b() {
        Map<K, Collection<V>> map = this.f15851e;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapE = e();
        this.f15851e = mapE;
        return mapE;
    }

    @Override // c.f.b.b.e0
    public boolean c(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(@NullableDecl Object obj) {
        Iterator<Collection<V>> it = b().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map<K, Collection<V>> e();

    public boolean equals(@NullableDecl Object obj) {
        return g0.a(this, obj);
    }

    public abstract Collection<Map.Entry<K, V>> f();

    public abstract Set<K> g();

    public abstract Collection<V> h();

    public int hashCode() {
        return b().hashCode();
    }

    public abstract Iterator<Map.Entry<K, V>> i();

    public abstract Iterator<V> j();

    @Override // c.f.b.b.e0
    public Set<K> keySet() {
        Set<K> set = this.f15849c;
        if (set != null) {
            return set;
        }
        Set<K> setG = g();
        this.f15849c = setG;
        return setG;
    }

    @Override // c.f.b.b.e0
    @CanIgnoreReturnValue
    public boolean remove(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Collection<V> collection = b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return b().toString();
    }

    @Override // c.f.b.b.e0
    public Collection<V> values() {
        Collection<V> collection = this.f15850d;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionH = h();
        this.f15850d = collectionH;
        return collectionH;
    }
}
