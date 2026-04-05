package com.amazonaws.auth;

/* JADX INFO: loaded from: classes.dex */
public class ChunkContentIterator {
    private int pos;
    private final byte[] signedChunk;

    public ChunkContentIterator(byte[] bArr) {
        this.signedChunk = bArr;
    }

    public boolean hasNext() {
        return this.pos < this.signedChunk.length;
    }

    public int read(byte[] bArr, int i2, int i3) {
        if (i3 == 0) {
            return 0;
        }
        if (!hasNext()) {
            return -1;
        }
        int iMin = Math.min(this.signedChunk.length - this.pos, i3);
        System.arraycopy(this.signedChunk, this.pos, bArr, i2, iMin);
        this.pos += iMin;
        return iMin;
    }
}
