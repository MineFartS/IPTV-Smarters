package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class p extends bkx<p, s> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final p f22674a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f22677g = -1;

    static {
        p pVar = new p();
        f22674a = pVar;
        bkx.at(p.class, pVar);
    }

    private p() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f22674a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"e", "f", n.c(), "g"});
        }
        if (i3 == 3) {
            return new p();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new s(bArr, bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f22674a;
    }
}
