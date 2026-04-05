package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.StringTokenizer;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Lk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0841Lk {
    public static byte[] A00;

    static {
        A02();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{25, 65, 65, 65};
    }

    public static String A01(String truncatedBody) {
        if (truncatedBody != null) {
            StringTokenizer tokenizer = new StringTokenizer(truncatedBody, A00(0, 1, 88), true);
            int i2 = 0;
            if (truncatedBody.length() > 90) {
                int length = truncatedBody.length();
                String strA00 = A00(1, 3, 14);
                if (length > 93 || !truncatedBody.endsWith(strA00)) {
                    while (tokenizer.hasMoreTokens()) {
                        int length2 = tokenizer.nextToken().length();
                        if (i2 + length2 < 90) {
                            i2 += length2;
                        }
                    }
                    if (i2 == 0) {
                        return truncatedBody.substring(0, 90) + strA00;
                    }
                    return truncatedBody.substring(0, i2) + strA00;
                }
                return truncatedBody;
            }
            return truncatedBody;
        }
        return truncatedBody;
    }
}
