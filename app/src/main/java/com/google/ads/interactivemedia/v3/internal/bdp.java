package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bdp extends bkx<bdp, bcx> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bdp f20956a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20957e;

    static {
        bdp bdpVar = new bdp();
        f20956a = bdpVar;
        bkx.at(bdp.class, bdpVar);
    }

    private bdp() {
    }

    public static bdp c() {
        return f20956a;
    }

    public static bdp d(bkd bkdVar, bkm bkmVar) {
        return (bdp) bkx.am(f20956a, bkdVar, bkmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20956a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"e"});
        }
        if (i3 == 3) {
            return new bdp();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcx(bArr, (byte[][]) (0 == true ? 1 : 0));
        }
        if (i3 != 5) {
            return null;
        }
        return f20956a;
    }
}
