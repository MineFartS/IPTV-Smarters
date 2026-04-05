package com.google.ads.interactivemedia.v3.internal;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class bjd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TimeZone f21209a = TimeZone.getTimeZone("UTC");

    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3 A[Catch: IllegalArgumentException -> 0x01de, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01e0, IndexOutOfBoundsException -> 0x01e2, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01e0, blocks: (B:3:0x0005, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0035, B:13:0x003b, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0071, B:25:0x0077, B:29:0x0081, B:34:0x0091, B:36:0x0099, B:37:0x009d, B:39:0x00a3, B:44:0x00b0, B:46:0x00ba, B:57:0x00dd, B:59:0x00e3, B:61:0x00ea, B:89:0x01a4, B:66:0x00f6, B:67:0x0113, B:68:0x0114, B:70:0x011e, B:71:0x0124, B:73:0x0131, B:76:0x013a, B:78:0x0142, B:80:0x014c, B:82:0x015a, B:85:0x0169, B:86:0x019e, B:79:0x0147, B:88:0x01a1, B:91:0x01d6, B:92:0x01dd, B:50:0x00ca, B:51:0x00cd, B:45:0x00b5), top: B:109:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d6 A[Catch: IllegalArgumentException -> 0x01de, NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01e0, IndexOutOfBoundsException -> 0x01e2, TryCatch #2 {NumberFormatException | IllegalArgumentException | IndexOutOfBoundsException -> 0x01e0, blocks: (B:3:0x0005, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0035, B:13:0x003b, B:17:0x0051, B:19:0x0061, B:20:0x0063, B:22:0x006f, B:23:0x0071, B:25:0x0077, B:29:0x0081, B:34:0x0091, B:36:0x0099, B:37:0x009d, B:39:0x00a3, B:44:0x00b0, B:46:0x00ba, B:57:0x00dd, B:59:0x00e3, B:61:0x00ea, B:89:0x01a4, B:66:0x00f6, B:67:0x0113, B:68:0x0114, B:70:0x011e, B:71:0x0124, B:73:0x0131, B:76:0x013a, B:78:0x0142, B:80:0x014c, B:82:0x015a, B:85:0x0169, B:86:0x019e, B:79:0x0147, B:88:0x01a1, B:91:0x01d6, B:92:0x01dd, B:50:0x00ca, B:51:0x00cd, B:45:0x00b5), top: B:109:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date a(java.lang.String r17, java.text.ParsePosition r18) throws java.text.ParseException {
        /*
            Method dump skipped, instruction units count: 620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bjd.a(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static int b(String str, int i2, int i3) {
        int i4;
        int i5;
        if (i2 < 0 || i3 > str.length() || i2 > i3) {
            throw new NumberFormatException(str);
        }
        if (i2 < i3) {
            i5 = i2 + 1;
            int iDigit = Character.digit(str.charAt(i2), 10);
            if (iDigit < 0) {
                String strValueOf = String.valueOf(str.substring(i2, i3));
                throw new NumberFormatException(strValueOf.length() != 0 ? "Invalid number: ".concat(strValueOf) : new String("Invalid number: "));
            }
            i4 = -iDigit;
        } else {
            i4 = 0;
            i5 = i2;
        }
        while (i5 < i3) {
            int i6 = i5 + 1;
            int iDigit2 = Character.digit(str.charAt(i5), 10);
            if (iDigit2 < 0) {
                String strValueOf2 = String.valueOf(str.substring(i2, i3));
                throw new NumberFormatException(strValueOf2.length() != 0 ? "Invalid number: ".concat(strValueOf2) : new String("Invalid number: "));
            }
            i4 = (i4 * 10) - iDigit2;
            i5 = i6;
        }
        return -i4;
    }

    private static boolean c(String str, int i2, char c2) {
        return i2 < str.length() && str.charAt(i2) == c2;
    }
}
