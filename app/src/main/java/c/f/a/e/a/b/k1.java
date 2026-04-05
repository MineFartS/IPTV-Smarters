package c.f.a.e.a.b;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes2.dex */
public final class k1 extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Enumeration<File> f15505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f15506c;

    public k1(Enumeration<File> enumeration) throws IOException {
        this.f15505b = enumeration;
        d();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f15506c;
        if (inputStream != null) {
            inputStream.close();
            this.f15506c = null;
        }
    }

    public final void d() throws IOException {
        InputStream inputStream = this.f15506c;
        if (inputStream != null) {
            inputStream.close();
        }
        this.f15506c = this.f15505b.hasMoreElements() ? new FileInputStream(this.f15505b.nextElement()) : null;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f15506c;
            if (inputStream == null) {
                return -1;
            }
            int i2 = inputStream.read();
            if (i2 != -1) {
                return i2;
            }
            d();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) throws IOException {
        if (this.f15506c == null) {
            return -1;
        }
        bArr.getClass();
        if (i2 < 0 || i3 < 0 || i3 > bArr.length - i2) {
            throw new IndexOutOfBoundsException();
        }
        if (i3 == 0) {
            return 0;
        }
        do {
            int i4 = this.f15506c.read(bArr, i2, i3);
            if (i4 > 0) {
                return i4;
            }
            d();
        } while (this.f15506c != null);
        return -1;
    }
}
