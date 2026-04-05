package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class bld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f21341a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f21342b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f21342b = bArr;
        ByteBuffer.wrap(bArr);
        bke.c(bArr, 0, 0, false);
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        int iD = d(length, bArr, 0, length);
        if (iD == 0) {
            return 1;
        }
        return iD;
    }

    public static int c(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int d(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    public static Object e(Object obj, Object obj2) {
        return ((blz) obj).aT().Z((blz) obj2).ae();
    }

    public static String f(byte[] bArr) {
        return new String(bArr, f21341a);
    }

    public static boolean g(blz blzVar) {
        if (!(blzVar instanceof bjq)) {
            return false;
        }
        throw null;
    }

    public static boolean h(byte[] bArr) {
        return bnm.e(bArr);
    }

    public static <T> void i(T t) {
        t.getClass();
    }

    public static <T> void j(T t, String str) {
        if (t == null) {
            throw new NullPointerException(str);
        }
    }
}
