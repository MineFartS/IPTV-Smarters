package c.f.a.b.z2.m0;

/* JADX INFO: loaded from: classes2.dex */
public final class j0 {
    public static int a(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] != 71) {
            i2++;
        }
        return i2;
    }

    public static boolean b(byte[] bArr, int i2, int i3, int i4) {
        int i5 = 0;
        for (int i6 = -4; i6 <= 4; i6++) {
            int i7 = (i6 * 188) + i4;
            if (i7 < i2 || i7 >= i3 || bArr[i7] != 71) {
                i5 = 0;
            } else {
                i5++;
                if (i5 == 5) {
                    return true;
                }
            }
        }
        return false;
    }

    public static long c(c.f.a.b.j3.i0 i0Var, int i2, int i3) {
        i0Var.P(i2);
        if (i0Var.a() < 5) {
            return -9223372036854775807L;
        }
        int iN = i0Var.n();
        if ((8388608 & iN) != 0 || ((2096896 & iN) >> 8) != i3) {
            return -9223372036854775807L;
        }
        if (((iN & 32) != 0) && i0Var.D() >= 7 && i0Var.a() >= 7) {
            if ((i0Var.D() & 16) == 16) {
                byte[] bArr = new byte[6];
                i0Var.j(bArr, 0, 6);
                return d(bArr);
            }
        }
        return -9223372036854775807L;
    }

    public static long d(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }
}
