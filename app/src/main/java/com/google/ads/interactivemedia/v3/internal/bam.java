package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bam extends bkx<bam, bal> implements bma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bam f20764a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f20765e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bkd f20766f = bkd.f21262b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private baq f20767g;

    static {
        bam bamVar = new bam();
        f20764a = bamVar;
        bkx.at(bam.class, bamVar);
    }

    private bam() {
    }

    public static bal c() {
        return f20764a.ak();
    }

    public static bam e(bkd bkdVar, bkm bkmVar) {
        return (bam) bkx.am(f20764a, bkdVar, bkmVar);
    }

    public static /* synthetic */ void i(bam bamVar, baq baqVar) {
        baqVar.getClass();
        bamVar.f20767g = baqVar;
    }

    public final int a() {
        return this.f20765e;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bkx
    public final Object b(int i2) {
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return bkx.as(f20764a, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"e", "f", "g"});
        }
        if (i3 == 3) {
            return new bam();
        }
        byte[] bArr = null;
        if (i3 == 4) {
            return new bal(bArr);
        }
        if (i3 != 5) {
            return null;
        }
        return f20764a;
    }

    public final baq f() {
        baq baqVar = this.f20767g;
        return baqVar == null ? baq.e() : baqVar;
    }

    public final bkd g() {
        return this.f20766f;
    }
}
