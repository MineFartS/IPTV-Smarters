package h.o;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class l extends k {
    public static final int a(@NotNull CharSequence charSequence) {
        h.l.c.g.c(charSequence, "$this$lastIndex");
        return charSequence.length() - 1;
    }

    public static final int b(@NotNull CharSequence charSequence, char c2, int i2, boolean z) {
        h.l.c.g.c(charSequence, "$this$lastIndexOf");
        return (z || !(charSequence instanceof String)) ? d(charSequence, new char[]{c2}, i2, z) : ((String) charSequence).lastIndexOf(c2, i2);
    }

    public static /* synthetic */ int c(CharSequence charSequence, char c2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = a(charSequence);
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return b(charSequence, c2, i2, z);
    }

    public static final int d(@NotNull CharSequence charSequence, @NotNull char[] cArr, int i2, boolean z) {
        h.l.c.g.c(charSequence, "$this$lastIndexOfAny");
        h.l.c.g.c(cArr, "chars");
        if (!z && cArr.length == 1 && (charSequence instanceof String)) {
            return ((String) charSequence).lastIndexOf(h.j.d.b(cArr), i2);
        }
        for (int iA = h.m.b.a(i2, a(charSequence)); iA >= 0; iA--) {
            char cCharAt = charSequence.charAt(iA);
            int length = cArr.length;
            boolean z2 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (b.a(cArr[i3], cCharAt, z)) {
                    z2 = true;
                    break;
                }
                i3++;
            }
            if (z2) {
                return iA;
            }
        }
        return -1;
    }

    @NotNull
    public static final String e(@NotNull String str, char c2, @NotNull String str2) {
        h.l.c.g.c(str, "$this$substringAfterLast");
        h.l.c.g.c(str2, "missingDelimiterValue");
        int iC = c(str, c2, 0, false, 6, null);
        if (iC == -1) {
            return str2;
        }
        String strSubstring = str.substring(iC + 1, str.length());
        h.l.c.g.b(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String f(String str, char c2, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = str;
        }
        return e(str, c2, str2);
    }
}
