package c.f.a.e.a.e;

import java.io.Closeable;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q implements Closeable {
    public abstract long d();

    public abstract InputStream i(long j2, long j3);

    public final synchronized InputStream l() {
        return i(0L, d());
    }
}
