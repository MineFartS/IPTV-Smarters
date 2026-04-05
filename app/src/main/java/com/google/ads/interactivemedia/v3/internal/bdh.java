package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class bdh extends bkx<bdh, bcx> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bdh f20933a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20934e = BuildConfig.FLAVOR;

    static {
        bdh bdhVar = new bdh();
        f20933a = bdhVar;
        bkx.at(bdh.class, bdhVar);
    }

    private bdh() {
    }

    public static bdh c() {
        return f20933a;
    }

    public static bdh d(bkd bkdVar, bkm bkmVar) {
        return (bdh) bkx.am(f20933a, bkdVar, bkmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20933a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"e"});
        }
        if (i3 == 3) {
            return new bdh();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcx(bArr, (int[]) bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20933a;
    }

    public final String e() {
        return this.f20934e;
    }
}
