package c.k.a;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        l().close();
    }

    public final InputStream d() {
        return l().inputStream();
    }

    public abstract long i();

    public abstract l.e l();
}
