package c.f.a.b.i3;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f9055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f9056c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f9060g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f9058e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9059f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f9057d = new byte[1];

    public r(p pVar, s sVar) {
        this.f9055b = pVar;
        this.f9056c = sVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f9059f) {
            return;
        }
        this.f9055b.close();
        this.f9059f = true;
    }

    public final void d() {
        if (this.f9058e) {
            return;
        }
        this.f9055b.g(this.f9056c);
        this.f9058e = true;
    }

    public void i() {
        d();
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f9057d) == -1) {
            return -1;
        }
        return this.f9057d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        c.f.a.b.j3.g.g(!this.f9059f);
        d();
        int iB = this.f9055b.b(bArr, i2, i3);
        if (iB == -1) {
            return -1;
        }
        this.f9060g += (long) iB;
        return iB;
    }
}
