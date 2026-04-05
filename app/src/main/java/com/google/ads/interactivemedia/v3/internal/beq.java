package com.google.ads.interactivemedia.v3.internal;

import java.security.InvalidAlgorithmParameterException;

/* JADX INFO: loaded from: classes.dex */
public final class beq implements axl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bak f21016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21017b;

    public beq(bak bakVar, int i2) throws InvalidAlgorithmParameterException {
        this.f21016a = bakVar;
        this.f21017b = i2;
        if (i2 < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        bakVar.a(new byte[0], i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.axl
    public final byte[] a(byte[] bArr) {
        return this.f21016a.a(bArr, this.f21017b);
    }
}
