package a.l.d;

import android.util.Log;
import java.io.Writer;

/* JADX INFO: loaded from: classes.dex */
public final class d0 extends Writer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public StringBuilder f2342c = new StringBuilder(128);

    public d0(String str) {
        this.f2341b = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        d();
    }

    public final void d() {
        if (this.f2342c.length() > 0) {
            Log.d(this.f2341b, this.f2342c.toString());
            StringBuilder sb = this.f2342c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        d();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            char c2 = cArr[i2 + i4];
            if (c2 == '\n') {
                d();
            } else {
                this.f2342c.append(c2);
            }
        }
    }
}
