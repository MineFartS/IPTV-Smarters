package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bao extends bkx<bao, ban> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bao f20768a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private baq f20770f;

    static {
        bao baoVar = new bao();
        f20768a = baoVar;
        bkx.at(bao.class, baoVar);
    }

    private bao() {
    }

    public static ban c() {
        return f20768a.ak();
    }

    public static bao e(bkd bkdVar, bkm bkmVar) {
        return (bao) bkx.am(f20768a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void g(bao baoVar, baq baqVar) {
        baqVar.getClass();
        baoVar.f20770f = baqVar;
    }

    public final int a() {
        return this.f20769e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20768a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bao();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new ban(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20768a;
    }

    public final baq f() {
        baq baqVar = this.f20770f;
        return baqVar == null ? baq.e() : baqVar;
    }
}
