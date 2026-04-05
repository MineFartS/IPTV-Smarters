package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bdg extends bkx<bdg, bdf> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bdg f20930a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bdh f20932f;

    static {
        bdg bdgVar = new bdg();
        f20930a = bdgVar;
        bkx.at(bdg.class, bdgVar);
    }

    private bdg() {
    }

    public static bdf c() {
        return f20930a.ak();
    }

    public static bdg e(bkd bkdVar, bkm bkmVar) {
        return (bdg) bkx.am(f20930a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void g(bdg bdgVar, bdh bdhVar) {
        bdhVar.getClass();
        bdgVar.f20932f = bdhVar;
    }

    public final int a() {
        return this.f20931e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20930a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bdg();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bdf(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20930a;
    }

    public final bdh f() {
        bdh bdhVar = this.f20932f;
        return bdhVar == null ? bdh.c() : bdhVar;
    }
}
