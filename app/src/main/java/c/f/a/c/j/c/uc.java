package c.f.a.c.j.c;

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
public class uc<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<zc> f13105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map<K, V> f13106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f13107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile bd f13108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<K, V> f13109g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile vc f13110h;

    public uc(int i2) {
        this.f13104b = i2;
        this.f13105c = Collections.emptyList();
        this.f13106d = Collections.emptyMap();
        this.f13109g = Collections.emptyMap();
    }

    public /* synthetic */ uc(int i2, tc tcVar) {
        this(i2);
    }

    public static <FieldDescriptorType extends ka<FieldDescriptorType>> uc<FieldDescriptorType, Object> h(int i2) {
        return new tc(i2);
    }

    public final boolean b() {
        return this.f13107e;
    }

    public final int c(K k2) {
        int size = this.f13105c.size() - 1;
        if (size >= 0) {
            int iCompareTo = k2.compareTo((Comparable) this.f13105c.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int iCompareTo2 = k2.compareTo((Comparable) this.f13105c.get(i3).getKey());
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

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        q();
        if (!this.f13105c.isEmpty()) {
            this.f13105c.clear();
        }
        if (this.f13106d.isEmpty()) {
            return;
        }
        this.f13106d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return c(comparable) >= 0 || this.f13106d.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        q();
        int iC = c(k2);
        if (iC >= 0) {
            return (V) this.f13105c.get(iC).setValue(v);
        }
        q();
        if (this.f13105c.isEmpty() && !(this.f13105c instanceof ArrayList)) {
            this.f13105c = new ArrayList(this.f13104b);
        }
        int i2 = -(iC + 1);
        if (i2 >= this.f13104b) {
            return r().put(k2, v);
        }
        int size = this.f13105c.size();
        int i3 = this.f13104b;
        if (size == i3) {
            zc zcVarRemove = this.f13105c.remove(i3 - 1);
            r().put((Comparable) zcVarRemove.getKey(), zcVarRemove.getValue());
        }
        this.f13105c.add(i2, new zc(this, k2, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f13108f == null) {
            this.f13108f = new bd(this, null);
        }
        return this.f13108f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc)) {
            return super.equals(obj);
        }
        uc ucVar = (uc) obj;
        int size = size();
        if (size != ucVar.size()) {
            return false;
        }
        int iN = n();
        if (iN != ucVar.n()) {
            return entrySet().equals(ucVar.entrySet());
        }
        for (int i2 = 0; i2 < iN; i2++) {
            if (!i(i2).equals(ucVar.i(i2))) {
                return false;
            }
        }
        if (iN != size) {
            return this.f13106d.equals(ucVar.f13106d);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        return iC >= 0 ? (V) this.f13105c.get(iC).getValue() : this.f13106d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int iN = n();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iN; i2++) {
            iHashCode += this.f13105c.get(i2).hashCode();
        }
        return this.f13106d.size() > 0 ? iHashCode + this.f13106d.hashCode() : iHashCode;
    }

    public final Map.Entry<K, V> i(int i2) {
        return this.f13105c.get(i2);
    }

    public final V j(int i2) {
        q();
        V v = (V) this.f13105c.remove(i2).getValue();
        if (!this.f13106d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = r().entrySet().iterator();
            this.f13105c.add(new zc(this, it.next()));
            it.remove();
        }
        return v;
    }

    public void m() {
        if (this.f13107e) {
            return;
        }
        this.f13106d = this.f13106d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f13106d);
        this.f13109g = this.f13109g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f13109g);
        this.f13107e = true;
    }

    public final int n() {
        return this.f13105c.size();
    }

    public final Iterable<Map.Entry<K, V>> o() {
        return this.f13106d.isEmpty() ? yc.a() : this.f13106d.entrySet();
    }

    public final Set<Map.Entry<K, V>> p() {
        if (this.f13110h == null) {
            this.f13110h = new vc(this, null);
        }
        return this.f13110h;
    }

    public final void q() {
        if (this.f13107e) {
            throw new UnsupportedOperationException();
        }
    }

    public final SortedMap<K, V> r() {
        q();
        if (this.f13106d.isEmpty() && !(this.f13106d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f13106d = treeMap;
            this.f13109g = treeMap.descendingMap();
        }
        return (SortedMap) this.f13106d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        q();
        Comparable comparable = (Comparable) obj;
        int iC = c(comparable);
        if (iC >= 0) {
            return j(iC);
        }
        if (this.f13106d.isEmpty()) {
            return null;
        }
        return this.f13106d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f13105c.size() + this.f13106d.size();
    }
}
