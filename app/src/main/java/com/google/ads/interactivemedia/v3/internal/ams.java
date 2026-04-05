package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes.dex */
public final class ams extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private aky f20161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Handler f20162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Error f20163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private RuntimeException f20164d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private amt f20165e;

    public ams() {
        super("ExoPlayer:DummySurface");
    }

    public final amt a(int i2) {
        boolean z;
        start();
        this.f20162b = new Handler(getLooper(), this);
        this.f20161a = new aky(this.f20162b);
        synchronized (this) {
            z = false;
            this.f20162b.obtainMessage(1, i2, 0).sendToTarget();
            while (this.f20165e == null && this.f20164d == null && this.f20163c == null) {
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
        RuntimeException runtimeException = this.f20164d;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f20163c;
        if (error != null) {
            throw error;
        }
        amt amtVar = this.f20165e;
        ajr.b(amtVar);
        return amtVar;
    }

    public final void b() {
        ajr.b(this.f20162b);
        this.f20162b.sendEmptyMessage(2);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i2 = message.what;
        try {
            if (i2 != 1) {
                if (i2 != 2) {
                    return true;
                }
                try {
                    ajr.b(this.f20161a);
                    this.f20161a.c();
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            try {
                int i3 = message.arg1;
                ajr.b(this.f20161a);
                this.f20161a.b(i3);
                this.f20165e = new amt(this, this.f20161a.a(), i3 != 0);
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                alj.a("DummySurface", "Failed to initialize dummy surface", e2);
                this.f20163c = e2;
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e3) {
                alj.a("DummySurface", "Failed to initialize dummy surface", e3);
                this.f20164d = e3;
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
