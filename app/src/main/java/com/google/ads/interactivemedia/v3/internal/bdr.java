package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class bdr implements bem {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20958a = azg.f20737b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f20959b = new bdq();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f20960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f20961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f20962e;

    public bdr(byte[] bArr, int i2) throws GeneralSecurityException {
        azg.a(f20958a);
        beu.a(bArr.length);
        this.f20960c = new SecretKeySpec(bArr, "AES");
        int blockSize = f20959b.get().getBlockSize();
        this.f20962e = blockSize;
        if (i2 < 12 || i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f20961d = i2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bem
    public final byte[] a(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.f20961d;
        int i3 = Integer.MAX_VALUE - i2;
        if (length > i3) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i3);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[i2 + length];
        byte[] bArrB = bes.b(i2);
        System.arraycopy(bArrB, 0, bArr2, 0, this.f20961d);
        int i4 = this.f20961d;
        Cipher cipher = f20959b.get();
        byte[] bArr3 = new byte[this.f20962e];
        System.arraycopy(bArrB, 0, bArr3, 0, this.f20961d);
        cipher.init(1, this.f20960c, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i4) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}
