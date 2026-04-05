package c.f.a.b.z2.j0;

import c.f.a.b.j3.i0;

/* JADX INFO: loaded from: classes2.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f10994a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(int i2, boolean z) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z) {
            return true;
        }
        for (int i3 : f10994a) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(c.f.a.b.z2.k kVar) {
        return c(kVar, true, false);
    }

    public static boolean c(c.f.a.b.z2.k kVar, boolean z, boolean z2) {
        boolean z3;
        long length = kVar.getLength();
        long j2 = 4096;
        long j3 = -1;
        if (length != -1 && length <= 4096) {
            j2 = length;
        }
        int i2 = (int) j2;
        i0 i0Var = new i0(64);
        boolean z4 = false;
        int i3 = 0;
        boolean z5 = false;
        while (i3 < i2) {
            i0Var.L(8);
            if (!kVar.i(i0Var.d(), z4 ? 1 : 0, 8, true)) {
                break;
            }
            long jF = i0Var.F();
            int iN = i0Var.n();
            int i4 = 16;
            if (jF == 1) {
                kVar.u(i0Var.d(), 8, 8);
                i0Var.O(16);
                jF = i0Var.w();
            } else {
                if (jF == 0) {
                    long length2 = kVar.getLength();
                    if (length2 != j3) {
                        jF = ((long) 8) + (length2 - kVar.j());
                    }
                }
                i4 = 8;
            }
            long j4 = i4;
            if (jF < j4) {
                return z4;
            }
            i3 += i4;
            if (iN == 1836019574) {
                i2 += (int) jF;
                if (length != -1 && i2 > length) {
                    i2 = (int) length;
                }
                j3 = -1;
            } else {
                if (iN == 1836019558 || iN == 1836475768) {
                    z3 = true;
                    break;
                }
                long j5 = length;
                if ((((long) i3) + jF) - j4 >= i2) {
                    break;
                }
                int i5 = (int) (jF - j4);
                i3 += i5;
                if (iN == 1718909296) {
                    if (i5 < 8) {
                        return false;
                    }
                    i0Var.L(i5);
                    kVar.u(i0Var.d(), 0, i5);
                    int i6 = i5 / 4;
                    int i7 = 0;
                    while (true) {
                        if (i7 >= i6) {
                            break;
                        }
                        if (i7 == 1) {
                            i0Var.Q(4);
                        } else if (a(i0Var.n(), z2)) {
                            z5 = true;
                            break;
                        }
                        i7++;
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i5 != 0) {
                    kVar.m(i5);
                }
                j3 = -1;
                length = j5;
                z4 = false;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }

    public static boolean d(c.f.a.b.z2.k kVar, boolean z) {
        return c(kVar, false, z);
    }
}
