package com.google.ads.interactivemedia.v3.internal;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class aud<K, V> implements Map<K, V>, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient auk<Map.Entry<K, V>> f20564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient auk<K> f20565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient ats<V> f20566c;

    public static <K, V> aub<K, V> c() {
        return new aub<>();
    }

    public static <K, V> aud<K, V> d(Map<? extends K, ? extends V> map) {
        if ((map instanceof aud) && !(map instanceof SortedMap)) {
            aud<K, V> audVar = (aud) map;
            audVar.j();
            return audVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> setEntrySet = map.entrySet();
        aub aubVar = new aub(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        aubVar.c(setEntrySet);
        return aubVar.a();
    }

    public static <K, V> aud<K, V> e() {
        return (aud<K, V>) avk.f20611a;
    }

    public static <K, V> aud<K, V> k(V v) {
        auv.o("adBreakTime", v);
        return avk.l(1, new Object[]{"adBreakTime", v});
    }

    public abstract ats<V> a();

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ats<V> values() {
        ats<V> atsVar = this.f20566c;
        if (atsVar != null) {
            return atsVar;
        }
        ats<V> atsVarA = a();
        this.f20566c = atsVarA;
        return atsVarA;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public abstract auk<Map.Entry<K, V>> f();

    public abstract auk<K> g();

    @Override // java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.Map
    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final auk<Map.Entry<K, V>> entrySet() {
        auk<Map.Entry<K, V>> aukVar = this.f20564a;
        if (aukVar != null) {
            return aukVar;
        }
        auk<Map.Entry<K, V>> aukVarF = f();
        this.f20564a = aukVarF;
        return aukVarF;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return avq.a(entrySet());
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public final auk<K> keySet() {
        auk<K> aukVar = this.f20565b;
        if (aukVar != null) {
            return aukVar;
        }
        auk<K> aukVarG = g();
        this.f20565b = aukVarG;
        return aukVarG;
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public abstract void j();

    @Override // java.util.Map
    @Deprecated
    public final V put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        auv.q(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new auc(this);
    }
}
