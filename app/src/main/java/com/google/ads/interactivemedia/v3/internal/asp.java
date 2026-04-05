package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class asp<K, V> implements auw<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set<K> f20477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection<V> f20478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Map<K, Collection<V>> f20479c;

    public abstract Collection<V> e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auw) {
            return w().equals(((auw) obj).w());
        }
        return false;
    }

    public Iterator<V> f() {
        throw null;
    }

    public final int hashCode() {
        return w().hashCode();
    }

    public abstract Map<K, Collection<V>> j();

    public abstract Set<K> l();

    public final String toString() {
        return w().toString();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auw
    public void u(K k2, V v) {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auw
    public Collection<V> v() {
        Collection<V> collection = this.f20478b;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionE = e();
        this.f20478b = collectionE;
        return collectionE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.auw
    public Map<K, Collection<V>> w() {
        Map<K, Collection<V>> map = this.f20479c;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapJ = j();
        this.f20479c = mapJ;
        return mapJ;
    }

    public final Set<K> x() {
        Set<K> set = this.f20477a;
        if (set != null) {
            return set;
        }
        Set<K> setL = l();
        this.f20477a = setL;
        return setL;
    }

    public boolean y(Object obj) {
        Iterator<Collection<V>> it = w().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
