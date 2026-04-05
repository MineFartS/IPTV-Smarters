package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class auu<K, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f20586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set<K> f20587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection<V> f20588c;

    public abstract Set<Map.Entry<K, V>> b();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f20586a;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> setB = b();
        this.f20586a = setB;
        return setB;
    }

    public Set<K> g() {
        return new aus(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f20587b;
        if (set != null) {
            return set;
        }
        Set<K> setG = g();
        this.f20587b = setG;
        return setG;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.f20588c;
        if (collection != null) {
            return collection;
        }
        aut autVar = new aut(this);
        this.f20588c = autVar;
        return autVar;
    }
}
