package c.f.a.c.j.h;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class u6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f13546a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f13547b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f13548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f13549d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final o5 f13550e;

    static {
        byte[] bArr = new byte[0];
        f13548c = bArr;
        f13549d = ByteBuffer.wrap(bArr);
        n5 n5Var = new n5(bArr, 0, 0, false, null);
        try {
            n5Var.c(0);
            f13550e = n5Var;
        } catch (w6 e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static boolean c(byte[] bArr) {
        return i9.a(bArr);
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f13546a);
    }

    public static int e(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int f(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int g(byte[] bArr) {
        int length = bArr.length;
        int iH = h(length, bArr, 0, length);
        if (iH == 0) {
            return 1;
        }
        return iH;
    }

    public static int h(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static Object i(Object obj, Object obj2) {
        return ((q7) obj).c().U((q7) obj2).Q();
    }
}
