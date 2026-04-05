package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class blu<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final blu f21374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f21375b;

    static {
        blu bluVar = new blu();
        f21374a = bluVar;
        bluVar.c();
    }

    private blu() {
        this.f21375b = true;
    }

    private blu(Map<K, V> map) {
        super(map);
        this.f21375b = true;
    }

    public static <K, V> blu<K, V> a() {
        return f21374a;
    }

    private static int f(Object obj) {
        if (obj instanceof byte[]) {
            return bld.b((byte[]) obj);
        }
        if (obj instanceof bkz) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void g() {
        if (!this.f21375b) {
            throw new UnsupportedOperationException();
        }
    }

    public final blu<K, V> b() {
        return isEmpty() ? new blu<>() : new blu<>(this);
    }

    public final void c() {
        this.f21375b = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        super.clear();
    }

    public final void d(blu<K, V> bluVar) {
        g();
        if (bluVar.isEmpty()) {
            return;
        }
        putAll(bluVar);
    }

    public final boolean e() {
        return this.f21375b;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iF = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iF += f(entry.getValue()) ^ f(entry.getKey());
        }
        return iF;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        g();
        bld.i(k2);
        bld.i(v);
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        g();
        for (K k2 : map.keySet()) {
            bld.i(k2);
            bld.i(map.get(k2));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        g();
        return (V) super.remove(obj);
    }
}
