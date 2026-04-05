package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.ads.interactivemedia.v3.internal.akf;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"HandlerLeak"})
public final class ake<T extends akf> extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ akj f19971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T f19972c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f19973d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private akc<T> f19974e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private IOException f19975f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19976g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Thread f19977h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f19978i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f19979j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ake(akj akjVar, Looper looper, T t, akc<T> akcVar, int i2, long j2) {
        super(looper);
        this.f19971b = akjVar;
        this.f19972c = t;
        this.f19974e = akcVar;
        this.f19970a = i2;
        this.f19973d = j2;
    }

    private final void d() {
        this.f19975f = null;
        ExecutorService executorService = this.f19971b.f19984d;
        ake akeVar = this.f19971b.f19985e;
        ajr.b(akeVar);
        executorService.execute(akeVar);
    }

    private final void e() {
        this.f19971b.f19985e = null;
    }

    public final void a(boolean z) {
        this.f19979j = z;
        this.f19975f = null;
        if (hasMessages(0)) {
            this.f19978i = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f19978i = true;
                this.f19972c.h();
                Thread thread = this.f19977h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            e();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            akc<T> akcVar = this.f19974e;
            ajr.b(akcVar);
            akcVar.C(this.f19972c, jElapsedRealtime, jElapsedRealtime - this.f19973d, true);
            this.f19974e = null;
        }
    }

    public final void b(int i2) throws IOException {
        IOException iOException = this.f19975f;
        if (iOException != null && this.f19976g > i2) {
            throw iOException;
        }
    }

    public final void c(long j2) {
        ajr.f(this.f19971b.f19985e == null);
        this.f19971b.f19985e = this;
        if (j2 > 0) {
            sendEmptyMessageDelayed(0, j2);
        } else {
            d();
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f19979j) {
            return;
        }
        int i2 = message.what;
        if (i2 == 0) {
            d();
            return;
        }
        if (i2 == 3) {
            throw ((Error) message.obj);
        }
        e();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = jElapsedRealtime - this.f19973d;
        akc<T> akcVar = this.f19974e;
        ajr.b(akcVar);
        if (this.f19978i) {
            akcVar.C(this.f19972c, jElapsedRealtime, j2, false);
            return;
        }
        int i3 = message.what;
        if (i3 == 1) {
            try {
                akcVar.D(this.f19972c, jElapsedRealtime, j2);
                return;
            } catch (RuntimeException e2) {
                alj.a("LoadTask", "Unexpected exception handling load completed", e2);
                this.f19971b.f19986f = new aki(e2);
                return;
            }
        }
        if (i3 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f19975f = iOException;
        int i4 = this.f19976g + 1;
        this.f19976g = i4;
        akd akdVarU = akcVar.u(this.f19972c, jElapsedRealtime, j2, iOException, i4);
        if (akdVarU.f19968a == 3) {
            this.f19971b.f19986f = this.f19975f;
        } else if (akdVarU.f19968a != 2) {
            if (akdVarU.f19968a == 1) {
                this.f19976g = 1;
            }
            c(akdVarU.f19969b != -9223372036854775807L ? akdVarU.f19969b : Math.min((this.f19976g - 1) * 1000, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        aki akiVar;
        Message messageObtainMessage;
        boolean z;
        try {
            synchronized (this) {
                z = !this.f19978i;
                this.f19977h = Thread.currentThread();
            }
            if (z) {
                String simpleName = this.f19972c.getClass().getSimpleName();
                arj.n(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                try {
                    this.f19972c.i();
                    arj.o();
                } catch (Throwable th) {
                    arj.o();
                    throw th;
                }
            }
            synchronized (this) {
                this.f19977h = null;
                Thread.interrupted();
            }
            if (this.f19979j) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e2) {
            if (this.f19979j) {
                return;
            }
            messageObtainMessage = obtainMessage(2, e2);
            messageObtainMessage.sendToTarget();
        } catch (Exception e3) {
            if (this.f19979j) {
                return;
            }
            alj.a("LoadTask", "Unexpected exception loading stream", e3);
            akiVar = new aki(e3);
            messageObtainMessage = obtainMessage(2, akiVar);
            messageObtainMessage.sendToTarget();
        } catch (OutOfMemoryError e4) {
            if (this.f19979j) {
                return;
            }
            alj.a("LoadTask", "OutOfMemory error loading stream", e4);
            akiVar = new aki(e4);
            messageObtainMessage = obtainMessage(2, akiVar);
            messageObtainMessage.sendToTarget();
        } catch (Error e5) {
            if (!this.f19979j) {
                alj.a("LoadTask", "Unexpected error loading stream", e5);
                obtainMessage(3, e5).sendToTarget();
            }
            throw e5;
        }
    }
}
