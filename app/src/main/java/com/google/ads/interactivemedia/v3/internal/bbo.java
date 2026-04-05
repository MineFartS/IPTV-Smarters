package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbo extends bkx<bbo, bbn> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbo f20809a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20810e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20811f;

    static {
        bbo bboVar = new bbo();
        f20809a = bboVar;
        bkx.at(bbo.class, bboVar);
    }

    private bbo() {
    }

    public static bbn c() {
        return f20809a.ak();
    }

    public static bbo e(bkd bkdVar, bkm bkmVar) {
        return (bbo) bkx.am(f20809a, bkdVar, bkmVar);
    }

    public final int a() {
        return this.f20810e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20809a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"f", "e"});
        }
        if (i3 == 3) {
            return new bbo();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbn(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20809a;
    }
}
