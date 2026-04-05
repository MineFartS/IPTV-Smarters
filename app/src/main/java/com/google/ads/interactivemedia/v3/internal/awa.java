package com.google.ads.interactivemedia.v3.internal;

import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class awa {
    public static int a(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static int[] b(Collection<? extends Number> collection) {
        if (collection instanceof avz) {
            throw null;
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            Object obj = array[i2];
            ars.g(obj);
            iArr[i2] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static int c(int i2, int i3) {
        return Math.min(Math.max(i2, i3), 1073741823);
    }

    public static /* synthetic */ boolean d(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static final acm e(acm... acmVarArr) {
        return new aal(acmVarArr);
    }

    public static int f(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    public static long g(alx alxVar, int i2, int i3) {
        alxVar.I(i2);
        if (alxVar.a() < 5) {
            return -9223372036854775807L;
        }
        int iE = alxVar.e();
        if ((8388608 & iE) != 0 || ((iE >> 8) & 8191) != i3 || (iE & 32) == 0 || alxVar.k() < 7 || alxVar.a() < 7 || (alxVar.k() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        alxVar.D(bArr, 0, 6);
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        byte b4 = bArr[2];
        long j2 = ((long) bArr[3]) & 255;
        return ((((long) b3) & 255) << 17) | ((((long) b2) & 255) << 25) | ((((long) b4) & 255) << 9) | (j2 + j2) | ((((long) bArr[4]) & 255) >> 7);
    }
}
