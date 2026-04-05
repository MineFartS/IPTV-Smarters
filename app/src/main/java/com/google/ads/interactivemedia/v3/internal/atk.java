package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class atk<K, V> extends AbstractMap<V, K> implements Serializable, asr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final atq<K, V> f20521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set<Map.Entry<V, K>> f20522b;

    public atk(atq<K, V> atqVar) {
        this.f20521a = atqVar;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        ((atq) this.f20521a).p = this;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f20521a.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.f20521a.containsValue(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return this.f20521a.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<V, K>> entrySet() {
        Set<Map.Entry<V, K>> set = this.f20522b;
        if (set != null) {
            return set;
        }
        atl atlVar = new atl(this.f20521a);
        this.f20522b = atlVar;
        return atlVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K get(Object obj) {
        atq<K, V> atqVar = this.f20521a;
        int iE = atqVar.e(obj);
        if (iE == -1) {
            return null;
        }
        return atqVar.f20531a[iE];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<V> keySet() {
        return this.f20521a.values();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K put(V v, K k2) {
        return this.f20521a.q(v, k2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final K remove(Object obj) {
        atq<K, V> atqVar = this.f20521a;
        int iU = auv.u(obj);
        int iF = atqVar.f(obj, iU);
        if (iF == -1) {
            return null;
        }
        K k2 = atqVar.f20531a[iF];
        atqVar.k(iF, iU);
        return k2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f20521a.f20533c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return this.f20521a.keySet();
    }
}
