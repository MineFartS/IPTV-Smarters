package com.google.ads.interactivemedia.v3.internal;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class us {
    public static UUID a(byte[] bArr) {
        ur urVarS = s(bArr);
        if (urVarS == null) {
            return null;
        }
        return urVarS.f23240a;
    }

    public static byte[] b(UUID uuid, byte[] bArr) {
        return c(uuid, null, bArr);
    }

    public static byte[] c(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length;
        int length2 = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length2 += (uuidArr.length * 16) + 4;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length2);
        byteBufferAllocate.putInt(length2);
        byteBufferAllocate.putInt(1886614376);
        byteBufferAllocate.putInt(uuidArr != null ? 16777216 : 0);
        byteBufferAllocate.putLong(uuid.getMostSignificantBits());
        byteBufferAllocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            byteBufferAllocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                byteBufferAllocate.putLong(uuid2.getMostSignificantBits());
                byteBufferAllocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && (length = bArr.length) != 0) {
            byteBufferAllocate.putInt(length);
            byteBufferAllocate.put(bArr);
        }
        return byteBufferAllocate.array();
    }

    public static int d(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    public static sh e(alx alxVar, boolean z, boolean z2) throws lb {
        if (z) {
            f(3, alxVar, false);
        }
        alxVar.y((int) alxVar.q()).length();
        long jQ = alxVar.q();
        String[] strArr = new String[(int) jQ];
        for (int i2 = 0; i2 < jQ; i2++) {
            String strY = alxVar.y((int) alxVar.q());
            strArr[i2] = strY;
            strY.length();
        }
        if (z2 && (alxVar.k() & 1) == 0) {
            throw new lb("framing bit expected to be set");
        }
        return new sh(strArr);
    }

    public static boolean f(int i2, alx alxVar, boolean z) throws lb {
        if (alxVar.a() < 7) {
            if (z) {
                return false;
            }
            int iA = alxVar.a();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(iA);
            throw new lb(sb.toString());
        }
        if (alxVar.k() != i2) {
            if (z) {
                return false;
            }
            String strValueOf = String.valueOf(Integer.toHexString(i2));
            throw new lb(strValueOf.length() != 0 ? "expected header type ".concat(strValueOf) : new String("expected header type "));
        }
        if (alxVar.k() == 118 && alxVar.k() == 111 && alxVar.k() == 114 && alxVar.k() == 98 && alxVar.k() == 105 && alxVar.k() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new lb("expected characters 'vorbis'");
    }

    public static si[] g(alx alxVar, int i2) throws lb {
        int i3;
        long jFloor;
        int i4 = 5;
        int i5 = 0;
        f(5, alxVar, false);
        int iK = alxVar.k() + 1;
        sg sgVar = new sg(alxVar.K());
        sgVar.c(alxVar.c() * 8);
        int i6 = 0;
        while (i6 < iK) {
            if (sgVar.b(24) != 5653314) {
                int iA = sgVar.a();
                StringBuilder sb = new StringBuilder(66);
                sb.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                sb.append(iA);
                throw new lb(sb.toString());
            }
            int iB = sgVar.b(16);
            int iB2 = sgVar.b(24);
            long[] jArr = new long[iB2];
            if (sgVar.d()) {
                int iB3 = sgVar.b(5) + 1;
                int i7 = 0;
                while (i7 < iB2) {
                    int iB4 = sgVar.b(d(iB2 - i7));
                    for (int i8 = 0; i8 < iB4 && i7 < iB2; i8++) {
                        jArr[i7] = iB3;
                        i7++;
                    }
                    iB3++;
                }
            } else {
                boolean zD = sgVar.d();
                while (i5 < iB2) {
                    if (!zD) {
                        jArr[i5] = sgVar.b(5) + 1;
                    } else if (sgVar.d()) {
                        jArr[i5] = sgVar.b(5) + 1;
                    } else {
                        jArr[i5] = 0;
                    }
                    i5++;
                }
            }
            int iB5 = sgVar.b(4);
            if (iB5 > 2) {
                StringBuilder sb2 = new StringBuilder(53);
                sb2.append("lookup type greater than 2 not decodable: ");
                sb2.append(iB5);
                throw new lb(sb2.toString());
            }
            if (iB5 == 1) {
                i3 = iB5;
            } else if (iB5 == 2) {
                i3 = 2;
            } else {
                i6++;
                i5 = 0;
            }
            sgVar.c(32);
            sgVar.c(32);
            int iB6 = sgVar.b(4) + 1;
            sgVar.c(1);
            if (i3 != 1) {
                jFloor = ((long) iB2) * ((long) iB);
            } else if (iB != 0) {
                double d2 = iB;
                Double.isNaN(d2);
                jFloor = (long) Math.floor(Math.pow(iB2, 1.0d / d2));
            } else {
                jFloor = 0;
            }
            sgVar.c((int) (jFloor * ((long) iB6)));
            i6++;
            i5 = 0;
        }
        int iB7 = sgVar.b(6) + 1;
        for (int i9 = 0; i9 < iB7; i9++) {
            if (sgVar.b(16) != 0) {
                throw new lb("placeholder of time domain transforms not zeroed out");
            }
        }
        int iB8 = sgVar.b(6) + 1;
        int i10 = 0;
        while (true) {
            int i11 = 3;
            if (i10 >= iB8) {
                int iB9 = sgVar.b(6) + 1;
                for (int i12 = 0; i12 < iB9; i12++) {
                    if (sgVar.b(16) > 2) {
                        throw new lb("residueType greater than 2 is not decodable");
                    }
                    sgVar.c(24);
                    sgVar.c(24);
                    sgVar.c(24);
                    int iB10 = sgVar.b(6) + 1;
                    int i13 = 8;
                    sgVar.c(8);
                    int[] iArr = new int[iB10];
                    for (int i14 = 0; i14 < iB10; i14++) {
                        iArr[i14] = ((sgVar.d() ? sgVar.b(5) : 0) * 8) + sgVar.b(3);
                    }
                    int i15 = 0;
                    while (i15 < iB10) {
                        int i16 = 0;
                        while (i16 < i13) {
                            if ((iArr[i15] & (1 << i16)) != 0) {
                                sgVar.c(i13);
                            }
                            i16++;
                            i13 = 8;
                        }
                        i15++;
                        i13 = 8;
                    }
                }
                int iB11 = sgVar.b(6) + 1;
                for (int i17 = 0; i17 < iB11; i17++) {
                    int iB12 = sgVar.b(16);
                    if (iB12 != 0) {
                        StringBuilder sb3 = new StringBuilder(52);
                        sb3.append("mapping type other than 0 not supported: ");
                        sb3.append(iB12);
                        Log.e("VorbisUtil", sb3.toString());
                    } else {
                        int iB13 = sgVar.d() ? sgVar.b(4) + 1 : 1;
                        if (sgVar.d()) {
                            int iB14 = sgVar.b(8) + 1;
                            for (int i18 = 0; i18 < iB14; i18++) {
                                int i19 = i2 - 1;
                                sgVar.c(d(i19));
                                sgVar.c(d(i19));
                            }
                        }
                        if (sgVar.b(2) != 0) {
                            throw new lb("to reserved bits must be zero after mapping coupling steps");
                        }
                        if (iB13 > 1) {
                            for (int i20 = 0; i20 < i2; i20++) {
                                sgVar.c(4);
                            }
                        }
                        for (int i21 = 0; i21 < iB13; i21++) {
                            sgVar.c(8);
                            sgVar.c(8);
                            sgVar.c(8);
                        }
                    }
                }
                int iB15 = sgVar.b(6) + 1;
                si[] siVarArr = new si[iB15];
                for (int i22 = 0; i22 < iB15; i22++) {
                    boolean zD2 = sgVar.d();
                    sgVar.b(16);
                    sgVar.b(16);
                    sgVar.b(8);
                    siVarArr[i22] = new si(zD2);
                }
                if (sgVar.d()) {
                    return siVarArr;
                }
                throw new lb("framing bit after modes not set as expected");
            }
            int iB16 = sgVar.b(16);
            if (iB16 == 0) {
                int i23 = 8;
                sgVar.c(8);
                sgVar.c(16);
                sgVar.c(16);
                sgVar.c(6);
                sgVar.c(8);
                int iB17 = sgVar.b(4) + 1;
                int i24 = 0;
                while (i24 < iB17) {
                    sgVar.c(i23);
                    i24++;
                    i23 = 8;
                }
            } else {
                if (iB16 != 1) {
                    StringBuilder sb4 = new StringBuilder(52);
                    sb4.append("floor type greater than 1 not decodable: ");
                    sb4.append(iB16);
                    throw new lb(sb4.toString());
                }
                int iB18 = sgVar.b(i4);
                int[] iArr2 = new int[iB18];
                int i25 = -1;
                for (int i26 = 0; i26 < iB18; i26++) {
                    int iB19 = sgVar.b(4);
                    iArr2[i26] = iB19;
                    if (iB19 > i25) {
                        i25 = iB19;
                    }
                }
                int i27 = i25 + 1;
                int[] iArr3 = new int[i27];
                int i28 = 0;
                while (i28 < i27) {
                    iArr3[i28] = sgVar.b(i11) + 1;
                    int iB20 = sgVar.b(2);
                    int i29 = 8;
                    if (iB20 > 0) {
                        sgVar.c(8);
                    }
                    int i30 = 0;
                    while (i30 < (1 << iB20)) {
                        sgVar.c(i29);
                        i30++;
                        i29 = 8;
                    }
                    i28++;
                    i11 = 3;
                }
                sgVar.c(2);
                int iB21 = sgVar.b(4);
                int i31 = 0;
                int i32 = 0;
                for (int i33 = 0; i33 < iB18; i33++) {
                    i31 += iArr3[iArr2[i33]];
                    while (i32 < i31) {
                        sgVar.c(iB21);
                        i32++;
                    }
                }
            }
            i10++;
            i4 = 5;
        }
    }

    public static int h(sf sfVar, aje ajeVar, int i2, boolean z) {
        return sfVar.e(ajeVar, i2, z);
    }

    public static void i(sf sfVar, alx alxVar, int i2) {
        sfVar.f(alxVar, i2);
    }

    public static rt j(alx alxVar) {
        alxVar.J(1);
        int iM = alxVar.m();
        long jC = ((long) alxVar.c()) + ((long) iM);
        int i2 = iM / 18;
        long[] jArrCopyOf = new long[i2];
        long[] jArrCopyOf2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long jR = alxVar.r();
            if (jR == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i3);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i3);
                break;
            }
            jArrCopyOf[i3] = jR;
            jArrCopyOf2[i3] = alxVar.r();
            alxVar.J(2);
            i3++;
        }
        alxVar.J((int) (jC - ((long) alxVar.c())));
        return new rt(jArrCopyOf, jArrCopyOf2);
    }

    public static ys k(rk rkVar, boolean z) {
        ys ysVarA = new rx().a(rkVar, z ? null : zn.f23868a);
        if (ysVarA == null || ysVarA.a() == 0) {
            return null;
        }
        return ysVarA;
    }

    public static int l(alx alxVar, int i2) {
        switch (i2) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return alxVar.k() + 1;
            case 7:
                return alxVar.o() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static long m(rk rkVar, ru ruVar) throws lb {
        rkVar.i();
        rkVar.f(1);
        byte[] bArr = new byte[1];
        rkVar.g(bArr, 0, 1);
        int i2 = bArr[0] & 1;
        rkVar.f(2);
        int i3 = 1 != i2 ? 6 : 7;
        alx alxVar = new alx(i3);
        alxVar.H(o(rkVar, alxVar.K(), 0, i3));
        rkVar.i();
        rq rqVar = new rq();
        if (t(alxVar, ruVar, 1 == i2, rqVar)) {
            return rqVar.f22902a;
        }
        throw new lb();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean n(com.google.ads.interactivemedia.v3.internal.alx r17, com.google.ads.interactivemedia.v3.internal.ru r18, int r19, com.google.ads.interactivemedia.v3.internal.rq r20) {
        /*
            r0 = r17
            r1 = r18
            int r2 = r17.c()
            long r3 = r17.s()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r19
            long r7 = (long) r7
            r9 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 == 0) goto L19
            return r9
        L19:
            r7 = 1
            long r5 = r5 & r7
            r10 = 1
            int r11 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r11 != 0) goto L23
            r5 = 1
            goto L24
        L23:
            r5 = 0
        L24:
            r6 = 12
            long r11 = r3 >> r6
            r13 = 15
            long r11 = r11 & r13
            int r12 = (int) r11
            r11 = 8
            long r15 = r3 >> r11
            long r6 = r15 & r13
            int r7 = (int) r6
            r6 = 4
            long r15 = r3 >> r6
            long r13 = r13 & r15
            int r6 = (int) r13
            long r13 = r3 >> r10
            r15 = 7
            long r13 = r13 & r15
            int r8 = (int) r13
            r13 = 1
            long r3 = r3 & r13
            r11 = 7
            r13 = -1
            if (r6 > r11) goto L4b
            int r11 = r1.f22914g
            int r11 = r11 + r13
            if (r6 != r11) goto Lb1
            goto L54
        L4b:
            r11 = 10
            if (r6 > r11) goto Lb1
            int r6 = r1.f22914g
            r11 = 2
            if (r6 != r11) goto Lb1
        L54:
            if (r8 != 0) goto L59
        L56:
            r14 = 1
            goto L5e
        L59:
            int r6 = r1.f22916i
            if (r8 != r6) goto Lb1
            goto L56
        L5e:
            int r6 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r6 == 0) goto Lb1
            r3 = r20
            boolean r3 = t(r0, r1, r5, r3)
            if (r3 == 0) goto Lb1
            int r3 = l(r0, r12)
            if (r3 == r13) goto Lb1
            int r4 = r1.f22909b
            if (r3 > r4) goto Lb1
            int r3 = r1.f22912e
            if (r7 != 0) goto L79
            goto L9d
        L79:
            r4 = 11
            if (r7 > r4) goto L82
            int r1 = r1.f22913f
            if (r7 == r1) goto L9d
            goto Lb1
        L82:
            r1 = 12
            if (r7 != r1) goto L8f
            int r1 = r17.k()
            int r1 = r1 * 1000
            if (r1 != r3) goto Lb1
            goto L9d
        L8f:
            r1 = 14
            if (r7 > r1) goto Lb1
            int r4 = r17.o()
            if (r7 != r1) goto L9b
            int r4 = r4 * 10
        L9b:
            if (r4 != r3) goto Lb1
        L9d:
            int r1 = r17.k()
            int r3 = r17.c()
            byte[] r0 = r17.K()
            int r3 = r3 + r13
            int r0 = com.google.ads.interactivemedia.v3.internal.amn.am(r0, r2, r3)
            if (r1 != r0) goto Lb1
            return r10
        Lb1:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.us.n(com.google.ads.interactivemedia.v3.internal.alx, com.google.ads.interactivemedia.v3.internal.ru, int, com.google.ads.interactivemedia.v3.internal.rq):boolean");
    }

    public static int o(rk rkVar, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        while (i4 < i3) {
            int iA = rkVar.a(bArr, i2 + i4, i3 - i4);
            if (iA == -1) {
                break;
            }
            i4 += iA;
        }
        return i4;
    }

    public static void p(boolean z, String str) throws lb {
        if (!z) {
            throw lb.a(str);
        }
    }

    public static void q(long j2, alx alxVar, sf[] sfVarArr) {
        int iE;
        while (true) {
            if (alxVar.a() <= 1) {
                return;
            }
            int iU = u(alxVar);
            int iU2 = u(alxVar);
            int iC = alxVar.c() + iU2;
            if (iU2 == -1 || iU2 > alxVar.a()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iC = alxVar.d();
            } else if (iU == 4 && iU2 >= 8) {
                int iK = alxVar.k();
                int iO = alxVar.o();
                if (iO == 49) {
                    iE = alxVar.e();
                    iO = 49;
                } else {
                    iE = 0;
                }
                int iK2 = alxVar.k();
                if (iO == 47) {
                    alxVar.J(1);
                }
                boolean z = iK == 181 && (iO == 49 || iO == 47) && iK2 == 3;
                if (iO == 49) {
                    z &= iE == 1195456820;
                }
                if (z) {
                    r(j2, alxVar, sfVarArr);
                }
            }
            alxVar.I(iC);
        }
    }

    public static void r(long j2, alx alxVar, sf[] sfVarArr) {
        int iK = alxVar.k();
        if ((iK & 64) != 0) {
            alxVar.J(1);
            int i2 = (iK & 31) * 3;
            int iC = alxVar.c();
            for (sf sfVar : sfVarArr) {
                alxVar.I(iC);
                sfVar.c(alxVar, i2);
                sfVar.d(j2, 1, i2, 0, null);
            }
        }
    }

    private static ur s(byte[] bArr) {
        alx alxVar = new alx(bArr);
        if (alxVar.d() < 32) {
            return null;
        }
        alxVar.I(0);
        if (alxVar.e() != alxVar.a() + 4 || alxVar.e() != 1886614376) {
            return null;
        }
        int iF = tz.f(alxVar.e());
        if (iF > 1) {
            StringBuilder sb = new StringBuilder(37);
            sb.append("Unsupported pssh version: ");
            sb.append(iF);
            Log.w("PsshAtomUtil", sb.toString());
            return null;
        }
        UUID uuid = new UUID(alxVar.r(), alxVar.r());
        if (iF == 1) {
            alxVar.J(alxVar.n() * 16);
        }
        int iN = alxVar.n();
        if (iN != alxVar.a()) {
            return null;
        }
        byte[] bArr2 = new byte[iN];
        alxVar.D(bArr2, 0, iN);
        return new ur(uuid, iF, bArr2);
    }

    private static boolean t(alx alxVar, ru ruVar, boolean z, rq rqVar) {
        try {
            long jU = alxVar.u();
            if (!z) {
                jU *= (long) ruVar.f22909b;
            }
            rqVar.f22902a = jU;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static int u(alx alxVar) {
        int i2 = 0;
        while (alxVar.a() != 0) {
            int iK = alxVar.k();
            i2 += iK;
            if (iK != 255) {
                return i2;
            }
        }
        return -1;
    }
}
