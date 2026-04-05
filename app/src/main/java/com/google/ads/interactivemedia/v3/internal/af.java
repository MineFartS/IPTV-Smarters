package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class af extends bkx<af, ae> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final af f19461a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19462e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f19463f = BuildConfig.FLAVOR;

    static {
        af afVar = new af();
        f19461a = afVar;
        bkx.at(af.class, afVar);
    }

    private af() {
    }

    public static ae a() {
        return f19461a.ak();
    }

    public static /* synthetic */ void d(af afVar, String str) {
        str.getClass();
        afVar.f19462e |= 1;
        afVar.f19463f = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f19461a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new af();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new ae(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f19461a;
    }
}
