package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbc extends bkx<bbc, bbb> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbc f20791a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20792e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bbg f20793f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bkd f20794g = bkd.f21262b;

    static {
        bbc bbcVar = new bbc();
        f20791a = bbcVar;
        bkx.at(bbc.class, bbcVar);
    }

    private bbc() {
    }

    public static bbb c() {
        return f20791a.ak();
    }

    public static bbc e(bkd bkdVar, bkm bkmVar) {
        return (bbc) bkx.am(f20791a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void h(bbc bbcVar, bbg bbgVar) {
        bbgVar.getClass();
        bbcVar.f20793f = bbgVar;
    }

    public final int a() {
        return this.f20792e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20791a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new bbc();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbb(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20791a;
    }

    public final bbg f() {
        bbg bbgVar = this.f20793f;
        return bbgVar == null ? bbg.e() : bbgVar;
    }

    public final bkd g() {
        return this.f20794g;
    }
}
