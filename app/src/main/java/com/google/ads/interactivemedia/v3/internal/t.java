package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class t extends bkx<t, s> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final t f23032a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23033e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f23034f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f23035g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23036h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f23037i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f23038j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f23039k = -1;

    static {
        t tVar = new t();
        f23032a = tVar;
        bkx.at(t.class, tVar);
    }

    private t() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f23032a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005", new Object[]{"e", "f", "g", "h", "i", "j", "k"});
        }
        if (i3 == 3) {
            return new t();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new s(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f23032a;
    }
}
