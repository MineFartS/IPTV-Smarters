package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class aut<K, V> extends AbstractCollection<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<K, V> f20585a;

    public aut(Map<K, V> map) {
        this.f20585a = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f20585a.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f20585a.containsValue(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return this.f20585a.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator<V> iterator() {
        return new auq(this.f20585a.entrySet().iterator());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        try {
            return super.remove(obj);
        } catch (UnsupportedOperationException unused) {
            for (Map.Entry<K, V> entry : this.f20585a.entrySet()) {
                if (auv.w(obj, entry.getValue())) {
                    this.f20585a.remove(entry.getKey());
                    return true;
                }
            }
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        try {
            ars.g(collection);
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetB = avq.b();
            for (Map.Entry<K, V> entry : this.f20585a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSetB.add(entry.getKey());
                }
            }
            return this.f20585a.keySet().removeAll(hashSetB);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        try {
            ars.g(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetB = avq.b();
            for (Map.Entry<K, V> entry : this.f20585a.entrySet()) {
                if (collection.contains(entry.getValue())) {
                    hashSetB.add(entry.getKey());
                }
            }
            return this.f20585a.keySet().retainAll(hashSetB);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.f20585a.size();
    }
}
