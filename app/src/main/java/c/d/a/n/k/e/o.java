package c.d.a.n.k.e;

import android.util.Log;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class o extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile byte[] f5749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5753f;

    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    public o(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.f5752e = -1;
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("buffer is null or empty");
        }
        this.f5749b = bArr;
    }

    public static IOException l() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f5749b == null || inputStream == null) {
            throw l();
        }
        return (this.f5750c - this.f5753f) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5749b = null;
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final int d(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.f5752e;
        if (i2 != -1) {
            int i3 = this.f5753f - i2;
            int i4 = this.f5751d;
            if (i3 < i4) {
                if (i2 == 0 && i4 > bArr.length && this.f5750c == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    if (Log.isLoggable("BufferedIs", 3)) {
                        Log.d("BufferedIs", "allocate buffer of length: " + i4);
                    }
                    byte[] bArr2 = new byte[i4];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f5749b = bArr2;
                    bArr = bArr2;
                } else if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                int i5 = this.f5753f - this.f5752e;
                this.f5753f = i5;
                this.f5752e = 0;
                this.f5750c = 0;
                int i6 = inputStream.read(bArr, i5, bArr.length - i5);
                int i7 = this.f5753f;
                if (i6 > 0) {
                    i7 += i6;
                }
                this.f5750c = i7;
                return i6;
            }
        }
        int i8 = inputStream.read(bArr);
        if (i8 > 0) {
            this.f5752e = -1;
            this.f5753f = 0;
            this.f5750c = i8;
        }
        return i8;
    }

    public synchronized void i() {
        this.f5751d = this.f5749b.length;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        this.f5751d = Math.max(this.f5751d, i2);
        this.f5752e = this.f5753f;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() {
        byte[] bArr = this.f5749b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw l();
        }
        if (this.f5753f >= this.f5750c && d(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f5749b && (bArr = this.f5749b) == null) {
            throw l();
        }
        int i2 = this.f5750c;
        int i3 = this.f5753f;
        if (i2 - i3 <= 0) {
            return -1;
        }
        this.f5753f = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(byte[] bArr, int i2, int i3) {
        int i4;
        int i5;
        byte[] bArr2 = this.f5749b;
        if (bArr2 == null) {
            throw l();
        }
        if (i3 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw l();
        }
        int i6 = this.f5753f;
        int i7 = this.f5750c;
        if (i6 < i7) {
            int i8 = i7 - i6 >= i3 ? i3 : i7 - i6;
            System.arraycopy(bArr2, i6, bArr, i2, i8);
            this.f5753f += i8;
            if (i8 == i3 || inputStream.available() == 0) {
                return i8;
            }
            i2 += i8;
            i4 = i3 - i8;
        } else {
            i4 = i3;
        }
        while (true) {
            if (this.f5752e == -1 && i4 >= bArr2.length) {
                i5 = inputStream.read(bArr, i2, i4);
                if (i5 == -1) {
                    return i4 != i3 ? i3 - i4 : -1;
                }
            } else {
                if (d(inputStream, bArr2) == -1) {
                    return i4 != i3 ? i3 - i4 : -1;
                }
                if (bArr2 != this.f5749b && (bArr2 = this.f5749b) == null) {
                    throw l();
                }
                int i9 = this.f5750c;
                int i10 = this.f5753f;
                i5 = i9 - i10 >= i4 ? i4 : i9 - i10;
                System.arraycopy(bArr2, i10, bArr, i2, i5);
                this.f5753f += i5;
            }
            i4 -= i5;
            if (i4 == 0) {
                return i3;
            }
            if (inputStream.available() == 0) {
                return i3 - i4;
            }
            i2 += i5;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() {
        if (this.f5749b == null) {
            throw new IOException("Stream is closed");
        }
        int i2 = this.f5752e;
        if (-1 == i2) {
            throw new a("Mark has been invalidated");
        }
        this.f5753f = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) {
        byte[] bArr = this.f5749b;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null) {
            throw l();
        }
        if (j2 < 1) {
            return 0L;
        }
        if (inputStream == null) {
            throw l();
        }
        int i2 = this.f5750c;
        int i3 = this.f5753f;
        if (i2 - i3 >= j2) {
            this.f5753f = (int) (((long) i3) + j2);
            return j2;
        }
        long j3 = i2 - i3;
        this.f5753f = i2;
        if (this.f5752e == -1 || j2 > this.f5751d) {
            return j3 + inputStream.skip(j2 - j3);
        }
        if (d(inputStream, bArr) == -1) {
            return j3;
        }
        int i4 = this.f5750c;
        int i5 = this.f5753f;
        long j4 = j2 - j3;
        if (i4 - i5 >= j4) {
            this.f5753f = (int) (((long) i5) + j4);
            return j2;
        }
        long j5 = (j3 + ((long) i4)) - ((long) i5);
        this.f5753f = i4;
        return j5;
    }
}
