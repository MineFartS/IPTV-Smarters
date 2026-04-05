package h.j;

import java.util.List;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class g extends f {
    @NotNull
    public static final <T> List<T> a() {
        return j.f30363b;
    }

    @NotNull
    public static final <T> List<T> b(@NotNull T... tArr) {
        h.l.c.g.c(tArr, "elements");
        return tArr.length > 0 ? c.a(tArr) : a();
    }

    public static final void c() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
