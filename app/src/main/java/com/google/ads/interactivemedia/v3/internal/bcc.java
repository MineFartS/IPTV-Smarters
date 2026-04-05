package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bcc extends bkx<bcc, bcb> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bcc f20834a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bci f20835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bby f20836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20837g;

    static {
        bcc bccVar = new bcc();
        f20834a = bccVar;
        bkx.at(bcc.class, bccVar);
    }

    private bcc() {
    }

    public static bcb d() {
        return f20834a.ak();
    }

    public static bcc f() {
        return f20834a;
    }

    public static /* synthetic */ void h(bcc bccVar, bci bciVar) {
        bciVar.getClass();
        bccVar.f20835e = bciVar;
    }

    public static /* synthetic */ void i(bcc bccVar, bby bbyVar) {
        bbyVar.getClass();
        bccVar.f20836f = bbyVar;
    }

    public final bbw a() {
        bbw bbwVarB = bbw.b(this.f20837g);
        return bbwVarB == null ? bbw.UNRECOGNIZED : bbwVarB;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20834a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new bcc();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcb(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20834a;
    }

    public final bby c() {
        bby bbyVar = this.f20836f;
        return bbyVar == null ? bby.d() : bbyVar;
    }

    public final bci g() {
        bci bciVar = this.f20835e;
        return bciVar == null ? bci.d() : bciVar;
    }
}
