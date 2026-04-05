package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbu extends bkx<bbu, bbt> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbu f20818a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkd f20820f = bkd.f21262b;

    static {
        bbu bbuVar = new bbu();
        f20818a = bbuVar;
        bkx.at(bbu.class, bbuVar);
    }

    private bbu() {
    }

    public static bbt c() {
        return f20818a.ak();
    }

    public static bbu e(bkd bkdVar, bkm bkmVar) {
        return (bbu) bkx.am(f20818a, bkdVar, bkmVar);
    }

    public final int a() {
        return this.f20819e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20818a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bbu();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbt(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20818a;
    }

    public final bkd f() {
        return this.f20820f;
    }
}
