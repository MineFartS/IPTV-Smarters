package com.google.ads.interactivemedia.v3.internal;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: loaded from: classes.dex */
public final class bdw implements awu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f20970a = azg.f20737b;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f20971b = new bdv();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SecretKey f20972c;

    public bdw(byte[] bArr) throws InvalidAlgorithmParameterException {
        azg.a(f20970a);
        beu.a(bArr.length);
        this.f20972c = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.awu
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] bArrB = bes.b(12);
        System.arraycopy(bArrB, 0, bArr3, 0, 12);
        int length2 = bArrB.length;
        AlgorithmParameterSpec gCMParameterSpec = (!bet.b() || bet.a() > 19) ? new GCMParameterSpec(128, bArrB, 0, length2) : new IvParameterSpec(bArrB, 0, length2);
        ThreadLocal<Cipher> threadLocal = f20971b;
        threadLocal.get().init(1, this.f20972c, gCMParameterSpec);
        int iDoFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
        if (iDoFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}
