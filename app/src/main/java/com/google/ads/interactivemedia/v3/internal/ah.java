package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class ah extends bkx<ah, ag> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ah f19677a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private blc<bkd> f19679f = bkx.ap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bkd f19680g = bkd.f21262b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f19681h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f19682i = 1;

    static {
        ah ahVar = new ah();
        f19677a = ahVar;
        bkx.at(ah.class, ahVar);
    }

    private ah() {
    }

    public static ag a() {
        return f19677a.ak();
    }

    public static /* synthetic */ void d(ah ahVar, bkd bkdVar) {
        ahVar.g();
        ahVar.f19679f.add(bkdVar);
    }

    public static /* synthetic */ void e(ah ahVar, bkd bkdVar) {
        ahVar.f19678e |= 1;
        ahVar.f19680g = bkdVar;
    }

    public static /* synthetic */ void f(ah ahVar, aa aaVar) {
        ahVar.f19682i = aaVar.a();
        ahVar.f19678e |= 4;
    }

    private final void g() {
        blc<bkd> blcVar = this.f19679f;
        if (blcVar.c()) {
            return;
        }
        this.f19679f = bkx.aq(blcVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f19677a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"e", "f", "g", "h", ac.b(), "i", aa.c()});
        }
        if (i3 == 3) {
            return new ah();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new ag(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f19677a;
    }
}
