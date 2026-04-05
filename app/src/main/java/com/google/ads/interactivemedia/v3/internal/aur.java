package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class aur<K, V> extends avp<Map.Entry<K, V>> {
    public abstract Map<K, V> a();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        a().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object objB = auv.b(a(), key);
        if (auv.w(objB, entry.getValue())) {
            return objB != null || a().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return a().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (contains(obj)) {
            return a().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avp, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        try {
            ars.g(collection);
            return avq.d(this, collection);
        } catch (UnsupportedOperationException unused) {
            return avq.e(this, collection.iterator());
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.avp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        try {
            ars.g(collection);
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSetC = avq.c(collection.size());
            for (Object obj : collection) {
                if (contains(obj)) {
                    hashSetC.add(((Map.Entry) obj).getKey());
                }
            }
            return a().keySet().retainAll(hashSetC);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return a().size();
    }
}
