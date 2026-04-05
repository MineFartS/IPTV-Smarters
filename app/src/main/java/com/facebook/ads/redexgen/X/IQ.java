package com.facebook.ads.redexgen.X;

import android.util.Pair;
import java.util.Arrays;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class IQ {
    public static byte[] A00;
    public static String[] A01;
    public static final byte[] A02;
    public static final int[] A03;
    public static final int[] A04;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{5, 62, 35, 37, 32, 32, 63, 34, 36, 53, 52, 112, 49, 37, 52, 57, 63, 112, 63, 50, 58, 53, 51, 36, 112, 36, 41, 32, 53, 106, 112, 116, 79, 82, 84, 81, 81, 78, 83, 85, 68, 69, 1, 68, 81, 98, 78, 79, 71, 72, 70, 27, 1};
    }

    public static void A06() {
        A01 = new String[]{"7xLJJJjcPic97znxr7jYyKVhMaeA1j2E", "qlBokwmGez00tGn8Zoa7EPfSBX4wK2nd", "lNuywCj9LEYUa8avgu1fHofmnBtqXXwP", "QFj1OU4oR8zs4ROIl6ex9DnIWth", "MldRCxmPSCf85WqtCY5KHjt0bBRgqPbR", "RjpHJdGRFnKrV", "xTxTizoIhxSZQJal7HagUNUTtmhMrgov", "oiVBLQsg82rzAXMmQswhUJYEb9MEhzaa"};
    }

    static {
        A06();
        A05();
        A02 = new byte[]{0, 0, 0, 1};
        A04 = new int[]{96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
        A03 = new int[]{0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    }

    public static int A00(C0767Ik c0767Ik) {
        int iA05 = c0767Ik.A05(5);
        if (iA05 == 31) {
            return c0767Ik.A05(6) + 32;
        }
        return iA05;
    }

    public static int A01(C0767Ik c0767Ik) {
        int iA05 = c0767Ik.A05(4);
        if (iA05 == 15) {
            int samplingFrequency = c0767Ik.A05(24);
            return samplingFrequency;
        }
        if (A01[3].length() != 27) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[5] = "Rl706moC1hxTN";
        strArr[5] = "Rl706moC1hxTN";
        IM.A03(iA05 < 13);
        int samplingFrequency2 = A04[iA05];
        return samplingFrequency2;
    }

    public static Pair<Integer, Integer> A02(C0767Ik c0767Ik, boolean z) throws AI {
        int iA00 = A00(c0767Ik);
        int channelConfiguration = A01(c0767Ik);
        int iA05 = c0767Ik.A05(4);
        if (iA00 == 5 || iA00 == 29) {
            channelConfiguration = A01(c0767Ik);
            iA00 = A00(c0767Ik);
            if (iA00 == 22) {
                iA05 = c0767Ik.A05(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (iA00 != 1 && iA00 != 2 && iA00 != 3 && iA00 != 4 && iA00 != 6 && iA00 != 7 && iA00 != 17) {
                switch (iA00) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new AI(A04(0, 31, 122) + iA00);
                }
            }
            A07(c0767Ik, iA00, iA05);
            if (A01[4].charAt(0) == 'c') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[7] = "vV2yfuq3D8MlByvyd0FSsWmE07MYRaiH";
            strArr[7] = "vV2yfuq3D8MlByvyd0FSsWmE07MYRaiH";
            switch (iA00) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int channelCount = c0767Ik.A05(2);
                    if (channelCount == 2 || channelCount == 3) {
                        throw new AI(A04(31, 22, 11) + channelCount);
                    }
                    break;
            }
        }
        int i2 = A03[iA05];
        if (i2 == -1) {
            z2 = false;
        }
        IM.A03(z2);
        return Pair.create(Integer.valueOf(channelConfiguration), Integer.valueOf(i2));
    }

    public static Pair<Integer, Integer> A03(byte[] bArr) throws AI {
        return A02(new C0767Ik(bArr), false);
    }

    public static void A07(C0767Ik c0767Ik, int i2, int i3) {
        c0767Ik.A09(1);
        if (c0767Ik.A0G()) {
            if (A01[5].length() != 13) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[6] = "9ZbgWIK1Tjah9N2o7wCOkUZOiekVuClG";
            strArr[6] = "9ZbgWIK1Tjah9N2o7wCOkUZOiekVuClG";
            c0767Ik.A09(14);
        }
        boolean zA0G = c0767Ik.A0G();
        if (i3 != 0) {
            if (i2 == 6 || i2 == 20) {
                c0767Ik.A09(3);
            }
            if (zA0G) {
                if (i2 == 22) {
                    c0767Ik.A09(16);
                }
                if (i2 == 17 || i2 == 19 || i2 == 20 || i2 == 23) {
                    c0767Ik.A09(3);
                }
                c0767Ik.A09(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] A08(int i2, int i3, int i4) {
        return new byte[]{(byte) (((i2 << 3) & 248) | ((i3 >> 1) & 7)), (byte) (((i3 << 7) & 128) | ((i4 << 3) & 120))};
    }

    public static byte[] A09(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = A02;
        byte[] bArr3 = new byte[bArr2.length + i3];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i2, bArr3, A02.length, i3);
        return bArr3;
    }
}
