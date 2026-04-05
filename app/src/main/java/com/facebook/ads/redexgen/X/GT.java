package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Locale;
import org.joda.time.DateTimeFieldType;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class GT {
    public static byte[] A04;
    public static String[] A05;
    public final int A00;
    public final int[] A01;
    public final String[] A02;
    public final String[] A03;

    static {
        A04();
        A03();
    }

    public static String A02(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 116);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{127, DateTimeFieldType.CLOCKHOUR_OF_DAY, DateTimeFieldType.CLOCKHOUR_OF_DAY, 111, 122, 24, DateTimeFieldType.HALFDAY_OF_DAY, 12, 89, 68, 103, 104, 98, 113, 111, 98, 114, 110, 73, 110, 118, 97, 108, 105, 100, 32, 116, 101, 109, 112, 108, 97, 116, 101, 58, 32, 35, 24, 0, DateTimeFieldType.CLOCKHOUR_OF_HALFDAY, 8, 31, 105, 94, 75, 73, 94, 72, 94, 85, 79, 90, 79, 82, 84, 85, 114, 127, 51, DateTimeFieldType.HOUR_OF_HALFDAY, 10, 2, DateTimeFieldType.HOUR_OF_HALFDAY};
    }

    public static void A04() {
        A05 = new String[]{"bpJJE2YFyKMkHQaE1RRYLnXzBpXgwbsI", "YRCGIBzHFLUlT1TdqIJiO4wSPI88uOLy", "BjfKEC0zKjI99lgopOHejdncgrodO0zC", "LKsFtS5C0vXgssCwN6zNqjMoZ4t", "ENzyJ7yJLgUD2uO2u1ihZNelpHaeZ", "MSaqCuZ565TZsnCHoA5rDIhXFC8Ju", "krNwoR4W", "17IP2yx0jrqtjro2OJMh649zIJQe5rt7"};
    }

    public GT(String[] strArr, int[] iArr, String[] strArr2, int i2) {
        this.A03 = strArr;
        this.A01 = iArr;
        this.A02 = strArr2;
        this.A00 = i2;
    }

    public static int A00(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String strA02 = A02(0, 0, 108);
        strArr[0] = strA02;
        int identifierCount = 0;
        int i2 = 0;
        while (identifierCount < str.length()) {
            String strA022 = A02(0, 1, 47);
            int iIndexOf = str.indexOf(strA022, identifierCount);
            byte b2 = -1;
            if (iIndexOf == -1) {
                strArr[i2] = strArr[i2] + str.substring(identifierCount);
                identifierCount = str.length();
            } else if (iIndexOf != identifierCount) {
                strArr[i2] = strArr[i2] + str.substring(identifierCount, iIndexOf);
                identifierCount = iIndexOf;
            } else if (str.startsWith(A02(1, 2, 64), identifierCount)) {
                strArr[i2] = strArr[i2] + strA022;
                identifierCount += 2;
            } else {
                int dollarIndex = identifierCount + 1;
                int iIndexOf2 = str.indexOf(strA022, dollarIndex);
                int dollarIndex2 = identifierCount + 1;
                String strSubstring = str.substring(dollarIndex2, iIndexOf2);
                if (strSubstring.equals(A02(42, 16, 79))) {
                    iArr[i2] = 1;
                } else {
                    int formatTagIndex = strSubstring.indexOf(A02(3, 2, 62));
                    String strA023 = A02(5, 4, 73);
                    if (formatTagIndex != -1) {
                        strA023 = strSubstring.substring(formatTagIndex);
                        String strA024 = A02(62, 1, 30);
                        if (!strA023.endsWith(strA024)) {
                            strA023 = strA023 + strA024;
                        }
                        strSubstring = strSubstring.substring(0, formatTagIndex);
                    }
                    int secondIndex = strSubstring.hashCode();
                    if (secondIndex == -1950496919) {
                        String formatTag = A05[6];
                        if (formatTag.length() == 7) {
                            throw new RuntimeException();
                        }
                        String[] strArr3 = A05;
                        strArr3[4] = "btImjNGCJTziNB55l7CpRatKziFbu";
                        strArr3[0] = "MDeeXB1rhAyla6QjO1EcjinW7TZRg7aq";
                        String formatTag2 = A02(36, 6, 25);
                        if (strSubstring.equals(formatTag2)) {
                            b2 = 0;
                        }
                    } else if (secondIndex == 2606829) {
                        String formatTag3 = A02(58, 4, 19);
                        if (strSubstring.equals(formatTag3)) {
                            b2 = 2;
                        }
                    } else if (secondIndex == 38199441) {
                        String formatTag4 = A02(9, 9, 114);
                        if (strSubstring.equals(formatTag4)) {
                            b2 = 1;
                        }
                    }
                    if (b2 == 0) {
                        iArr[i2] = 2;
                    } else if (b2 == 1) {
                        iArr[i2] = 3;
                    } else if (b2 == 2) {
                        iArr[i2] = 4;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        String formatTag5 = A02(18, 18, 116);
                        sb.append(formatTag5);
                        sb.append(str);
                        String formatTag6 = sb.toString();
                        throw new IllegalArgumentException(formatTag6);
                    }
                    strArr2[i2] = strA023;
                }
                i2++;
                strArr[i2] = strA02;
                identifierCount = iIndexOf2 + 1;
            }
        }
        return i2;
    }

    public static GT A01(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new GT(strArr, iArr, strArr2, A00(str, strArr, iArr, strArr2));
    }

    public final String A05(String str, long j2, int i2, long j3) {
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        while (true) {
            int i4 = this.A00;
            if (i3 < i4) {
                sb.append(this.A03[i3]);
                int[] iArr = this.A01;
                if (iArr[i3] == 1) {
                    sb.append(str);
                } else if (iArr[i3] == 2) {
                    sb.append(String.format(Locale.US, this.A02[i3], Long.valueOf(j2)));
                } else if (iArr[i3] == 3) {
                    sb.append(String.format(Locale.US, this.A02[i3], Integer.valueOf(i2)));
                } else if (iArr[i3] == 4) {
                    sb.append(String.format(Locale.US, this.A02[i3], Long.valueOf(j3)));
                }
                i3++;
            } else {
                sb.append(this.A03[i4]);
                return sb.toString();
            }
        }
    }
}
