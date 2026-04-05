package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ie, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0761Ie {
    public static byte[] A00;
    public static String[] A01;
    public static final ArrayList<C0760Id> A02;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 79);
            String[] strArr = A01;
            if (strArr[0].charAt(29) == strArr[5].charAt(29)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "6kBQdFqqCH2elqWgy3DcQfzShaIb6UIi";
            strArr2[1] = "zTGMXzpPBZsgXyab5gRaVPvK6angpM9I";
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0A() {
        A00 = new byte[]{107, 32, 7, 31, 8, 5, 0, DateTimeFieldType.HALFDAY_OF_DAY, 73, 4, 0, 4, 12, 73, 29, DateTimeFieldType.CLOCKHOUR_OF_DAY, 25, 12, 83, 73, 31, 29, 83, 77, 96, 113, 113, 109, 104, 98, 96, 117, 104, 110, 111, 46, 98, 100, 96, 44, 55, 49, 57, 76, 93, 93, 65, 68, 78, 76, 89, 68, 66, 67, 2, 78, 72, 76, 0, 26, 29, DateTimeFieldType.SECOND_OF_MINUTE, 89, 72, 72, 84, 81, 91, 89, 76, 81, 87, 86, DateTimeFieldType.MILLIS_OF_SECOND, 92, 78, 90, 75, 77, 90, 75, 116, 101, 101, 121, 124, 118, 116, 97, 124, 122, 123, 58, 124, 113, 38, 100, 117, 117, 105, 108, 102, 100, 113, 108, 106, 107, 42, 117, 98, 118, 73, 88, 88, 68, 65, 75, 73, 92, 65, 71, 70, 7, 92, 92, 69, 68, 3, 80, 69, 68, 100, 117, 117, 105, 108, 102, 100, 113, 108, 106, 107, 42, 115, 106, 103, 118, 112, 103, DateTimeFieldType.HOUR_OF_DAY, 0, 0, 28, 25, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 4, 25, 31, 30, 95, 8, 93, DateTimeFieldType.MINUTE_OF_HOUR, DateTimeFieldType.HOUR_OF_DAY, 29, DateTimeFieldType.SECOND_OF_MINUTE, 2, DateTimeFieldType.HOUR_OF_DAY, 93, 29, 31, 4, 25, 31, 30, 39, 54, 54, 42, 47, 37, 39, 50, 47, 41, 40, 105, 62, 107, 35, 43, 53, 33, 32, 49, 49, 45, 40, 34, 32, 53, 40, 46, 47, 110, 57, 108, 44, 49, 117, 108, 34, 36, 32, 108, 119, 113, 121, 79, 94, 94, 66, 71, 77, 79, 90, 71, 65, 64, 1, 86, 3, 67, 94, 26, 3, 88, 90, 90, 70, 87, 87, 75, 78, 68, 70, 83, 78, 72, 73, 8, 95, 10, 86, 82, 78, 68, 76, 83, 78, 74, 66, 10, 83, 95, DateTimeFieldType.SECOND_OF_DAY, 64, 41, 56, 56, 36, 33, 43, 41, 60, 33, 39, 38, 103, 48, 101, 58, 41, 63, 43, 43, 5, DateTimeFieldType.SECOND_OF_DAY, DateTimeFieldType.SECOND_OF_DAY, 8, DateTimeFieldType.HALFDAY_OF_DAY, 7, 5, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.HALFDAY_OF_DAY, 11, 10, 75, 28, 73, DateTimeFieldType.MILLIS_OF_SECOND, 7, DateTimeFieldType.CLOCKHOUR_OF_DAY, 1, 87, 81, 109, 124, 124, 96, 101, 111, 109, 120, 101, 99, 98, 35, 116, 33, 127, 121, 110, 126, 101, 124, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 27, 10, 7, 1, 34, 54, 39, 42, 44, 108, 34, 32, 112, 79, 91, 74, 71, 65, 1, 75, 79, 77, 29, 54, 34, 51, 62, 56, 120, 50, 54, 52, 100, 122, 61, 56, 52, 52, 32, 49, 60, 58, 122, 56, 37, 97, 52, 120, 57, 52, 33, 56, 125, 105, 120, 117, 115, 51, 113, 108, 121, 123, 93, 73, 88, 85, 83, DateTimeFieldType.MINUTE_OF_HOUR, 83, 76, 73, 79, 116, 96, 113, 124, 122, 58, 97, 103, 96, 112, 56, 125, 113, 106, 126, 111, 98, 100, 36, 125, 101, 111, 37, 111, 127, 120, 58, 46, 63, 50, 52, 116, 45, 53, 63, 117, 63, 47, 40, 117, 51, 63, 116, 96, 113, 124, 122, 58, 99, 122, 103, 119, 124, 102, 31, 8, 29, 79, 122, 109, 120, 40, 100, 97, 99, 51, 72, 73, 79, 31, 95, 79, 72, 88, 35, 51, 52, 34, 113, 97, 102, 125, 111, 127, 120, 103, 113, 119, 63, 39, 96, 102, 40, 54, 48, 61, 46, 105, 38, 56, 45, 127, 29, 0, 68, DateTimeFieldType.HOUR_OF_DAY, 7, 26, 94, 11, 68, 117, 106, 111, 105, 75, 90, 71, 75, 102, 121, 116, 117, 127, 94, 65, 76, 77, 71, 7, 73, 94, 75, 58, 37, 40, 41, 35, 99, 36, 41, 58, 47, 117, 106, 103, 102, 108, 44, 110, 115, 55, 117, 46, 102, 112, 124, 99, 110, 111, 101, 37, 103, 122, 111, 109, 94, 65, 76, 77, 71, 7, 69, 88, 77, 79, 26, 74, 85, 88, 89, 83, DateTimeFieldType.MINUTE_OF_HOUR, 75, 74, 95, DateTimeFieldType.HALFDAY_OF_DAY, 119, 104, 101, 100, 110, 46, 121, 44, 119, 111, 101, 47, 110, 111, 51, 47, 119, 113, 57, 57, 38, 43, 42, 32, 96, 55, 98, 57, 33, 43, 97, 32, 33, 125, 97, 57, 63, 118, 74, 83, 78, 94, 85, 79, 95, 89, 25, DateTimeFieldType.HOUR_OF_DAY, 24, 30, 94, 87, 97, 103, 47, 58, 60, 117};
    }

    public static void A0B() {
        A01 = new String[]{"lBCeuhX9hNfcmu4hXiaB0UIfsko1beot", "ra13xGj8RSB6BkwatJnpBptPaaCfoBcx", "P21", "Bri2Verx5lE2lvMoTNthHk7hdJI5vErz", "EDlB2oyjjzMvSj7LU0PhrIFki3Wbmzj0", "c0tnGg1pU0xQOSl8MzV3k5KzHYaf6B4M", "ToIyleuLgVqT12ZHnDYontQlJBt8XJPF", "oHW1wN4pMWLo5Y0khnI8b0OqqaKma6BZ"};
    }

    static {
        A0B();
        A0A();
        A02 = new ArrayList<>();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0761Ie.A00(java.lang.String):int");
    }

    public static int A01(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (A0C(str)) {
            return 1;
        }
        if (A0E(str)) {
            if (A01[2].length() != 3) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "Tbf";
            strArr[2] = "Tbf";
            return 2;
        }
        if (A0D(str) || A04(24, 19, 78).equals(str) || A04(43, 19, 98).equals(str) || A04(194, 25, 14).equals(str) || A04(307, 20, 67).equals(str) || A04(111, 20, 103).equals(str) || A04(240, 28, 104).equals(str) || A04(219, 21, 97).equals(str) || A04(268, 19, 7).equals(str) || A04(131, 18, 74).equals(str) || A04(96, 15, 74).equals(str) || A04(62, 19, 119).equals(str)) {
            return 3;
        }
        if (A04(81, 15, 90).equals(str) || A04(176, 18, 9).equals(str) || A04(287, 20, 43).equals(str) || A04(149, 27, 63).equals(str)) {
            return 4;
        }
        return A02(str);
    }

    public static int A02(String str) {
        int size = A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0760Id c0760Id = A02.get(i2);
            if (str.equals(c0760Id.A02)) {
                int i3 = c0760Id.A00;
                if (A01[3].charAt(8) != '5') {
                    throw new RuntimeException();
                }
                String[] strArr = A01;
                strArr[7] = "YSWVz5r88Frt8fEbwFjXVMBNOaem5rQH";
                strArr[1] = "pHXVZv2iqxHVHPkGMSFE5ZZmXa81zybh";
                return i3;
            }
        }
        return -1;
    }

    @Nullable
    public static String A03(int i2) {
        if (i2 == 32) {
            return A04(543, 13, 76);
        }
        if (i2 == 33) {
            return A04(524, 9, 103);
        }
        String[] strArr = A01;
        if (strArr[7].charAt(25) != strArr[1].charAt(25)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "xwToz2hGyzeZlJau4s70LCfyGGvyNjlM";
        strArr2[4] = "z90Y73QdABRO9FFteloeaI1S2h3IuM4k";
        if (i2 == 35) {
            String[] strArr3 = A01;
            if (strArr3[7].charAt(25) != strArr3[1].charAt(25)) {
                return A04(533, 10, 3);
            }
            String[] strArr4 = A01;
            strArr4[6] = "P8Y4RDrDcLRp9FcHeOWRUzIMEfiRWdjY";
            strArr4[4] = "CxyRoddQ3h3V8143CrsBrhzN8eEi9nxs";
            return A04(533, 10, 3);
        }
        if (i2 != 64) {
            if (i2 == 163) {
                String[] strArr5 = A01;
                if (strArr5[7].charAt(25) != strArr5[1].charAt(25)) {
                    throw new RuntimeException();
                }
                String[] strArr6 = A01;
                strArr6[0] = "pE8eczaUY1qYPJUnjn6leqRwAOZhXoVo";
                strArr6[5] = "UHIpG1ZmHJnhYYsnmXPa5Mhqnk81Hhhu";
                return A04(577, 10, 115);
            }
            if (i2 == 177) {
                return A04(606, 19, 0);
            }
            if (i2 == 165) {
                return A04(332, 9, 12);
            }
            if (i2 != 166) {
                switch (i2) {
                    case 96:
                    case 97:
                    case 98:
                    case 99:
                    case 100:
                    case 101:
                        return A04(566, 11, 103);
                    case 102:
                    case 103:
                    case 104:
                        break;
                    case 105:
                    case 107:
                        if (A01[3].charAt(8) != '5') {
                            return A04(380, 10, 83);
                        }
                        String[] strArr7 = A01;
                        strArr7[3] = "3bsHpIyd5cpBijoTJ4OMmefdCTR5gTxx";
                        strArr7[3] = "3bsHpIyd5cpBijoTJ4OMmefdCTR5gTxx";
                        return A04(380, 10, 83);
                    case 106:
                        return A04(556, 10, 69);
                    default:
                        switch (i2) {
                            case 169:
                            case 172:
                                return A04(413, 13, 68);
                            case 170:
                            case 171:
                                return A04(426, 16, 20);
                            case 173:
                                return A04(390, 10, 115);
                            default:
                                return null;
                        }
                }
            } else {
                return A04(341, 10, 97);
            }
        }
        return A04(365, 15, 26);
    }

    @Nullable
    public static String A05(@Nullable String str) {
        if (str == null) {
            return null;
        }
        for (String codec : J1.A0p(str, A04(0, 1, 8))) {
            String strA06 = A06(codec);
            if (strA06 != null && A0C(strA06)) {
                return strA06;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x01d0  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A06(@androidx.annotation.Nullable java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0761Ie.A06(java.lang.String):java.lang.String");
    }

    @Nullable
    public static String A07(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String strA04 = A04(0, 1, 8);
        if (A01[2].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "kAsHoKDs5TGFpeukbSLQ0TtxeITgKaDg";
        strArr[3] = "kAsHoKDs5TGFpeukbSLQ0TtxeITgKaDg";
        String[] strArrA0p = J1.A0p(str, strA04);
        for (String codec : strArrA0p) {
            String strA06 = A06(codec);
            if (A01[3].charAt(8) != '5') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[0] = "gMD9kiBJFrPjXjJSWTJ7YWAztJHnCG7O";
            strArr2[5] = "9IT8hcDlm0Q96rR13ReP0isvIjsKRNLa";
            if (strA06 != null) {
                boolean zA0E = A0E(strA06);
                String[] strArr3 = A01;
                if (strArr3[7].charAt(25) != strArr3[1].charAt(25)) {
                    String[] strArr4 = A01;
                    strArr4[0] = "0cITUJ7IdavEtZCHOV3Y9WGxeqgTBYuh";
                    strArr4[5] = "JAyDdtJpzqPUzVgkiSCBL6msT5Uh4b5j";
                    if (zA0E) {
                        return strA06;
                    }
                } else {
                    String[] strArr5 = A01;
                    strArr5[2] = "QFu";
                    strArr5[2] = "QFu";
                    if (zA0E) {
                        return strA06;
                    }
                }
            }
        }
        return null;
    }

    @Nullable
    public static String A08(String str) {
        int size = A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0760Id c0760Id = A02.get(i2);
            if (str.startsWith(c0760Id.A01)) {
                return c0760Id.A02;
            }
        }
        if (A01[2].length() != 3) {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[6] = "uqMFW3SzqAJLI4ch9TDXcfdjcmNi1dfZ";
        strArr[4] = "vnqPuSQM6Pv1MUHSLr8O6PKTPzGiY5hV";
        return null;
    }

    @Nullable
    public static String A09(@Nullable String str) {
        if (str == null) {
            return null;
        }
        int iIndexOf = str.indexOf(47);
        if (iIndexOf != -1) {
            return str.substring(0, iIndexOf);
        }
        throw new IllegalArgumentException(A04(1, 19, 38) + str);
    }

    public static boolean A0C(String str) {
        return A04(327, 5, 33).equals(A09(str));
    }

    public static boolean A0D(String str) {
        return A04(515, 4, 112).equals(A09(str));
    }

    public static boolean A0E(String str) {
        return A04(519, 5, 95).equals(A09(str));
    }
}
