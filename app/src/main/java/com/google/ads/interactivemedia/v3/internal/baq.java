package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class baq extends bkx<baq, bap> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final baq f20771a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20772e;

    static {
        baq baqVar = new baq();
        f20771a = baqVar;
        bkx.at(baq.class, baqVar);
    }

    private baq() {
    }

    public static bap c() {
        return f20771a.ak();
    }

    public static baq e() {
        return f20771a;
    }

    public final int a() {
        return this.f20772e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20771a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"e"});
        }
        if (i3 == 3) {
            return new baq();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bap(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20771a;
    }
}
