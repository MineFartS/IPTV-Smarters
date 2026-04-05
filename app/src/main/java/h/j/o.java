package h.j;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class o extends n {
    @NotNull
    public static final <K, V> Map<K, V> d() {
        k kVar = k.f30364b;
        if (kVar != null) {
            return kVar;
        }
        throw new h.h("null cannot be cast to non-null type kotlin.collections.Map<K, V>");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <K, V> Map<K, V> e(@NotNull Map<K, ? extends V> map) {
        h.l.c.g.c(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        return size != 0 ? size != 1 ? map : n.c(map) : d();
    }

    public static final <K, V> void f(@NotNull Map<? super K, ? super V> map, @NotNull Iterable<? extends h.e<? extends K, ? extends V>> iterable) {
        h.l.c.g.c(map, "$this$putAll");
        h.l.c.g.c(iterable, "pairs");
        for (h.e<? extends K, ? extends V> eVar : iterable) {
            map.put(eVar.a(), eVar.b());
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> g(@NotNull Iterable<? extends h.e<? extends K, ? extends V>> iterable) {
        h.l.c.g.c(iterable, "$this$toMap");
        if (!(iterable instanceof Collection)) {
            return e(h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return h(iterable, new LinkedHashMap(n.a(collection.size())));
        }
        return n.b(iterable instanceof List ? (h.e<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    @NotNull
    public static final <K, V, M extends Map<? super K, ? super V>> M h(@NotNull Iterable<? extends h.e<? extends K, ? extends V>> iterable, @NotNull M m2) {
        h.l.c.g.c(iterable, "$this$toMap");
        h.l.c.g.c(m2, "destination");
        f(m2, iterable);
        return m2;
    }
}
