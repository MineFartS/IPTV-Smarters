package com.amazonaws.services.s3.internal.crypto;

import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class GCMCipherLite extends CipherLite {
    private static final int BITS = 8;
    private static final int TAG_LENGTH = ContentCryptoScheme.AES_GCM.getTagLengthInBits() / 8;
    private CipherLite aux;
    private long currentCount;
    private boolean doneFinal;
    private byte[] finalBytes;
    private boolean invisiblyProcessed;
    private long markedCount;
    private long outputByteCount;
    private boolean securityViolated;
    private final int tagLen;

    public GCMCipherLite(Cipher cipher, SecretKey secretKey, int i2) {
        super(cipher, ContentCryptoScheme.AES_GCM, secretKey, i2);
        this.tagLen = i2 == 1 ? TAG_LENGTH : 0;
        if (i2 != 1 && i2 != 2) {
            throw new IllegalArgumentException();
        }
    }

    private int checkMax(int i2) {
        if (this.outputByteCount + ((long) i2) <= ContentCryptoScheme.MAX_GCM_BYTES) {
            return i2;
        }
        this.securityViolated = true;
        throw new SecurityException("Number of bytes processed has exceeded the maximum allowed by AES/GCM; [outputByteCount=" + this.outputByteCount + ", delta=" + i2 + "]");
    }

    private final byte[] doFinal0(byte[] bArr, int i2, int i3) {
        if (!this.doneFinal) {
            this.doneFinal = true;
            byte[] bArrDoFinal = super.doFinal(bArr, i2, i3);
            this.finalBytes = bArrDoFinal;
            if (bArrDoFinal == null) {
                return null;
            }
            this.outputByteCount += (long) checkMax(bArrDoFinal.length - this.tagLen);
            return (byte[]) this.finalBytes.clone();
        }
        if (this.securityViolated) {
            throw new SecurityException();
        }
        if (2 == getCipherMode()) {
            byte[] bArr2 = this.finalBytes;
            if (bArr2 == null) {
                return null;
            }
            return (byte[]) bArr2.clone();
        }
        byte[] bArr3 = this.finalBytes;
        int length = bArr3.length;
        int i4 = this.tagLen;
        int i5 = length - i4;
        if (i3 == i5) {
            return (byte[]) bArr3.clone();
        }
        if (i3 >= i5 || ((long) i3) + this.currentCount != this.outputByteCount) {
            throw new IllegalStateException("Inconsistent re-rencryption");
        }
        return Arrays.copyOfRange(bArr3, (bArr3.length - i4) - i3, bArr3.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public byte[] doFinal() {
        if (this.doneFinal) {
            if (this.securityViolated) {
                throw new SecurityException();
            }
            byte[] bArr = this.finalBytes;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }
        this.doneFinal = true;
        byte[] bArrDoFinal = super.doFinal();
        this.finalBytes = bArrDoFinal;
        if (bArrDoFinal == null) {
            return null;
        }
        this.outputByteCount += (long) checkMax(bArrDoFinal.length - this.tagLen);
        return (byte[]) this.finalBytes.clone();
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public final byte[] doFinal(byte[] bArr) {
        return doFinal0(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public final byte[] doFinal(byte[] bArr, int i2, int i3) {
        return doFinal0(bArr, i2, i3);
    }

    public long getCurrentCount() {
        return this.currentCount;
    }

    public byte[] getFinalBytes() {
        byte[] bArr = this.finalBytes;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public long getMarkedCount() {
        return this.markedCount;
    }

    public long getOutputByteCount() {
        return this.outputByteCount;
    }

    public byte[] getTag() {
        byte[] bArr;
        if (getCipherMode() != 1 || (bArr = this.finalBytes) == null) {
            return null;
        }
        return Arrays.copyOfRange(bArr, bArr.length - this.tagLen, bArr.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public long mark() {
        long j2 = this.aux == null ? this.outputByteCount : this.currentCount;
        this.markedCount = j2;
        return j2;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public boolean markSupported() {
        return true;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public void reset() {
        long j2 = this.markedCount;
        if (j2 < this.outputByteCount || this.invisiblyProcessed) {
            try {
                this.aux = createAuxiliary(j2);
                this.currentCount = this.markedCount;
            } catch (Exception e2) {
                if (!(e2 instanceof RuntimeException)) {
                    throw new IllegalStateException(e2);
                }
            }
        }
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public byte[] update(byte[] bArr, int i2, int i3) {
        byte[] bArrUpdate;
        CipherLite cipherLite = this.aux;
        if (cipherLite == null) {
            bArrUpdate = super.update(bArr, i2, i3);
            if (bArrUpdate == null) {
                this.invisiblyProcessed = bArr.length > 0;
                return null;
            }
            this.outputByteCount += (long) checkMax(bArrUpdate.length);
            this.invisiblyProcessed = bArrUpdate.length == 0 && i3 > 0;
        } else {
            bArrUpdate = cipherLite.update(bArr, i2, i3);
            if (bArrUpdate == null) {
                return null;
            }
            long length = this.currentCount + ((long) bArrUpdate.length);
            this.currentCount = length;
            long j2 = this.outputByteCount;
            if (length == j2) {
                this.aux = null;
            } else if (length > j2) {
                if (1 == getCipherMode()) {
                    throw new IllegalStateException("currentCount=" + this.currentCount + " > outputByteCount=" + this.outputByteCount);
                }
                byte[] bArr2 = this.finalBytes;
                int length2 = bArr2 != null ? bArr2.length : 0;
                long j3 = this.outputByteCount;
                long length3 = j3 - (this.currentCount - ((long) bArrUpdate.length));
                long j4 = length2;
                this.currentCount = j3 - j4;
                this.aux = null;
                return Arrays.copyOf(bArrUpdate, (int) (length3 - j4));
            }
        }
        return bArrUpdate;
    }
}
