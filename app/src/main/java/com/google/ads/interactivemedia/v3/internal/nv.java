package com.google.ads.interactivemedia.v3.internal;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class nv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f22570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f22571b;

    static {
        new nv(new int[]{2});
        new nv(new int[]{2, 5, 6});
    }

    public nv(int[] iArr) {
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        this.f22570a = iArrCopyOf;
        Arrays.sort(iArrCopyOf);
        this.f22571b = 8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nv) && Arrays.equals(this.f22570a, ((nv) obj).f22570a);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.f22570a) * 31) + 8;
    }

    public final String toString() {
        String string = Arrays.toString(this.f22570a);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 67);
        sb.append("AudioCapabilities[maxChannelCount=");
        sb.append(8);
        sb.append(", supportedEncodings=");
        sb.append(string);
        sb.append("]");
        return sb.toString();
    }
}
