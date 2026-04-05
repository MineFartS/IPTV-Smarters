package com.amazonaws.util;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ImmutableMapParameter<K, V> implements Map<K, V> {
    private static final String DUPLICATED_KEY_MESSAGE = "Duplicate keys are provided.";
    private static final String UNMODIFIABLE_MESSAGE = "This is an immutable map.";
    private final Map<K, V> map;

    public static class Builder<K, V> {
        private final Map<K, V> entries = new HashMap();

        public ImmutableMapParameter<K, V> build() {
            HashMap map = new HashMap();
            map.putAll(this.entries);
            return new ImmutableMapParameter<>(map);
        }

        public Builder<K, V> put(K k2, V v) {
            ImmutableMapParameter.putAndWarnDuplicateKeys(this.entries, k2, v);
            return this;
        }
    }

    private ImmutableMapParameter(Map<K, V> map) {
        this.map = map;
    }

    public static <K, V> Builder<K, V> builder() {
        return new Builder<>();
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k2, V v) {
        return new ImmutableMapParameter<>(Collections.singletonMap(k2, v));
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k2, V v, K k3, V v2) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k2, v);
        putAndWarnDuplicateKeys(map, k3, v2);
        return new ImmutableMapParameter<>(map);
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k2, V v, K k3, V v2, K k4, V v3) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k2, v);
        putAndWarnDuplicateKeys(map, k3, v2);
        putAndWarnDuplicateKeys(map, k4, v3);
        return new ImmutableMapParameter<>(map);
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k2, v);
        putAndWarnDuplicateKeys(map, k3, v2);
        putAndWarnDuplicateKeys(map, k4, v3);
        putAndWarnDuplicateKeys(map, k5, v4);
        return new ImmutableMapParameter<>(map);
    }

    public static <K, V> ImmutableMapParameter<K, V> of(K k2, V v, K k3, V v2, K k4, V v3, K k5, V v4, K k6, V v5) {
        HashMap map = new HashMap();
        putAndWarnDuplicateKeys(map, k2, v);
        putAndWarnDuplicateKeys(map, k3, v2);
        putAndWarnDuplicateKeys(map, k4, v3);
        putAndWarnDuplicateKeys(map, k5, v4);
        putAndWarnDuplicateKeys(map, k6, v5);
        return new ImmutableMapParameter<>(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void putAndWarnDuplicateKeys(Map<K, V> map, K k2, V v) {
        if (map.containsKey(k2)) {
            throw new IllegalArgumentException(DUPLICATED_KEY_MESSAGE);
        }
        map.put(k2, v);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.map.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return this.map.entrySet();
    }

    @Override // java.util.Map
    public V get(Object obj) {
        return this.map.get(obj);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return this.map.keySet();
    }

    @Override // java.util.Map
    public V put(K k2, V v) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException(UNMODIFIABLE_MESSAGE);
    }

    @Override // java.util.Map
    public int size() {
        return this.map.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.map.values();
    }
}
