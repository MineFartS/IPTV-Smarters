package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class b extends bkx<b, e> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b f20752a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20753e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20754f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f20755g = BuildConfig.FLAVOR;

    static {
        b bVar = new b();
        f20752a = bVar;
        bkx.at(b.class, bVar);
    }

    private b() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20752a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new e(bArr, bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20752a;
    }
}
