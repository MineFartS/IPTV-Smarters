package c.f.a.b.j3;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends BufferedOutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9221b;

    public m0(OutputStream outputStream) {
        super(outputStream);
    }

    public m0(OutputStream outputStream, int i2) {
        super(outputStream, i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f9221b = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            x0.S0(th);
        }
    }

    public void d(OutputStream outputStream) {
        g.g(this.f9221b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f9221b = false;
    }
}
