package h.j;

import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class n extends m {
    public static final int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @NotNull
    public static final <K, V> Map<K, V> b(@NotNull h.e<? extends K, ? extends V> eVar) {
        h.l.c.g.c(eVar, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(eVar.c(), eVar.d());
        h.l.c.g.b(mapSingletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return mapSingletonMap;
    }

    @NotNull
    public static final <K, V> Map<K, V> c(@NotNull Map<? extends K, ? extends V> map) {
        h.l.c.g.c(map, "$this$toSingletonMap");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        h.l.c.g.b(mapSingletonMap, "java.util.Collections.singletonMap(key, value)");
        h.l.c.g.b(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }
}
