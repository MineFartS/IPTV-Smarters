package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class x extends bkx<x, w> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x f23667a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23668e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkd f23669f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bkd f23670g;

    static {
        x xVar = new x();
        f23667a = xVar;
        bkx.at(x.class, xVar);
    }

    private x() {
        bkd bkdVar = bkd.f21262b;
        this.f23669f = bkdVar;
        this.f23670g = bkdVar;
    }

    public static w a() {
        return f23667a.ak();
    }

    public static /* synthetic */ void d(x xVar, bkd bkdVar) {
        xVar.f23668e |= 1;
        xVar.f23669f = bkdVar;
    }

    public static /* synthetic */ void e(x xVar, bkd bkdVar) {
        xVar.f23668e |= 2;
        xVar.f23670g = bkdVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f23667a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new x();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new w(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f23667a;
    }
}
