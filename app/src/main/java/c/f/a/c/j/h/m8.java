package c.f.a.c.j.h;

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

/* JADX INFO: loaded from: classes2.dex */
public class m8<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13434b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile l8 f13438f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<j8> f13435c = Collections.emptyList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<K, V> f13436d = Collections.emptyMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<K, V> f13439g = Collections.emptyMap();

    public void b() {
        if (this.f13437e) {
            return;
        }
        this.f13436d = this.f13436d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f13436d);
        this.f13439g = this.f13439g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f13439g);
        this.f13437e = true;
    }

    public final boolean c() {
        return this.f13437e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        n();
        if (!this.f13435c.isEmpty()) {
            this.f13435c.clear();
        }
        if (this.f13436d.isEmpty()) {
            return;
        }
        this.f13436d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m(comparable) >= 0 || this.f13436d.containsKey(comparable);
    }

    public final int d() {
        return this.f13435c.size();
    }

    public final Map.Entry<K, V> e(int i2) {
        return this.f13435c.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f13438f == null) {
            this.f13438f = new l8(this, null);
        }
        return this.f13438f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8)) {
            return super.equals(obj);
        }
        m8 m8Var = (m8) obj;
        int size = size();
        if (size != m8Var.size()) {
            return false;
        }
        int iD = d();
        if (iD != m8Var.d()) {
            return entrySet().equals(m8Var.entrySet());
        }
        for (int i2 = 0; i2 < iD; i2++) {
            if (!e(i2).equals(m8Var.e(i2))) {
                return false;
            }
        }
        if (iD != size) {
            return this.f13436d.equals(m8Var.f13436d);
        }
        return true;
    }

    public final Iterable<Map.Entry<K, V>> f() {
        return this.f13436d.isEmpty() ? i8.a() : this.f13436d.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        n();
        int iM = m(k2);
        if (iM >= 0) {
            return (V) this.f13435c.get(iM).setValue(v);
        }
        n();
        if (this.f13435c.isEmpty() && !(this.f13435c instanceof ArrayList)) {
            this.f13435c = new ArrayList(this.f13434b);
        }
        int i2 = -(iM + 1);
        if (i2 >= this.f13434b) {
            return o().put(k2, v);
        }
        int size = this.f13435c.size();
        int i3 = this.f13434b;
        if (size == i3) {
            j8 j8VarRemove = this.f13435c.remove(i3 - 1);
            o().put(j8VarRemove.d(), j8VarRemove.getValue());
        }
        this.f13435c.add(i2, new j8(this, k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        return iM >= 0 ? (V) this.f13435c.get(iM).getValue() : this.f13436d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iD = d();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iD; i2++) {
            iHashCode += this.f13435c.get(i2).hashCode();
        }
        return this.f13436d.size() > 0 ? iHashCode + this.f13436d.hashCode() : iHashCode;
    }

    public final V l(int i2) {
        n();
        V v = (V) this.f13435c.remove(i2).getValue();
        if (!this.f13436d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = o().entrySet().iterator();
            List<j8> list = this.f13435c;
            Map.Entry<K, V> next = it.next();
            list.add(new j8(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    public final int m(K k2) {
        int size = this.f13435c.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int iCompareTo = k2.compareTo(this.f13435c.get(size).d());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int iCompareTo2 = k2.compareTo(this.f13435c.get(i3).d());
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

    public final void n() {
        if (this.f13437e) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap<K, V> o() {
        n();
        if (this.f13436d.isEmpty() && !(this.f13436d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13436d = treeMap;
            this.f13439g = treeMap.descendingMap();
        }
        return (SortedMap) this.f13436d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        n();
        Comparable comparable = (Comparable) obj;
        int iM = m(comparable);
        if (iM >= 0) {
            return l(iM);
        }
        if (this.f13436d.isEmpty()) {
            return null;
        }
        return this.f13436d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f13435c.size() + this.f13436d.size();
    }
}
