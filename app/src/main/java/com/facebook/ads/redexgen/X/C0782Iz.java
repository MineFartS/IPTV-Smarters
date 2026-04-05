package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Iz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0782Iz {
    public static byte[] A00;
    public static String[] A01;

    static {
        A05();
        A04();
    }

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{115};
    }

    public static void A05() {
        A01 = new String[]{"PyS", "B0MwY", "fv9GP7qfSE7s2d8LbAJl64CqhfUEI5ze", "u2emZ9fGS5suETq8VqmQZyeaNx", "qZCJvERLFvhCI28g7YCQjUuV", "IFi1W", "b30ndAOmbcVVBKnCK", "AmMnZ7TshSgGOpByiq4g4tq"};
    }

    public static Uri A00(String str, String str2) {
        return Uri.parse(A02(str, str2));
    }

    public static String A02(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        String strA01 = A01(0, 0, 53);
        if (str == null) {
            str = strA01;
        }
        if (str2 != null) {
            strA01 = str2;
        }
        int[] iArrA06 = A06(strA01);
        if (iArrA06[0] != -1) {
            sb.append(strA01);
            A03(sb, iArrA06[1], iArrA06[2]);
            return sb.toString();
        }
        int[] iArrA062 = A06(str);
        if (iArrA06[3] == 0) {
            sb.append((CharSequence) str, 0, iArrA062[3]);
            sb.append(strA01);
            return sb.toString();
        }
        if (iArrA06[2] == 0) {
            sb.append((CharSequence) str, 0, iArrA062[2]);
            sb.append(strA01);
            return sb.toString();
        }
        if (iArrA06[1] != 0) {
            int i2 = iArrA062[0] + 1;
            sb.append((CharSequence) str, 0, i2);
            sb.append(strA01);
            int baseLimit = iArrA06[1];
            return A03(sb, baseLimit + i2, iArrA06[2] + i2);
        }
        if (strA01.charAt(iArrA06[1]) == '/') {
            sb.append((CharSequence) str, 0, iArrA062[1]);
            sb.append(strA01);
            String strA03 = A03(sb, iArrA062[1], iArrA062[1] + iArrA06[2]);
            String[] strArr = A01;
            if (strArr[1].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[7] = "puPFE12Mfn7HBKXNPDdn50d";
            strArr2[6] = "lSZZX5wwyoYCDaj3z";
            return strA03;
        }
        if (iArrA062[0] + 2 < iArrA062[1] && iArrA062[1] == iArrA062[2]) {
            sb.append((CharSequence) str, 0, iArrA062[1]);
            sb.append('/');
            sb.append(strA01);
            return A03(sb, iArrA062[1], iArrA062[1] + iArrA06[2] + 1);
        }
        int iLastIndexOf = str.lastIndexOf(47, iArrA062[2] - 1);
        int i3 = iLastIndexOf == -1 ? iArrA062[1] : iLastIndexOf + 1;
        sb.append((CharSequence) str, 0, i3);
        sb.append(strA01);
        int baseLimit2 = iArrA062[1];
        String strA032 = A03(sb, baseLimit2, iArrA06[2] + i3);
        String[] strArr3 = A01;
        String str3 = strArr3[7];
        String str4 = strArr3[6];
        int baseLimit3 = str3.length();
        if (baseLimit3 == str4.length()) {
            return strA032;
        }
        String[] strArr4 = A01;
        strArr4[0] = "zz6";
        strArr4[4] = "UohugVstqrRMcYJZrbvwJq4W";
        return strA032;
    }

    public static String A03(StringBuilder sb, int i2, int i3) {
        int i4;
        if (i2 >= i3) {
            return sb.toString();
        }
        if (sb.charAt(i2) == '/') {
            i2++;
        }
        int i5 = i2;
        int i6 = i2;
        while (i6 <= i3) {
            if (i6 == i3) {
                i4 = i6;
            } else if (sb.charAt(i6) == '/') {
                i4 = i6 + 1;
            } else {
                i6++;
            }
            int nextSegmentStart = i5 + 1;
            if (i6 == nextSegmentStart) {
                char cCharAt = sb.charAt(i5);
                String[] strArr = A01;
                String str = strArr[7];
                String str2 = strArr[6];
                int length = str.length();
                int nextSegmentStart2 = str2.length();
                if (length == nextSegmentStart2) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A01;
                strArr2[1] = "O2ctt";
                strArr2[5] = "smizT";
                if (cCharAt == '.') {
                    sb.delete(i5, i4);
                    i3 -= i4 - i5;
                    i6 = i5;
                }
            }
            int nextSegmentStart3 = i5 + 2;
            if (i6 == nextSegmentStart3) {
                int nextSegmentStart4 = sb.charAt(i5);
                if (nextSegmentStart4 == 46) {
                    int nextSegmentStart5 = i5 + 1;
                    if (sb.charAt(nextSegmentStart5) == 46) {
                        int nextSegmentStart6 = sb.lastIndexOf(A01(0, 1, 111), i5 - 2);
                        i5 = nextSegmentStart6 + 1;
                        int prevSegmentStart = i5 > i2 ? i5 : i2;
                        sb.delete(prevSegmentStart, i4);
                        i3 -= i4 - prevSegmentStart;
                        i6 = i5;
                    }
                }
            }
            i6++;
            i5 = i6;
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] A06(java.lang.String r9) {
        /*
            r0 = 4
            int[] r4 = new int[r0]
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            r8 = 0
            r6 = -1
            if (r0 == 0) goto Le
            r4[r8] = r6
            return r4
        Le:
            int r1 = r9.length()
            r0 = 35
            int r3 = r9.indexOf(r0)
            if (r3 != r6) goto L1b
            r3 = r1
        L1b:
            r0 = 63
            int r5 = r9.indexOf(r0)
            if (r5 == r6) goto L25
            if (r5 <= r3) goto L26
        L25:
            r5 = r3
        L26:
            r7 = 47
            int r1 = r9.indexOf(r7)
            if (r1 == r6) goto L30
            if (r1 <= r5) goto L31
        L30:
            r1 = r5
        L31:
            r0 = 58
            int r2 = r9.indexOf(r0)
            if (r2 <= r1) goto L3a
            r2 = -1
        L3a:
            int r0 = r2 + 2
            r1 = 1
            if (r0 >= r5) goto L6b
            int r0 = r2 + 1
            char r0 = r9.charAt(r0)
            if (r0 != r7) goto L6b
            int r0 = r2 + 2
            char r0 = r9.charAt(r0)
            if (r0 != r7) goto L6b
            r0 = 1
        L50:
            if (r0 == 0) goto L68
            int r0 = r2 + 3
            int r0 = r9.indexOf(r7, r0)
            if (r0 == r6) goto L5c
            if (r0 <= r5) goto L5d
        L5c:
            r0 = r5
        L5d:
            r4[r8] = r2
            r4[r1] = r0
            r0 = 2
            r4[r0] = r5
            r0 = 3
            r4[r0] = r3
            return r4
        L68:
            int r0 = r2 + 1
            goto L5d
        L6b:
            r0 = 0
            goto L50
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0782Iz.A06(java.lang.String):int[]");
    }
}
