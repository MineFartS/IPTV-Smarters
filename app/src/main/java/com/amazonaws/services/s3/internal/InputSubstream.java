package com.amazonaws.services.s3.internal;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class InputSubstream extends SdkFilterInputStream {
    private final boolean closeSourceStream;
    private long currentPosition;
    private long markedPosition;
    private final long requestedLength;
    private final long requestedOffset;

    public InputSubstream(InputStream inputStream, long j2, long j3, boolean z) {
        super(inputStream);
        this.markedPosition = 0L;
        this.currentPosition = 0L;
        this.requestedLength = j3;
        this.requestedOffset = j2;
        this.closeSourceStream = z;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() {
        long j2 = this.currentPosition;
        long j3 = this.requestedOffset;
        return (int) Math.min(j2 < j3 ? this.requestedLength : (this.requestedLength + j3) - j2, super.available());
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closeSourceStream) {
            super.close();
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        this.markedPosition = this.currentPosition;
        super.mark(i2);
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        byte[] bArr = new byte[1];
        int i2 = read(bArr, 0, 1);
        return i2 == -1 ? i2 : bArr[0];
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        long j2;
        long j3;
        while (true) {
            j2 = this.currentPosition;
            j3 = this.requestedOffset;
            if (j2 >= j3) {
                break;
            }
            this.currentPosition += super.skip(j3 - j2);
        }
        long j4 = (this.requestedLength + j3) - j2;
        if (j4 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i2, (int) Math.min(i3, j4));
        this.currentPosition += (long) i4;
        return i4;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        this.currentPosition = this.markedPosition;
        super.reset();
    }
}
