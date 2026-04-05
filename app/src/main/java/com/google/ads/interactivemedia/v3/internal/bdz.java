package com.google.ads.interactivemedia.v3.internal;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* JADX INFO: loaded from: classes.dex */
public abstract class bdz implements bem {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f20978b = i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f20979a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f20980c;

    public bdz(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f20979a = i(bArr);
        this.f20980c = i2;
    }

    public static void f(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = iArr[i2] + iArr[i3];
        iArr[i2] = i6;
        int iJ = j(i6 ^ iArr[i5], 16);
        iArr[i5] = iJ;
        int i7 = iArr[i4] + iJ;
        iArr[i4] = i7;
        int iJ2 = j(iArr[i3] ^ i7, 12);
        iArr[i3] = iJ2;
        int i8 = iArr[i2] + iJ2;
        iArr[i2] = i8;
        int iJ3 = j(iArr[i5] ^ i8, 8);
        iArr[i5] = iJ3;
        int i9 = iArr[i4] + iJ3;
        iArr[i4] = i9;
        iArr[i3] = j(iArr[i3] ^ i9, 7);
    }

    public static void g(int[] iArr, int[] iArr2) {
        int[] iArr3 = f20978b;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    public static void h(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            f(iArr, 0, 4, 8, 12);
            f(iArr, 1, 5, 9, 13);
            f(iArr, 2, 6, 10, 14);
            f(iArr, 3, 7, 11, 15);
            f(iArr, 0, 5, 10, 15);
            f(iArr, 1, 6, 11, 12);
            f(iArr, 2, 7, 8, 13);
            f(iArr, 3, 4, 9, 14);
        }
    }

    public static int[] i(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    private static int j(int i2, int i3) {
        return (i2 >>> (-i3)) | (i2 << i3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bem
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > Integer.MAX_VALUE - b()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(b() + length);
        e(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    public abstract int b();

    public abstract int[] c(int[] iArr, int i2);

    public final ByteBuffer d(byte[] bArr, int i2) {
        int[] iArrC = c(i(bArr), i2);
        int[] iArr = (int[]) iArrC.clone();
        h(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            iArrC[i3] = iArrC[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrC, 0, 16);
        return byteBufferOrder;
    }

    public final void e(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - b() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrB = bes.b(b());
        byteBuffer.put(bArrB);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining = byteBufferWrap.remaining();
        int i2 = (iRemaining / 64) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferD = d(bArrB, this.f20980c + i3);
            if (i3 == i2 - 1) {
                awp.b(byteBuffer, byteBufferWrap, byteBufferD, iRemaining % 64);
            } else {
                awp.b(byteBuffer, byteBufferWrap, byteBufferD, 64);
            }
        }
    }
}
