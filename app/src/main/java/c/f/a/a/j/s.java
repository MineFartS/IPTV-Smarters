package c.f.a.a.j;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class s implements Closeable {

    public interface a {
        a a(Context context);

        s build();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        d().close();
    }

    public abstract c.f.a.a.j.y.k.c d();

    public abstract r i();
}
