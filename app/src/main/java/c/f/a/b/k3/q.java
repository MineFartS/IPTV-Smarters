package c.f.a.b.k3;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;

/* JADX INFO: loaded from: classes2.dex */
public final class q extends Surface {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f9497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f9498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f9499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f9500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f9501f;

    public static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public c.f.a.b.j3.p f9502b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f9503c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Error f9504d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public RuntimeException f9505e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public q f9506f;

        public b() {
            super("ExoPlayer:DummySurface");
        }

        public q a(int i2) {
            boolean z;
            start();
            this.f9503c = new Handler(getLooper(), this);
            this.f9502b = new c.f.a.b.j3.p(this.f9503c);
            synchronized (this) {
                z = false;
                this.f9503c.obtainMessage(1, i2, 0).sendToTarget();
                while (this.f9506f == null && this.f9505e == null && this.f9504d == null) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = this.f9505e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f9504d;
            if (error == null) {
                return (q) c.f.a.b.j3.g.e(this.f9506f);
            }
            throw error;
        }

        public final void b(int i2) {
            c.f.a.b.j3.g.e(this.f9502b);
            this.f9502b.h(i2);
            this.f9506f = new q(this, this.f9502b.g(), i2 != 0);
        }

        public void c() {
            c.f.a.b.j3.g.e(this.f9503c);
            this.f9503c.sendEmptyMessage(2);
        }

        public final void d() {
            c.f.a.b.j3.g.e(this.f9502b);
            this.f9502b.i();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            try {
                if (i2 != 1) {
                    if (i2 != 2) {
                        return true;
                    }
                    try {
                        d();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e2) {
                    c.f.a.b.j3.z.e("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f9504d = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e3) {
                    c.f.a.b.j3.z.e("DummySurface", "Failed to initialize dummy surface", e3);
                    this.f9505e = e3;
                    synchronized (this) {
                        notify();
                    }
                }
                return true;
            } catch (Throwable th) {
                synchronized (this) {
                    notify();
                    throw th;
                }
            }
        }
    }

    public q(b bVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f9500e = bVar;
        this.f9499d = z;
    }

    public static int b(Context context) {
        if (c.f.a.b.j3.u.h(context)) {
            return c.f.a.b.j3.u.i() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean c(Context context) {
        if (!f9498c) {
            f9497b = b(context);
            f9498c = true;
        }
        return f9497b != 0;
    }

    public static q d(Context context, boolean z) {
        c.f.a.b.j3.g.g(!z || c(context));
        return new b().a(z ? f9497b : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f9500e) {
            if (!this.f9501f) {
                this.f9500e.c();
                this.f9501f = true;
            }
        }
    }
}
