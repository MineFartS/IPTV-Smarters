package com.amazonaws.util;

import com.amazonaws.internal.SdkFilterInputStream;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class CountingInputStream extends SdkFilterInputStream {
    private long byteCount;

    public CountingInputStream(InputStream inputStream) {
        super(inputStream);
        this.byteCount = 0L;
    }

    public long getByteCount() {
        return this.byteCount;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() {
        int i2 = super.read();
        this.byteCount += i2 >= 0 ? 1L : 0L;
        return i2;
    }

    @Override // com.amazonaws.internal.SdkFilterInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        int i4 = super.read(bArr, i2, i3);
        this.byteCount += i4 >= 0 ? i4 : 0L;
        return i4;
    }
}
