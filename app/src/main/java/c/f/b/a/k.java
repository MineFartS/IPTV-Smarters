package c.f.b.a;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes.dex */
public final class k {
    public static String a(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0) {
            return n.a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return n.a("%s (%s) must be less than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }

    public static String b(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0) {
            return n.a("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return n.a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        throw new IllegalArgumentException("negative size: " + i3);
    }

    public static String c(int i2, int i3, int i4) {
        return (i2 < 0 || i2 > i4) ? b(i2, i4, "start index") : (i3 < 0 || i3 > i4) ? b(i3, i4, "end index") : n.a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
    }

    public static void d(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void e(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void f(boolean z, @NullableDecl String str, long j2) {
        if (!z) {
            throw new IllegalArgumentException(n.a(str, Long.valueOf(j2)));
        }
    }

    public static void g(boolean z, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalArgumentException(n.a(str, obj));
        }
    }

    @CanIgnoreReturnValue
    public static int h(int i2, int i3) {
        return i(i2, i3, "index");
    }

    @CanIgnoreReturnValue
    public static int i(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(a(i2, i3, str));
        }
        return i2;
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T j(@NonNullDecl T t) {
        t.getClass();
        return t;
    }

    @CanIgnoreReturnValue
    @NonNullDecl
    public static <T> T k(@NonNullDecl T t, @NullableDecl Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @CanIgnoreReturnValue
    public static int l(int i2, int i3) {
        return m(i2, i3, "index");
    }

    @CanIgnoreReturnValue
    public static int m(int i2, int i3, @NullableDecl String str) {
        if (i2 < 0 || i2 > i3) {
            throw new IndexOutOfBoundsException(b(i2, i3, str));
        }
        return i2;
    }

    public static void n(int i2, int i3, int i4) {
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            throw new IndexOutOfBoundsException(c(i2, i3, i4));
        }
    }

    public static void o(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void p(boolean z, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void q(boolean z, @NullableDecl String str, @NullableDecl Object obj) {
        if (!z) {
            throw new IllegalStateException(n.a(str, obj));
        }
    }
}
