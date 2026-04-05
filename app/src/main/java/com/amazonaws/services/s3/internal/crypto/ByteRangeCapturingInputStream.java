package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class ByteRangeCapturingInputStream extends SdkFilterInputStream {
    private final byte[] block;
    private int blockPosition;
    private final long endingPosition;
    private int markedBlockPosition;
    private long markedStreamPosition;
    private final long startingPosition;
    private long streamPosition;

    public ByteRangeCapturingInputStream(InputStream inputStream, long j2, long j3) {
        super(inputStream);
        this.blockPosition = 0;
        if (j2 >= j3) {
            throw new IllegalArgumentException("Invalid byte range specified: the starting position must be less than the ending position");
        }
        this.startingPosition = j2;
        this.endingPosition = j3;
        this.block = new byte[(int) (j3 - j2)];
    }

    public byte[] getBlock() {
        return this.block;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        super.mark(i2);
        if (markSupported()) {
            this.markedStreamPosition = this.streamPosition;
            this.markedBlockPosition = this.blockPosition;
        }
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i2 = super.read();
        if (i2 == -1) {
            return -1;
        }
        long j2 = this.streamPosition;
        if (j2 >= this.startingPosition && j2 <= this.endingPosition) {
            byte[] bArr = this.block;
            int i3 = this.blockPosition;
            this.blockPosition = i3 + 1;
            bArr[i3] = (byte) i2;
        }
        this.streamPosition = j2 + 1;
        return i2;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        int i4 = super.read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        long j2 = this.streamPosition;
        long j3 = i4;
        if (j2 + j3 >= this.startingPosition && j2 <= this.endingPosition) {
            for (int i5 = 0; i5 < i4; i5++) {
                long j4 = this.streamPosition;
                long j5 = i5;
                if (j4 + j5 >= this.startingPosition && j4 + j5 < this.endingPosition) {
                    byte[] bArr2 = this.block;
                    int i6 = this.blockPosition;
                    this.blockPosition = i6 + 1;
                    bArr2[i6] = bArr[i2 + i5];
                }
            }
        }
        this.streamPosition += j3;
        return i4;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        super.reset();
        if (markSupported()) {
            this.streamPosition = this.markedStreamPosition;
            this.blockPosition = this.markedBlockPosition;
        }
    }
}
