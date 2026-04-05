package a.f;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class a<K, V> extends i<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h<K, V> f1245i;

    /* JADX INFO: renamed from: a.f.a$a, reason: collision with other inner class name */
    public class C0022a extends h<K, V> {
        public C0022a() {
        }

        @Override // a.f.h
        public void a() {
            a.this.clear();
        }

        @Override // a.f.h
        public Object b(int i2, int i3) {
            return a.this.f1302g[(i2 << 1) + i3];
        }

        @Override // a.f.h
        public Map<K, V> c() {
            return a.this;
        }

        @Override // a.f.h
        public int d() {
            return a.this.f1303h;
        }

        @Override // a.f.h
        public int e(Object obj) {
            return a.this.g(obj);
        }

        @Override // a.f.h
        public int f(Object obj) {
            return a.this.i(obj);
        }

        @Override // a.f.h
        public void g(K k2, V v) {
            a.this.put(k2, v);
        }

        @Override // a.f.h
        public void h(int i2) {
            a.this.l(i2);
        }

        @Override // a.f.h
        public V i(int i2, V v) {
            return a.this.m(i2, v);
        }
    }

    public a() {
    }

    public a(int i2) {
        super(i2);
    }

    public a(i iVar) {
        super(iVar);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return o().l();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return o().m();
    }

    public final h<K, V> o() {
        if (this.f1245i == null) {
            this.f1245i = new C0022a();
        }
        return this.f1245i;
    }

    public boolean p(Collection<?> collection) {
        return h.p(this, collection);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        d(this.f1303h + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return o().n();
    }
}
