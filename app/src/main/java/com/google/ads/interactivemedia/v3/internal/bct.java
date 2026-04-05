package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class bct extends bkx<bct, bcr> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bct f20887a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20888e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkd f20889f = bkd.f21262b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20890g;

    static {
        bct bctVar = new bct();
        f20887a = bctVar;
        bkx.at(bct.class, bctVar);
    }

    private bct() {
    }

    public static bcr a() {
        return f20887a.ak();
    }

    public static bct e() {
        return f20887a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20887a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new bct();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcr(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20887a;
    }

    public final bcs c() {
        bcs bcsVarB = bcs.b(this.f20890g);
        return bcsVarB == null ? bcs.UNRECOGNIZED : bcsVarB;
    }

    public final bkd f() {
        return this.f20889f;
    }

    public final String g() {
        return this.f20888e;
    }
}
