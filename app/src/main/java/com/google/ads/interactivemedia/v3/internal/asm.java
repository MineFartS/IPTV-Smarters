package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class asm<K, V> extends asp<K, V> implements Serializable {
    private static final long serialVersionUID = 2447537837011683357L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Map<K, Collection<V>> f20474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient int f20475b;

    public asm(Map<K, Collection<V>> map) {
        ars.a(map.isEmpty());
        this.f20474a = map;
    }

    public static /* synthetic */ void n(asm asmVar, Object obj) {
        Collection<V> collectionRemove;
        Map<K, Collection<V>> map = asmVar.f20474a;
        ars.g(map);
        try {
            collectionRemove = map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            collectionRemove = null;
        }
        Collection<V> collection = collectionRemove;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            asmVar.f20475b -= size;
        }
    }

    public static /* synthetic */ void q(asm asmVar) {
        asmVar.f20475b++;
    }

    public static /* synthetic */ void r(asm asmVar) {
        asmVar.f20475b--;
    }

    public static /* synthetic */ void s(asm asmVar, int i2) {
        asmVar.f20475b += i2;
    }

    public static /* synthetic */ void t(asm asmVar, int i2) {
        asmVar.f20475b -= i2;
    }

    public abstract Collection<V> a();

    public <E> Collection<E> b(Collection<E> collection) {
        throw null;
    }

    public Collection<V> c(K k2, Collection<V> collection) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auw
    public final int d() {
        return this.f20475b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp
    public final Collection<V> e() {
        return new aso(this);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp
    public final Iterator<V> f() {
        return new asa(this, null);
    }

    public final List<V> g(K k2, List<V> list, asj asjVar) {
        return list instanceof RandomAccess ? new asf(this, k2, list, asjVar) : new asl(this, k2, list, asjVar);
    }

    public final Map<K, Collection<V>> i() {
        return this.f20474a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp
    public Map<K, Collection<V>> j() {
        throw null;
    }

    public final Map<K, Collection<V>> k() {
        Map<K, Collection<V>> map = this.f20474a;
        return map instanceof NavigableMap ? new asd(this, (NavigableMap) map) : map instanceof SortedMap ? new asg(this, (SortedMap) map) : new arz(this, map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp
    public Set<K> l() {
        throw null;
    }

    public final Set<K> m() {
        Map<K, Collection<V>> map = this.f20474a;
        return map instanceof NavigableMap ? new ase(this, (NavigableMap) map) : map instanceof SortedMap ? new ash(this, (SortedMap) map) : new asc(this, map);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auw
    public final void o() {
        Iterator<Collection<V>> it = this.f20474a.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.f20474a.clear();
        this.f20475b = 0;
    }

    public final void p(Map<K, Collection<V>> map) {
        this.f20474a = map;
        this.f20475b = 0;
        for (Collection<V> collection : map.values()) {
            ars.a(!collection.isEmpty());
            this.f20475b += collection.size();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.asp, com.google.ads.interactivemedia.v3.internal.auw
    public final void u(K k2, V v) {
        Collection<V> collection = this.f20474a.get(k2);
        if (collection != null) {
            if (collection.add(v)) {
                this.f20475b++;
            }
        } else {
            Collection<V> collectionA = a();
            if (!collectionA.add(v)) {
                throw new AssertionError("New Collection violated the Collection spec");
            }
            this.f20475b++;
            this.f20474a.put(k2, collectionA);
        }
    }
}
