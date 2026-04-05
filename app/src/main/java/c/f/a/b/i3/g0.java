package c.f.a.b.i3;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import c.f.a.b.j3.v0;
import c.f.a.b.j3.x0;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes2.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f8875a = h(false, -9223372036854775807L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f8876b = h(true, -9223372036854775807L);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f8877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f8878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ExecutorService f8879e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public d<? extends e> f8880f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public IOException f8881g;

    public interface b<T extends e> {
        void k(T t, long j2, long j3, boolean z);

        void m(T t, long j2, long j3);

        c u(T t, long j2, long j3, IOException iOException, int i2);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f8883b;

        public c(int i2, long j2) {
            this.f8882a = i2;
            this.f8883b = j2;
        }

        public boolean c() {
            int i2 = this.f8882a;
            return i2 == 0 || i2 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f8884b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f8885c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f8886d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public b<T> f8887e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public IOException f8888f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f8889g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Thread f8890h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f8891i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f8892j;

        public d(Looper looper, T t, b<T> bVar, int i2, long j2) {
            super(looper);
            this.f8885c = t;
            this.f8887e = bVar;
            this.f8884b = i2;
            this.f8886d = j2;
        }

        public void a(boolean z) {
            this.f8892j = z;
            this.f8888f = null;
            if (hasMessages(0)) {
                this.f8891i = true;
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f8891i = true;
                    this.f8885c.c();
                    Thread thread = this.f8890h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) c.f.a.b.j3.g.e(this.f8887e)).k(this.f8885c, jElapsedRealtime, jElapsedRealtime - this.f8886d, true);
                this.f8887e = null;
            }
        }

        public final void b() {
            this.f8888f = null;
            g0.this.f8879e.execute((Runnable) c.f.a.b.j3.g.e(g0.this.f8880f));
        }

        public final void c() {
            g0.this.f8880f = null;
        }

        public final long d() {
            return Math.min((this.f8889g - 1) * 1000, 5000);
        }

        public void e(int i2) throws IOException {
            IOException iOException = this.f8888f;
            if (iOException != null && this.f8889g > i2) {
                throw iOException;
            }
        }

        public void f(long j2) {
            c.f.a.b.j3.g.g(g0.this.f8880f == null);
            g0.this.f8880f = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f8892j) {
                return;
            }
            int i2 = message.what;
            if (i2 == 0) {
                b();
                return;
            }
            if (i2 == 3) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = jElapsedRealtime - this.f8886d;
            b bVar = (b) c.f.a.b.j3.g.e(this.f8887e);
            if (this.f8891i) {
                bVar.k(this.f8885c, jElapsedRealtime, j2, false);
                return;
            }
            int i3 = message.what;
            if (i3 == 1) {
                try {
                    bVar.m(this.f8885c, jElapsedRealtime, j2);
                    return;
                } catch (RuntimeException e2) {
                    c.f.a.b.j3.z.e("LoadTask", "Unexpected exception handling load completed", e2);
                    g0.this.f8881g = new h(e2);
                    return;
                }
            }
            if (i3 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f8888f = iOException;
            int i4 = this.f8889g + 1;
            this.f8889g = i4;
            c cVarU = bVar.u(this.f8885c, jElapsedRealtime, j2, iOException, i4);
            if (cVarU.f8882a == 3) {
                g0.this.f8881g = this.f8888f;
            } else if (cVarU.f8882a != 2) {
                if (cVarU.f8882a == 1) {
                    this.f8889g = 1;
                }
                f(cVarU.f8883b != -9223372036854775807L ? cVarU.f8883b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar;
            Message messageObtainMessage;
            boolean z;
            try {
                synchronized (this) {
                    z = !this.f8891i;
                    this.f8890h = Thread.currentThread();
                }
                if (z) {
                    v0.a("load:" + this.f8885c.getClass().getSimpleName());
                    try {
                        this.f8885c.a();
                        v0.c();
                    } catch (Throwable th) {
                        v0.c();
                        throw th;
                    }
                }
                synchronized (this) {
                    this.f8890h = null;
                    Thread.interrupted();
                }
                if (this.f8892j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e2) {
                if (this.f8892j) {
                    return;
                }
                messageObtainMessage = obtainMessage(2, e2);
                messageObtainMessage.sendToTarget();
            } catch (Exception e3) {
                if (this.f8892j) {
                    return;
                }
                c.f.a.b.j3.z.e("LoadTask", "Unexpected exception loading stream", e3);
                hVar = new h(e3);
                messageObtainMessage = obtainMessage(2, hVar);
                messageObtainMessage.sendToTarget();
            } catch (OutOfMemoryError e4) {
                if (this.f8892j) {
                    return;
                }
                c.f.a.b.j3.z.e("LoadTask", "OutOfMemory error loading stream", e4);
                hVar = new h(e4);
                messageObtainMessage = obtainMessage(2, hVar);
                messageObtainMessage.sendToTarget();
            } catch (Error e5) {
                if (!this.f8892j) {
                    c.f.a.b.j3.z.e("LoadTask", "Unexpected error loading stream", e5);
                    obtainMessage(3, e5).sendToTarget();
                }
                throw e5;
            }
        }
    }

    public interface e {
        void a();

        void c();
    }

    public interface f {
        void j();
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f8894b;

        public g(f fVar) {
            this.f8894b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f8894b.j();
        }
    }

    public static final class h extends IOException {
        public h(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    static {
        long j2 = -9223372036854775807L;
        f8877c = new c(2, j2);
        f8878d = new c(3, j2);
    }

    public g0(String str) {
        this.f8879e = x0.C0("ExoPlayer:Loader:" + str);
    }

    public static c h(boolean z, long j2) {
        return new c(z ? 1 : 0, j2);
    }

    @Override // c.f.a.b.i3.h0
    public void a() throws IOException {
        k(Integer.MIN_VALUE);
    }

    public void f() {
        ((d) c.f.a.b.j3.g.i(this.f8880f)).a(false);
    }

    public void g() {
        this.f8881g = null;
    }

    public boolean i() {
        return this.f8881g != null;
    }

    public boolean j() {
        return this.f8880f != null;
    }

    public void k(int i2) throws IOException {
        IOException iOException = this.f8881g;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f8880f;
        if (dVar != null) {
            if (i2 == Integer.MIN_VALUE) {
                i2 = dVar.f8884b;
            }
            dVar.e(i2);
        }
    }

    public void l() {
        m(null);
    }

    public void m(f fVar) {
        d<? extends e> dVar = this.f8880f;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f8879e.execute(new g(fVar));
        }
        this.f8879e.shutdown();
    }

    public <T extends e> long n(T t, b<T> bVar, int i2) {
        Looper looper = (Looper) c.f.a.b.j3.g.i(Looper.myLooper());
        this.f8881g = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t, bVar, i2, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }
}
