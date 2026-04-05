package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bba extends bkx<bba, baz> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bba f20789a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20790e;

    static {
        bba bbaVar = new bba();
        f20789a = bbaVar;
        bkx.at(bba.class, bbaVar);
    }

    private bba() {
    }

    public static baz c() {
        return f20789a.ak();
    }

    public static bba e() {
        return f20789a;
    }

    public final int a() {
        return this.f20790e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20789a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"e"});
        }
        if (i3 == 3) {
            return new bba();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new baz(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20789a;
    }
}
