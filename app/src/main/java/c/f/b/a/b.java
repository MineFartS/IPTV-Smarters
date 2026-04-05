package c.f.b.a;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int iB;
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
            if (cCharAt != cCharAt2 && ((iB = b(cCharAt)) >= 26 || iB != b(cCharAt2))) {
                return false;
            }
        }
        return true;
    }

    public static int b(char c2) {
        return (char) ((c2 | ' ') - 97);
    }

    public static boolean c(char c2) {
        return c2 >= 'a' && c2 <= 'z';
    }

    public static boolean d(char c2) {
        return c2 >= 'A' && c2 <= 'Z';
    }

    public static String e(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (d(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (d(c2)) {
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

    public static String f(String str) {
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            if (c(str.charAt(i2))) {
                char[] charArray = str.toCharArray();
                while (i2 < length) {
                    char c2 = charArray[i2];
                    if (c(c2)) {
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
}
