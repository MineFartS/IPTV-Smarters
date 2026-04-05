package c.k.a.y.j;

/* JADX INFO: loaded from: classes2.dex */
public final class d {
    public static int a(String str, int i2) {
        try {
            long j2 = Long.parseLong(str);
            if (j2 > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (j2 < 0) {
                return 0;
            }
            return (int) j2;
        } catch (NumberFormatException unused) {
            return i2;
        }
    }

    public static int b(String str, int i2, String str2) {
        while (i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            i2++;
        }
        return i2;
    }

    public static int c(String str, int i2) {
        char cCharAt;
        while (i2 < str.length() && ((cCharAt = str.charAt(i2)) == ' ' || cCharAt == '\t')) {
            i2++;
        }
        return i2;
    }
}
