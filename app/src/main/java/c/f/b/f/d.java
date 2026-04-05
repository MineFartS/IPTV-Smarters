package c.f.b.f;

import c.f.b.a.k;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static int a(long j2, long j3) {
        if (j2 < j3) {
            return -1;
        }
        return j2 > j3 ? 1 : 0;
    }

    public static int b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static long c(long... jArr) {
        k.d(jArr.length > 0);
        long j2 = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            if (jArr[i2] > j2) {
                j2 = jArr[i2];
            }
        }
        return j2;
    }

    public static long d(long... jArr) {
        k.d(jArr.length > 0);
        long j2 = jArr[0];
        for (int i2 = 1; i2 < jArr.length; i2++) {
            if (jArr[i2] < j2) {
                j2 = jArr[i2];
            }
        }
        return j2;
    }
}
