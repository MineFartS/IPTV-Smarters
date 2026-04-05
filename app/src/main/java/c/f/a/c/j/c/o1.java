package c.f.a.c.j.c;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class o1<K, V> implements Serializable, Map<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map.Entry<?, ?>[] f12987b = new Map.Entry[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient s1<Map.Entry<K, V>> f12988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient s1<K> f12989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public transient j1<V> f12990e;

    public static <K, V> o1<K, V> b() {
        return (o1<K, V>) u1.f13091f;
    }

    public abstract s1<Map.Entry<K, V>> c();

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return ((j1) values()).contains(obj);
    }

    public abstract s1<K> d();

    public abstract j1<V> e();

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        s1<Map.Entry<K, V>> s1Var = this.f12988c;
        if (s1Var != null) {
            return s1Var;
        }
        s1<Map.Entry<K, V>> s1VarC = c();
        this.f12988c = s1VarC;
        return s1VarC;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public int hashCode() {
        return x1.b((s1) entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        s1<K> s1Var = this.f12989d;
        if (s1Var != null) {
            return s1Var;
        }
        s1<K> s1VarD = d();
        this.f12989d = s1VarD;
        return s1VarD;
    }

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

    public String toString() {
        int size = size();
        g1.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) << 3, 1073741824L));
        sb.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        j1<V> j1Var = this.f12990e;
        if (j1Var != null) {
            return j1Var;
        }
        j1<V> j1VarE = e();
        this.f12990e = j1VarE;
        return j1VarE;
    }
}
