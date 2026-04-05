package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bby extends bkx<bby, bbx> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bby f20829a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bcw f20830e;

    static {
        bby bbyVar = new bby();
        f20829a = bbyVar;
        bkx.at(bby.class, bbyVar);
    }

    private bby() {
    }

    public static bbx a() {
        return f20829a.ak();
    }

    public static bby d() {
        return f20829a;
    }

    public static /* synthetic */ void f(bby bbyVar, bcw bcwVar) {
        bcwVar.getClass();
        bbyVar.f20830e = bcwVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20829a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"e"});
        }
        if (i3 == 3) {
            return new bby();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbx(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20829a;
    }

    public final bcw e() {
        bcw bcwVar = this.f20830e;
        return bcwVar == null ? bcw.d() : bcwVar;
    }
}
