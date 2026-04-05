package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.AmazonClientException;
import java.nio.ByteBuffer;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ContentCryptoScheme {
    private static final int BYTE_SIZE = 4;
    private static final int CBC_SHIFT_VALUE = 48;
    private static final int DEFAULT_BIT_COUNTER = 16;
    private static final int DEFAULT_RIGHTMOST_BIT_START = 12;
    private static final int GCM_SHIFT_VALUE = 32;
    private static final int LONG_BYTE_SIZE = 8;
    private static final long LONG_VALUE = 1;
    public static final long MAX_CBC_BYTES = 4503599627370496L;
    public static final long MAX_CTR_BYTES = -1;
    public static final long MAX_GCM_BLOCKS = 4294967294L;
    public static final long MAX_GCM_BYTES = 68719476704L;
    public static final ContentCryptoScheme AES_CBC = new AesCbc();
    public static final ContentCryptoScheme AES_GCM = new AesGcm();
    public static final ContentCryptoScheme AES_CTR = new AesCtr();

    public static ContentCryptoScheme fromCEKAlgo(String str) {
        return fromCEKAlgo(str, false);
    }

    public static ContentCryptoScheme fromCEKAlgo(String str, boolean z) {
        ContentCryptoScheme contentCryptoScheme = AES_GCM;
        if (contentCryptoScheme.getCipherAlgorithm().equals(str)) {
            return z ? AES_CTR : contentCryptoScheme;
        }
        if (str == null || AES_CBC.getCipherAlgorithm().equals(str)) {
            return AES_CBC;
        }
        throw new UnsupportedOperationException("Unsupported content encryption scheme: " + str);
    }

    public static byte[] incrementBlocks(byte[] bArr, long j2) {
        if (j2 == 0) {
            return bArr;
        }
        if (bArr == null || bArr.length != 16) {
            throw new IllegalArgumentException();
        }
        if (j2 > MAX_GCM_BLOCKS) {
            throw new IllegalStateException();
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        for (int i2 = 12; i2 <= 15; i2++) {
            byteBufferAllocate.put(i2 - 8, bArr[i2]);
        }
        long j3 = byteBufferAllocate.getLong() + j2;
        if (j3 > MAX_GCM_BLOCKS) {
            throw new IllegalStateException();
        }
        byteBufferAllocate.rewind();
        byte[] bArrArray = byteBufferAllocate.putLong(j3).array();
        for (int i3 = 12; i3 <= 15; i3++) {
            bArr[i3] = bArrArray[i3 - 8];
        }
        return bArr;
    }

    public byte[] adjustIV(byte[] bArr, long j2) {
        return bArr;
    }

    public CipherLite createAuxillaryCipher(SecretKey secretKey, byte[] bArr, int i2, Provider provider, long j2) {
        return null;
    }

    public CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i2) {
        return createCipherLite(secretKey, bArr, i2, null);
    }

    public CipherLite createCipherLite(SecretKey secretKey, byte[] bArr, int i2, Provider provider) {
        String specificCipherProvider = getSpecificCipherProvider();
        try {
            Cipher cipher = provider != null ? Cipher.getInstance(getCipherAlgorithm(), provider) : specificCipherProvider != null ? Cipher.getInstance(getCipherAlgorithm(), specificCipherProvider) : Cipher.getInstance(getCipherAlgorithm());
            cipher.init(i2, secretKey, new IvParameterSpec(bArr));
            return newCipherLite(cipher, secretKey, i2);
        } catch (Exception e2) {
            if (e2 instanceof RuntimeException) {
                throw ((RuntimeException) e2);
            }
            throw new AmazonClientException("Unable to build cipher: " + e2.getMessage() + "\nMake sure you have the JCE unlimited strength policy files installed and configured for your JVM", e2);
        }
    }

    public abstract int getBlockSizeInBytes();

    public abstract String getCipherAlgorithm();

    public abstract int getIVLengthInBytes();

    public abstract String getKeyGeneratorAlgorithm();

    public abstract int getKeyLengthInBits();

    public final String getKeySpec() {
        return getKeyGeneratorAlgorithm() + "_" + getKeyLengthInBits();
    }

    public abstract long getMaxPlaintextSize();

    public String getSpecificCipherProvider() {
        return null;
    }

    public int getTagLengthInBits() {
        return 0;
    }

    public CipherLite newCipherLite(Cipher cipher, SecretKey secretKey, int i2) {
        return new CipherLite(cipher, this, secretKey, i2);
    }

    public String toString() {
        return "cipherAlgo=" + getCipherAlgorithm() + ", blockSizeInBytes=" + getBlockSizeInBytes() + ", ivLengthInBytes=" + getIVLengthInBytes() + ", keyGenAlgo=" + getKeyGeneratorAlgorithm() + ", keyLengthInBits=" + getKeyLengthInBits() + ", specificProvider=" + getSpecificCipherProvider() + ", tagLengthInBits=" + getTagLengthInBits();
    }
}
