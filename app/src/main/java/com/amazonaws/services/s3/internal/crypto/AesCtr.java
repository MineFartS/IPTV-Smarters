package com.amazonaws.services.s3.internal.crypto;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class AesCtr extends ContentCryptoScheme {
    private static final int DEFAULT_IV_LENGTH_IN_BYTES = 16;
    private static final int SUPPORTED_IV_LENGTH = 12;

    private byte[] computeJ0(byte[] bArr) {
        int blockSizeInBytes = getBlockSizeInBytes();
        byte[] bArr2 = new byte[blockSizeInBytes];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        bArr2[blockSizeInBytes - 1] = 1;
        return ContentCryptoScheme.incrementBlocks(bArr2, 1L);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public byte[] adjustIV(byte[] bArr, long j2) {
        if (bArr.length != 12) {
            throw new UnsupportedOperationException();
        }
        int blockSizeInBytes = getBlockSizeInBytes();
        long j3 = blockSizeInBytes;
        long j4 = j2 / j3;
        if (j3 * j4 == j2) {
            return ContentCryptoScheme.incrementBlocks(computeJ0(bArr), j4);
        }
        throw new IllegalArgumentException("Expecting byteOffset to be multiple of 16, but got blockOffset=" + j4 + ", blockSize=" + blockSizeInBytes + ", byteOffset=" + j2);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public int getBlockSizeInBytes() {
        return ContentCryptoScheme.AES_GCM.getBlockSizeInBytes();
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public String getCipherAlgorithm() {
        return "AES/CTR/NoPadding";
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public int getIVLengthInBytes() {
        return 16;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public String getKeyGeneratorAlgorithm() {
        return ContentCryptoScheme.AES_GCM.getKeyGeneratorAlgorithm();
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public int getKeyLengthInBits() {
        return ContentCryptoScheme.AES_GCM.getKeyLengthInBits();
    }

    @Override // com.amazonaws.services.s3.internal.crypto.ContentCryptoScheme
    public long getMaxPlaintextSize() {
        return -1L;
    }
}
