package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;

/* JADX INFO: loaded from: classes.dex */
public class DecodedStreamBuffer {
    private static final Log log = LogFactory.getLog((Class<?>) DecodedStreamBuffer.class);
    private byte[] bufferArray;
    private boolean bufferSizeOverflow;
    private int byteBuffered;
    private int maxBufferSize;
    private int pos = -1;

    public DecodedStreamBuffer(int i2) {
        this.bufferArray = new byte[i2];
        this.maxBufferSize = i2;
    }

    public void buffer(byte b2) {
        this.pos = -1;
        int i2 = this.byteBuffered;
        if (i2 < this.maxBufferSize) {
            byte[] bArr = this.bufferArray;
            this.byteBuffered = i2 + 1;
            bArr[i2] = b2;
            return;
        }
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Buffer size " + this.maxBufferSize + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
        }
        this.bufferSizeOverflow = true;
    }

    public void buffer(byte[] bArr, int i2, int i3) {
        this.pos = -1;
        int i4 = this.byteBuffered;
        if (i4 + i3 <= this.maxBufferSize) {
            System.arraycopy(bArr, i2, this.bufferArray, i4, i3);
            this.byteBuffered += i3;
            return;
        }
        Log log2 = log;
        if (log2.isDebugEnabled()) {
            log2.debug("Buffer size " + this.maxBufferSize + " has been exceeded and the input stream will not be repeatable. Freeing buffer memory");
        }
        this.bufferSizeOverflow = true;
    }

    public boolean hasNext() {
        int i2 = this.pos;
        return i2 != -1 && i2 < this.byteBuffered;
    }

    public byte next() {
        byte[] bArr = this.bufferArray;
        int i2 = this.pos;
        this.pos = i2 + 1;
        return bArr[i2];
    }

    public void startReadBuffer() {
        if (!this.bufferSizeOverflow) {
            this.pos = 0;
            return;
        }
        throw new AmazonClientException("The input stream is not repeatable since the buffer size " + this.maxBufferSize + " has been exceeded.");
    }
}
