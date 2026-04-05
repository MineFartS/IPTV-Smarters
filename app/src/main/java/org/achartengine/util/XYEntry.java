package org.achartengine.util;

import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class XYEntry<K, V> implements Map.Entry<K, V> {
    private final K key;
    private V value;

    public XYEntry(K k2, V v) {
        this.key = k2;
        this.value = v;
    }

    @Override // java.util.Map.Entry
    public K getKey() {
        return this.key;
    }

    @Override // java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // java.util.Map.Entry
    public V setValue(V v) {
        this.value = v;
        return v;
    }
}
