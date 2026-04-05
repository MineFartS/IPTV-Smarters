package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class ad extends bkx<ad, s> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ad f19230a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f19233g = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private bkd f19234h = bkd.f21262b;

    static {
        ad adVar = new ad();
        f19230a = adVar;
        bkx.at(ad.class, adVar);
    }

    private ad() {
    }

    public static ad d() {
        return f19230a;
    }

    public final long a() {
        return this.f19232f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f19230a, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new ad();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new s(bArr, (short[]) bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f19230a;
    }

    public final boolean e() {
        return (this.f19231e & 1) != 0;
    }
}
