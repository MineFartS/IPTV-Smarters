package h.j;

import java.util.Collection;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class h extends g {
    public static final <T> int d(@NotNull Iterable<? extends T> iterable, int i2) {
        h.l.c.g.c(iterable, "$this$collectionSizeOrDefault");
        return iterable instanceof Collection ? ((Collection) iterable).size() : i2;
    }
}
