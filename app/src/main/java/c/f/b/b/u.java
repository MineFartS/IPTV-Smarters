package c.f.b.b;

import c.f.b.b.v;
import c.f.b.b.w;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public class u<K, V> extends w<K, V> implements a0<K, V> {

    /* JADX INFO: loaded from: classes2.dex */
    public static final class a<K, V> extends w.c<K, V> {
        public u<K, V> f() {
            return (u) super.a();
        }

        @CanIgnoreReturnValue
        public a<K, V> g(K k2, V v) {
            super.c(k2, v);
            return this;
        }

        @Override // c.f.b.b.w.c
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a<K, V> d(K k2, Iterable<? extends V> iterable) {
            super.d(k2, iterable);
            return this;
        }

        @CanIgnoreReturnValue
        public a<K, V> i(K k2, V... vArr) {
            super.e(k2, vArr);
            return this;
        }
    }

    public u(v<K, t<V>> vVar, int i2) {
        super(vVar, i2);
    }

    public static <K, V> a<K, V> s() {
        return new a<>();
    }

    public static <K, V> u<K, V> t(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return v();
        }
        v.a aVar = new v.a(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            t tVarD = comparator == null ? t.D(value) : t.P(comparator, value);
            if (!tVarD.isEmpty()) {
                aVar.c(key, tVarD);
                size += tVarD.size();
            }
        }
        return new u<>(aVar.a(), size);
    }

    public static <K, V> u<K, V> v() {
        return o.f15909h;
    }

    @Override // c.f.b.b.e0
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public t<V> get(@NullableDecl K k2) {
        t<V> tVar = (t) this.f15975f.get(k2);
        return tVar == null ? t.J() : tVar;
    }
}
