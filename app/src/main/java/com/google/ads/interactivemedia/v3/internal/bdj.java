package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bdj extends bkx<bdj, bdi> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bdj f20935a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bdk f20937f;

    static {
        bdj bdjVar = new bdj();
        f20935a = bdjVar;
        bkx.at(bdj.class, bdjVar);
    }

    private bdj() {
    }

    public static bdi c() {
        return f20935a.ak();
    }

    public static bdj e(bkd bkdVar, bkm bkmVar) {
        return (bdj) bkx.am(f20935a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void g(bdj bdjVar, bdk bdkVar) {
        bdkVar.getClass();
        bdjVar.f20937f = bdkVar;
    }

    public final int a() {
        return this.f20936e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20935a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bdj();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bdi(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20935a;
    }

    public final bdk f() {
        bdk bdkVar = this.f20937f;
        return bdkVar == null ? bdk.d() : bdkVar;
    }
}
