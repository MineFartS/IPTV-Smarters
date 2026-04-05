package c.f.d.w;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Comparator<Comparable> f16513b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Comparator<? super K> f16514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e<K, V> f16515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f16517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e<K, V> f16518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h<K, V>.b f16519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h<K, V>.c f16520i;

    public class a implements Comparator<Comparable> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public class b extends AbstractSet<Map.Entry<K, V>> {

        public class a extends h<K, V>.d<Map.Entry<K, V>> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.d((Map.Entry) obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            e<K, V> eVarD;
            if (!(obj instanceof Map.Entry) || (eVarD = h.this.d((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.g(eVarD, true);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f16516e;
        }
    }

    public final class c extends AbstractSet<K> {

        public class a extends h<K, V>.d<K> {
            public a() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return a().f16534g;
            }
        }

        public c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            return h.this.h(obj) != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return h.this.f16516e;
        }
    }

    public abstract class d<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e<K, V> f16525b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f16526c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16527d;

        public d() {
            this.f16525b = h.this.f16518g.f16532e;
            this.f16527d = h.this.f16517f;
        }

        public final e<K, V> a() {
            e<K, V> eVar = this.f16525b;
            h hVar = h.this;
            if (eVar == hVar.f16518g) {
                throw new NoSuchElementException();
            }
            if (hVar.f16517f != this.f16527d) {
                throw new ConcurrentModificationException();
            }
            this.f16525b = eVar.f16532e;
            this.f16526c = eVar;
            return eVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f16525b != h.this.f16518g;
        }

        @Override // java.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f16526c;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            h.this.g(eVar, true);
            this.f16526c = null;
            this.f16527d = h.this.f16517f;
        }
    }

    public static final class e<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public e<K, V> f16529b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public e<K, V> f16530c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public e<K, V> f16531d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public e<K, V> f16532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public e<K, V> f16533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final K f16534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public V f16535h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f16536i;

        public e() {
            this.f16534g = null;
            this.f16533f = this;
            this.f16532e = this;
        }

        public e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.f16529b = eVar;
            this.f16534g = k2;
            this.f16536i = 1;
            this.f16532e = eVar2;
            this.f16533f = eVar3;
            eVar3.f16532e = this;
            eVar2.f16533f = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f16530c; eVar2 != null; eVar2 = eVar2.f16530c) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f16531d; eVar2 != null; eVar2 = eVar2.f16531d) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f16534g;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v = this.f16535h;
            Object value = entry.getValue();
            if (v == null) {
                if (value != null) {
                    return false;
                }
            } else if (!v.equals(value)) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f16534g;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f16535h;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k2 = this.f16534g;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f16535h;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f16535h;
            this.f16535h = v;
            return v2;
        }

        public String toString() {
            return this.f16534g + "=" + this.f16535h;
        }
    }

    public h() {
        this(f16513b);
    }

    public h(Comparator<? super K> comparator) {
        this.f16516e = 0;
        this.f16517f = 0;
        this.f16518g = new e<>();
        this.f16514c = comparator == null ? f16513b : comparator;
    }

    public final boolean b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public e<K, V> c(K k2, boolean z) {
        int iCompareTo;
        e<K, V> eVar;
        Comparator<? super K> comparator = this.f16514c;
        e<K, V> eVar2 = this.f16515d;
        if (eVar2 != null) {
            Comparable comparable = comparator == f16513b ? (Comparable) k2 : null;
            while (true) {
                K k3 = eVar2.f16534g;
                iCompareTo = comparable != null ? comparable.compareTo(k3) : comparator.compare(k2, k3);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f16530c : eVar2.f16531d;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f16518g;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f16533f);
            if (iCompareTo < 0) {
                eVar2.f16530c = eVar;
            } else {
                eVar2.f16531d = eVar;
            }
            f(eVar2, true);
        } else {
            if (comparator == f16513b && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f16533f);
            this.f16515d = eVar;
        }
        this.f16516e++;
        this.f16517f++;
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        this.f16515d = null;
        this.f16516e = 0;
        this.f16517f++;
        e<K, V> eVar = this.f16518g;
        eVar.f16533f = eVar;
        eVar.f16532e = eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return e(obj) != null;
    }

    public e<K, V> d(Map.Entry<?, ?> entry) {
        e<K, V> eVarE = e(entry.getKey());
        if (eVarE != null && b(eVarE.f16535h, entry.getValue())) {
            return eVarE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e<K, V> e(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return c(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.f16519h;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f16519h = bVar2;
        return bVar2;
    }

    public final void f(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f16530c;
            e<K, V> eVar3 = eVar.f16531d;
            int i2 = eVar2 != null ? eVar2.f16536i : 0;
            int i3 = eVar3 != null ? eVar3.f16536i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.f16530c;
                e<K, V> eVar5 = eVar3.f16531d;
                int i5 = (eVar4 != null ? eVar4.f16536i : 0) - (eVar5 != null ? eVar5.f16536i : 0);
                if (i5 != -1 && (i5 != 0 || z)) {
                    k(eVar3);
                }
                j(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.f16530c;
                e<K, V> eVar7 = eVar2.f16531d;
                int i6 = (eVar6 != null ? eVar6.f16536i : 0) - (eVar7 != null ? eVar7.f16536i : 0);
                if (i6 != 1 && (i6 != 0 || z)) {
                    j(eVar2);
                }
                k(eVar);
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f16536i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f16536i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f16529b;
        }
    }

    public void g(e<K, V> eVar, boolean z) {
        int i2;
        if (z) {
            e<K, V> eVar2 = eVar.f16533f;
            eVar2.f16532e = eVar.f16532e;
            eVar.f16532e.f16533f = eVar2;
        }
        e<K, V> eVar3 = eVar.f16530c;
        e<K, V> eVar4 = eVar.f16531d;
        e<K, V> eVar5 = eVar.f16529b;
        int i3 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                i(eVar, eVar3);
                eVar.f16530c = null;
            } else if (eVar4 != null) {
                i(eVar, eVar4);
                eVar.f16531d = null;
            } else {
                i(eVar, null);
            }
            f(eVar5, false);
            this.f16516e--;
            this.f16517f++;
            return;
        }
        e<K, V> eVarB = eVar3.f16536i > eVar4.f16536i ? eVar3.b() : eVar4.a();
        g(eVarB, false);
        e<K, V> eVar6 = eVar.f16530c;
        if (eVar6 != null) {
            i2 = eVar6.f16536i;
            eVarB.f16530c = eVar6;
            eVar6.f16529b = eVarB;
            eVar.f16530c = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar7 = eVar.f16531d;
        if (eVar7 != null) {
            i3 = eVar7.f16536i;
            eVarB.f16531d = eVar7;
            eVar7.f16529b = eVarB;
            eVar.f16531d = null;
        }
        eVarB.f16536i = Math.max(i2, i3) + 1;
        i(eVar, eVarB);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        e<K, V> eVarE = e(obj);
        if (eVarE != null) {
            return eVarE.f16535h;
        }
        return null;
    }

    public e<K, V> h(Object obj) {
        e<K, V> eVarE = e(obj);
        if (eVarE != null) {
            g(eVarE, true);
        }
        return eVarE;
    }

    public final void i(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f16529b;
        eVar.f16529b = null;
        if (eVar2 != null) {
            eVar2.f16529b = eVar3;
        }
        if (eVar3 == null) {
            this.f16515d = eVar2;
        } else if (eVar3.f16530c == eVar) {
            eVar3.f16530c = eVar2;
        } else {
            eVar3.f16531d = eVar2;
        }
    }

    public final void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f16530c;
        e<K, V> eVar3 = eVar.f16531d;
        e<K, V> eVar4 = eVar3.f16530c;
        e<K, V> eVar5 = eVar3.f16531d;
        eVar.f16531d = eVar4;
        if (eVar4 != null) {
            eVar4.f16529b = eVar;
        }
        i(eVar, eVar3);
        eVar3.f16530c = eVar;
        eVar.f16529b = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f16536i : 0, eVar4 != null ? eVar4.f16536i : 0) + 1;
        eVar.f16536i = iMax;
        eVar3.f16536i = Math.max(iMax, eVar5 != null ? eVar5.f16536i : 0) + 1;
    }

    public final void k(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f16530c;
        e<K, V> eVar3 = eVar.f16531d;
        e<K, V> eVar4 = eVar2.f16530c;
        e<K, V> eVar5 = eVar2.f16531d;
        eVar.f16530c = eVar5;
        if (eVar5 != null) {
            eVar5.f16529b = eVar;
        }
        i(eVar, eVar2);
        eVar2.f16531d = eVar;
        eVar.f16529b = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f16536i : 0, eVar5 != null ? eVar5.f16536i : 0) + 1;
        eVar.f16536i = iMax;
        eVar2.f16536i = Math.max(iMax, eVar4 != null ? eVar4.f16536i : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        h<K, V>.c cVar = this.f16520i;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.f16520i = cVar2;
        return cVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k2, V v) {
        if (k2 == null) {
            throw new NullPointerException("key == null");
        }
        e<K, V> eVarC = c(k2, true);
        V v2 = eVarC.f16535h;
        eVarC.f16535h = v;
        return v2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        e<K, V> eVarH = h(obj);
        if (eVarH != null) {
            return eVarH.f16535h;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f16516e;
    }
}
