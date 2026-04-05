package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class uu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f23243a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(rk rkVar) {
        return c(rkVar, true);
    }

    public static boolean b(rk rkVar) {
        return c(rkVar, false);
    }

    private static boolean c(rk rkVar, boolean z) {
        boolean z2;
        long jC = rkVar.c();
        long j2 = 4096;
        long j3 = -1;
        if (jC != -1 && jC <= 4096) {
            j2 = jC;
        }
        int i2 = (int) j2;
        alx alxVar = new alx(64);
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (i3 < i2) {
            alxVar.E(8);
            if (!rkVar.l(alxVar.K(), z3 ? 1 : 0, 8, true)) {
                break;
            }
            long jS = alxVar.s();
            int iE = alxVar.e();
            int i4 = 16;
            if (jS == 1) {
                rkVar.g(alxVar.K(), 8, 8);
                alxVar.H(16);
                jS = alxVar.r();
            } else {
                if (jS == 0) {
                    long jC2 = rkVar.c();
                    if (jC2 != j3) {
                        jS = 8 + (jC2 - rkVar.d());
                    }
                }
                i4 = 8;
            }
            long j4 = i4;
            if (jS < j4) {
                return z3;
            }
            i3 += i4;
            if (iE == 1836019574) {
                i2 += (int) jS;
                if (jC != -1 && i2 > jC) {
                    i2 = (int) jC;
                }
                j3 = -1;
            } else {
                if (iE == 1836019558 || iE == 1836475768) {
                    z2 = true;
                    break;
                }
                long j5 = jC;
                if ((((long) i3) + jS) - j4 >= i2) {
                    break;
                }
                int i5 = (int) (jS - j4);
                i3 += i5;
                if (iE == 1718909296) {
                    if (i5 < 8) {
                        return false;
                    }
                    alxVar.E(i5);
                    rkVar.g(alxVar.K(), 0, i5);
                    int i6 = i5 >> 2;
                    for (int i7 = 0; i7 < i6; i7++) {
                        if (i7 != 1) {
                            int iE2 = alxVar.e();
                            if ((iE2 >>> 8) != 3368816) {
                                if (iE2 == 1751476579) {
                                    iE2 = 1751476579;
                                }
                                int[] iArr = f23243a;
                                for (int i8 = 0; i8 < 29; i8++) {
                                    if (iArr[i8] != iE2) {
                                    }
                                }
                            }
                            z4 = true;
                            break;
                        }
                        alxVar.J(4);
                    }
                    if (!z4) {
                        return false;
                    }
                } else if (i5 != 0) {
                    rkVar.f(i5);
                }
                j3 = -1;
                jC = j5;
                z3 = false;
            }
        }
        z2 = false;
        return z4 && z == z2;
    }
}
