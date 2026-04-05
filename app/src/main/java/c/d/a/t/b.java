package c.d.a.t;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5951c;

    public b(InputStream inputStream, long j2) {
        super(inputStream);
        this.f5950b = j2;
    }

    public static InputStream i(InputStream inputStream, long j2) {
        return new b(inputStream, j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        return (int) Math.max(this.f5950b - ((long) this.f5951c), ((FilterInputStream) this).in.available());
    }

    public final int d(int i2) throws IOException {
        if (i2 >= 0) {
            this.f5951c += i2;
        } else if (this.f5950b - ((long) this.f5951c) > 0) {
            throw new IOException("Failed to read all expected data, expected: " + this.f5950b + ", but read: " + this.f5951c);
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        return d(super.read());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) {
        return d(super.read(bArr, i2, i3));
    }
}
