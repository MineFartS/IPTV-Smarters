package c.f.a.e.a.b;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f15652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f15653c;

    public w(InputStream inputStream, long j2) {
        this.f15652b = inputStream;
        this.f15653c = j2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f15652b.close();
        this.f15653c = 0L;
    }

    @Override // java.io.InputStream
    public final int read() {
        long j2 = this.f15653c;
        if (j2 <= 0) {
            return -1;
        }
        this.f15653c = j2 - 1;
        return this.f15652b.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        long j2 = this.f15653c;
        if (j2 <= 0) {
            return -1;
        }
        int i4 = this.f15652b.read(bArr, i2, (int) Math.min(i3, j2));
        if (i4 != -1) {
            this.f15653c -= (long) i4;
        }
        return i4;
    }
}
