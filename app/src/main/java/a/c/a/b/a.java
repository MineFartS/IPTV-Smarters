package a.c.a.b;

import a.c.a.b.b;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HashMap<K, b.c<K, V>> f1027f = new HashMap<>();

    public boolean contains(K k2) {
        return this.f1027f.containsKey(k2);
    }

    @Override // a.c.a.b.b
    public b.c<K, V> e(K k2) {
        return this.f1027f.get(k2);
    }

    @Override // a.c.a.b.b
    public V i(K k2, V v) {
        b.c<K, V> cVarE = e(k2);
        if (cVarE != null) {
            return cVarE.f1033c;
        }
        this.f1027f.put(k2, h(k2, v));
        return null;
    }

    @Override // a.c.a.b.b
    public V s(K k2) {
        V v = (V) super.s(k2);
        this.f1027f.remove(k2);
        return v;
    }

    public Map.Entry<K, V> t(K k2) {
        if (contains(k2)) {
            return this.f1027f.get(k2).f1035e;
        }
        return null;
    }
}
