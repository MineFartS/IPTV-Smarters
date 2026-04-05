package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bcm extends bkx<bcm, bcl> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bcm f20868a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bcq f20870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bkd f20871g = bkd.f21262b;

    static {
        bcm bcmVar = new bcm();
        f20868a = bcmVar;
        bkx.at(bcm.class, bcmVar);
    }

    private bcm() {
    }

    public static bcl c() {
        return f20868a.ak();
    }

    public static bcm e() {
        return f20868a;
    }

    public static bcm f(bkd bkdVar, bkm bkmVar) {
        return (bcm) bkx.am(f20868a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void i(bcm bcmVar, bcq bcqVar) {
        bcqVar.getClass();
        bcmVar.f20870f = bcqVar;
    }

    public final int a() {
        return this.f20869e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20868a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new bcm();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bcl(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20868a;
    }

    public final bcq g() {
        bcq bcqVar = this.f20870f;
        return bcqVar == null ? bcq.f() : bcqVar;
    }

    public final bkd h() {
        return this.f20871g;
    }
}
