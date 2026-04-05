package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bau extends bkx<bau, bat> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bau f20777a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bay f20778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bco f20779f;

    static {
        bau bauVar = new bau();
        f20777a = bauVar;
        bkx.at(bau.class, bauVar);
    }

    private bau() {
    }

    public static bat a() {
        return f20777a.ak();
    }

    public static bau d(bkd bkdVar, bkm bkmVar) {
        return (bau) bkx.am(f20777a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void g(bau bauVar, bay bayVar) {
        bayVar.getClass();
        bauVar.f20778e = bayVar;
    }

    public static /* synthetic */ void h(bau bauVar, bco bcoVar) {
        bcoVar.getClass();
        bauVar.f20779f = bcoVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20777a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bau();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bat(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20777a;
    }

    public final bay e() {
        bay bayVar = this.f20778e;
        return bayVar == null ? bay.e() : bayVar;
    }

    public final bco f() {
        bco bcoVar = this.f20779f;
        return bcoVar == null ? bco.e() : bcoVar;
    }
}
