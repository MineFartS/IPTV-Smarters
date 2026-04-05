package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bbk extends bkx<bbk, bbj> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bbk f20803a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f20805f;

    static {
        bbk bbkVar = new bbk();
        f20803a = bbkVar;
        bkx.at(bbk.class, bbkVar);
    }

    private bbk() {
    }

    public static bbj c() {
        return f20803a.ak();
    }

    public static bbk e(bkd bkdVar, bkm bkmVar) {
        return (bbk) bkx.am(f20803a, bkdVar, bkmVar);
    }

    public final int a() {
        return this.f20804e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20803a, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"e", "f"});
        }
        if (i3 == 3) {
            return new bbk();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bbj(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20803a;
    }
}
