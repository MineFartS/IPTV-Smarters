package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bco extends bkx<bco, bcn> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bco f20872a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bcq f20873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20875g;

    static {
        bco bcoVar = new bco();
        f20872a = bcoVar;
        bkx.at(bco.class, bcoVar);
    }

    private bco() {
    }

    public static bcn c() {
        return f20872a.ak();
    }

    public static bco e() {
        return f20872a;
    }

    public static bco f(bkd bkdVar, bkm bkmVar) {
        return (bco) bkx.am(f20872a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void h(bco bcoVar, bcq bcqVar) {
        bcqVar.getClass();
        bcoVar.f20873e = bcqVar;
    }

    public final int a() {
        return this.f20874f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20872a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new bco();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcn(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20872a;
    }

    public final bcq g() {
        bcq bcqVar = this.f20873e;
        return bcqVar == null ? bcq.f() : bcqVar;
    }
}
