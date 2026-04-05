package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bdo extends bkx<bdo, bdn> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bdo f20953a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkd f20955f = bkd.f21262b;

    static {
        bdo bdoVar = new bdo();
        f20953a = bdoVar;
        bkx.at(bdo.class, bdoVar);
    }

    private bdo() {
    }

    public static bdn c() {
        return f20953a.ak();
    }

    public static bdo e(bkd bkdVar, bkm bkmVar) {
        return (bdo) bkx.am(f20953a, bkdVar, bkmVar);
    }

    public final int a() {
        return this.f20954e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20953a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bdo();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bdn(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20953a;
    }

    public final bkd f() {
        return this.f20955f;
    }
}
