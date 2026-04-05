package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class bdk extends bkx<bdk, bcx> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bdk f20938a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20939e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bcw f20940f;

    static {
        bdk bdkVar = new bdk();
        f20938a = bdkVar;
        bkx.at(bdk.class, bdkVar);
    }

    private bdk() {
    }

    public static bdk d() {
        return f20938a;
    }

    public static bdk e(bkd bkdVar, bkm bkmVar) {
        return (bdk) bkx.am(f20938a, bkdVar, bkmVar);
    }

    public final bcw a() {
        bcw bcwVar = this.f20940f;
        return bcwVar == null ? bcw.d() : bcwVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20938a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bdk();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcx(bArr, (boolean[]) (0 == true ? 1 : 0));
        }
        if (i3 != 5) {
            return null;
        }
        return f20938a;
    }

    public final String f() {
        return this.f20939e;
    }

    public final boolean g() {
        return this.f20940f != null;
    }
}
