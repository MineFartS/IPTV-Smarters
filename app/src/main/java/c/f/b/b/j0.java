package c.f.b.b;

import com.google.errorprone.annotations.CanIgnoreReturnValue;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 {
    @CanIgnoreReturnValue
    public static Object a(Object obj, int i2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i2);
    }

    @CanIgnoreReturnValue
    public static Object[] b(Object... objArr) {
        return c(objArr, objArr.length);
    }

    @CanIgnoreReturnValue
    public static Object[] c(Object[] objArr, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            a(objArr[i3], i3);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i2) {
        return (T[]) l0.b(tArr, i2);
    }
}
