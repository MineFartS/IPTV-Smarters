package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bnk extends bnj {
    @Override // com.google.ads.interactivemedia.v3.internal.bnj
    public final int a(CharSequence charSequence, byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        char cCharAt;
        int length = charSequence.length();
        int i7 = i3 + i2;
        int i8 = 0;
        while (i8 < length && (i6 = i8 + i2) < i7 && (cCharAt = charSequence.charAt(i8)) < 128) {
            bArr[i6] = (byte) cCharAt;
            i8++;
        }
        if (i8 == length) {
            return i2 + length;
        }
        int i9 = i2 + i8;
        while (i8 < length) {
            char cCharAt2 = charSequence.charAt(i8);
            if (cCharAt2 >= 128 || i9 >= i7) {
                if (cCharAt2 < 2048 && i9 <= i7 - 2) {
                    int i10 = i9 + 1;
                    bArr[i9] = (byte) ((cCharAt2 >>> 6) | 960);
                    i9 = i10 + 1;
                    bArr[i10] = (byte) ((cCharAt2 & '?') | 128);
                } else {
                    if ((cCharAt2 >= 55296 && cCharAt2 <= 57343) || i9 > i7 - 3) {
                        if (i9 > i7 - 4) {
                            if (cCharAt2 >= 55296 && cCharAt2 <= 57343 && ((i5 = i8 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i5)))) {
                                throw new bnl(i8, length);
                            }
                            StringBuilder sb = new StringBuilder(37);
                            sb.append("Failed writing ");
                            sb.append(cCharAt2);
                            sb.append(" at index ");
                            sb.append(i9);
                            throw new ArrayIndexOutOfBoundsException(sb.toString());
                        }
                        int i11 = i8 + 1;
                        if (i11 != charSequence.length()) {
                            char cCharAt3 = charSequence.charAt(i11);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i12 = i9 + 1;
                                bArr[i9] = (byte) ((codePoint >>> 18) | 240);
                                int i13 = i12 + 1;
                                bArr[i12] = (byte) (((codePoint >>> 12) & 63) | 128);
                                int i14 = i13 + 1;
                                bArr[i13] = (byte) (((codePoint >>> 6) & 63) | 128);
                                i9 = i14 + 1;
                                bArr[i14] = (byte) ((codePoint & 63) | 128);
                                i8 = i11;
                            } else {
                                i8 = i11;
                            }
                        }
                        throw new bnl(i8 - 1, length);
                    }
                    int i15 = i9 + 1;
                    bArr[i9] = (byte) ((cCharAt2 >>> '\f') | 480);
                    int i16 = i15 + 1;
                    bArr[i15] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                    i4 = i16 + 1;
                    bArr[i16] = (byte) ((cCharAt2 & '?') | 128);
                }
                i8++;
            } else {
                i4 = i9 + 1;
                bArr[i9] = (byte) cCharAt2;
            }
            i9 = i4;
            i8++;
        }
        return i9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnj
    public final String b(byte[] bArr, int i2, int i3) throws blf {
        int length = bArr.length;
        if ((i2 | i3 | ((length - i2) - i3)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(i2), Integer.valueOf(i3)));
        }
        int i4 = i2 + i3;
        char[] cArr = new char[i3];
        int i5 = 0;
        while (i2 < i4) {
            byte b2 = bArr[i2];
            if (!bni.e(b2)) {
                break;
            }
            i2++;
            bni.b(b2, cArr, i5);
            i5++;
        }
        while (i2 < i4) {
            int i6 = i2 + 1;
            byte b3 = bArr[i2];
            if (bni.e(b3)) {
                int i7 = i5 + 1;
                bni.b(b3, cArr, i5);
                i2 = i6;
                while (true) {
                    i5 = i7;
                    if (i2 < i4) {
                        byte b4 = bArr[i2];
                        if (!bni.e(b4)) {
                            break;
                        }
                        i2++;
                        i7 = i5 + 1;
                        bni.b(b4, cArr, i5);
                    }
                }
            } else if (bni.f(b3)) {
                if (i6 >= i4) {
                    throw blf.d();
                }
                bni.c(b3, bArr[i6], cArr, i5);
                i2 = i6 + 1;
                i5++;
            } else if (bni.g(b3)) {
                if (i6 >= i4 - 1) {
                    throw blf.d();
                }
                int i8 = i6 + 1;
                bni.d(b3, bArr[i6], bArr[i8], cArr, i5);
                i2 = i8 + 1;
                i5++;
            } else {
                if (i6 >= i4 - 2) {
                    throw blf.d();
                }
                int i9 = i6 + 1;
                int i10 = i9 + 1;
                bni.a(b3, bArr[i6], bArr[i9], bArr[i10], cArr, i5);
                i5 += 2;
                i2 = i10 + 1;
            }
        }
        return new String(cArr, 0, i5);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bnj
    public final int d(byte[] bArr, int i2, int i3) {
        while (i2 < i3 && bArr[i2] >= 0) {
            i2++;
        }
        if (i2 >= i3) {
            return 0;
        }
        while (i2 < i3) {
            int i4 = i2 + 1;
            byte b2 = bArr[i2];
            if (b2 < 0) {
                if (b2 < -32) {
                    if (i4 >= i3) {
                        return b2;
                    }
                    if (b2 >= -62) {
                        i2 = i4 + 1;
                        if (bArr[i4] > -65) {
                        }
                    }
                    return -1;
                }
                if (b2 >= -16) {
                    if (i4 >= i3 - 2) {
                        return bnm.a(bArr, i4, i3);
                    }
                    int i5 = i4 + 1;
                    byte b3 = bArr[i4];
                    if (b3 <= -65 && (((b2 << 28) + (b3 + 112)) >> 30) == 0) {
                        int i6 = i5 + 1;
                        if (bArr[i5] <= -65) {
                            i4 = i6 + 1;
                            if (bArr[i6] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i4 >= i3 - 1) {
                    return bnm.a(bArr, i4, i3);
                }
                int i7 = i4 + 1;
                byte b4 = bArr[i4];
                if (b4 <= -65 && ((b2 != -32 || b4 >= -96) && (b2 != -19 || b4 < -96))) {
                    i2 = i7 + 1;
                    if (bArr[i7] > -65) {
                    }
                }
                return -1;
            }
            i2 = i4;
        }
        return 0;
    }
}
