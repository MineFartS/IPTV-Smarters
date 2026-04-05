package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ayx implements awu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f20725a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bcw f20726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final awu f20727c;

    public ayx(bcw bcwVar, awu awuVar) {
        this.f20726b = bcwVar;
        this.f20727c = awuVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awu
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrAi = axx.c(this.f20726b).ai();
        byte[] bArrA = this.f20727c.a(bArrAi, f20725a);
        byte[] bArrA2 = ((awu) axx.g(this.f20726b.g(), bArrAi, awu.class)).a(bArr, bArr2);
        int length = bArrA.length;
        return ByteBuffer.allocate(length + 4 + bArrA2.length).putInt(length).put(bArrA).put(bArrA2).array();
    }
}
