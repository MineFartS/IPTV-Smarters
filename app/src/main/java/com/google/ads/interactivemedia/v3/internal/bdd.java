package com.google.ads.interactivemedia.v3.internal;

import me.zhanghai.android.materialprogressbar.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final class bdd extends bkx<bdd, bdc> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bdd f20922a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20923e = BuildConfig.FLAVOR;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20925g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20926h;

    static {
        bdd bddVar = new bdd();
        f20922a = bddVar;
        bkx.at(bdd.class, bddVar);
    }

    private bdd() {
    }

    public static bdc a() {
        return f20922a.ak();
    }

    public static /* synthetic */ void d(bdd bddVar, String str) {
        str.getClass();
        bddVar.f20923e = str;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20922a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new bdd();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bdc(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20922a;
    }
}
