package com.amazonaws.services.s3.internal.crypto;

import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.NullCipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class CipherLite {
    public static final CipherLite NULL = new CipherLite() { // from class: com.amazonaws.services.s3.internal.crypto.CipherLite.1
        @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
        public CipherLite createAuxiliary(long j2) {
            return this;
        }

        @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
        public CipherLite createInverse() {
            return this;
        }
    };
    private final Cipher cipher;
    private final int cipherMode;
    private final ContentCryptoScheme scheme;
    private final SecretKey secreteKey;

    private CipherLite() {
        this.cipher = new NullCipher();
        this.scheme = null;
        this.secreteKey = null;
        this.cipherMode = -1;
    }

    public CipherLite(Cipher cipher, ContentCryptoScheme contentCryptoScheme, SecretKey secretKey, int i2) {
        this.cipher = cipher;
        this.scheme = contentCryptoScheme;
        this.secreteKey = secretKey;
        this.cipherMode = i2;
    }

    public CipherLite createAuxiliary(long j2) {
        return this.scheme.createAuxillaryCipher(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider(), j2);
    }

    public CipherLite createInverse() {
        int i2 = this.cipherMode;
        int i3 = 1;
        if (i2 != 2) {
            if (i2 != 1) {
                throw new UnsupportedOperationException();
            }
            i3 = 2;
        }
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), i3, this.cipher.getProvider());
    }

    public CipherLite createUsingIV(byte[] bArr) {
        return this.scheme.createCipherLite(this.secreteKey, bArr, this.cipherMode, this.cipher.getProvider());
    }

    public byte[] doFinal() {
        return this.cipher.doFinal();
    }

    public byte[] doFinal(byte[] bArr) {
        return this.cipher.doFinal(bArr);
    }

    public byte[] doFinal(byte[] bArr, int i2, int i3) {
        return this.cipher.doFinal(bArr, i2, i3);
    }

    public final int getBlockSize() {
        return this.cipher.getBlockSize();
    }

    public final Cipher getCipher() {
        return this.cipher;
    }

    public final String getCipherAlgorithm() {
        return this.cipher.getAlgorithm();
    }

    public final int getCipherMode() {
        return this.cipherMode;
    }

    public final Provider getCipherProvider() {
        return this.cipher.getProvider();
    }

    public final ContentCryptoScheme getContentCryptoScheme() {
        return this.scheme;
    }

    public final byte[] getIV() {
        return this.cipher.getIV();
    }

    public int getOutputSize(int i2) {
        return this.cipher.getOutputSize(i2);
    }

    public final String getSecretKeyAlgorithm() {
        return this.secreteKey.getAlgorithm();
    }

    public long mark() {
        return -1L;
    }

    public boolean markSupported() {
        return false;
    }

    public CipherLite recreate() {
        return this.scheme.createCipherLite(this.secreteKey, this.cipher.getIV(), this.cipherMode, this.cipher.getProvider());
    }

    public void reset() {
        throw new IllegalStateException("mark/reset not supported");
    }

    public byte[] update(byte[] bArr, int i2, int i3) {
        return this.cipher.update(bArr, i2, i3);
    }
}
