package c.f.b.b;

import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static <T> Collection<T> a(Iterable<T> iterable) {
        return (Collection) iterable;
    }

    public static StringBuilder b(int i2) {
        j.b(i2, "size");
        return new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824L));
    }

    public static boolean c(Collection<?> collection, @NullableDecl Object obj) {
        c.f.b.a.k.j(collection);
        try {
            return collection.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }
}
