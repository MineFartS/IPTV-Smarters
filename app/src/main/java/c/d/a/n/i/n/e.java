package c.d.a.n.i.n;

import c.d.a.n.i.n.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class e<K extends h, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a<K, V> f5601a = new a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<K, a<K, V>> f5602b = new HashMap();

    public static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final K f5603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List<V> f5604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a<K, V> f5605c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a<K, V> f5606d;

        public a() {
            this(null);
        }

        public a(K k2) {
            this.f5606d = this;
            this.f5605c = this;
            this.f5603a = k2;
        }

        public void b(V v) {
            if (this.f5604b == null) {
                this.f5604b = new ArrayList();
            }
            this.f5604b.add(v);
        }

        public V c() {
            int iD = d();
            if (iD > 0) {
                return this.f5604b.remove(iD - 1);
            }
            return null;
        }

        public int d() {
            List<V> list = this.f5604b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    public static <K, V> void e(a<K, V> aVar) {
        a<K, V> aVar2 = aVar.f5606d;
        aVar2.f5605c = aVar.f5605c;
        aVar.f5605c.f5606d = aVar2;
    }

    public static <K, V> void g(a<K, V> aVar) {
        aVar.f5605c.f5606d = aVar;
        aVar.f5606d.f5605c = aVar;
    }

    public V a(K k2) {
        a<K, V> aVar = this.f5602b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            this.f5602b.put(k2, aVar);
        } else {
            k2.a();
        }
        b(aVar);
        return aVar.c();
    }

    public final void b(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f5601a;
        aVar.f5606d = aVar2;
        aVar.f5605c = aVar2.f5605c;
        g(aVar);
    }

    public final void c(a<K, V> aVar) {
        e(aVar);
        a<K, V> aVar2 = this.f5601a;
        aVar.f5606d = aVar2.f5606d;
        aVar.f5605c = aVar2;
        g(aVar);
    }

    public void d(K k2, V v) {
        a<K, V> aVar = this.f5602b.get(k2);
        if (aVar == null) {
            aVar = new a<>(k2);
            c(aVar);
            this.f5602b.put(k2, aVar);
        } else {
            k2.a();
        }
        aVar.b(v);
    }

    public V f() {
        a aVar = this.f5601a;
        while (true) {
            aVar = aVar.f5606d;
            if (aVar.equals(this.f5601a)) {
                return null;
            }
            V v = (V) aVar.c();
            if (v != null) {
                return v;
            }
            e(aVar);
            this.f5602b.remove(aVar.f5603a);
            ((h) aVar.f5603a).a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (a aVar = this.f5601a.f5605c; !aVar.equals(this.f5601a); aVar = aVar.f5605c) {
            z = true;
            sb.append('{');
            sb.append(aVar.f5603a);
            sb.append(':');
            sb.append(aVar.d());
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
