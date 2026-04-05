package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bgl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f21085a;

    static {
        String property = System.getProperty("java.version");
        int i2 = 1;
        try {
            String[] strArrSplit = property.split("[._]");
            int i3 = Integer.parseInt(strArrSplit[0]);
            if (i3 != 1) {
                i2 = i3;
            } else if (strArrSplit.length > 1) {
                i2 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i2 = -1;
        }
        if (i2 == -1) {
            try {
                StringBuilder sb = new StringBuilder();
                for (int i4 = 0; i4 < property.length(); i4++) {
                    char cCharAt = property.charAt(i4);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb.append(cCharAt);
                }
                i2 = Integer.parseInt(sb.toString());
            } catch (NumberFormatException unused2) {
                i2 = -1;
            }
        }
        if (i2 == -1) {
            i2 = 6;
        }
        f21085a = i2;
    }

    public static int a() {
        return f21085a;
    }

    public static boolean b() {
        return f21085a >= 9;
    }
}
