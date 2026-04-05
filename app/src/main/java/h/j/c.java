package h.j;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class c extends b {
    @NotNull
    public static final <T> List<T> a(@NotNull T[] tArr) {
        h.l.c.g.c(tArr, "$this$asList");
        List<T> listA = e.a(tArr);
        h.l.c.g.b(listA, "ArraysUtilJVM.asList(this)");
        return listA;
    }
}
