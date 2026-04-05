package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class bcy extends bkx<bcy, bcx> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bcy f20902a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f20906h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20903e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20904f = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f20907i = BuildConfig.FLAVOR;

    static {
        bcy bcyVar = new bcy();
        f20902a = bcyVar;
        bkx.at(bcy.class, bcyVar);
    }

    private bcy() {
    }

    public final int a() {
        return this.f20905g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20902a, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"e", "f", "g", "h", "i"});
        }
        if (i3 == 3) {
            return new bcy();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcx(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20902a;
    }

    public final String d() {
        return this.f20907i;
    }

    public final String e() {
        return this.f20903e;
    }

    public final String f() {
        return this.f20904f;
    }

    public final boolean g() {
        return this.f20906h;
    }
}
