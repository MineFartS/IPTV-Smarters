package com.amazonaws.util;

/* JADX INFO: loaded from: classes.dex */
public enum CodecUtils {
    ;

    public static int sanitize(String str, byte[] bArr) {
        int length = bArr.length;
        char[] charArray = str.toCharArray();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char c2 = charArray[i3];
            if (c2 != '\r' && c2 != '\n' && c2 != ' ') {
                if (c2 > 127) {
                    throw new IllegalArgumentException("Invalid character found at position " + i3 + " for " + str);
                }
                bArr[i2] = (byte) c2;
                i2++;
            }
        }
        return i2;
    }

    public static void sanityCheckLastPos(int i2, int i3) {
        if ((i2 & i3) != 0) {
            throw new IllegalArgumentException("Invalid last non-pad character detected");
        }
    }

    public static byte[] toBytesDirect(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            char c2 = charArray[i2];
            if (c2 > 127) {
                throw new IllegalArgumentException("Invalid character found at position " + i2 + " for " + str);
            }
            bArr[i2] = (byte) c2;
        }
        return bArr;
    }

    public static String toStringDirect(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int length = bArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            cArr[i3] = (char) bArr[i2];
            i2++;
            i3++;
        }
        return new String(cArr);
    }
}
