package c.f.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public abstract class c<K, V> extends d<K, V> implements a0<K, V> {
    public c(Map<K, Collection<V>> map) {
        super(map);
    }

    @Override // c.f.b.b.d, c.f.b.b.e0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public List<V> get(@NullableDecl K k2) {
        return (List) super.get(k2);
    }

    @Override // c.f.b.b.f, c.f.b.b.e0
    public Map<K, Collection<V>> b() {
        return super.b();
    }

    @Override // c.f.b.b.f
    public boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // c.f.b.b.d, c.f.b.b.e0
    @CanIgnoreReturnValue
    public boolean put(@NullableDecl K k2, @NullableDecl V v) {
        return super.put(k2, v);
    }

    @Override // c.f.b.b.d
    public <E> Collection<E> x(Collection<E> collection) {
        return Collections.unmodifiableList((List) collection);
    }

    @Override // c.f.b.b.d
    public Collection<V> y(K k2, Collection<V> collection) {
        return z(k2, (List) collection, null);
    }
}
