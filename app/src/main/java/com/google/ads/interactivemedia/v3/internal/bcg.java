package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bcg extends bkx<bcg, bcf> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bcg f20842a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bcc f20844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bkd f20845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private bkd f20846h;

    static {
        bcg bcgVar = new bcg();
        f20842a = bcgVar;
        bkx.at(bcg.class, bcgVar);
    }

    private bcg() {
        bkd bkdVar = bkd.f21262b;
        this.f20845g = bkdVar;
        this.f20846h = bkdVar;
    }

    public static bcf d() {
        return f20842a.ak();
    }

    public static bcg f() {
        return f20842a;
    }

    public static bcg g(bkd bkdVar, bkm bkmVar) {
        return (bcg) bkx.am(f20842a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void j(bcg bcgVar, bcc bccVar) {
        bccVar.getClass();
        bcgVar.f20844f = bccVar;
    }

    public final int a() {
        return this.f20843e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20842a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new bcg();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcf(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20842a;
    }

    public final bcc c() {
        bcc bccVar = this.f20844f;
        return bccVar == null ? bcc.f() : bccVar;
    }

    public final bkd h() {
        return this.f20845g;
    }

    public final bkd i() {
        return this.f20846h;
    }
}
