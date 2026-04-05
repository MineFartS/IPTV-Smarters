package com.google.ads.interactivemedia.v3.internal;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class bmu<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21426a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f21429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile bmt f21430e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<bmr> f21427b = Collections.emptyList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<K, V> f21428c = Collections.emptyMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<K, V> f21431f = Collections.emptyMap();

    public static <FieldDescriptorType extends bkp<FieldDescriptorType>> bmu<FieldDescriptorType, Object> c(int i2) {
        return new bmn(i2);
    }

    private final int l(K k2) {
        int size = this.f21427b.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int iCompareTo = k2.compareTo(this.f21427b.get(size).a());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int iCompareTo2 = k2.compareTo(this.f21427b.get(i3).a());
            if (iCompareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V m(int i2) {
        o();
        V v = (V) this.f21427b.remove(i2).getValue();
        if (!this.f21428c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            List<bmr> list = this.f21427b;
            Map.Entry<K, V> next = it.next();
            list.add(new bmr(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    private final SortedMap<K, V> n() {
        o();
        if (this.f21428c.isEmpty() && !(this.f21428c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f21428c = treeMap;
            this.f21431f = treeMap.descendingMap();
        }
        return (SortedMap) this.f21428c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (this.f21429d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f21429d) {
            return;
        }
        this.f21428c = this.f21428c.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f21428c);
        this.f21431f = this.f21431f.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f21431f);
        this.f21429d = true;
    }

    public final int b() {
        return this.f21427b.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        o();
        if (!this.f21427b.isEmpty()) {
            this.f21427b.clear();
        }
        if (this.f21428c.isEmpty()) {
            return;
        }
        this.f21428c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f21428c.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.f21428c.isEmpty() ? bmq.a() : this.f21428c.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        o();
        int iL = l(k2);
        if (iL >= 0) {
            return (V) this.f21427b.get(iL).setValue(v);
        }
        o();
        if (this.f21427b.isEmpty() && !(this.f21427b instanceof ArrayList)) {
            this.f21427b = new ArrayList(this.f21426a);
        }
        int i2 = -(iL + 1);
        if (i2 >= this.f21426a) {
            return n().put(k2, v);
        }
        int size = this.f21427b.size();
        int i3 = this.f21426a;
        if (size == i3) {
            bmr bmrVarRemove = this.f21427b.remove(i3 - 1);
            n().put(bmrVarRemove.a(), bmrVarRemove.getValue());
        }
        this.f21427b.add(i2, new bmr(this, k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f21430e == null) {
            this.f21430e = new bmt(this);
        }
        return this.f21430e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bmu)) {
            return super.equals(obj);
        }
        bmu bmuVar = (bmu) obj;
        int size = size();
        if (size != bmuVar.size()) {
            return false;
        }
        int iB = b();
        if (iB != bmuVar.b()) {
            return entrySet().equals(bmuVar.entrySet());
        }
        for (int i2 = 0; i2 < iB; i2++) {
            if (!g(i2).equals(bmuVar.g(i2))) {
                return false;
            }
        }
        if (iB != size) {
            return this.f21428c.equals(bmuVar.f21428c);
        }
        return true;
    }

    public final Map.Entry<K, V> g(int i2) {
        return this.f21427b.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? (V) this.f21427b.get(iL).getValue() : this.f21428c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iB = b();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iB; i2++) {
            iHashCode += this.f21427b.get(i2).hashCode();
        }
        return this.f21428c.size() > 0 ? iHashCode + this.f21428c.hashCode() : iHashCode;
    }

    public final boolean j() {
        return this.f21429d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        o();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return m(iL);
        }
        if (this.f21428c.isEmpty()) {
            return null;
        }
        return this.f21428c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f21427b.size() + this.f21428c.size();
    }
}
