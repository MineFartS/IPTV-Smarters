package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class arq {
    public static arp a(Object obj) {
        return new arp(obj.getClass().getSimpleName());
    }

    public static String b(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (f(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (f(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static String c(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (e(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (e(c2)) {
                        charArray[i2] = (char) (c2 ^ ' ');
                    }
                    i2++;
                }
                return String.valueOf(charArray);
            }
            i2++;
        }
        return str;
    }

    public static boolean d(CharSequence charSequence, CharSequence charSequence2) {
        int iG;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = charSequence.charAt(i2);
            char cCharAt2 = charSequence2.charAt(i2);
            if (cCharAt != cCharAt2 && ((iG = g(cCharAt)) >= 26 || iG != g(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static boolean f(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    private static int g(char c2) {
        return (char) ((c2 | ' ') - 97);
    }
}
