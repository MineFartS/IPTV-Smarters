package c.d.a.t;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public class f extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5960b;

    public f(InputStream inputStream) {
        super(inputStream);
        this.f5960b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        int i2 = this.f5960b;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    public final long d(long j2) {
        int i2 = this.f5960b;
        if (i2 == 0) {
            return -1L;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : i2;
    }

    public final void i(long j2) {
        int i2 = this.f5960b;
        if (i2 == Integer.MIN_VALUE || j2 == -1) {
            return;
        }
        this.f5960b = (int) (((long) i2) - j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        super.mark(i2);
        this.f5960b = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (d(1L) == -1) {
            return -1;
        }
        int i2 = super.read();
        i(1L);
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int iD = (int) d(i3);
        if (iD == -1) {
            return -1;
        }
        int i4 = super.read(bArr, i2, iD);
        i(i4);
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        super.reset();
        this.f5960b = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jD = d(j2);
        if (jD == -1) {
            return -1L;
        }
        long jSkip = super.skip(jD);
        i(jSkip);
        return jSkip;
    }
}
