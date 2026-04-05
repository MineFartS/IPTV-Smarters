package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bde extends bkx<bde, bdb> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bde f20927a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20928e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private blc<bdd> f20929f = bkx.ap();

    static {
        bde bdeVar = new bde();
        f20927a = bdeVar;
        bkx.at(bde.class, bdeVar);
    }

    private bde() {
    }

    public static bdb a() {
        return f20927a.ak();
    }

    public static /* synthetic */ void e(bde bdeVar, bdd bddVar) {
        bddVar.getClass();
        bdeVar.f();
        bdeVar.f20929f.add(bddVar);
    }

    private final void f() {
        blc<bdd> blcVar = this.f20929f;
        if (blcVar.c()) {
            return;
        }
        this.f20929f = bkx.aq(blcVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20927a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"e", "f", bdd.class});
        }
        if (i3 == 3) {
            return new bde();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bdb(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20927a;
    }
}
