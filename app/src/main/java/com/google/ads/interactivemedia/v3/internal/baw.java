package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class baw extends bkx<baw, bav> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final baw f20780a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bba f20782f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bkd f20783g = bkd.f21262b;

    static {
        baw bawVar = new baw();
        f20780a = bawVar;
        bkx.at(baw.class, bawVar);
    }

    private baw() {
    }

    public static bav c() {
        return f20780a.ak();
    }

    public static baw e() {
        return f20780a;
    }

    public static baw f(bkd bkdVar, bkm bkmVar) {
        return (baw) bkx.am(f20780a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void i(baw bawVar, bba bbaVar) {
        bbaVar.getClass();
        bawVar.f20782f = bbaVar;
    }

    public final int a() {
        return this.f20781e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20780a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new baw();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bav(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20780a;
    }

    public final bba g() {
        bba bbaVar = this.f20782f;
        return bbaVar == null ? bba.e() : bbaVar;
    }

    public final bkd h() {
        return this.f20783g;
    }
}
