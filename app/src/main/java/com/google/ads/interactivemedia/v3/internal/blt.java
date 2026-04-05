package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: classes.dex */
public final class blt<K, V> {
    public blt() {
    }

    public blt(byte[] bArr) {
        this();
    }

    public static int A(byte[] bArr, int i2, bjt bjtVar) {
        int i3 = i2 + 1;
        long j2 = bArr[i2];
        if (j2 >= 0) {
            bjtVar.f21249b = j2;
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
        bjtVar.f21249b = j3;
        return i4;
    }

    public static int B(int i2, byte[] bArr, int i3, int i4, bjt bjtVar) throws blf {
        if (bnp.a(i2) == 0) {
            throw blf.c();
        }
        int iB = bnp.b(i2);
        if (iB == 0) {
            return A(bArr, i3, bjtVar);
        }
        if (iB == 1) {
            return i3 + 8;
        }
        if (iB == 2) {
            return x(bArr, i3, bjtVar) + bjtVar.f21248a;
        }
        if (iB != 3) {
            if (iB == 5) {
                return i3 + 4;
            }
            throw blf.c();
        }
        int i5 = (i2 & (-8)) | 4;
        int i6 = 0;
        while (i3 < i4) {
            i3 = x(bArr, i3, bjtVar);
            i6 = bjtVar.f21248a;
            if (i6 == i5) {
                break;
            }
            i3 = B(i6, bArr, i3, i4, bjtVar);
        }
        if (i3 > i4 || i6 != i5) {
            throw blf.g();
        }
        return i3;
    }

    public static long C(byte[] bArr, int i2) {
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public static <K, V> int a(bls<K, V> blsVar, K k2, V v) {
        bnn bnnVar = blsVar.f21370a;
        return bkq.d(1, k2) + bkq.d(2, v);
    }

    public static <K, V> void b(bki bkiVar, bls<K, V> blsVar, K k2, V v) {
        bnn bnnVar = blsVar.f21370a;
        bkq.f(bkiVar, 1, k2);
        bkq.f(bkiVar, 2, v);
    }

    public static Object d(bkm bkmVar, blz blzVar, int i2) {
        return bkmVar.b(blzVar, i2);
    }

    public static void e(Object obj) {
        bkq bkqVar = ((bkw) obj).f21332a;
        throw null;
    }

    public static bkq f(Object obj) {
        throw null;
    }

    public static boolean g(blz blzVar) {
        return blzVar instanceof bkw;
    }

    public static Object h() {
        throw null;
    }

    public static void i(Object obj) {
        throw null;
    }

    public static void j(Object obj) {
        throw null;
    }

    public static final bkd k(bki bkiVar, byte[] bArr) {
        bkiVar.L();
        return new bkb(bArr);
    }

    public static final bki l(bki bkiVar) {
        return bkiVar;
    }

    public static double m(byte[] bArr, int i2) {
        return Double.longBitsToDouble(C(bArr, i2));
    }

    public static float n(byte[] bArr, int i2) {
        return Float.intBitsToFloat(p(bArr, i2));
    }

    public static int o(byte[] bArr, int i2, bjt bjtVar) throws blf {
        int iX = x(bArr, i2, bjtVar);
        int i3 = bjtVar.f21248a;
        if (i3 < 0) {
            throw blf.f();
        }
        if (i3 > bArr.length - iX) {
            throw blf.h();
        }
        if (i3 == 0) {
            bjtVar.f21250c = bkd.f21262b;
            return iX;
        }
        bjtVar.f21250c = bkd.p(bArr, iX, i3);
        return iX + i3;
    }

    public static int p(byte[] bArr, int i2) {
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public static int q(bmk bmkVar, byte[] bArr, int i2, int i3, int i4, bjt bjtVar) {
        bmc bmcVar = (bmc) bmkVar;
        Object objE = bmcVar.e();
        int iC = bmcVar.c(objE, bArr, i2, i3, i4, bjtVar);
        bmcVar.f(objE);
        bjtVar.f21250c = objE;
        return iC;
    }

    public static int r(bmk bmkVar, byte[] bArr, int i2, int i3, bjt bjtVar) throws blf {
        int iY = i2 + 1;
        int i4 = bArr[i2];
        if (i4 < 0) {
            iY = y(i4, bArr, iY, bjtVar);
            i4 = bjtVar.f21248a;
        }
        int i5 = iY;
        if (i4 < 0 || i4 > i3 - i5) {
            throw blf.h();
        }
        Object objE = bmkVar.e();
        int i6 = i4 + i5;
        bmkVar.i(objE, bArr, i5, i6, bjtVar);
        bmkVar.f(objE);
        bjtVar.f21250c = objE;
        return i6;
    }

    public static int s(bmk<?> bmkVar, int i2, byte[] bArr, int i3, int i4, blc<?> blcVar, bjt bjtVar) throws blf {
        int iR = r(bmkVar, bArr, i3, i4, bjtVar);
        while (true) {
            blcVar.add(bjtVar.f21250c);
            if (iR >= i4) {
                break;
            }
            int iX = x(bArr, iR, bjtVar);
            if (i2 != bjtVar.f21248a) {
                break;
            }
            iR = r(bmkVar, bArr, iX, i4, bjtVar);
        }
        return iR;
    }

    public static int t(byte[] bArr, int i2, blc<?> blcVar, bjt bjtVar) throws blf {
        bky bkyVar = (bky) blcVar;
        int iX = x(bArr, i2, bjtVar);
        int i3 = bjtVar.f21248a + iX;
        while (iX < i3) {
            iX = x(bArr, iX, bjtVar);
            bkyVar.g(bjtVar.f21248a);
        }
        if (iX == i3) {
            return iX;
        }
        throw blf.h();
    }

    public static int u(byte[] bArr, int i2, bjt bjtVar) throws blf {
        int iX = x(bArr, i2, bjtVar);
        int i3 = bjtVar.f21248a;
        if (i3 < 0) {
            throw blf.f();
        }
        if (i3 == 0) {
            bjtVar.f21250c = BuildConfig.FLAVOR;
            return iX;
        }
        bjtVar.f21250c = new String(bArr, iX, i3, bld.f21341a);
        return iX + i3;
    }

    public static int v(byte[] bArr, int i2, bjt bjtVar) throws blf {
        int iX = x(bArr, i2, bjtVar);
        int i3 = bjtVar.f21248a;
        if (i3 < 0) {
            throw blf.f();
        }
        if (i3 == 0) {
            bjtVar.f21250c = BuildConfig.FLAVOR;
            return iX;
        }
        bjtVar.f21250c = bnm.d(bArr, iX, i3);
        return iX + i3;
    }

    public static int w(int i2, byte[] bArr, int i3, int i4, bmz bmzVar, bjt bjtVar) throws blf {
        if (bnp.a(i2) == 0) {
            throw blf.c();
        }
        int iB = bnp.b(i2);
        if (iB == 0) {
            int iA = A(bArr, i3, bjtVar);
            bmzVar.h(i2, Long.valueOf(bjtVar.f21249b));
            return iA;
        }
        if (iB == 1) {
            bmzVar.h(i2, Long.valueOf(C(bArr, i3)));
            return i3 + 8;
        }
        if (iB == 2) {
            int iX = x(bArr, i3, bjtVar);
            int i5 = bjtVar.f21248a;
            if (i5 < 0) {
                throw blf.f();
            }
            if (i5 > bArr.length - iX) {
                throw blf.h();
            }
            bmzVar.h(i2, i5 == 0 ? bkd.f21262b : bkd.p(bArr, iX, i5));
            return iX + i5;
        }
        if (iB != 3) {
            if (iB != 5) {
                throw blf.c();
            }
            bmzVar.h(i2, Integer.valueOf(p(bArr, i3)));
            return i3 + 4;
        }
        int i6 = (i2 & (-8)) | 4;
        bmz bmzVarE = bmz.e();
        int i7 = 0;
        while (true) {
            if (i3 >= i4) {
                break;
            }
            int iX2 = x(bArr, i3, bjtVar);
            int i8 = bjtVar.f21248a;
            i7 = i8;
            if (i8 == i6) {
                i3 = iX2;
                break;
            }
            int iW = w(i7, bArr, iX2, i4, bmzVarE, bjtVar);
            i7 = i8;
            i3 = iW;
        }
        if (i3 > i4 || i7 != i6) {
            throw blf.g();
        }
        bmzVar.h(i2, bmzVarE);
        return i3;
    }

    public static int x(byte[] bArr, int i2, bjt bjtVar) {
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 < 0) {
            return y(b2, bArr, i3, bjtVar);
        }
        bjtVar.f21248a = b2;
        return i3;
    }

    public static int y(int i2, byte[] bArr, int i3, bjt bjtVar) {
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
                                bjtVar.f21248a = i10;
                                return i11;
                            }
                            i9 = i11;
                        }
                    }
                }
            }
            bjtVar.f21248a = i8 | i4;
            return i9;
        }
        i5 = b2 << 7;
        bjtVar.f21248a = i6 | i5;
        return i7;
    }

    public static int z(int i2, byte[] bArr, int i3, int i4, blc<?> blcVar, bjt bjtVar) {
        bky bkyVar = (bky) blcVar;
        int iX = x(bArr, i3, bjtVar);
        while (true) {
            bkyVar.g(bjtVar.f21248a);
            if (iX >= i4) {
                break;
            }
            int iX2 = x(bArr, iX, bjtVar);
            if (i2 != bjtVar.f21248a) {
                break;
            }
            iX = x(bArr, iX2, bjtVar);
        }
        return iX;
    }

    public final void c(Object obj) {
        e(obj);
        throw null;
    }
}
