package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class beh implements awu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bem f20993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final axl f20994b;

    public beh(bem bemVar, axl axlVar) {
        this.f20993a = bemVar;
        this.f20994b = axlVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awu
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArrA = this.f20993a.a(bArr);
        return awp.c(bArrA, this.f20994b.a(awp.c(bArr2, bArrA, Arrays.copyOf(ByteBuffer.allocate(8).putLong(0L).array(), 8))));
    }
}
