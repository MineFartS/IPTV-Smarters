package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bci extends bkx<bci, bch> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bci f20847a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20848e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20849f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bkd f20850g = bkd.f21262b;

    static {
        bci bciVar = new bci();
        f20847a = bciVar;
        bkx.at(bci.class, bciVar);
    }

    private bci() {
    }

    public static bch a() {
        return f20847a.ak();
    }

    public static bci d() {
        return f20847a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20847a, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new bci();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bch(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20847a;
    }

    public final bcj e() {
        bcj bcjVarB = bcj.b(this.f20848e);
        return bcjVarB == null ? bcj.UNRECOGNIZED : bcjVarB;
    }

    public final bck f() {
        bck bckVarB = bck.b(this.f20849f);
        return bckVarB == null ? bck.UNRECOGNIZED : bckVarB;
    }

    public final bkd g() {
        return this.f20850g;
    }
}
