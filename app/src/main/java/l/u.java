package l;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f31095a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f31096b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f31097c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f31098d;

    /* JADX INFO: loaded from: classes2.dex */
    public class a extends u {
        @Override // l.u
        public u d(long j2) {
            return this;
        }

        @Override // l.u
        public void f() {
        }

        @Override // l.u
        public u g(long j2, TimeUnit timeUnit) {
            return this;
        }
    }

    public u a() {
        this.f31096b = false;
        return this;
    }

    public u b() {
        this.f31098d = 0L;
        return this;
    }

    public long c() {
        if (this.f31096b) {
            return this.f31097c;
        }
        throw new IllegalStateException("No deadline");
    }

    public u d(long j2) {
        this.f31096b = true;
        this.f31097c = j2;
        return this;
    }

    public boolean e() {
        return this.f31096b;
    }

    public void f() throws InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f31096b && this.f31097c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public u g(long j2, TimeUnit timeUnit) {
        if (j2 >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f31098d = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j2);
    }

    public long h() {
        return this.f31098d;
    }
}
