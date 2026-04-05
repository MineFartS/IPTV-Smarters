package com.amazonaws.util;

import com.amazonaws.AmazonClientException;
import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class LengthCheckInputStream extends SdkFilterInputStream {
    public static final boolean EXCLUDE_SKIPPED_BYTES = false;
    public static final boolean INCLUDE_SKIPPED_BYTES = true;
    private long dataLength;
    private final long expectedLength;
    private final boolean includeSkipped;
    private long marked;

    public LengthCheckInputStream(InputStream inputStream, long j2, boolean z) {
        super(inputStream);
        if (j2 < 0) {
            throw new IllegalArgumentException();
        }
        this.expectedLength = j2;
        this.includeSkipped = z;
    }

    private void checkLength(boolean z) {
        long j2 = this.dataLength;
        long j3 = this.expectedLength;
        if (z) {
            if (j2 == j3) {
                return;
            }
            throw new AmazonClientException("Data read (" + this.dataLength + ") has a different length than the expected (" + this.expectedLength + ")");
        }
        if (j2 <= j3) {
            return;
        }
        throw new AmazonClientException("More data read (" + this.dataLength + ") than expected (" + this.expectedLength + ")");
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        super.mark(i2);
        this.marked = this.dataLength;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i2 = super.read();
        if (i2 >= 0) {
            this.dataLength++;
        }
        checkLength(i2 == -1);
        return i2;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        int i4 = super.read(bArr, i2, i3);
        this.dataLength += i4 >= 0 ? i4 : 0L;
        checkLength(i4 == -1);
        return i4;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public void reset() {
        super.reset();
        if (super.markSupported()) {
            this.dataLength = this.marked;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) {
        long jSkip = super.skip(j2);
        if (this.includeSkipped && jSkip > 0) {
            this.dataLength += jSkip;
            checkLength(false);
        }
        return jSkip;
    }
}
