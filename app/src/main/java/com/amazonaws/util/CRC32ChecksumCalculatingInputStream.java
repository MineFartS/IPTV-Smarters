package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.CRC32;

/* JADX INFO: loaded from: classes.dex */
public class CRC32ChecksumCalculatingInputStream extends SdkFilterInputStream {
    private CRC32 crc32;

    public CRC32ChecksumCalculatingInputStream(InputStream inputStream) {
        super(inputStream);
        this.crc32 = new CRC32();
    }

    public long getCRC32Checksum() {
        return this.crc32.getValue();
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        abortIfNeeded();
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 != -1) {
            this.crc32.update(i2);
        }
        return i2;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        abortIfNeeded();
        int i4 = ((FilterInputStream) this).in.read(bArr, i2, i3);
        if (i4 != -1) {
            this.crc32.update(bArr, i2, i4);
        }
        return i4;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        abortIfNeeded();
        this.crc32.reset();
        ((FilterInputStream) this).in.reset();
    }
}
