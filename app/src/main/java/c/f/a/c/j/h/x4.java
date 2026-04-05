package c.f.a.c.j.h;

import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes2.dex */
public final class x4 {
    public static int a(byte[] bArr, int i2, w4 w4Var) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return b(b2, bArr, i3, w4Var);
        }
        w4Var.f13606a = b2;
        return i3;
    }

    public static int b(int i2, byte[] bArr, int i3, w4 w4Var) {
        int i4;
        int i5;
        int i6 = i2 & 127;
        int i7 = i3 + 1;
        byte b2 = bArr[i3];
        if (b2 < 0) {
            int i8 = i6 | ((b2 & 127) << 7);
            int i9 = i7 + 1;
            byte b3 = bArr[i7];
            if (b3 >= 0) {
                i4 = b3 << DateTimeFieldType.HOUR_OF_HALFDAY;
            } else {
                i6 = i8 | ((b3 & 127) << 14);
                i7 = i9 + 1;
                byte b4 = bArr[i9];
                if (b4 >= 0) {
                    i5 = b4 << DateTimeFieldType.SECOND_OF_MINUTE;
                } else {
                    i8 = i6 | ((b4 & 127) << 21);
                    i9 = i7 + 1;
                    byte b5 = bArr[i7];
                    if (b5 >= 0) {
                        i4 = b5 << 28;
                    } else {
                        int i10 = i8 | ((b5 & 127) << 28);
                        while (true) {
                            int i11 = i9 + 1;
                            if (bArr[i9] >= 0) {
                                w4Var.f13606a = i10;
                                return i11;
                            }
                            i9 = i11;
                        }
                    }
                }
            }
            w4Var.f13606a = i8 | i4;
            return i9;
        }
        i5 = b2 << 7;
        w4Var.f13606a = i6 | i5;
        return i7;
    }

    public static int c(byte[] bArr, int i2, w4 w4Var) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            w4Var.f13607b = j2;
            return i3;
        }
        int i4 = i3 + 1;
        byte b2 = bArr[i3];
        long j3 = (j2 & 127) | (((long) (b2 & 127)) << 7);
        int i5 = 7;
        while (b2 < 0) {
            int i6 = i4 + 1;
            byte b3 = bArr[i4];
            i5 += 7;
            j3 |= ((long) (b3 & 127)) << i5;
            b2 = b3;
            i4 = i6;
        }
        w4Var.f13607b = j3;
        return i4;
    }

    public static int d(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static long e(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static int f(byte[] bArr, int i2, w4 w4Var) throws w6 {
        int iA = a(bArr, i2, w4Var);
        int i3 = w4Var.f13606a;
        if (i3 < 0) {
            throw w6.b();
        }
        if (i3 == 0) {
            w4Var.f13608c = BuildConfig.FLAVOR;
            return iA;
        }
        w4Var.f13608c = new String(bArr, iA, i3, u6.f13546a);
        return iA + i3;
    }

    public static int g(byte[] bArr, int i2, w4 w4Var) throws w6 {
        int iA = a(bArr, i2, w4Var);
        int i3 = w4Var.f13606a;
        if (i3 < 0) {
            throw w6.b();
        }
        if (i3 == 0) {
            w4Var.f13608c = BuildConfig.FLAVOR;
            return iA;
        }
        w4Var.f13608c = i9.e(bArr, iA, i3);
        return iA + i3;
    }

    public static int h(byte[] bArr, int i2, w4 w4Var) {
        int iA = a(bArr, i2, w4Var);
        int i3 = w4Var.f13606a;
        if (i3 < 0) {
            throw w6.b();
        }
        if (i3 > bArr.length - iA) {
            throw w6.a();
        }
        if (i3 == 0) {
            w4Var.f13608c = l5.f13413b;
            return iA;
        }
        w4Var.f13608c = l5.t(bArr, iA, i3);
        return iA + i3;
    }

    public static int i(c8 c8Var, byte[] bArr, int i2, int i3, w4 w4Var) {
        int iB = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iB = b(i4, bArr, iB, w4Var);
            i4 = w4Var.f13606a;
        }
        int i5 = iB;
        if (i4 < 0 || i4 > i3 - i5) {
            throw w6.a();
        }
        Object objZza = c8Var.zza();
        int i6 = i4 + i5;
        c8Var.e(objZza, bArr, i5, i6, w4Var);
        c8Var.f(objZza);
        w4Var.f13608c = objZza;
        return i6;
    }

    public static int j(c8 c8Var, byte[] bArr, int i2, int i3, int i4, w4 w4Var) {
        u7 u7Var = (u7) c8Var;
        Object objZza = u7Var.zza();
        int iD = u7Var.D(objZza, bArr, i2, i3, i4, w4Var);
        u7Var.f(objZza);
        w4Var.f13608c = objZza;
        return iD;
    }

    public static int k(int i2, byte[] bArr, int i3, int i4, t6<?> t6Var, w4 w4Var) {
        m6 m6Var = (m6) t6Var;
        int iA = a(bArr, i3, w4Var);
        while (true) {
            m6Var.h(w4Var.f13606a);
            if (iA >= i4) {
                break;
            }
            int iA2 = a(bArr, iA, w4Var);
            if (i2 != w4Var.f13606a) {
                break;
            }
            iA = a(bArr, iA2, w4Var);
        }
        return iA;
    }

    public static int l(byte[] bArr, int i2, t6<?> t6Var, w4 w4Var) {
        m6 m6Var = (m6) t6Var;
        int iA = a(bArr, i2, w4Var);
        int i3 = w4Var.f13606a + iA;
        while (iA < i3) {
            iA = a(bArr, iA, w4Var);
            m6Var.h(w4Var.f13606a);
        }
        if (iA == i3) {
            return iA;
        }
        throw w6.a();
    }

    public static int m(c8<?> c8Var, int i2, byte[] bArr, int i3, int i4, t6<?> t6Var, w4 w4Var) {
        int i5 = i(c8Var, bArr, i3, i4, w4Var);
        while (true) {
            t6Var.add(w4Var.f13608c);
            if (i5 >= i4) {
                break;
            }
            int iA = a(bArr, i5, w4Var);
            if (i2 != w4Var.f13606a) {
                break;
            }
            i5 = i(c8Var, bArr, iA, i4, w4Var);
        }
        return i5;
    }

    public static int n(int i2, byte[] bArr, int i3, int i4, r8 r8Var, w4 w4Var) {
        if ((i2 >>> 3) == 0) {
            throw w6.c();
        }
        int i5 = i2 & 7;
        if (i5 == 0) {
            int iC = c(bArr, i3, w4Var);
            r8Var.h(i2, Long.valueOf(w4Var.f13607b));
            return iC;
        }
        if (i5 == 1) {
            r8Var.h(i2, Long.valueOf(e(bArr, i3)));
            return i3 + 8;
        }
        if (i5 == 2) {
            int iA = a(bArr, i3, w4Var);
            int i6 = w4Var.f13606a;
            if (i6 < 0) {
                throw w6.b();
            }
            if (i6 > bArr.length - iA) {
                throw w6.a();
            }
            r8Var.h(i2, i6 == 0 ? l5.f13413b : l5.t(bArr, iA, i6));
            return iA + i6;
        }
        if (i5 != 3) {
            if (i5 != 5) {
                throw w6.c();
            }
            r8Var.h(i2, Integer.valueOf(d(bArr, i3)));
            return i3 + 4;
        }
        int i7 = (i2 & (-8)) | 4;
        r8 r8VarB = r8.b();
        int i8 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int iA2 = a(bArr, i3, w4Var);
            int i9 = w4Var.f13606a;
            i8 = i9;
            if (i9 == i7) {
                i3 = iA2;
                break;
            }
            int iN = n(i8, bArr, iA2, i4, r8VarB, w4Var);
            i8 = i9;
            i3 = iN;
        }
        if (i3 > i4 || i8 != i7) {
            throw w6.e();
        }
        r8Var.h(i2, r8VarB);
        return i3;
    }
}
