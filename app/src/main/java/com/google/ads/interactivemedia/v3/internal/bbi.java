package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbi extends bkx<bbi, bbh> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbi f20800a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkd f20802f = bkd.f21262b;

    static {
        bbi bbiVar = new bbi();
        f20800a = bbiVar;
        bkx.at(bbi.class, bbiVar);
    }

    private bbi() {
    }

    public static bbh c() {
        return f20800a.ak();
    }

    public static bbi e(bkd bkdVar, bkm bkmVar) {
        return (bbi) bkx.am(f20800a, bkdVar, bkmVar);
    }

    public final int a() {
        return this.f20801e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20800a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bbi();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbh(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20800a;
    }

    public final bkd f() {
        return this.f20802f;
    }
}
