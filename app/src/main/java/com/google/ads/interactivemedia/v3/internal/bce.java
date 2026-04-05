package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bce extends bkx<bce, bcd> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bce f20838a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20839e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bcg f20840f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bkd f20841g = bkd.f21262b;

    static {
        bce bceVar = new bce();
        f20838a = bceVar;
        bkx.at(bce.class, bceVar);
    }

    private bce() {
    }

    public static bcd c() {
        return f20838a.ak();
    }

    public static bce e(bkd bkdVar, bkm bkmVar) {
        return (bce) bkx.am(f20838a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void h(bce bceVar, bcg bcgVar) {
        bcgVar.getClass();
        bceVar.f20840f = bcgVar;
    }

    public final int a() {
        return this.f20839e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20838a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new bce();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcd(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20838a;
    }

    public final bcg f() {
        bcg bcgVar = this.f20840f;
        return bcgVar == null ? bcg.f() : bcgVar;
    }

    public final bkd g() {
        return this.f20841g;
    }
}
