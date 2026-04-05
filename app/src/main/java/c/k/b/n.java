package c.k.b;

import com.amazonaws.event.ProgressEvent;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class n extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f18735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f18736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f18737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f18738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f18739f;

    public n(InputStream inputStream) {
        this(inputStream, ProgressEvent.PART_FAILED_EVENT_CODE);
    }

    public n(InputStream inputStream, int i2) {
        this.f18739f = -1L;
        this.f18735b = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i2);
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f18735b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f18735b.close();
    }

    public void d(long j2) throws IOException {
        if (this.f18736c > this.f18738e || j2 < this.f18737d) {
            throw new IOException("Cannot reset");
        }
        this.f18735b.reset();
        m(this.f18737d, j2);
        this.f18736c = j2;
    }

    public long i(int i2) {
        long j2 = this.f18736c + ((long) i2);
        if (this.f18738e < j2) {
            l(j2);
        }
        return this.f18736c;
    }

    public final void l(long j2) {
        try {
            long j3 = this.f18737d;
            long j4 = this.f18736c;
            if (j3 >= j4 || j4 > this.f18738e) {
                this.f18737d = j4;
                this.f18735b.mark((int) (j2 - j4));
            } else {
                this.f18735b.reset();
                this.f18735b.mark((int) (j2 - this.f18737d));
                m(this.f18737d, this.f18736c);
            }
            this.f18738e = j2;
        } catch (IOException e2) {
            throw new IllegalStateException("Unable to mark: " + e2);
        }
    }

    public final void m(long j2, long j3) throws IOException {
        while (j2 < j3) {
            long jSkip = this.f18735b.skip(j3 - j2);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j2 += jSkip;
        }
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f18739f = i(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f18735b.markSupported();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int i2 = this.f18735b.read();
        if (i2 != -1) {
            this.f18736c++;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        int i2 = this.f18735b.read(bArr);
        if (i2 != -1) {
            this.f18736c += (long) i2;
        }
        return i2;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f18735b.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f18736c += (long) i4;
        }
        return i4;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        d(this.f18739f);
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        long jSkip = this.f18735b.skip(j2);
        this.f18736c += jSkip;
        return jSkip;
    }
}
