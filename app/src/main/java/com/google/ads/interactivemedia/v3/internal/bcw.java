package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class bcw extends bkx<bcw, bcv> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bcw f20898a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20899e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkd f20900f = bkd.f21262b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20901g;

    static {
        bcw bcwVar = new bcw();
        f20898a = bcwVar;
        bkx.at(bcw.class, bcwVar);
    }

    private bcw() {
    }

    public static bcv a() {
        return f20898a.ak();
    }

    public static bcw d() {
        return f20898a;
    }

    public static /* synthetic */ void h(bcw bcwVar, String str) {
        str.getClass();
        bcwVar.f20899e = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20898a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new bcw();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcv(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20898a;
    }

    public final bdl e() {
        bdl bdlVarB = bdl.b(this.f20901g);
        return bdlVarB == null ? bdl.UNRECOGNIZED : bdlVarB;
    }

    public final bkd f() {
        return this.f20900f;
    }

    public final String g() {
        return this.f20899e;
    }
}
