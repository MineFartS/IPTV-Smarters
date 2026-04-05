package c.f.b.b;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: loaded from: classes2.dex */
    public static class a<K, V> extends c<K, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public transient c.f.b.a.o<? extends List<V>> f15859h;

        public a(Map<K, Collection<V>> map, c.f.b.a.o<? extends List<V>> oVar) {
            super(map);
            this.f15859h = (c.f.b.a.o) c.f.b.a.k.j(oVar);
        }

        @Override // c.f.b.b.d
        /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
        public List<V> r() {
            return this.f15859h.get();
        }

        @Override // c.f.b.b.f
        public Map<K, Collection<V>> e() {
            return t();
        }

        @Override // c.f.b.b.f
        public Set<K> g() {
            return u();
        }
    }

    public static abstract class b<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return d().c(entry.getKey(), entry.getValue());
        }

        public abstract e0<K, V> d();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return d().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d().size();
        }
    }

    public static boolean a(e0<?, ?> e0Var, @NullableDecl Object obj) {
        if (obj == e0Var) {
            return true;
        }
        if (obj instanceof e0) {
            return e0Var.b().equals(((e0) obj).b());
        }
        return false;
    }

    public static <K, V> a0<K, V> b(Map<K, Collection<V>> map, c.f.b.a.o<? extends List<V>> oVar) {
        return new a(map, oVar);
    }
}
