package c.f.a.c.j.c;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class sa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f13070a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f13071b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f13072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ByteBuffer f13073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y9 f13074e;

    static {
        byte[] bArr = new byte[0];
        f13072c = bArr;
        f13073d = ByteBuffer.wrap(bArr);
        f13074e = y9.a(bArr, 0, bArr.length, false);
    }

    public static <T> T a(T t) {
        t.getClass();
        return t;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int iC = c(length, bArr, 0, length);
        if (iC == 0) {
            return 1;
        }
        return iC;
    }

    public static int c(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static <T> T d(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    public static Object e(Object obj, Object obj2) {
        return ((bc) obj).a().t((bc) obj2).s();
    }

    public static boolean f(byte[] bArr) {
        return rd.e(bArr);
    }

    public static String g(byte[] bArr) {
        return new String(bArr, f13070a);
    }

    public static boolean h(bc bcVar) {
        if (!(bcVar instanceof e9)) {
            return false;
        }
        return false;
    }

    public static int i(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int j(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }
}
