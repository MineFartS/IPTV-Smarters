package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class aev {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yv[] f19443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f19444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f19445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f19446d;

    public aev(String str, String str2, long[] jArr, yv[] yvVarArr) {
        this.f19445c = str;
        this.f19446d = str2;
        this.f19444b = jArr;
        this.f19443a = yvVarArr;
    }

    public final String a() {
        String str = this.f19445c;
        String str2 = this.f19446d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("/");
        sb.append(str2);
        return sb.toString();
    }
}
