package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbm extends bkx<bbm, bbl> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbm f20806a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkd f20808f = bkd.f21262b;

    static {
        bbm bbmVar = new bbm();
        f20806a = bbmVar;
        bkx.at(bbm.class, bbmVar);
    }

    private bbm() {
    }

    public static bbl c() {
        return f20806a.ak();
    }

    public static bbm e(bkd bkdVar, bkm bkmVar) {
        return (bbm) bkx.am(f20806a, bkdVar, bkmVar);
    }

    public final int a() {
        return this.f20807e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20806a, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bbm();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbl(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20806a;
    }

    public final bkd f() {
        return this.f20808f;
    }
}
