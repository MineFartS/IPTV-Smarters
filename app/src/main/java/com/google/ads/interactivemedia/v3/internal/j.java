package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class j extends bkx<j, e> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j f22023a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f22025f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f22026g = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f22027h = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f22028i = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f22029j = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f22030k = BuildConfig.FLAVOR;

    static {
        j jVar = new j();
        f22023a = jVar;
        bkx.at(j.class, jVar);
    }

    private j() {
    }

    public static j c() {
        return f22023a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f22023a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"e", "f", "g", "h", "i", "j", "k"});
        }
        if (i3 == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new e(bArr, (short[]) bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f22023a;
    }

    public final String d() {
        return this.f22025f;
    }

    public final String e() {
        return this.f22030k;
    }
}
