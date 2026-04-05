package c.f.b.b;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {
    public static <T> T[] a(Object[] objArr, int i2, int i3, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i2, i3, tArr.getClass());
    }

    public static <T> T[] b(T[] tArr, int i2) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i2));
    }

    public static <K, V> Map<K, V> c(int i2) {
        return l.k(i2);
    }

    public static <K, V> Map<K, V> d() {
        return l.g();
    }
}
