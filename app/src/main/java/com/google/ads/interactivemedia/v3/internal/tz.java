package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public class tz {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23137d;

    public tz(int i2) {
        this.f23137d = i2;
    }

    public static int e(int i2) {
        return i2 & 16777215;
    }

    public static int f(int i2) {
        return (i2 >> 24) & 255;
    }

    public static String g(int i2) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i2 >> 24) & 255));
        sb.append((char) ((i2 >> 16) & 255));
        sb.append((char) ((i2 >> 8) & 255));
        sb.append((char) (i2 & 255));
        return sb.toString();
    }

    public String toString() {
        return g(this.f23137d);
    }
}
