package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbv extends bkx<bbv, bcx> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbv f20821a;

    static {
        bbv bbvVar = new bbv();
        f20821a = bbvVar;
        bkx.at(bbv.class, bbvVar);
    }

    private bbv() {
    }

    public static bbv c() {
        return f20821a;
    }

    public static bbv d(bkd bkdVar, bkm bkmVar) {
        return (bbv) bkx.am(f20821a, bkdVar, bkmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        byte[] bArr = null;
        if (i3 == 2) {
            return bkx.as(f20821a, "\u0000\u0000", null);
        }
        if (i3 == 3) {
            return new bbv();
        }
        if (i3 == 4) {
            return new bcx(bArr, bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20821a;
    }
}
