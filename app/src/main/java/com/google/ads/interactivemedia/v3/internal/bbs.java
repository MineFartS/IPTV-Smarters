package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbs extends bkx<bbs, bbr> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbs f20815a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20817f;

    static {
        bbs bbsVar = new bbs();
        f20815a = bbsVar;
        bkx.at(bbs.class, bbsVar);
    }

    private bbs() {
    }

    public static bbr c() {
        return f20815a.ak();
    }

    public static bbs e(bkd bkdVar, bkm bkmVar) {
        return (bbs) bkx.am(f20815a, bkdVar, bkmVar);
    }

    public final int a() {
        return this.f20816e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20815a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bbs();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbr(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20815a;
    }
}
