package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bas extends bkx<bas, bar> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bas f20773a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20774e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private baw f20775f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bcm f20776g;

    static {
        bas basVar = new bas();
        f20773a = basVar;
        bkx.at(bas.class, basVar);
    }

    private bas() {
    }

    public static bar c() {
        return f20773a.ak();
    }

    public static bas e(bkd bkdVar, bkm bkmVar) {
        return (bas) bkx.am(f20773a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void i(bas basVar, baw bawVar) {
        bawVar.getClass();
        basVar.f20775f = bawVar;
    }

    public static /* synthetic */ void j(bas basVar, bcm bcmVar) {
        bcmVar.getClass();
        basVar.f20776g = bcmVar;
    }

    public final int a() {
        return this.f20774e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20773a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new bas();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bar(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20773a;
    }

    public final baw f() {
        baw bawVar = this.f20775f;
        return bawVar == null ? baw.e() : bawVar;
    }

    public final bcm g() {
        bcm bcmVar = this.f20776g;
        return bcmVar == null ? bcm.e() : bcmVar;
    }
}
