package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class v extends bkx<v, s> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final v f23284a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f23287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f23288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private blb f23289i = bkx.ao();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23290j;

    static {
        v vVar = new v();
        f23284a = vVar;
        bkx.at(v.class, vVar);
    }

    private v() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f23284a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"e", "f", "g", "h", "i", "j"});
        }
        if (i3 == 3) {
            return new v();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new s(bArr, (char[]) (0 == true ? 1 : 0));
        }
        if (i3 != 5) {
            return null;
        }
        return f23284a;
    }
}
