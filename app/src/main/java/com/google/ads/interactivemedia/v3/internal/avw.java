package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class avw {
    static {
        Math.log(2.0d);
    }

    public static boolean a(double d2) {
        return Math.copySign(1.0d - d2, 1.0d) <= 0.1d || d2 == 1.0d || (Double.isNaN(1.0d) && Double.isNaN(d2));
    }
}
