package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ug {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f23174a = amn.W("OpusHead");

    public static Pair<ys, ys> a(ty tyVar) {
        alx alxVar = tyVar.f23136a;
        alxVar.I(8);
        ys ysVar = null;
        ys ysVar2 = null;
        while (alxVar.a() >= 8) {
            int iC = alxVar.c();
            int iE = alxVar.e();
            int iE2 = alxVar.e();
            if (iE2 == 1835365473) {
                alxVar.I(iC);
                int i2 = iC + iE;
                alxVar.J(8);
                c(alxVar);
                while (true) {
                    if (alxVar.c() >= i2) {
                        break;
                    }
                    int iC2 = alxVar.c();
                    int iE3 = alxVar.e();
                    if (alxVar.e() == 1768715124) {
                        alxVar.I(iC2);
                        int i3 = iC2 + iE3;
                        alxVar.J(8);
                        ArrayList arrayList = new ArrayList();
                        while (alxVar.c() < i3) {
                            yr yrVarA = um.a(alxVar);
                            if (yrVarA != null) {
                                arrayList.add(yrVarA);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            break;
                        }
                        ysVar = new ys(arrayList);
                    } else {
                        alxVar.I(iC2 + iE3);
                    }
                }
                ysVar = null;
            } else if (iE2 == 1936553057) {
                alxVar.I(iC);
                int i4 = iC + iE;
                alxVar.J(12);
                while (true) {
                    if (alxVar.c() >= i4) {
                        break;
                    }
                    int iC3 = alxVar.c();
                    int iE4 = alxVar.e();
                    if (alxVar.e() != 1935766900) {
                        alxVar.I(iC3 + iE4);
                    } else {
                        if (iE4 < 14) {
                            break;
                        }
                        alxVar.J(5);
                        int iK = alxVar.k();
                        float f2 = 120.0f;
                        if (iK != 12) {
                            if (iK != 13) {
                                break;
                            }
                        } else if (iK == 12) {
                            f2 = 240.0f;
                        }
                        alxVar.J(1);
                        ysVar2 = new ys(new zx(f2, alxVar.k()));
                    }
                }
                ysVar2 = null;
            }
            alxVar.I(iC + iE);
        }
        return Pair.create(ysVar, ysVar2);
    }

    public static ys b(tx txVar) {
        zu zuVar;
        ty tyVarB = txVar.b(1751411826);
        ty tyVarB2 = txVar.b(1801812339);
        ty tyVarB3 = txVar.b(1768715124);
        if (tyVarB == null || tyVarB2 == null || tyVarB3 == null || f(tyVarB.f23136a) != 1835299937) {
            return null;
        }
        alx alxVar = tyVarB2.f23136a;
        alxVar.I(12);
        int iE = alxVar.e();
        String[] strArr = new String[iE];
        for (int i2 = 0; i2 < iE; i2++) {
            int iE2 = alxVar.e();
            alxVar.J(4);
            strArr[i2] = alxVar.y(iE2 - 8);
        }
        alx alxVar2 = tyVarB3.f23136a;
        alxVar2.I(8);
        ArrayList arrayList = new ArrayList();
        while (alxVar2.a() > 8) {
            int iC = alxVar2.c();
            int iE3 = alxVar2.e();
            int iE4 = alxVar2.e() - 1;
            if (iE4 < 0 || iE4 >= iE) {
                StringBuilder sb = new StringBuilder(52);
                sb.append("Skipped metadata with unknown key index: ");
                sb.append(iE4);
                Log.w("AtomParsers", sb.toString());
            } else {
                String str = strArr[iE4];
                int i3 = iC + iE3;
                int i4 = um.f23215b;
                while (true) {
                    int iC2 = alxVar2.c();
                    if (iC2 >= i3) {
                        zuVar = null;
                        break;
                    }
                    int iE5 = alxVar2.e();
                    if (alxVar2.e() == 1684108385) {
                        int iE6 = alxVar2.e();
                        int iE7 = alxVar2.e();
                        int i5 = iE5 - 16;
                        byte[] bArr = new byte[i5];
                        alxVar2.D(bArr, 0, i5);
                        zuVar = new zu(str, bArr, iE7, iE6);
                        break;
                    }
                    alxVar2.I(iC2 + iE5);
                }
                if (zuVar != null) {
                    arrayList.add(zuVar);
                }
            }
            alxVar2.I(iC + iE3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new ys(arrayList);
    }

    public static void c(alx alxVar) {
        int iC = alxVar.c();
        alxVar.J(4);
        if (alxVar.e() != 1751411826) {
            iC += 4;
        }
        alxVar.I(iC);
    }

    /* JADX WARN: Removed duplicated region for block: B:370:0x072b  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x079c  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x07a0  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x09b9  */
    /* JADX WARN: Removed duplicated region for block: B:499:0x0aa3 A[ADDED_TO_REGION, LOOP:13: B:499:0x0aa3->B:503:0x0aad, LOOP_START, PHI: r16
  0x0aa3: PHI (r16v17 int) = (r16v13 int), (r16v18 int) binds: [B:498:0x0aa1, B:503:0x0aad] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0ab3  */
    /* JADX WARN: Removed duplicated region for block: B:506:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:517:0x0afb  */
    /* JADX WARN: Removed duplicated region for block: B:520:0x0b0e  */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0b11  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0b72  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x0b8b  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x0c2e  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0c38  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0c81  */
    /* JADX WARN: Removed duplicated region for block: B:559:0x0c87  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0c89  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0c9f  */
    /* JADX WARN: Removed duplicated region for block: B:581:0x0cfe  */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0d00  */
    /* JADX WARN: Removed duplicated region for block: B:585:0x0d05  */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0d08  */
    /* JADX WARN: Removed duplicated region for block: B:588:0x0d0c  */
    /* JADX WARN: Removed duplicated region for block: B:589:0x0d0f  */
    /* JADX WARN: Removed duplicated region for block: B:592:0x0d13  */
    /* JADX WARN: Removed duplicated region for block: B:593:0x0d15  */
    /* JADX WARN: Removed duplicated region for block: B:595:0x0d19  */
    /* JADX WARN: Removed duplicated region for block: B:596:0x0d1c  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x0d29  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0cfa A[EDGE_INSN: B:631:0x0cfa->B:579:0x0cfa BREAK  A[LOOP:6: B:562:0x0c9a->B:578:0x0cf1], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:642:0x0a94 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0227  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.List<com.google.ads.interactivemedia.v3.internal.uy> d(com.google.ads.interactivemedia.v3.internal.tx r46, com.google.ads.interactivemedia.v3.internal.rw r47, long r48, com.google.ads.interactivemedia.v3.internal.qg r50, boolean r51, com.google.ads.interactivemedia.v3.internal.arn<com.google.ads.interactivemedia.v3.internal.uv, com.google.ads.interactivemedia.v3.internal.uv> r52) {
        /*
            Method dump skipped, instruction units count: 3567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ug.d(com.google.ads.interactivemedia.v3.internal.tx, com.google.ads.interactivemedia.v3.internal.rw, long, com.google.ads.interactivemedia.v3.internal.qg, boolean, com.google.ads.interactivemedia.v3.internal.arn):java.util.List");
    }

    private static int e(alx alxVar) {
        int iK = alxVar.k();
        int i2 = iK & 127;
        while ((iK & 128) == 128) {
            iK = alxVar.k();
            i2 = (i2 << 7) | (iK & 127);
        }
        return i2;
    }

    private static int f(alx alxVar) {
        alxVar.I(16);
        return alxVar.e();
    }

    private static Pair<String, byte[]> g(alx alxVar, int i2) {
        alxVar.I(i2 + 12);
        alxVar.J(1);
        e(alxVar);
        alxVar.J(2);
        int iK = alxVar.k();
        if ((iK & 128) != 0) {
            alxVar.J(2);
        }
        if ((iK & 64) != 0) {
            alxVar.J(alxVar.o());
        }
        if ((iK & 32) != 0) {
            alxVar.J(2);
        }
        alxVar.J(1);
        e(alxVar);
        String strG = alo.g(alxVar.k());
        if ("audio/mpeg".equals(strG) || "audio/vnd.dts".equals(strG) || "audio/vnd.dts.hd".equals(strG)) {
            return Pair.create(strG, null);
        }
        alxVar.J(12);
        alxVar.J(1);
        int iE = e(alxVar);
        byte[] bArr = new byte[iE];
        alxVar.D(bArr, 0, iE);
        return Pair.create(strG, bArr);
    }

    private static Pair<Integer, uw> h(alx alxVar, int i2, int i3) throws lb {
        Integer num;
        uw uwVar;
        Pair<Integer, uw> pairCreate;
        int i4;
        int i5;
        byte[] bArr;
        int iC = alxVar.c();
        while (iC - i2 < i3) {
            alxVar.I(iC);
            int iE = alxVar.e();
            us.p(iE > 0, "childAtomSize must be positive");
            if (alxVar.e() == 1936289382) {
                int i6 = iC + 8;
                int i7 = -1;
                int i8 = 0;
                String strY = null;
                Integer numValueOf = null;
                while (i6 - iC < iE) {
                    alxVar.I(i6);
                    int iE2 = alxVar.e();
                    int iE3 = alxVar.e();
                    if (iE3 == 1718775137) {
                        numValueOf = Integer.valueOf(alxVar.e());
                    } else if (iE3 == 1935894637) {
                        alxVar.J(4);
                        strY = alxVar.y(4);
                    } else if (iE3 == 1935894633) {
                        i7 = i6;
                        i8 = iE2;
                    }
                    i6 += iE2;
                }
                if ("cenc".equals(strY) || "cbc1".equals(strY) || "cens".equals(strY) || "cbcs".equals(strY)) {
                    us.p(numValueOf != null, "frma atom is mandatory");
                    us.p(i7 != -1, "schi atom is mandatory");
                    int i9 = i7 + 8;
                    while (true) {
                        if (i9 - i7 >= i8) {
                            num = numValueOf;
                            uwVar = null;
                            break;
                        }
                        alxVar.I(i9);
                        int iE4 = alxVar.e();
                        if (alxVar.e() == 1952804451) {
                            int iE5 = alxVar.e();
                            alxVar.J(1);
                            if (tz.f(iE5) == 0) {
                                alxVar.J(1);
                                i4 = 0;
                                i5 = 0;
                            } else {
                                int iK = alxVar.k();
                                int i10 = (iK & 240) >> 4;
                                i4 = iK & 15;
                                i5 = i10;
                            }
                            boolean z = alxVar.k() == 1;
                            int iK2 = alxVar.k();
                            byte[] bArr2 = new byte[16];
                            alxVar.D(bArr2, 0, 16);
                            if (z && iK2 == 0) {
                                int iK3 = alxVar.k();
                                byte[] bArr3 = new byte[iK3];
                                alxVar.D(bArr3, 0, iK3);
                                bArr = bArr3;
                            } else {
                                bArr = null;
                            }
                            num = numValueOf;
                            uwVar = new uw(z, strY, iK2, bArr2, i5, i4, bArr);
                        } else {
                            i9 += iE4;
                        }
                    }
                    us.p(uwVar != null, "tenc atom is mandatory");
                    int i11 = amn.f20135a;
                    pairCreate = Pair.create(num, uwVar);
                } else {
                    pairCreate = null;
                }
                if (pairCreate != null) {
                    return pairCreate;
                }
            }
            iC += iE;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:95:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(com.google.ads.interactivemedia.v3.internal.alx r21, int r22, int r23, int r24, int r25, java.lang.String r26, boolean r27, com.google.ads.interactivemedia.v3.internal.qg r28, com.google.ads.interactivemedia.v3.internal.uc r29, int r30) throws com.google.ads.interactivemedia.v3.internal.lb {
        /*
            Method dump skipped, instruction units count: 863
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.ug.i(com.google.ads.interactivemedia.v3.internal.alx, int, int, int, int, java.lang.String, boolean, com.google.ads.interactivemedia.v3.internal.qg, com.google.ads.interactivemedia.v3.internal.uc, int):void");
    }

    private static boolean j(long[] jArr, long j2, long j3, long j4) {
        int length = jArr.length;
        int i2 = length - 1;
        return jArr[0] <= j3 && j3 < jArr[amn.c(4, 0, i2)] && jArr[amn.c(length + (-4), 0, i2)] < j4 && j4 <= j2;
    }
}
