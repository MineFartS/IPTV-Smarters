package c.f.b.b;

import c.f.b.b.d0;
import c.f.b.b.f;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class d<K, V> extends c.f.b.b.f<K, V> implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public transient Map<K, Collection<V>> f15809f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient int f15810g;

    /* JADX INFO: loaded from: classes2.dex */
    public class a extends d<K, V>.AbstractC0186d<V> {
        public a() {
            super();
        }

        @Override // c.f.b.b.d.AbstractC0186d
        public V a(K k2, V v) {
            return v;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class b extends d<K, V>.AbstractC0186d<Map.Entry<K, V>> {
        public b() {
            super();
        }

        @Override // c.f.b.b.d.AbstractC0186d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> a(K k2, V v) {
            return d0.c(k2, v);
        }
    }

    public class c extends d0.f<K, Collection<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final transient Map<K, Collection<V>> f15813d;

        /* JADX INFO: loaded from: classes2.dex */
        public class a extends d0.c<K, Collection<V>> {
            public a() {
            }

            @Override // c.f.b.b.d0.c, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return c.f.b.b.k.c(c.this.f15813d.entrySet(), obj);
            }

            @Override // c.f.b.b.d0.c
            public Map<K, Collection<V>> d() {
                return c.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return c.this.new b();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                d.this.w(((Map.Entry) obj).getKey());
                return true;
            }
        }

        public class b implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<Map.Entry<K, Collection<V>>> f15816b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            @NullableDecl
            public Collection<V> f15817c;

            public b() {
                this.f15816b = c.this.f15813d.entrySet().iterator();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry<K, Collection<V>> next = this.f15816b.next();
                this.f15817c = next.getValue();
                return c.this.f(next);
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f15816b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                c.f.b.b.j.c(this.f15817c != null);
                this.f15816b.remove();
                d.this.f15810g -= this.f15817c.size();
                this.f15817c.clear();
                this.f15817c = null;
            }
        }

        public c(Map<K, Collection<V>> map) {
            this.f15813d = map;
        }

        @Override // c.f.b.b.d0.f
        public Set<Map.Entry<K, Collection<V>>> b() {
            return new a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f15813d == d.this.f15809f) {
                d.this.clear();
            } else {
                z.b(new b());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return d0.h(this.f15813d, obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(Object obj) {
            Collection<V> collection = (Collection) d0.i(this.f15813d, obj);
            if (collection == null) {
                return null;
            }
            return d.this.y(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(Object obj) {
            Collection<V> collectionRemove = this.f15813d.remove(obj);
            if (collectionRemove == null) {
                return null;
            }
            Collection<V> collectionR = d.this.r();
            collectionR.addAll(collectionRemove);
            d.this.f15810g -= collectionRemove.size();
            collectionRemove.clear();
            return collectionR;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || this.f15813d.equals(obj);
        }

        public Map.Entry<K, Collection<V>> f(Map.Entry<K, Collection<V>> entry) {
            K key = entry.getKey();
            return d0.c(key, d.this.y(key, entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f15813d.hashCode();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return d.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f15813d.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f15813d.toString();
        }
    }

    /* JADX INFO: renamed from: c.f.b.b.d$d, reason: collision with other inner class name */
    public abstract class AbstractC0186d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Iterator<Map.Entry<K, Collection<V>>> f15819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NullableDecl
        public K f15820c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @MonotonicNonNullDecl
        public Collection<V> f15821d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Iterator<V> f15822e = z.f();

        public AbstractC0186d() {
            this.f15819b = d.this.f15809f.entrySet().iterator();
        }

        public abstract T a(K k2, V v);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f15819b.hasNext() || this.f15822e.hasNext();
        }

        @Override // java.util.Iterator
        public T next() {
            if (!this.f15822e.hasNext()) {
                Map.Entry<K, Collection<V>> next = this.f15819b.next();
                this.f15820c = next.getKey();
                Collection<V> value = next.getValue();
                this.f15821d = value;
                this.f15822e = value.iterator();
            }
            return a(this.f15820c, this.f15822e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f15822e.remove();
            if (this.f15821d.isEmpty()) {
                this.f15819b.remove();
            }
            d.p(d.this);
        }
    }

    public class e extends d0.d<K, Collection<V>> {

        public class a implements Iterator<K> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            @NullableDecl
            public Map.Entry<K, Collection<V>> f15825b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Iterator f15826c;

            public a(Iterator it) {
                this.f15826c = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f15826c.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry<K, Collection<V>> entry = (Map.Entry) this.f15826c.next();
                this.f15825b = entry;
                return entry.getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                c.f.b.b.j.c(this.f15825b != null);
                Collection<V> value = this.f15825b.getValue();
                this.f15826c.remove();
                d.this.f15810g -= value.size();
                value.clear();
                this.f15825b = null;
            }
        }

        public e(Map<K, Collection<V>> map) {
            super(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            z.b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return d().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(@NullableDecl Object obj) {
            return this == obj || d().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return d().keySet().hashCode();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a(d().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection<V> collectionRemove = d().remove(obj);
            if (collectionRemove != null) {
                size = collectionRemove.size();
                collectionRemove.clear();
                d.this.f15810g -= size;
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class f extends d<K, V>.i implements NavigableMap<K, Collection<V>> {
        public f(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(K k2) {
            Map.Entry<K, Collection<V>> entryCeilingEntry = i().ceilingEntry(k2);
            if (entryCeilingEntry == null) {
                return null;
            }
            return f(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k2) {
            return i().ceilingKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new f(i().descendingMap());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, Collection<V>> entryFirstEntry = i().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return f(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(K k2) {
            Map.Entry<K, Collection<V>> entryFloorEntry = i().floorEntry(k2);
            if (entryFloorEntry == null) {
                return null;
            }
            return f(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k2) {
            return i().floorKey(k2);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(K k2, boolean z) {
            return new f(i().headMap(k2, z));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(K k2) {
            Map.Entry<K, Collection<V>> entryHigherEntry = i().higherEntry(k2);
            if (entryHigherEntry == null) {
                return null;
            }
            return f(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k2) {
            return i().higherKey(k2);
        }

        @Override // c.f.b.b.d.i
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> g() {
            return new g(i());
        }

        @Override // c.f.b.b.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> headMap(K k2) {
            return headMap(k2, false);
        }

        @Override // c.f.b.b.d.i, c.f.b.b.d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, Collection<V>> entryLastEntry = i().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return f(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(K k2) {
            Map.Entry<K, Collection<V>> entryLowerEntry = i().lowerEntry(k2);
            if (entryLowerEntry == null) {
                return null;
            }
            return f(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k2) {
            return i().lowerKey(k2);
        }

        public Map.Entry<K, Collection<V>> m(Iterator<Map.Entry<K, Collection<V>>> it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry<K, Collection<V>> next = it.next();
            Collection<V> collectionR = d.this.r();
            collectionR.addAll(next.getValue());
            it.remove();
            return d0.c(next.getKey(), d.this.x(collectionR));
        }

        @Override // c.f.b.b.d.i
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> i() {
            return (NavigableMap) super.i();
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return h();
        }

        @Override // c.f.b.b.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> subMap(K k2, K k3) {
            return subMap(k2, true, k3, false);
        }

        @Override // c.f.b.b.d.i, java.util.SortedMap, java.util.NavigableMap
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> tailMap(K k2) {
            return tailMap(k2, true);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return m(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return m(descendingMap().entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(K k2, boolean z, K k3, boolean z2) {
            return new f(i().subMap(k2, z, k3, z2));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(K k2, boolean z) {
            return new f(i().tailMap(k2, z));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class g extends d<K, V>.j implements NavigableSet<K> {
        public g(NavigableMap<K, Collection<V>> navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(K k2) {
            return f().ceilingKey(k2);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new g(f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(K k2) {
            return f().floorKey(k2);
        }

        @Override // c.f.b.b.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> headSet(K k2) {
            return headSet(k2, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(K k2, boolean z) {
            return new g(f().headMap(k2, z));
        }

        @Override // java.util.NavigableSet
        public K higher(K k2) {
            return f().higherKey(k2);
        }

        @Override // c.f.b.b.d.j
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<K, Collection<V>> f() {
            return (NavigableMap) super.f();
        }

        @Override // java.util.NavigableSet
        public K lower(K k2) {
            return f().lowerKey(k2);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) z.j(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) z.j(descendingIterator());
        }

        @Override // c.f.b.b.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> subSet(K k2, K k3) {
            return subSet(k2, true, k3, false);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(K k2, boolean z, K k3, boolean z2) {
            return new g(f().subMap(k2, z, k3, z2));
        }

        @Override // c.f.b.b.d.j, java.util.SortedSet, java.util.NavigableSet
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public NavigableSet<K> tailSet(K k2) {
            return tailSet(k2, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(K k2, boolean z) {
            return new g(f().tailMap(k2, z));
        }
    }

    public class h extends d<K, V>.l implements RandomAccess {
        public h(@NullableDecl K k2, List<V> list, @NullableDecl d<K, V>.k kVar) {
            super(k2, list, kVar);
        }
    }

    public class i extends d<K, V>.c implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @MonotonicNonNullDecl
        public SortedSet<K> f15831f;

        public i(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return i().comparator();
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            return i().firstKey();
        }

        public SortedSet<K> g() {
            return new j(i());
        }

        @Override // c.f.b.b.d.c, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: h */
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f15831f;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetG = g();
            this.f15831f = sortedSetG;
            return sortedSetG;
        }

        public SortedMap<K, Collection<V>> headMap(K k2) {
            return new i(i().headMap(k2));
        }

        public SortedMap<K, Collection<V>> i() {
            return (SortedMap) this.f15813d;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            return i().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(K k2, K k3) {
            return new i(i().subMap(k2, k3));
        }

        public SortedMap<K, Collection<V>> tailMap(K k2) {
            return new i(i().tailMap(k2));
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class j extends d<K, V>.e implements SortedSet<K> {
        public j(SortedMap<K, Collection<V>> sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        public SortedMap<K, Collection<V>> f() {
            return (SortedMap) super.d();
        }

        @Override // java.util.SortedSet
        public K first() {
            return f().firstKey();
        }

        public SortedSet<K> headSet(K k2) {
            return new j(f().headMap(k2));
        }

        @Override // java.util.SortedSet
        public K last() {
            return f().lastKey();
        }

        public SortedSet<K> subSet(K k2, K k3) {
            return new j(f().subMap(k2, k3));
        }

        public SortedSet<K> tailSet(K k2) {
            return new j(f().tailMap(k2));
        }
    }

    public class k extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NullableDecl
        public final K f15834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Collection<V> f15835c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NullableDecl
        public final d<K, V>.k f15836d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NullableDecl
        public final Collection<V> f15837e;

        /* JADX INFO: loaded from: classes2.dex */
        public class a implements Iterator<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Iterator<V> f15839b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final Collection<V> f15840c;

            public a() {
                Collection<V> collection = k.this.f15835c;
                this.f15840c = collection;
                this.f15839b = d.v(collection);
            }

            public a(Iterator<V> it) {
                this.f15840c = k.this.f15835c;
                this.f15839b = it;
            }

            public Iterator<V> a() {
                b();
                return this.f15839b;
            }

            public void b() {
                k.this.s();
                if (k.this.f15835c != this.f15840c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f15839b.hasNext();
            }

            @Override // java.util.Iterator
            public V next() {
                b();
                return this.f15839b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f15839b.remove();
                d.p(d.this);
                k.this.t();
            }
        }

        public k(@NullableDecl K k2, Collection<V> collection, @NullableDecl d<K, V>.k kVar) {
            this.f15834b = k2;
            this.f15835c = collection;
            this.f15836d = kVar;
            this.f15837e = kVar == null ? null : kVar.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(V v) {
            s();
            boolean zIsEmpty = this.f15835c.isEmpty();
            boolean zAdd = this.f15835c.add(v);
            if (zAdd) {
                d.o(d.this);
                if (zIsEmpty) {
                    d();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f15835c.addAll(collection);
            if (zAddAll) {
                int size2 = this.f15835c.size();
                d.this.f15810g += size2 - size;
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f15835c.clear();
            d.this.f15810g -= size;
            t();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            s();
            return this.f15835c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            s();
            return this.f15835c.containsAll(collection);
        }

        public void d() {
            d<K, V>.k kVar = this.f15836d;
            if (kVar != null) {
                kVar.d();
            } else {
                d.this.f15809f.put(this.f15834b, this.f15835c);
            }
        }

        @Override // java.util.Collection
        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            s();
            return this.f15835c.equals(obj);
        }

        public d<K, V>.k f() {
            return this.f15836d;
        }

        public Collection<V> g() {
            return this.f15835c;
        }

        @Override // java.util.Collection
        public int hashCode() {
            s();
            return this.f15835c.hashCode();
        }

        public K i() {
            return this.f15834b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            s();
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            s();
            boolean zRemove = this.f15835c.remove(obj);
            if (zRemove) {
                d.p(d.this);
                t();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f15835c.removeAll(collection);
            if (zRemoveAll) {
                int size2 = this.f15835c.size();
                d.this.f15810g += size2 - size;
                t();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            c.f.b.a.k.j(collection);
            int size = size();
            boolean zRetainAll = this.f15835c.retainAll(collection);
            if (zRetainAll) {
                int size2 = this.f15835c.size();
                d.this.f15810g += size2 - size;
                t();
            }
            return zRetainAll;
        }

        public void s() {
            Collection<V> collection;
            d<K, V>.k kVar = this.f15836d;
            if (kVar != null) {
                kVar.s();
                if (this.f15836d.g() != this.f15837e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f15835c.isEmpty() || (collection = (Collection) d.this.f15809f.get(this.f15834b)) == null) {
                    return;
                }
                this.f15835c = collection;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            s();
            return this.f15835c.size();
        }

        public void t() {
            d<K, V>.k kVar = this.f15836d;
            if (kVar != null) {
                kVar.t();
            } else if (this.f15835c.isEmpty()) {
                d.this.f15809f.remove(this.f15834b);
            }
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            s();
            return this.f15835c.toString();
        }
    }

    public class l extends d<K, V>.k implements List<V> {

        /* JADX INFO: loaded from: classes2.dex */
        public class a extends d<K, V>.k.a implements ListIterator<V> {
            public a() {
                super();
            }

            public a(int i2) {
                super(l.this.v().listIterator(i2));
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean zIsEmpty = l.this.isEmpty();
                c().add(v);
                d.o(d.this);
                if (zIsEmpty) {
                    l.this.d();
                }
            }

            public final ListIterator<V> c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                c().set(v);
            }
        }

        public l(@NullableDecl K k2, List<V> list, @NullableDecl d<K, V>.k kVar) {
            super(k2, list, kVar);
        }

        @Override // java.util.List
        public void add(int i2, V v) {
            s();
            boolean zIsEmpty = g().isEmpty();
            v().add(i2, v);
            d.o(d.this);
            if (zIsEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i2, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = v().addAll(i2, collection);
            if (zAddAll) {
                int size2 = g().size();
                d.this.f15810g += size2 - size;
                if (size == 0) {
                    d();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        public V get(int i2) {
            s();
            return v().get(i2);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            s();
            return v().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            s();
            return v().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            s();
            return new a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i2) {
            s();
            return new a(i2);
        }

        @Override // java.util.List
        public V remove(int i2) {
            s();
            V vRemove = v().remove(i2);
            d.p(d.this);
            t();
            return vRemove;
        }

        @Override // java.util.List
        public V set(int i2, V v) {
            s();
            return v().set(i2, v);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public List<V> subList(int i2, int i3) {
            s();
            return d.this.z(i(), v().subList(i2, i3), f() == null ? this : f());
        }

        public List<V> v() {
            return (List) g();
        }
    }

    public d(Map<K, Collection<V>> map) {
        c.f.b.a.k.d(map.isEmpty());
        this.f15809f = map;
    }

    public static /* synthetic */ int o(d dVar) {
        int i2 = dVar.f15810g;
        dVar.f15810g = i2 + 1;
        return i2;
    }

    public static /* synthetic */ int p(d dVar) {
        int i2 = dVar.f15810g;
        dVar.f15810g = i2 - 1;
        return i2;
    }

    public static <E> Iterator<E> v(Collection<E> collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    @Override // c.f.b.b.f, c.f.b.b.e0
    public Collection<Map.Entry<K, V>> a() {
        return super.a();
    }

    @Override // c.f.b.b.e0
    public void clear() {
        Iterator<Collection<V>> it = this.f15809f.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f15809f.clear();
        this.f15810g = 0;
    }

    @Override // c.f.b.b.f
    public Collection<Map.Entry<K, V>> f() {
        return new f.a();
    }

    @Override // c.f.b.b.e0
    public Collection<V> get(@NullableDecl K k2) {
        Collection<V> collectionS = this.f15809f.get(k2);
        if (collectionS == null) {
            collectionS = s(k2);
        }
        return y(k2, collectionS);
    }

    @Override // c.f.b.b.f
    public Collection<V> h() {
        return new f.b();
    }

    @Override // c.f.b.b.f
    public Iterator<Map.Entry<K, V>> i() {
        return new b();
    }

    @Override // c.f.b.b.f
    public Iterator<V> j() {
        return new a();
    }

    @Override // c.f.b.b.e0
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
        Collection<V> collection = this.f15809f.get(k2);
        if (collection != null) {
            if (!collection.add(v)) {
                return false;
            }
            this.f15810g++;
            return true;
        }
        Collection<V> collectionS = s(k2);
        if (!collectionS.add(v)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f15810g++;
        this.f15809f.put(k2, collectionS);
        return true;
    }

    public abstract Collection<V> r();

    public Collection<V> s(@NullableDecl K k2) {
        return r();
    }

    @Override // c.f.b.b.e0
    public int size() {
        return this.f15810g;
    }

    public final Map<K, Collection<V>> t() {
        Map<K, Collection<V>> map = this.f15809f;
        return map instanceof NavigableMap ? new f((NavigableMap) this.f15809f) : map instanceof SortedMap ? new i((SortedMap) this.f15809f) : new c(this.f15809f);
    }

    public final Set<K> u() {
        Map<K, Collection<V>> map = this.f15809f;
        return map instanceof NavigableMap ? new g((NavigableMap) this.f15809f) : map instanceof SortedMap ? new j((SortedMap) this.f15809f) : new e(this.f15809f);
    }

    @Override // c.f.b.b.f, c.f.b.b.e0
    public Collection<V> values() {
        return super.values();
    }

    public final void w(Object obj) {
        Collection collection = (Collection) d0.j(this.f15809f, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f15810g -= size;
        }
    }

    public abstract <E> Collection<E> x(Collection<E> collection);

    public abstract Collection<V> y(@NullableDecl K k2, Collection<V> collection);

    public final List<V> z(@NullableDecl K k2, List<V> list, @NullableDecl d<K, V>.k kVar) {
        return list instanceof RandomAccess ? new h(k2, list, kVar) : new l(k2, list, kVar);
    }
}
