package com.facebook.ads.redexgen.X;

import android.util.Log;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class DI {
    public static byte[] A00;
    public static String[] A01;

    static {
        A07();
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 19 out of bounds for length 19
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:645)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static DH A04(C0768Il c0768Il) throws AI {
        A0B(1, c0768Il, false);
        long jA0L = c0768Il.A0L();
        int iA0F = c0768Il.A0F();
        long jA0L2 = c0768Il.A0L();
        int iA0B = c0768Il.A0B();
        int iA0B2 = c0768Il.A0B();
        int iA0B3 = c0768Il.A0B();
        int iA0F2 = c0768Il.A0F();
        return new DH(jA0L, iA0F, jA0L2, iA0B, iA0B2, iA0B3, (int) Math.pow(2.0d, iA0F2 & 15), (int) Math.pow(2.0d, (iA0F2 & 240) >> 4), (c0768Il.A0F() & 1) > 0, Arrays.copyOf(c0768Il.A00, c0768Il.A08()));
    }

    public static String A05(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 55);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{35, 26, 7, DateTimeFieldType.MILLIS_OF_SECOND, 28, 6, 32, 1, 28, 25, 74, 87, 95, 74, 76, 91, 74, 75, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 76, 71, 78, 93, 78, 76, 91, 74, 93, 92, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 89, 64, 93, 77, 70, 92, 8, 100, 121, 113, 100, 98, 117, 100, 101, 33, 98, 110, 101, 100, 33, 99, 110, 110, 106, 33, 117, 110, 33, 114, 117, 96, 115, 117, 33, 118, 104, 117, 105, 33, 90, 49, 121, 52, 55, 45, 33, 49, 121, 53, 50, 45, 33, 49, 121, 53, 51, 92, 33, 96, 117, 33, 88, 69, 77, 88, 94, 73, 88, 89, 29, 85, 88, 92, 89, 88, 79, 29, 73, 68, 77, 88, 29, 47, 37, 38, 38, 59, 105, 61, 48, 57, 44, 105, 46, 59, 44, 40, 61, 44, 59, 105, 61, 33, 40, 39, 105, 120, 105, 39, 38, 61, 105, 45, 44, 42, 38, 45, 40, 43, 37, 44, 115, 105, DateTimeFieldType.SECOND_OF_DAY, 0, DateTimeFieldType.MINUTE_OF_HOUR, 31, 27, 28, DateTimeFieldType.SECOND_OF_MINUTE, 82, DateTimeFieldType.CLOCKHOUR_OF_DAY, 27, 6, 82, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.SECOND_OF_DAY, 6, DateTimeFieldType.MILLIS_OF_SECOND, 0, 82, 31, 29, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MILLIS_OF_SECOND, 1, 82, 28, 29, 6, 82, 1, DateTimeFieldType.MILLIS_OF_SECOND, 6, 82, DateTimeFieldType.MINUTE_OF_HOUR, 1, 82, DateTimeFieldType.MILLIS_OF_SECOND, 10, 2, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.HOUR_OF_DAY, 6, DateTimeFieldType.MILLIS_OF_SECOND, DateTimeFieldType.MILLIS_OF_DAY, 87, 67, 80, 92, 88, 95, 86, DateTimeFieldType.HOUR_OF_DAY, 83, 88, 69, DateTimeFieldType.HOUR_OF_DAY, 84, 73, 65, 84, 82, 69, 84, 85, DateTimeFieldType.HOUR_OF_DAY, 69, 94, DateTimeFieldType.HOUR_OF_DAY, 83, 84, DateTimeFieldType.HOUR_OF_DAY, 66, 84, 69, 66, 65, 65, 69, 91, 94, DateTimeFieldType.HOUR_OF_HALFDAY, 90, 87, 94, 75, DateTimeFieldType.HOUR_OF_HALFDAY, 73, 92, 75, 79, 90, 75, 92, DateTimeFieldType.HOUR_OF_HALFDAY, 90, 70, 79, 64, DateTimeFieldType.HOUR_OF_HALFDAY, 28, DateTimeFieldType.HOUR_OF_HALFDAY, 64, 65, 90, DateTimeFieldType.HOUR_OF_HALFDAY, 74, 75, 77, 65, 74, 79, 76, 66, 75, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.HOUR_OF_HALFDAY, 38, 42, 59, 59, 34, 37, 44, 107, 63, 50, 59, 46, 107, 36, 63, 35, 46, 57, 107, 63, 35, 42, 37, 107, 123, 107, 37, 36, 63, 107, 56, 62, 59, 59, 36, 57, 63, 46, 47, 113, 107, 41, 53, 56, 58, 60, 49, 54, 53, 61, 60, 43, 121, 54, 63, 121, 45, 48, 52, 60, 121, 61, 54, 52, 56, 48, 55, 121, 45, 43, 56, 55, 42, 63, 54, 43, 52, 42, 121, 55, 54, 45, 121, 35, 60, 43, 54, 60, 61, 121, 54, 44, 45, 84, 67, 85, 79, 66, 83, 67, 114, 95, 86, 67, 6, 65, 84, 67, 71, 82, 67, 84, 6, 82, 78, 71, 72, 6, DateTimeFieldType.SECOND_OF_DAY, 6, 79, 85, 6, 72, 73, 82, 6, 66, 67, 69, 73, 66, 71, 68, 74, 67, 113, 106, 37, 119, 96, 118, 96, 119, 115, 96, 97, 37, 103, 108, 113, 118, 37, 104, 112, 118, 113, 37, 103, 96, 37, 127, 96, 119, 106, 37, 100, 99, 113, 96, 119, 37, 104, 100, 117, 117, 108, 107, 98, 37, 102, 106, 112, 117, 105, 108, 107, 98, 37, 118, 113, 96, 117, 118, 3, 24, 24, 87, 4, 31, 24, 5, 3, 87, 31, DateTimeFieldType.MINUTE_OF_DAY, DateTimeFieldType.MILLIS_OF_DAY, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.MINUTE_OF_DAY, 5, 77, 87};
    }

    public static void A07() {
        A01 = new String[]{"97CkWcXqrjyz7Qw2gcwWTf0UsRxLJkLY", "KmKspjn8yBhlsuKfHc5dD1By4HqwQES7", "tM7dEAyUMmHTAlM7QEv8AsYa9vZW08DW", "cnFzSmdUdmsM2SVrr3BadDXsi4nDpClW", "tMN7ldEkNAphgvj5y1u3W8bdaUauudV5", "yEIP5bnoN3ttum2IDgG23FKNyE9RzpP8", "N0hhc3G9NfQEzjT9vQvNmE", "ceiH1Z9CkPvfm4IJnpqvFzCjzC6OBPie"};
    }

    public static int A00(int val) {
        int i2 = 0;
        while (val > 0) {
            i2++;
            String[] strArr = A01;
            if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "aCblbtCs51TFarEUteijDfi4L2eIPPB5";
            strArr2[3] = "aCblbtCs51TFarEUteijDfi4L2eIPPB5";
            val >>>= 1;
        }
        return i2;
    }

    public static long A01(long j2, long j3) {
        return (long) Math.floor(Math.pow(j2, 1.0d / j3));
    }

    /* JADX WARN: Incorrect condition in loop: B:18:0x004f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.DE A02(com.facebook.ads.redexgen.X.DC r12) throws com.facebook.ads.redexgen.X.AI {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.DI.A02(com.facebook.ads.redexgen.X.DC):com.facebook.ads.redexgen.X.DE");
    }

    public static DF A03(C0768Il c0768Il) throws AI {
        A0B(3, c0768Il, false);
        int len = (int) c0768Il.A0L();
        String strA0T = c0768Il.A0T(len);
        int len2 = strA0T.length();
        int i2 = 7 + 4 + len2;
        long jA0L = c0768Il.A0L();
        int len3 = (int) jA0L;
        String[] strArr = new String[len3];
        int i3 = i2 + 4;
        for (int i4 = 0; i4 < jA0L; i4++) {
            int i5 = (int) c0768Il.A0L();
            strArr[i4] = c0768Il.A0T(i5);
            int i6 = strArr[i4].length();
            i3 = i3 + 4 + i6;
        }
        int i7 = c0768Il.A0F();
        int i8 = i7 & 1;
        if (A01[6].length() != 22) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[7] = "uufDOlXzPXn7e2vsUzYQOzPoYhXCwGZ3";
        strArr2[7] = "uufDOlXzPXn7e2vsUzYQOzPoYhXCwGZ3";
        if (i8 != 0) {
            return new DF(strA0T, strArr, i3 + 1);
        }
        throw new AI(A05(198, 30, 6));
    }

    public static void A08(int mappingsCount, DC dc) throws AI {
        int iA02;
        int iA022 = dc.A02(6) + 1;
        for (int i2 = 0; i2 < iA022; i2++) {
            int iA023 = dc.A02(16);
            if (iA023 != 0) {
                Log.e(A05(0, 10, 66), A05(270, 41, 124) + iA023);
            } else {
                if (dc.A04()) {
                    iA02 = dc.A02(4) + 1;
                } else {
                    iA02 = 1;
                }
                boolean zA04 = dc.A04();
                if (A01[7].charAt(17) == '3') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[1] = "2d5iZcFzMvct5JxqCcZ0JFUoYSVZwGiZ";
                strArr[0] = "NTut6iZFc5ITOEQfsc6CPFa8BEeWuqD1";
                if (zA04) {
                    int iA024 = dc.A02(8) + 1;
                    for (int i3 = 0; i3 < iA024; i3++) {
                        int i4 = mappingsCount - 1;
                        dc.A03(A00(i4));
                        int i5 = mappingsCount - 1;
                        dc.A03(A00(i5));
                    }
                }
                int i6 = dc.A02(2);
                if (i6 == 0) {
                    if (iA02 > 1) {
                        for (int i7 = 0; i7 < mappingsCount; i7++) {
                            dc.A03(4);
                        }
                    }
                    for (int i8 = 0; i8 < iA02; i8++) {
                        dc.A03(8);
                        dc.A03(8);
                        dc.A03(8);
                    }
                } else {
                    throw new AI(A05(406, 58, 50));
                }
            }
        }
    }

    public static void A09(DC dc) throws AI {
        int iA02 = dc.A02(6) + 1;
        for (int floorType = 0; floorType < iA02; floorType++) {
            int iA022 = dc.A02(16);
            if (iA022 == 0) {
                dc.A03(8);
                dc.A03(16);
                dc.A03(16);
                dc.A03(6);
                dc.A03(8);
                int iA023 = dc.A02(4) + 1;
                for (int rangeBits = 0; rangeBits < iA023; rangeBits++) {
                    dc.A03(8);
                }
            } else if (iA022 == 1) {
                int j2 = dc.A02(5);
                int i2 = -1;
                int[] iArr = new int[j2];
                for (int i3 = 0; i3 < j2; i3++) {
                    iArr[i3] = dc.A02(4);
                    if (iArr[i3] > i2) {
                        i2 = iArr[i3];
                    }
                }
                int[] iArr2 = new int[i2 + 1];
                int i4 = 0;
                while (true) {
                    int length = iArr2.length;
                    String[] strArr = A01;
                    if (strArr[1].charAt(17) != strArr[0].charAt(17)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A01;
                    strArr2[5] = "G5LXKc5ovtw5smiaOglq2UN4xBS1bXIF";
                    strArr2[5] = "G5LXKc5ovtw5smiaOglq2UN4xBS1bXIF";
                    if (i4 < length) {
                        iArr2[i4] = dc.A02(3) + 1;
                        int classSubclasses = dc.A02(2);
                        if (classSubclasses > 0) {
                            dc.A03(8);
                        }
                        for (int i5 = 0; i5 < (1 << classSubclasses); i5++) {
                            dc.A03(8);
                        }
                        i4++;
                    } else {
                        dc.A03(2);
                        int iA024 = dc.A02(4);
                        int i6 = 0;
                        int i7 = 0;
                        for (int k2 = 0; k2 < j2; k2++) {
                            int rangeBits2 = iArr[k2];
                            i6 += iArr2[rangeBits2];
                            while (i7 < i6) {
                                dc.A03(iA024);
                                i7++;
                            }
                        }
                    }
                }
            } else {
                throw new AI(A05(114, 41, 126) + iA022);
            }
        }
    }

    public static void A0A(DC dc) throws AI {
        int iA02 = dc.A02(6) + 1;
        for (int classifications = 0; classifications < iA02; classifications++) {
            if (dc.A02(16) <= 2) {
                dc.A03(24);
                dc.A03(24);
                dc.A03(24);
                int iA022 = dc.A02(6) + 1;
                dc.A03(8);
                int[] iArr = new int[iA022];
                for (int i2 = 0; i2 < iA022; i2++) {
                    int iA023 = 0;
                    int iA024 = dc.A02(3);
                    if (dc.A04()) {
                        iA023 = dc.A02(5);
                    }
                    int highBits = iA023 * 8;
                    iArr[i2] = highBits + iA024;
                }
                for (int i3 = 0; i3 < iA022; i3++) {
                    for (int i4 = 0; i4 < 8; i4++) {
                        int k2 = 1 << i4;
                        if ((iArr[i3] & k2) != 0) {
                            dc.A03(8);
                        }
                    }
                }
            } else {
                throw new AI(A05(363, 43, 17));
            }
        }
    }

    public static boolean A0B(int i2, C0768Il c0768Il, boolean z) throws AI {
        if (c0768Il.A05() < 7) {
            if (z) {
                return false;
            }
            throw new AI(A05(464, 18, 64) + c0768Il.A05());
        }
        if (c0768Il.A0F() != i2) {
            if (z) {
                return false;
            }
            throw new AI(A05(93, 21, 10) + Integer.toHexString(i2));
        }
        if (c0768Il.A0F() != 118 || c0768Il.A0F() != 111 || c0768Il.A0F() != 114 || c0768Il.A0F() != 98 || c0768Il.A0F() != 105 || c0768Il.A0F() != 115) {
            if (z) {
                return false;
            }
            throw new AI(A05(10, 28, 24));
        }
        if (A01[6].length() != 22) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[1] = "3PFcydRg4Lp36gDWvcJwdxiXGhHOWBjb";
        strArr[0] = "aGBtdcQRGSwkEsynEcaJAL8zRbeII6kr";
        return true;
    }

    public static DG[] A0C(DC dc) {
        int iA02 = dc.A02(6) + 1;
        DG[] dgArr = new DG[iA02];
        for (int windowType = 0; windowType < iA02; windowType++) {
            dgArr[windowType] = new DG(dc.A04(), dc.A02(16), dc.A02(16), dc.A02(8));
        }
        return dgArr;
    }

    public static DG[] A0D(C0768Il c0768Il, int i2) throws AI {
        A0B(5, c0768Il, false);
        int i3 = c0768Il.A0F() + 1;
        DC dc = new DC(c0768Il.A00);
        dc.A03(c0768Il.A07() * 8);
        for (int i4 = 0; i4 < i3; i4++) {
            A02(dc);
        }
        int iA02 = dc.A02(6) + 1;
        for (int timeCount = 0; timeCount < iA02; timeCount++) {
            int i5 = dc.A02(16);
            if (i5 != 0) {
                throw new AI(A05(311, 52, 110));
            }
        }
        A09(dc);
        A0A(dc);
        A08(i2, dc);
        DG[] dgArrA0C = A0C(dc);
        if (dc.A04()) {
            return dgArrA0C;
        }
        throw new AI(A05(155, 43, 69));
    }
}
