package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bca extends bkx<bca, bbz> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bca f20832a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bcc f20833e;

    static {
        bca bcaVar = new bca();
        f20832a = bcaVar;
        bkx.at(bca.class, bcaVar);
    }

    private bca() {
    }

    public static bbz a() {
        return f20832a.ak();
    }

    public static bca d(bkd bkdVar, bkm bkmVar) {
        return (bca) bkx.am(f20832a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void f(bca bcaVar, bcc bccVar) {
        bccVar.getClass();
        bcaVar.f20833e = bccVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20832a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"e"});
        }
        if (i3 == 3) {
            return new bca();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbz(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20832a;
    }

    public final bcc e() {
        bcc bccVar = this.f20833e;
        return bccVar == null ? bcc.f() : bccVar;
    }
}
