package c.f.a.c.j.h;

/* JADX INFO: loaded from: classes2.dex */
public final class h9 extends e9 {
    public static int e(byte[] bArr, int i2, long j2, int i3) {
        if (i3 == 0) {
            return i9.j(i2);
        }
        if (i3 == 1) {
            return i9.k(i2, c9.A(bArr, j2));
        }
        if (i3 == 2) {
            return i9.l(i2, c9.A(bArr, j2), c9.A(bArr, j2 + 1));
        }
        throw new AssertionError();
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:?, code lost:
    
        return e(r17, r1, r3, r2);
     */
    @Override // c.f.a.c.j.h.e9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int b(int r16, byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: c.f.a.c.j.h.h9.b(int, byte[], int, int):int");
    }

    @Override // c.f.a.c.j.h.e9
    public final String c(byte[] bArr, int i2, int i3) throws w6 {
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte bA = c9.A(bArr, i2);
            if (!d9.a(bA)) {
                break;
            }
            i2++;
            cArr[i5] = (char) bA;
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte bA2 = c9.A(bArr, i2);
            if (d9.a(bA2)) {
                int i7 = i5 + 1;
                cArr[i5] = (char) bA2;
                i2 = i6;
                while (true) {
                    i5 = i7;
                    if (i2 < i4) {
                        byte bA3 = c9.A(bArr, i2);
                        if (!d9.a(bA3)) {
                            break;
                        }
                        i2++;
                        i7 = i5 + 1;
                        cArr[i5] = (char) bA3;
                    }
                }
            } else if (d9.b(bA2)) {
                if (i6 >= i4) {
                    throw w6.f();
                }
                d9.c(bA2, c9.A(bArr, i6), cArr, i5);
                i2 = i6 + 1;
                i5++;
            } else if (d9.d(bA2)) {
                if (i6 >= i4 - 1) {
                    throw w6.f();
                }
                int i8 = i6 + 1;
                d9.e(bA2, c9.A(bArr, i6), c9.A(bArr, i8), cArr, i5);
                i2 = i8 + 1;
                i5++;
            } else {
                if (i6 >= i4 - 2) {
                    throw w6.f();
                }
                int i9 = i6 + 1;
                int i10 = i9 + 1;
                d9.f(bA2, c9.A(bArr, i6), c9.A(bArr, i9), c9.A(bArr, i10), cArr, i5);
                i5 += 2;
                i2 = i10 + 1;
            }
        }
        return new String(cArr, 0, i5);
    }

    @Override // c.f.a.c.j.h.e9
    public final int d(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        char c2;
        long j2;
        long j3;
        long j4;
        int i4;
        char cCharAt;
        long j5 = i2;
        long j6 = ((long) i3) + j5;
        int length = charSequence.length();
        if (length > i3 || bArr.length - i3 < i2) {
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb = new StringBuilder(37);
            sb.append("Failed writing ");
            sb.append(cCharAt2);
            sb.append(" at index ");
            sb.append(i2 + i3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        int i5 = 0;
        while (true) {
            c2 = 128;
            j2 = 1;
            if (i5 >= length || (cCharAt = charSequence.charAt(i5)) >= 128) {
                break;
            }
            c9.B(bArr, j5, (byte) cCharAt);
            i5++;
            j5 = 1 + j5;
        }
        if (i5 == length) {
            return (int) j5;
        }
        while (i5 < length) {
            char cCharAt3 = charSequence.charAt(i5);
            if (cCharAt3 >= c2 || j5 >= j6) {
                if (cCharAt3 < 2048 && j5 <= (-2) + j6) {
                    long j7 = j5 + j2;
                    c9.B(bArr, j5, (byte) ((cCharAt3 >>> 6) | 960));
                    c9.B(bArr, j7, (byte) ((cCharAt3 & '?') | 128));
                    j3 = j7 + j2;
                    j4 = j2;
                } else {
                    if ((cCharAt3 >= 55296 && cCharAt3 <= 57343) || j5 > (-3) + j6) {
                        if (j5 > (-4) + j6) {
                            if (cCharAt3 >= 55296 && cCharAt3 <= 57343 && ((i4 = i5 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i4)))) {
                                throw new g9(i5, length);
                            }
                            StringBuilder sb2 = new StringBuilder(46);
                            sb2.append("Failed writing ");
                            sb2.append(cCharAt3);
                            sb2.append(" at index ");
                            sb2.append(j5);
                            throw new ArrayIndexOutOfBoundsException(sb2.toString());
                        }
                        int i6 = i5 + 1;
                        if (i6 != length) {
                            char cCharAt4 = charSequence.charAt(i6);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                long j8 = j5 + 1;
                                c9.B(bArr, j5, (byte) ((codePoint >>> 18) | 240));
                                long j9 = j8 + 1;
                                c9.B(bArr, j8, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j10 = j9 + 1;
                                c9.B(bArr, j9, (byte) (((codePoint >>> 6) & 63) | 128));
                                j4 = 1;
                                j3 = j10 + 1;
                                c9.B(bArr, j10, (byte) ((codePoint & 63) | 128));
                                i5 = i6;
                            } else {
                                i5 = i6;
                            }
                        }
                        throw new g9(i5 - 1, length);
                    }
                    long j11 = j5 + j2;
                    c9.B(bArr, j5, (byte) ((cCharAt3 >>> '\f') | 480));
                    long j12 = j11 + j2;
                    c9.B(bArr, j11, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                    c9.B(bArr, j12, (byte) ((cCharAt3 & '?') | 128));
                    j3 = j12 + 1;
                    j4 = 1;
                }
                i5++;
                c2 = 128;
                long j13 = j4;
                j5 = j3;
                j2 = j13;
            } else {
                long j14 = j5 + j2;
                c9.B(bArr, j5, (byte) cCharAt3);
                j4 = j2;
                j3 = j14;
            }
            i5++;
            c2 = 128;
            long j132 = j4;
            j5 = j3;
            j2 = j132;
        }
        return (int) j5;
    }
}
