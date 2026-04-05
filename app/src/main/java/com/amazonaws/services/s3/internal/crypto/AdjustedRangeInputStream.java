package com.amazonaws.services.s3.internal.crypto;

import com.amazonaws.internal.SdkInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class AdjustedRangeInputStream extends SdkInputStream {
    private boolean closed = false;
    private InputStream decryptedContents;
    private long virtualAvailable;

    public AdjustedRangeInputStream(InputStream inputStream, long j2, long j3) throws IOException {
        this.decryptedContents = inputStream;
        initializeForRead(j2, j3);
    }

    private void initializeForRead(long j2, long j3) throws IOException {
        int i2 = j2 < 16 ? (int) j2 : ((int) (j2 % 16)) + 16;
        if (i2 != 0) {
            while (i2 > 0) {
                this.decryptedContents.read();
                i2--;
            }
        }
        this.virtualAvailable = (j3 - j2) + 1;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        abortIfNeeded();
        int iAvailable = this.decryptedContents.available();
        long j2 = iAvailable;
        long j3 = this.virtualAvailable;
        return j2 < j3 ? iAvailable : (int) j3;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.closed) {
            this.closed = true;
            this.decryptedContents.close();
        }
        abortIfNeeded();
    }

    @Override // com.amazonaws.internal.SdkInputStream
    public InputStream getWrappedInputStream() {
        return this.decryptedContents;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int i2 = this.virtualAvailable <= 0 ? -1 : this.decryptedContents.read();
        if (i2 != -1) {
            this.virtualAvailable--;
        } else {
            close();
            this.virtualAvailable = 0L;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        abortIfNeeded();
        long j2 = this.virtualAvailable;
        if (j2 <= 0) {
            i4 = -1;
        } else {
            if (i3 > j2) {
                i3 = j2 < 2147483647L ? (int) j2 : Integer.MAX_VALUE;
            }
            i4 = this.decryptedContents.read(bArr, i2, i3);
        }
        if (i4 != -1) {
            this.virtualAvailable -= (long) i4;
        } else {
            close();
            this.virtualAvailable = 0L;
        }
        return i4;
    }
}
