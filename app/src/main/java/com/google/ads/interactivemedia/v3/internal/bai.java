package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bai implements axl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final axp<axl> f20762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f20763b = {0};

    @Override // com.google.ads.interactivemedia.v3.internal.axl
    public final byte[] a(byte[] bArr) {
        return this.f20762a.b().b().equals(bdl.LEGACY) ? awp.c(this.f20762a.b().d(), this.f20762a.b().c().a(awp.c(bArr, this.f20763b))) : awp.c(this.f20762a.b().d(), this.f20762a.b().c().a(bArr));
    }
}
