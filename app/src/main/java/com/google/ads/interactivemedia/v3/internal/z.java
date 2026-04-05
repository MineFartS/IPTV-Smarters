package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class z extends bkx<z, y> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final z f23826a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23827e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkd f23828f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bkd f23829g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private bkd f23830h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private bkd f23831i;

    static {
        z zVar = new z();
        f23826a = zVar;
        bkx.at(z.class, zVar);
    }

    private z() {
        bkd bkdVar = bkd.f21262b;
        this.f23828f = bkdVar;
        this.f23829g = bkdVar;
        this.f23830h = bkdVar;
        this.f23831i = bkdVar;
    }

    public static y a() {
        return f23826a.ak();
    }

    public static z d(byte[] bArr, bkm bkmVar) {
        return (z) bkx.an(f23826a, bArr, bkmVar);
    }

    public static /* synthetic */ void i(z zVar, bkd bkdVar) {
        zVar.f23827e |= 1;
        zVar.f23828f = bkdVar;
    }

    public static /* synthetic */ void j(z zVar, bkd bkdVar) {
        zVar.f23827e |= 2;
        zVar.f23829g = bkdVar;
    }

    public static /* synthetic */ void k(z zVar, bkd bkdVar) {
        zVar.f23827e |= 4;
        zVar.f23830h = bkdVar;
    }

    public static /* synthetic */ void l(z zVar, bkd bkdVar) {
        zVar.f23827e |= 8;
        zVar.f23831i = bkdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f23826a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"e", "f", "g", "h", "i"});
        }
        if (i3 == 3) {
            return new z();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new y(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f23826a;
    }

    public final bkd e() {
        return this.f23828f;
    }

    public final bkd f() {
        return this.f23829g;
    }

    public final bkd g() {
        return this.f23831i;
    }

    public final bkd h() {
        return this.f23830h;
    }
}
