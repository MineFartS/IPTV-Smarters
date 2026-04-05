package c.f.b.b;

import c.f.b.b.s0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: Add missing generic type declarations: [V, K] */
    /* JADX INFO: loaded from: classes2.dex */
    public static class a<K, V> extends u0<Map.Entry<K, V>, V> {
        public a(Iterator it) {
            super(it);
        }

        @Override // c.f.b.b.u0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public V a(Map.Entry<K, V> entry) {
            return entry.getValue();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class b implements c.f.b.a.f<Map.Entry<?, ?>, Object> {
        private static final /* synthetic */ b[] $VALUES;
        public static final b KEY;
        public static final b VALUE;

        public enum a extends b {
            public a(String str, int i2) {
                super(str, i2, null);
            }

            @Override // c.f.b.b.d0.b, c.f.b.a.f
            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        /* JADX INFO: renamed from: c.f.b.b.d0$b$b, reason: collision with other inner class name */
        public enum C0187b extends b {
            public C0187b(String str, int i2) {
                super(str, i2, null);
            }

            @Override // c.f.b.b.d0.b, c.f.b.a.f
            @NullableDecl
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        static {
            a aVar = new a("KEY", 0);
            KEY = aVar;
            C0187b c0187b = new C0187b("VALUE", 1);
            VALUE = c0187b;
            $VALUES = new b[]{aVar, c0187b};
        }

        private b(String str, int i2) {
        }

        public /* synthetic */ b(String str, int i2, c0 c0Var) {
            this(str, i2);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        @Override // c.f.b.a.f
        @CanIgnoreReturnValue
        @NullableDecl
        public abstract /* synthetic */ T apply(@NullableDecl F f2);
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class c<K, V> extends s0.b<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public abstract boolean contains(Object obj);

        public abstract Map<K, V> d();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // c.f.b.b.s0.b, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) c.f.b.a.k.j(collection));
            } catch (UnsupportedOperationException unused) {
                return s0.h(this, collection.iterator());
            }
        }

        @Override // c.f.b.b.s0.b, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) c.f.b.a.k.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetE = s0.e(collection.size());
                for (Object obj : collection) {
                    if (contains(obj)) {
                        hashSetE.add(((Map.Entry) obj).getKey());
                    }
                }
                return d().keySet().retainAll(hashSetE);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d().size();
        }
    }

    public static class d<K, V> extends s0.b<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Weak
        public final Map<K, V> f15844b;

        public d(Map<K, V> map) {
            this.f15844b = (Map) c.f.b.a.k.j(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return d().containsKey(obj);
        }

        public Map<K, V> d() {
            return this.f15844b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d().size();
        }
    }

    public static class e<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Weak
        public final Map<K, V> f15845b;

        public e(Map<K, V> map) {
            this.f15845b = (Map) c.f.b.a.k.j(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            return d().containsValue(obj);
        }

        public final Map<K, V> d() {
            return this.f15845b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return d().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return d0.m(d().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : d().entrySet()) {
                    if (c.f.b.a.h.a(obj, entry.getValue())) {
                        d().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) c.f.b.a.k.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetD = s0.d();
                for (Map.Entry<K, V> entry : d().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetD.add(entry.getKey());
                    }
                }
                return d().keySet().removeAll(hashSetD);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) c.f.b.a.k.j(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetD = s0.d();
                for (Map.Entry<K, V> entry : d().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetD.add(entry.getKey());
                    }
                }
                return d().keySet().retainAll(hashSetD);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d().size();
        }
    }

    public static abstract class f<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @MonotonicNonNullDecl
        public transient Set<Map.Entry<K, V>> f15846b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @MonotonicNonNullDecl
        public transient Collection<V> f15847c;

        public abstract Set<Map.Entry<K, V>> b();

        public Collection<V> c() {
            return new e(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f15846b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setB = b();
            this.f15846b = setB;
            return setB;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> values() {
            Collection<V> collection = this.f15847c;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionC = c();
            this.f15847c = collectionC;
            return collectionC;
        }
    }

    public static int a(int i2) {
        if (i2 < 3) {
            j.b(i2, "expectedSize");
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static boolean b(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static <K, V> Map.Entry<K, V> c(@NullableDecl K k2, @NullableDecl V v) {
        return new s(k2, v);
    }

    public static <K> c.f.b.a.f<Map.Entry<K, ?>, K> d() {
        return b.KEY;
    }

    public static <K, V> HashMap<K, V> e() {
        return new HashMap<>();
    }

    public static <K, V> IdentityHashMap<K, V> f() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> g() {
        return new LinkedHashMap<>();
    }

    public static boolean h(Map<?, ?> map, Object obj) {
        c.f.b.a.k.j(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static <V> V i(Map<?, V> map, @NullableDecl Object obj) {
        c.f.b.a.k.j(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static <V> V j(Map<?, V> map, Object obj) {
        c.f.b.a.k.j(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    public static String k(Map<?, ?> map) {
        StringBuilder sbB = k.b(map.size());
        sbB.append('{');
        boolean z = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                sbB.append(", ");
            }
            z = false;
            sbB.append(entry.getKey());
            sbB.append('=');
            sbB.append(entry.getValue());
        }
        sbB.append('}');
        return sbB.toString();
    }

    public static <V> c.f.b.a.f<Map.Entry<?, V>, V> l() {
        return b.VALUE;
    }

    public static <K, V> Iterator<V> m(Iterator<Map.Entry<K, V>> it) {
        return new a(it);
    }
}
