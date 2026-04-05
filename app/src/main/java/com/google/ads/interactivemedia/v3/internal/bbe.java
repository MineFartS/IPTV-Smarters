package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbe extends bkx<bbe, bbd> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbe f20795a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bbg f20796e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20797f;

    static {
        bbe bbeVar = new bbe();
        f20795a = bbeVar;
        bkx.at(bbe.class, bbeVar);
    }

    private bbe() {
    }

    public static bbd c() {
        return f20795a.ak();
    }

    public static bbe e(bkd bkdVar, bkm bkmVar) {
        return (bbe) bkx.am(f20795a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void g(bbe bbeVar, bbg bbgVar) {
        bbgVar.getClass();
        bbeVar.f20796e = bbgVar;
    }

    public final int a() {
        return this.f20797f;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20795a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bbe();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbd(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20795a;
    }

    public final bbg f() {
        bbg bbgVar = this.f20796e;
        return bbgVar == null ? bbg.e() : bbgVar;
    }
}
