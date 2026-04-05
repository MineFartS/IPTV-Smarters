package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class bdu implements awu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20963a = azg.f20736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f20964b = new bds();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f20965c = new bdt();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f20966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f20967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SecretKeySpec f20968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f20969g;

    public bdu(byte[] bArr, int i2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        azg.a(f20963a);
        if (i2 != 12 && i2 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f20969g = i2;
        beu.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f20968f = secretKeySpec;
        Cipher cipher = f20964b.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrB = b(cipher.doFinal(new byte[16]));
        this.f20966d = bArrB;
        this.f20967e = b(bArrB);
    }

    private static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            byte b2 = bArr[i2];
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((b2 + b2) ^ ((bArr[i3] & 255) >>> 7)) & 255);
            i2 = i3;
        }
        byte b3 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b3 + b3));
        return bArr2;
    }

    private final byte[] c(Cipher cipher, int i2, byte[] bArr, int i3, int i4) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        byte[] bArrD;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i2;
        if (i4 == 0) {
            return cipher.doFinal(d(bArr2, this.f20966d));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i5 = 0;
        int i6 = 0;
        while (i4 - i6 > 16) {
            for (int i7 = 0; i7 < 16; i7++) {
                bArrDoFinal[i7] = (byte) (bArrDoFinal[i7] ^ bArr[(i3 + i6) + i7]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i6 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i6 + i3, i3 + i4);
        if (bArrCopyOfRange.length == 16) {
            bArrD = d(bArrCopyOfRange, this.f20966d);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f20967e, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i5 >= length) {
                    break;
                }
                bArrCopyOf[i5] = (byte) (bArrCopyOf[i5] ^ bArrCopyOfRange[i5]);
                i5++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrD = bArrCopyOf;
        }
        return cipher.doFinal(d(bArrDoFinal, bArrD));
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awu
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.f20969g;
        if (length > (Integer.MAX_VALUE - i2) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i2 + length + 16];
        byte[] bArrB = bes.b(i2);
        System.arraycopy(bArrB, 0, bArr3, 0, this.f20969g);
        Cipher cipher = f20964b.get();
        cipher.init(1, this.f20968f);
        byte[] bArrC = c(cipher, 0, bArrB, 0, bArrB.length);
        byte[] bArrC2 = c(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = f20965c.get();
        cipher2.init(1, this.f20968f, new IvParameterSpec(bArrC));
        cipher2.doFinal(bArr, 0, length, bArr3, this.f20969g);
        byte[] bArrC3 = c(cipher, 2, bArr3, this.f20969g, length);
        int i3 = length + this.f20969g;
        for (int i4 = 0; i4 < 16; i4++) {
            bArr3[i3 + i4] = (byte) ((bArrC2[i4] ^ bArrC[i4]) ^ bArrC3[i4]);
        }
        return bArr3;
    }
}
