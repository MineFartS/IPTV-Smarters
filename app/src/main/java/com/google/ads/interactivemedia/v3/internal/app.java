package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import c.f.a.c.f.q.c;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class app implements c.a, c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aps f20342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f20343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f20344c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final LinkedBlockingQueue<u> f20345d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HandlerThread f20346e;

    public app(Context context, String str, String str2) {
        this.f20343b = str;
        this.f20344c = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.f20346e = handlerThread;
        handlerThread.start();
        aps apsVar = new aps(context, handlerThread.getLooper(), this, this);
        this.f20342a = apsVar;
        this.f20345d = new LinkedBlockingQueue<>();
        apsVar.checkAvailabilityAndConnect();
    }

    public static u a() {
        k kVarA = u.a();
        kVarA.B(32768L);
        return kVarA.ac();
    }

    public final u b() {
        u uVarPoll;
        try {
            uVarPoll = this.f20345d.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            uVarPoll = null;
        }
        return uVarPoll == null ? a() : uVarPoll;
    }

    public final apx c() {
        try {
            return this.f20342a.a();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    public final void d() {
        aps apsVar = this.f20342a;
        if (apsVar != null) {
            if (apsVar.isConnected() || this.f20342a.isConnecting()) {
                this.f20342a.disconnect();
            }
        }
    }

    @Override // c.f.a.c.f.q.c.a
    public final void onConnected(Bundle bundle) {
        apx apxVarC = c();
        if (apxVarC != null) {
            try {
                try {
                    this.f20345d.put(apxVarC.e(new apt(this.f20343b, this.f20344c)).a());
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    d();
                    this.f20346e.quit();
                    throw th;
                }
            } catch (Throwable unused2) {
                this.f20345d.put(a());
            }
            d();
            this.f20346e.quit();
        }
    }

    @Override // c.f.a.c.f.q.c.b
    public final void onConnectionFailed(c.f.a.c.f.b bVar) {
        try {
            this.f20345d.put(a());
        } catch (InterruptedException unused) {
        }
    }

    @Override // c.f.a.c.f.q.c.a
    public final void onConnectionSuspended(int i2) {
        try {
            this.f20345d.put(a());
        } catch (InterruptedException unused) {
        }
    }
}
