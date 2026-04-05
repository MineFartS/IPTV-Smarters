package c.f.a.c.j.h;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class k7<K, V> extends LinkedHashMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k7 f13398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13399c;

    static {
        k7 k7Var = new k7();
        f13398b = k7Var;
        k7Var.f13399c = false;
    }

    public k7() {
        this.f13399c = true;
    }

    public k7(Map<K, V> map) {
        super(map);
        this.f13399c = true;
    }

    public static <K, V> k7<K, V> b() {
        return f13398b;
    }

    public static int h(Object obj) {
        if (obj instanceof byte[]) {
            return u6.g((byte[]) obj);
        }
        if (obj instanceof n6) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    public final void c(k7<K, V> k7Var) {
        j();
        if (k7Var.isEmpty()) {
            return;
        }
        putAll(k7Var);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        j();
        super.clear();
    }

    public final k7<K, V> e() {
        return isEmpty() ? new k7<>() : new k7<>(this);
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

    public final void f() {
        this.f13399c = false;
    }

    public final boolean g() {
        return this.f13399c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iH = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iH += h(entry.getValue()) ^ h(entry.getKey());
        }
        return iH;
    }

    public final void j() {
        if (!this.f13399c) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k2, V v) {
        j();
        u6.a(k2);
        u6.a(v);
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        j();
        for (K k2 : map.keySet()) {
            u6.a(k2);
            u6.a(map.get(k2));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        j();
        return (V) super.remove(obj);
    }
}
