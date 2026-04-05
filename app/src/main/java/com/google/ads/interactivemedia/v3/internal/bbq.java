package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbq extends bkx<bbq, bbp> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbq f20812a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20813e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkd f20814f = bkd.f21262b;

    static {
        bbq bbqVar = new bbq();
        f20812a = bbqVar;
        bkx.at(bbq.class, bbqVar);
    }

    private bbq() {
    }

    public static bbp c() {
        return f20812a.ak();
    }

    public static bbq e(bkd bkdVar, bkm bkmVar) {
        return (bbq) bkx.am(f20812a, bkdVar, bkmVar);
    }

    public final int a() {
        return this.f20813e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20812a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bbq();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbp(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20812a;
    }

    public final bkd f() {
        return this.f20814f;
    }
}
