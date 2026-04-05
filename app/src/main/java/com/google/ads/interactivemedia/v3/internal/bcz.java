package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bcz extends bkx<bcz, bcx> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bcz f20908a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bct f20909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20912h;

    static {
        bcz bczVar = new bcz();
        f20908a = bczVar;
        bkx.at(bcz.class, bczVar);
    }

    private bcz() {
    }

    public final int a() {
        return this.f20911g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20908a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new bcz();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcx(bArr, (short[]) bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20908a;
    }

    public final bct c() {
        bct bctVar = this.f20909e;
        return bctVar == null ? bct.e() : bctVar;
    }

    public final bcu d() {
        bcu bcuVarB = bcu.b(this.f20910f);
        return bcuVarB == null ? bcu.UNRECOGNIZED : bcuVarB;
    }

    public final bdl f() {
        bdl bdlVarB = bdl.b(this.f20912h);
        return bdlVarB == null ? bdl.UNRECOGNIZED : bdlVarB;
    }

    public final boolean g() {
        return this.f20909e != null;
    }
}
