package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class f extends bkx<f, e> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f21761a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private g f21763f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private j f21764g;

    static {
        f fVar = new f();
        f21761a = fVar;
        bkx.at(f.class, fVar);
    }

    private f() {
    }

    public static f c(byte[] bArr, bkm bkmVar) {
        return (f) bkx.an(f21761a, bArr, bkmVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f21761a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new f();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new e(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f21761a;
    }

    public final g d() {
        g gVar = this.f21763f;
        return gVar == null ? g.c() : gVar;
    }

    public final j e() {
        j jVar = this.f21764g;
        return jVar == null ? j.c() : jVar;
    }

    public final boolean f() {
        return (this.f21762e & 1) != 0;
    }

    public final boolean g() {
        return (this.f21762e & 2) != 0;
    }
}
