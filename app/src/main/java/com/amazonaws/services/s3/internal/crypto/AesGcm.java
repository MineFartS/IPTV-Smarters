package com.amazonaws.services.s3.internal.crypto;

import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AesGcm extends ContentCryptoScheme {
    private static final int DEFAULT_BLOCK_SIZE_IN_BYTES = 16;
    private static final int DEFAULT_IV_LENGTH_IN_BYTES = 12;
    private static final int DEFAULT_KEY_LENGTH_IN_BITS = 256;
    private static final int DEFAULT_TAG_LENGTH_IN_BITS = 128;

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public CipherLite createAuxillaryCipher(SecretKey secretKey, byte[] bArr, int i2, Provider provider, long j2) {
        ContentCryptoScheme contentCryptoScheme = ContentCryptoScheme.AES_CTR;
        return contentCryptoScheme.createCipherLite(secretKey, contentCryptoScheme.adjustIV(bArr, j2), i2, provider);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public int getBlockSizeInBytes() {
        return 16;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public String getCipherAlgorithm() {
        return "AES/GCM/NoPadding";
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public int getIVLengthInBytes() {
        return 12;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public String getKeyGeneratorAlgorithm() {
        return "AES";
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public int getKeyLengthInBits() {
        return 256;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public long getMaxPlaintextSize() {
        return ContentCryptoScheme.MAX_GCM_BYTES;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public String getSpecificCipherProvider() {
        return CryptoRuntime.BOUNCY_CASTLE_PROVIDER;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public int getTagLengthInBits() {
        return DEFAULT_TAG_LENGTH_IN_BITS;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public CipherLite newCipherLite(Cipher cipher, SecretKey secretKey, int i2) {
        return new GCMCipherLite(cipher, secretKey, i2);
    }
}
