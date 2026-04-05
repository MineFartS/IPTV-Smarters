package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class afl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19499b;

    public afl(String str, String str2) {
        this.f19498a = str;
        this.f19499b = str2;
    }

    public final String toString() {
        String str = this.f19498a;
        String str2 = this.f19499b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 2 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        return sb.toString();
    }
}
