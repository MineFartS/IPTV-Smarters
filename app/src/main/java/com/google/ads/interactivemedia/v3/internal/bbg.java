package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbg extends bkx<bbg, bbf> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbg f20798a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20799e;

    static {
        bbg bbgVar = new bbg();
        f20798a = bbgVar;
        bkx.at(bbg.class, bbgVar);
    }

    private bbg() {
    }

    public static bbf c() {
        return f20798a.ak();
    }

    public static bbg e() {
        return f20798a;
    }

    public final int a() {
        return this.f20799e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20798a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"e"});
        }
        if (i3 == 3) {
            return new bbg();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbf(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20798a;
    }
}
