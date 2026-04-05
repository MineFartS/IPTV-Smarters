package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0764Ih {
    public static byte[] A00;
    public static int[] A01;
    public static String[] A02;
    public static final byte[] A03;
    public static final float[] A04;
    public static final Object A05;

    public static String A07(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-4, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 26, 3, 28, DateTimeFieldType.MILLIS_OF_SECOND, 34, 3, 34, DateTimeFieldType.MILLIS_OF_SECOND, 26, -41, -16, -25, -6, -14, -25, -27, -10, -25, -26, -94, -29, -11, -14, -25, -27, -10, -31, -12, -29, -10, -21, -15, -31, -21, -26, -27, -94, -8, -29, -18, -9, -25, -68, -94, -9, -22, -27, -26, -16, -80, -30, -9, -28, 7, -6, -11, -10, 0, -64, -7, -10, 7, -12};
    }

    public static void A09() {
        A02 = new String[]{"Oi30oJFxUMFG0gOFP1qEoKnGUzBDTsvx", "3WD4gW2GQkEI5AwBfxSAXddooip3O", "Ouz028YKvSlJVOERB46zGmLFjnusBt99", "zuSd86snyfkH6Kt688AXpDWJmpjjYjYh", "jm5obH6VrXyDYReHZwz8l0mhz55kc4yf", "71eZjkBm8iWWJxdGvDt2NXp", "W8ZvrObejWqz7a9mktO8s2uWHHxOtI0w", "Nv5C13AVolnSAeqab8n4y7TwRlreXIzh"};
    }

    static {
        A09();
        A08();
        A03 = new byte[]{0, 0, 0, 1};
        A04 = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
        A05 = new Object();
        A01 = new int[10];
    }

    public static int A00(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    public static int A01(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    public static int A02(byte[] bArr, int position) {
        int position2;
        synchronized (A05) {
            int iA03 = 0;
            int scratchEscapeCount = 0;
            while (iA03 < position) {
                iA03 = A03(bArr, iA03, position);
                if (iA03 < position) {
                    if (A01.length <= scratchEscapeCount) {
                        A01 = Arrays.copyOf(A01, A01.length * 2);
                    }
                    A01[scratchEscapeCount] = iA03;
                    iA03 += 3;
                    scratchEscapeCount++;
                }
            }
            position2 = position - scratchEscapeCount;
            String[] strArr = A02;
            if (strArr[0].charAt(3) != strArr[2].charAt(3)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[1] = "ghc1n9RTDSO0Z4i69kgOEipuot9Zj";
            strArr2[1] = "ghc1n9RTDSO0Z4i69kgOEipuot9Zj";
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < scratchEscapeCount; i4++) {
                int unescapedPosition = A01[i4] - i2;
                System.arraycopy(bArr, i2, bArr, i3, unescapedPosition);
                int i5 = i3 + unescapedPosition;
                int copyLength = i5 + 1;
                bArr[i5] = 0;
                i3 = copyLength + 1;
                bArr[copyLength] = 0;
                i2 += unescapedPosition + 3;
            }
            int remainingLength = position2 - i3;
            System.arraycopy(bArr, i2, bArr, i3, remainingLength);
        }
        return position2;
    }

    public static int A03(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x012c, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A04(byte[] r8, int r9, int r10, boolean[] r11) {
        /*
            Method dump skipped, instruction units count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0764Ih.A04(byte[], int, int, boolean[]):int");
    }

    public static C0762If A05(byte[] bArr, int i2, int i3) {
        C0769Im c0769Im = new C0769Im(bArr, i2, i3);
        c0769Im.A08(8);
        int picParameterSetId = c0769Im.A05();
        int iA05 = c0769Im.A05();
        c0769Im.A07();
        boolean bottomFieldPicOrderInFramePresentFlag = c0769Im.A0B();
        return new C0762If(picParameterSetId, iA05, bottomFieldPicOrderInFramePresentFlag);
    }

    public static C0763Ig A06(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        C0769Im c0769Im = new C0769Im(bArr, i2, i3);
        c0769Im.A08(8);
        int iA06 = c0769Im.A06(8);
        c0769Im.A08(16);
        int iA05 = c0769Im.A05();
        int iA052 = 1;
        boolean zA0B = false;
        if (iA06 == 100 || iA06 == 110 || iA06 == 122 || iA06 == 244 || iA06 == 44 || iA06 == 83 || iA06 == 86 || iA06 == 118 || iA06 == 128 || iA06 == 138) {
            iA052 = c0769Im.A05();
            if (iA052 == 3) {
                zA0B = c0769Im.A0B();
            }
            c0769Im.A05();
            c0769Im.A05();
            c0769Im.A07();
            if (c0769Im.A0B()) {
                int i6 = iA052 != 3 ? 8 : 12;
                int i7 = 0;
                while (i7 < i6) {
                    if (c0769Im.A0B()) {
                        A0A(c0769Im, i7 < 6 ? 16 : 64);
                    }
                    i7++;
                }
            }
        }
        int iA053 = c0769Im.A05() + 4;
        int iA054 = c0769Im.A05();
        int iA055 = 0;
        boolean zA0B2 = false;
        if (iA054 == 0) {
            iA055 = c0769Im.A05() + 4;
        } else if (iA054 == 1) {
            zA0B2 = c0769Im.A0B();
            c0769Im.A04();
            c0769Im.A04();
            long jA05 = c0769Im.A05();
            for (int i8 = 0; i8 < jA05; i8++) {
                c0769Im.A05();
            }
        } else {
            if (A02[1].length() != 29) {
                throw new RuntimeException();
            }
            String[] strArr = A02;
            strArr[0] = "gg30aCps8xaKqlQpqNwqV8MpUTOLFqGh";
            strArr[2] = "6dq0Mx0u8Kgv53YJdcFQMlotDlRuazjf";
        }
        c0769Im.A05();
        c0769Im.A07();
        int iA056 = c0769Im.A05() + 1;
        int iA057 = c0769Im.A05() + 1;
        boolean zA0B3 = c0769Im.A0B();
        int i9 = (2 - (zA0B3 ? 1 : 0)) * iA057;
        if (!zA0B3) {
            c0769Im.A07();
        }
        c0769Im.A07();
        int i10 = iA056 * 16;
        int i11 = i9 * 16;
        if (c0769Im.A0B()) {
            int iA058 = c0769Im.A05();
            int iA059 = c0769Im.A05();
            int iA0510 = c0769Im.A05();
            int iA0511 = c0769Im.A05();
            if (iA052 == 0) {
                i4 = 1;
                i5 = 2 - (zA0B3 ? 1 : 0);
            } else {
                i4 = iA052 == 3 ? 1 : 2;
                i5 = (2 - (zA0B3 ? 1 : 0)) * (iA052 == 1 ? 2 : 1);
            }
            i10 -= (iA058 + iA059) * i4;
            i11 -= (iA0510 + iA0511) * i5;
        }
        float f2 = 1.0f;
        boolean zA0B4 = c0769Im.A0B();
        String[] strArr2 = A02;
        if (strArr2[0].charAt(3) == strArr2[2].charAt(3)) {
            String[] strArr3 = A02;
            strArr3[6] = "jcRzMhbBY3Dw1JTLjGKCGc6YaVOjENSo";
            strArr3[3] = "o4pmI9swvtrYdLR0BRHjmVJPNciV1YNp";
            if (zA0B4) {
                boolean zA0B5 = c0769Im.A0B();
                String[] strArr4 = A02;
                if (strArr4[0].charAt(3) == strArr4[2].charAt(3)) {
                    String[] strArr5 = A02;
                    strArr5[0] = "nxo01JuHYgIdSih3CNMvKr0vsuD4ByKM";
                    strArr5[2] = "Ktm0TZ4NHFdoOw88agihQWJn0ILc0Ki9";
                    if (zA0B5) {
                        int iA062 = c0769Im.A06(8);
                        if (iA062 == 255) {
                            int iA063 = c0769Im.A06(16);
                            int iA064 = c0769Im.A06(16);
                            if (iA063 != 0 && iA064 != 0) {
                                f2 = iA063 / iA064;
                            }
                        } else {
                            float[] fArr = A04;
                            if (iA062 < fArr.length) {
                                f2 = fArr[iA062];
                            } else {
                                Log.w(A07(0, 11, 97), A07(11, 35, 53) + iA062);
                            }
                        }
                    }
                }
            }
            return new C0763Ig(iA05, i10, i11, f2, zA0B, zA0B3, iA053, iA054, iA055, zA0B2);
        }
        throw new RuntimeException();
    }

    public static void A0A(C0769Im c0769Im, int nextScale) {
        int i2 = 8;
        int deltaScale = 8;
        for (int i3 = 0; i3 < nextScale; i3++) {
            if (deltaScale != 0) {
                int deltaScale2 = c0769Im.A04();
                deltaScale = ((deltaScale2 + i2) + 256) % 256;
            }
            if (deltaScale != 0) {
                i2 = deltaScale;
            }
        }
    }

    public static void A0B(ByteBuffer byteBuffer) {
        int consecutiveZeros = byteBuffer.position();
        int offset = 0;
        for (int value = 0; value + 1 < consecutiveZeros; value++) {
            int i2 = byteBuffer.get(value) & 255;
            if (offset == 3) {
                if (i2 == 1 && (byteBuffer.get(value + 1) & 31) == 7) {
                    ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                    byteBufferDuplicate.position(value - 3);
                    byteBufferDuplicate.limit(consecutiveZeros);
                    byteBuffer.position(0);
                    byteBuffer.put(byteBufferDuplicate);
                    return;
                }
            } else if (i2 == 0) {
                offset++;
            }
            if (i2 != 0) {
                offset = 0;
            }
        }
        byteBuffer.clear();
        if (A02[1].length() != 29) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "LhexrLoV7v0KAfJEyFTOZZKZaNSS1gs0";
        strArr[4] = "gpIVcqUVkpQz0S61taD9WNDesiV6owqm";
    }

    public static void A0C(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static boolean A0D(String str, byte b2) {
        if (A07(46, 9, 52).equals(str) && (b2 & 31) == 6) {
            return true;
        }
        return A07(55, 10, 68).equals(str) && ((b2 & 126) >> 1) == 39;
    }
}
