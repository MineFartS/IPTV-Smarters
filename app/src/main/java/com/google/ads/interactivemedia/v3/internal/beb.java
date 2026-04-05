package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes.dex */
public abstract class beb implements awu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20981a = azg.f20736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bdz f20982b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bdz f20983c;

    public beb(byte[] bArr) {
        azg.a(f20981a);
        this.f20982b = b(bArr, 1);
        this.f20983c = b(bArr, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awu
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > (Integer.MAX_VALUE - this.f20982b.b()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.f20982b.b() + length + 16);
        if (byteBufferAllocate.remaining() < length + this.f20982b.b() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBufferAllocate.position();
        this.f20982b.e(byteBufferAllocate, bArr);
        byteBufferAllocate.position(iPosition);
        byte[] bArr3 = new byte[this.f20982b.b()];
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.limit(byteBufferAllocate.limit() - 16);
        byte[] bArr4 = new byte[32];
        this.f20983c.d(bArr3, 0).get(bArr4);
        int iRemaining = byteBufferAllocate.remaining();
        int i2 = iRemaining % 16;
        int i3 = i2 == 0 ? iRemaining : (iRemaining + 16) - i2;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i3 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr2);
        byteBufferOrder.position(0);
        byteBufferOrder.put(byteBufferAllocate);
        byteBufferOrder.position(i3);
        byteBufferOrder.putLong(0L);
        byteBufferOrder.putLong(iRemaining);
        byte[] bArrC = bet.c(bArr4, byteBufferOrder.array());
        byteBufferAllocate.limit(byteBufferAllocate.limit() + 16);
        byteBufferAllocate.put(bArrC);
        return byteBufferAllocate.array();
    }

    public abstract bdz b(byte[] bArr, int i2);
}
