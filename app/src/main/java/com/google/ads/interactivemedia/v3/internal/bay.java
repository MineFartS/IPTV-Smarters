package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bay extends bkx<bay, bax> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bay f20784a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bba f20785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20786f;

    static {
        bay bayVar = new bay();
        f20784a = bayVar;
        bkx.at(bay.class, bayVar);
    }

    private bay() {
    }

    public static bax c() {
        return f20784a.ak();
    }

    public static bay e() {
        return f20784a;
    }

    public static bay f(bkd bkdVar, bkm bkmVar) {
        return (bay) bkx.am(f20784a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void h(bay bayVar, bba bbaVar) {
        bbaVar.getClass();
        bayVar.f20785e = bbaVar;
    }

    public final int a() {
        return this.f20786f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20784a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bay();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bax(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20784a;
    }

    public final bba g() {
        bba bbaVar = this.f20785e;
        return bbaVar == null ? bba.e() : bbaVar;
    }
}
