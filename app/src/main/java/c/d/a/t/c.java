package c.d.a.t;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class c extends InputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Queue<c> f5952b = h.c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InputStream f5953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IOException f5954d;

    public static c i(InputStream inputStream) {
        c cVarPoll;
        Queue<c> queue = f5952b;
        synchronized (queue) {
            cVarPoll = queue.poll();
        }
        if (cVarPoll == null) {
            cVarPoll = new c();
        }
        cVarPoll.m(inputStream);
        return cVarPoll;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f5953c.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f5953c.close();
    }

    public IOException d() {
        return this.f5954d;
    }

    public void l() {
        this.f5954d = null;
        this.f5953c = null;
        Queue<c> queue = f5952b;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    public void m(InputStream inputStream) {
        this.f5953c = inputStream;
    }

    @Override // java.io.InputStream
    public void mark(int i2) {
        this.f5953c.mark(i2);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f5953c.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        try {
            return this.f5953c.read();
        } catch (IOException e2) {
            this.f5954d = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        try {
            return this.f5953c.read(bArr);
        } catch (IOException e2) {
            this.f5954d = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) {
        try {
            return this.f5953c.read(bArr, i2, i3);
        } catch (IOException e2) {
            this.f5954d = e2;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() {
        this.f5953c.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j2) {
        try {
            return this.f5953c.skip(j2);
        } catch (IOException e2) {
            this.f5954d = e2;
            return 0L;
        }
    }
}
