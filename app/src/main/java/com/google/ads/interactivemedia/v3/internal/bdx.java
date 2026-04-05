package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class bdx implements awx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20973a = azg.f20736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Collection<Integer> f20974b = Arrays.asList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f20975c = new byte[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ben f20976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f20977e;

    public bdx(byte[] bArr) throws InvalidKeyException {
        azg.a(f20973a);
        Collection<Integer> collection = f20974b;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i2 = length >> 1;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i2);
            this.f20977e = Arrays.copyOfRange(bArr, i2, length);
            this.f20976d = new ben(bArrCopyOfRange);
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("invalid key size: ");
        sb.append(length);
        sb.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awx
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrD;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipherA = bei.f20995a.a("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] bArrA = this.f20976d.a(f20975c, 16);
        for (int i2 = 0; i2 <= 0; i2++) {
            byte[] bArr4 = bArr3[i2];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArrA = awp.d(bet.j(bArrA), this.f20976d.a(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = bArrA.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i3 = length - length2;
            bArrD = Arrays.copyOf(bArr5, length);
            for (int i4 = 0; i4 < bArrA.length; i4++) {
                int i5 = i3 + i4;
                bArrD[i5] = (byte) (bArrD[i5] ^ bArrA[i4]);
            }
        } else {
            bArrD = awp.d(bet.i(bArr5), bet.j(bArrA));
        }
        byte[] bArrA2 = this.f20976d.a(bArrD, 16);
        byte[] bArr6 = (byte[]) bArrA2.clone();
        bArr6[8] = (byte) (bArr6[8] & 127);
        bArr6[12] = (byte) (bArr6[12] & 127);
        cipherA.init(1, new SecretKeySpec(this.f20977e, "AES"), new IvParameterSpec(bArr6));
        return awp.c(bArrA2, cipherA.doFinal(bArr));
    }
}
