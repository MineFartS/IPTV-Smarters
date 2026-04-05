package a.c.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c<K, V> f1028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c<K, V> f1029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public WeakHashMap<f<K, V>, Boolean> f1030d = new WeakHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1031e = 0;

    public static class a<K, V> extends e<K, V> {
        public a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1035e;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1034d;
        }
    }

    /* JADX INFO: renamed from: a.c.a.b.b$b, reason: collision with other inner class name */
    public static class C0015b<K, V> extends e<K, V> {
        public C0015b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.c.a.b.b.e
        public c<K, V> b(c<K, V> cVar) {
            return cVar.f1034d;
        }

        @Override // a.c.a.b.b.e
        public c<K, V> c(c<K, V> cVar) {
            return cVar.f1035e;
        }
    }

    public static class c<K, V> implements Map.Entry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f1032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final V f1033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<K, V> f1034d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public c<K, V> f1035e;

        public c(K k2, V v) {
            this.f1032b = k2;
            this.f1033c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f1032b.equals(cVar.f1032b) && this.f1033c.equals(cVar.f1033c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f1032b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f1033c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f1032b.hashCode() ^ this.f1033c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1032b + "=" + this.f1033c;
        }
    }

    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f1036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f1037c = true;

        public d() {
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f1036b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f1035e;
                this.f1036b = cVar3;
                this.f1037c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f1037c) {
                this.f1037c = false;
                cVar = b.this.f1028b;
            } else {
                c<K, V> cVar2 = this.f1036b;
                cVar = cVar2 != null ? cVar2.f1034d : null;
            }
            this.f1036b = cVar;
            return this.f1036b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1037c) {
                return b.this.f1028b != null;
            }
            c<K, V> cVar = this.f1036b;
            return (cVar == null || cVar.f1034d == null) ? false : true;
        }
    }

    public static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c<K, V> f1039b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public c<K, V> f1040c;

        public e(c<K, V> cVar, c<K, V> cVar2) {
            this.f1039b = cVar2;
            this.f1040c = cVar;
        }

        @Override // a.c.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f1039b == cVar && cVar == this.f1040c) {
                this.f1040c = null;
                this.f1039b = null;
            }
            c<K, V> cVar2 = this.f1039b;
            if (cVar2 == cVar) {
                this.f1039b = b(cVar2);
            }
            if (this.f1040c == cVar) {
                this.f1040c = f();
            }
        }

        public abstract c<K, V> b(c<K, V> cVar);

        public abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f1040c;
            this.f1040c = f();
            return cVar;
        }

        public final c<K, V> f() {
            c<K, V> cVar = this.f1040c;
            c<K, V> cVar2 = this.f1039b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1040c != null;
        }
    }

    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> d() {
        return this.f1028b;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0015b c0015b = new C0015b(this.f1029c, this.f1028b);
        this.f1030d.put(c0015b, Boolean.FALSE);
        return c0015b;
    }

    public c<K, V> e(K k2) {
        c<K, V> cVar = this.f1028b;
        while (cVar != null && !cVar.f1032b.equals(k2)) {
            cVar = cVar.f1034d;
        }
        return cVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public b<K, V>.d f() {
        b<K, V>.d dVar = new d();
        this.f1030d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> g() {
        return this.f1029c;
    }

    public c<K, V> h(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f1031e++;
        c<K, V> cVar2 = this.f1029c;
        if (cVar2 == null) {
            this.f1028b = cVar;
        } else {
            cVar2.f1034d = cVar;
            cVar.f1035e = cVar2;
        }
        this.f1029c = cVar;
        return cVar;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    public V i(K k2, V v) {
        c<K, V> cVarE = e(k2);
        if (cVarE != null) {
            return cVarE.f1033c;
        }
        h(k2, v);
        return null;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f1028b, this.f1029c);
        this.f1030d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V s(K k2) {
        c<K, V> cVarE = e(k2);
        if (cVarE == null) {
            return null;
        }
        this.f1031e--;
        if (!this.f1030d.isEmpty()) {
            Iterator<f<K, V>> it = this.f1030d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarE);
            }
        }
        c<K, V> cVar = cVarE.f1035e;
        c<K, V> cVar2 = cVarE.f1034d;
        if (cVar != null) {
            cVar.f1034d = cVar2;
        } else {
            this.f1028b = cVar2;
        }
        c<K, V> cVar3 = cVarE.f1034d;
        if (cVar3 != null) {
            cVar3.f1035e = cVar;
        } else {
            this.f1029c = cVar;
        }
        cVarE.f1034d = null;
        cVarE.f1035e = null;
        return cVarE.f1033c;
    }

    public int size() {
        return this.f1031e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
