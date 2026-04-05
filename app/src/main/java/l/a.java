package l;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class a extends u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final long f31034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f31035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public static a f31036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f31037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    public a f31038i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f31039j;

    /* JADX INFO: renamed from: l.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes2.dex */
    public class C0315a implements s {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f31040b;

        public C0315a(s sVar) {
            this.f31040b = sVar;
        }

        @Override // l.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.k();
            try {
                try {
                    this.f31040b.close();
                    a.this.m(true);
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // l.s, java.io.Flushable
        public void flush() throws IOException {
            a.this.k();
            try {
                try {
                    this.f31040b.flush();
                    a.this.m(true);
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // l.s
        public void h(l.c cVar, long j2) throws IOException {
            v.b(cVar.f31048d, 0L, j2);
            while (true) {
                long j3 = 0;
                if (j2 <= 0) {
                    return;
                }
                p pVar = cVar.f31047c;
                while (true) {
                    if (j3 >= 65536) {
                        break;
                    }
                    p pVar2 = cVar.f31047c;
                    j3 += (long) (pVar2.f31086c - pVar2.f31085b);
                    if (j3 >= j2) {
                        j3 = j2;
                        break;
                    }
                    pVar = pVar.f31089f;
                }
                a.this.k();
                try {
                    try {
                        this.f31040b.h(cVar, j3);
                        j2 -= j3;
                        a.this.m(true);
                    } catch (IOException e2) {
                        throw a.this.l(e2);
                    }
                } catch (Throwable th) {
                    a.this.m(false);
                    throw th;
                }
            }
        }

        @Override // l.s
        public u timeout() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f31040b + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public class b implements t {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f31042b;

        public b(t tVar) {
            this.f31042b = tVar;
        }

        @Override // l.t, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f31042b.close();
                    a.this.m(true);
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // l.t
        public long k(l.c cVar, long j2) throws IOException {
            a.this.k();
            try {
                try {
                    long jK = this.f31042b.k(cVar, j2);
                    a.this.m(true);
                    return jK;
                } catch (IOException e2) {
                    throw a.this.l(e2);
                }
            } catch (Throwable th) {
                a.this.m(false);
                throw th;
            }
        }

        @Override // l.t
        public u timeout() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f31042b + ")";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
        
            r1.t();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<l.a> r0 = l.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                l.a r1 = l.a.i()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                l.a r2 = l.a.f31036g     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                l.a.f31036g = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.t()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L1d
            L1c:
                throw r1
            L1d:
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: l.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f31034e = millis;
        f31035f = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static a i() throws InterruptedException {
        a aVar = f31036g.f31038i;
        long jNanoTime = System.nanoTime();
        if (aVar == null) {
            a.class.wait(f31034e);
            if (f31036g.f31038i != null || System.nanoTime() - jNanoTime < f31035f) {
                return null;
            }
            return f31036g;
        }
        long jP = aVar.p(jNanoTime);
        if (jP > 0) {
            long j2 = jP / 1000000;
            a.class.wait(j2, (int) (jP - (1000000 * j2)));
            return null;
        }
        f31036g.f31038i = aVar.f31038i;
        aVar.f31038i = null;
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x000b, code lost:
    
        r1.f31038i = r3.f31038i;
        r3.f31038i = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
    
        r3 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized boolean j(l.a r3) {
        /*
            java.lang.Class<l.a> r0 = l.a.class
            monitor-enter(r0)
            l.a r1 = l.a.f31036g     // Catch: java.lang.Throwable -> L19
        L5:
            if (r1 == 0) goto L17
            l.a r2 = r1.f31038i     // Catch: java.lang.Throwable -> L19
            if (r2 != r3) goto L15
            l.a r2 = r3.f31038i     // Catch: java.lang.Throwable -> L19
            r1.f31038i = r2     // Catch: java.lang.Throwable -> L19
            r1 = 0
            r3.f31038i = r1     // Catch: java.lang.Throwable -> L19
            r3 = 0
        L13:
            monitor-exit(r0)
            return r3
        L15:
            r1 = r2
            goto L5
        L17:
            r3 = 1
            goto L13
        L19:
            r3 = move-exception
            monitor-exit(r0)
            goto L1d
        L1c:
            throw r3
        L1d:
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.j(l.a):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[Catch: all -> 0x0067, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:7:0x0016, B:10:0x0022, B:11:0x002b, B:17:0x003c, B:18:0x0042, B:20:0x0046, B:23:0x004f, B:24:0x0052, B:26:0x005c, B:16:0x0036, B:29:0x0061, B:30:0x0066), top: B:36:0x0003 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized void q(l.a r6, long r7, boolean r9) {
        /*
            java.lang.Class<l.a> r0 = l.a.class
            monitor-enter(r0)
            l.a r1 = l.a.f31036g     // Catch: java.lang.Throwable -> L67
            if (r1 != 0) goto L16
            l.a r1 = new l.a     // Catch: java.lang.Throwable -> L67
            r1.<init>()     // Catch: java.lang.Throwable -> L67
            l.a.f31036g = r1     // Catch: java.lang.Throwable -> L67
            l.a$c r1 = new l.a$c     // Catch: java.lang.Throwable -> L67
            r1.<init>()     // Catch: java.lang.Throwable -> L67
            r1.start()     // Catch: java.lang.Throwable -> L67
        L16:
            long r1 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L67
            r3 = 0
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L2f
            if (r9 == 0) goto L2f
            long r3 = r6.c()     // Catch: java.lang.Throwable -> L67
            long r3 = r3 - r1
            long r7 = java.lang.Math.min(r7, r3)     // Catch: java.lang.Throwable -> L67
        L2b:
            long r7 = r7 + r1
            r6.f31039j = r7     // Catch: java.lang.Throwable -> L67
            goto L3c
        L2f:
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 == 0) goto L34
            goto L2b
        L34:
            if (r9 == 0) goto L61
            long r7 = r6.c()     // Catch: java.lang.Throwable -> L67
            r6.f31039j = r7     // Catch: java.lang.Throwable -> L67
        L3c:
            long r7 = r6.p(r1)     // Catch: java.lang.Throwable -> L67
            l.a r9 = l.a.f31036g     // Catch: java.lang.Throwable -> L67
        L42:
            l.a r3 = r9.f31038i     // Catch: java.lang.Throwable -> L67
            if (r3 == 0) goto L52
            long r3 = r3.p(r1)     // Catch: java.lang.Throwable -> L67
            int r5 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r5 >= 0) goto L4f
            goto L52
        L4f:
            l.a r9 = r9.f31038i     // Catch: java.lang.Throwable -> L67
            goto L42
        L52:
            l.a r7 = r9.f31038i     // Catch: java.lang.Throwable -> L67
            r6.f31038i = r7     // Catch: java.lang.Throwable -> L67
            r9.f31038i = r6     // Catch: java.lang.Throwable -> L67
            l.a r6 = l.a.f31036g     // Catch: java.lang.Throwable -> L67
            if (r9 != r6) goto L5f
            r0.notify()     // Catch: java.lang.Throwable -> L67
        L5f:
            monitor-exit(r0)
            return
        L61:
            java.lang.AssertionError r6 = new java.lang.AssertionError     // Catch: java.lang.Throwable -> L67
            r6.<init>()     // Catch: java.lang.Throwable -> L67
            throw r6     // Catch: java.lang.Throwable -> L67
        L67:
            r6 = move-exception
            monitor-exit(r0)
            goto L6b
        L6a:
            throw r6
        L6b:
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.q(l.a, long, boolean):void");
    }

    public final void k() {
        if (this.f31037h) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jH = h();
        boolean zE = e();
        if (jH != 0 || zE) {
            this.f31037h = true;
            q(this, jH, zE);
        }
    }

    public final IOException l(IOException iOException) {
        return !n() ? iOException : o(iOException);
    }

    public final void m(boolean z) throws IOException {
        if (n() && z) {
            throw o(null);
        }
    }

    public final boolean n() {
        if (!this.f31037h) {
            return false;
        }
        this.f31037h = false;
        return j(this);
    }

    public IOException o(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final long p(long j2) {
        return this.f31039j - j2;
    }

    public final s r(s sVar) {
        return new C0315a(sVar);
    }

    public final t s(t tVar) {
        return new b(tVar);
    }

    public void t() {
    }
}
