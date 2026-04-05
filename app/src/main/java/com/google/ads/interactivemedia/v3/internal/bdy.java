package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes.dex */
public final class bdy extends bdz {
    public bdy(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdz
    public final int b() {
        return 12;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bdz
    public final int[] c(int[] iArr, int i2) {
        int length = iArr.length;
        if (length != 3) {
            throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        bdz.g(iArr2, this.f20979a);
        iArr2[12] = i2;
        System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }
}
