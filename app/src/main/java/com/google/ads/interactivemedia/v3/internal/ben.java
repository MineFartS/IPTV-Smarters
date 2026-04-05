package com.google.ads.interactivemedia.v3.internal;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class ben implements bak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f21006a = azg.f20736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SecretKey f21007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f21008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f21009d;

    public ben(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        beu.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f21007b = secretKeySpec;
        Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrJ = bet.j(cipherB.doFinal(new byte[16]));
        this.f21008c = bArrJ;
        this.f21009d = bet.j(bArrJ);
    }

    private static Cipher b() {
        azg.a(f21006a);
        return bei.f20995a.a("AES/ECB/NoPadding");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bak
    public final byte[] a(byte[] bArr, int i2) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherB = b();
        cipherB.init(1, this.f21007b);
        int length = bArr.length;
        double d2 = length;
        Double.isNaN(d2);
        int iMax = Math.max(1, (int) Math.ceil(d2 / 16.0d));
        byte[] bArrE = iMax * 16 == length ? awp.e(bArr, (iMax - 1) * 16, this.f21008c, 0, 16) : awp.d(bet.i(Arrays.copyOfRange(bArr, (iMax - 1) * 16, length)), this.f21009d);
        byte[] bArrDoFinal = new byte[16];
        for (int i3 = 0; i3 < iMax - 1; i3++) {
            bArrDoFinal = cipherB.doFinal(awp.e(bArrDoFinal, 0, bArr, i3 * 16, 16));
        }
        return Arrays.copyOf(cipherB.doFinal(awp.d(bArrE, bArrDoFinal)), i2);
    }
}
