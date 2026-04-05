package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class CipherLiteInputStream extends SdkFilterInputStream {
    private static final int BYTE_MASK = 255;
    private static final int DEFAULT_IN_BUFFER_SIZE = 512;
    private static final int MAX_RETRY = 1000;
    private final byte[] bufin;
    private byte[] bufout;
    private CipherLite cipherLite;
    private int currPos;
    private boolean eof;
    private final boolean lastMultiPart;
    private int maxPos;
    private final boolean multipart;

    public CipherLiteInputStream(InputStream inputStream) {
        this(inputStream, CipherLite.NULL, 512, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite) {
        this(inputStream, cipherLite, 512, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i2) {
        this(inputStream, cipherLite, i2, false, false);
    }

    public CipherLiteInputStream(InputStream inputStream, CipherLite cipherLite, int i2, boolean z, boolean z2) {
        super(inputStream);
        this.eof = false;
        this.currPos = 0;
        this.maxPos = 0;
        if (z2 && !z) {
            throw new IllegalArgumentException("lastMultiPart can only be true if multipart is true");
        }
        this.multipart = z;
        this.lastMultiPart = z2;
        this.cipherLite = cipherLite;
        if (i2 > 0 && i2 % 512 == 0) {
            this.bufin = new byte[i2];
            return;
        }
        throw new IllegalArgumentException("buffsize (" + i2 + ") must be a positive multiple of 512");
    }

    private int nextChunk() throws IOException {
        abortIfNeeded();
        if (this.eof) {
            return -1;
        }
        this.bufout = null;
        int i2 = ((FilterInputStream) this).in.read(this.bufin);
        if (i2 != -1) {
            byte[] bArrUpdate = this.cipherLite.update(this.bufin, 0, i2);
            this.bufout = bArrUpdate;
            this.currPos = 0;
            int length = bArrUpdate != null ? bArrUpdate.length : 0;
            this.maxPos = length;
            return length;
        }
        this.eof = true;
        if (!this.multipart || this.lastMultiPart) {
            try {
                byte[] bArrDoFinal = this.cipherLite.doFinal();
                this.bufout = bArrDoFinal;
                if (bArrDoFinal == null) {
                    return -1;
                }
                this.currPos = 0;
                int length2 = bArrDoFinal.length;
                this.maxPos = length2;
                return length2;
            } catch (BadPaddingException e2) {
                if (S3CryptoScheme.isAesGcm(this.cipherLite.getCipherAlgorithm())) {
                    throw new SecurityException(e2);
                }
            } catch (IllegalBlockSizeException unused) {
            }
        }
        return -1;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        abortIfNeeded();
        return this.maxPos - this.currPos;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterInputStream) this).in.close();
        if (!this.multipart && !S3CryptoScheme.isAesGcm(this.cipherLite.getCipherAlgorithm())) {
            try {
                this.cipherLite.doFinal();
            } catch (BadPaddingException | IllegalBlockSizeException unused) {
            }
        }
        this.currPos = 0;
        this.maxPos = 0;
        abortIfNeeded();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        abortIfNeeded();
        ((FilterInputStream) this).in.mark(i2);
        this.cipherLite.mark();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        abortIfNeeded();
        return ((FilterInputStream) this).in.markSupported() && this.cipherLite.markSupported();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.currPos >= this.maxPos) {
            if (this.eof) {
                return -1;
            }
            int i2 = 0;
            while (i2 <= 1000) {
                int iNextChunk = nextChunk();
                i2++;
                if (iNextChunk != 0) {
                    if (iNextChunk == -1) {
                        return -1;
                    }
                }
            }
            throw new IOException("exceeded maximum number of attempts to read next chunk of data");
        }
        byte[] bArr = this.bufout;
        int i3 = this.currPos;
        this.currPos = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.currPos >= this.maxPos) {
            if (this.eof) {
                return -1;
            }
            int i4 = 0;
            while (i4 <= 1000) {
                int iNextChunk = nextChunk();
                i4++;
                if (iNextChunk != 0) {
                    if (iNextChunk == -1) {
                        return -1;
                    }
                }
            }
            throw new IOException("exceeded maximum number of attempts to read next chunk of data");
        }
        if (i3 <= 0) {
            return 0;
        }
        int i5 = this.maxPos;
        int i6 = this.currPos;
        int i7 = i5 - i6;
        if (i3 >= i7) {
            i3 = i7;
        }
        System.arraycopy(this.bufout, i6, bArr, i2, i3);
        this.currPos += i3;
        return i3;
    }

    public void renewCipherLite() {
        this.cipherLite = this.cipherLite.recreate();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        abortIfNeeded();
        ((FilterInputStream) this).in.reset();
        this.cipherLite.reset();
        resetInternal();
    }

    public final void resetInternal() {
        if (markSupported()) {
            this.currPos = 0;
            this.maxPos = 0;
            this.eof = false;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        abortIfNeeded();
        int i2 = this.maxPos;
        int i3 = this.currPos;
        long j3 = i2 - i3;
        if (j2 > j3) {
            j2 = j3;
        }
        if (j2 < 0) {
            return 0L;
        }
        this.currPos = (int) (((long) i3) + j2);
        return j2;
    }
}
