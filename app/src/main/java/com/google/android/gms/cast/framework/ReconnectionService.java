package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import c.f.a.c.d.u.p0;
import c.f.a.c.d.v.b;
import c.f.a.c.j.c.h;

/* JADX INFO: loaded from: classes2.dex */
public class ReconnectionService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f24148b = new b("ReconnectionService");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public p0 f24149c;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            return this.f24149c.onBind(intent);
        } catch (RemoteException e2) {
            f24148b.b(e2, "Unable to call %s on %s.", "onBind", p0.class.getSimpleName());
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        c.f.a.c.d.u.b bVarE = c.f.a.c.d.u.b.e(this);
        p0 p0VarD = h.d(this, bVarE.c().f(), bVarE.p().a());
        this.f24149c = p0VarD;
        try {
            p0VarD.onCreate();
        } catch (RemoteException e2) {
            f24148b.b(e2, "Unable to call %s on %s.", "onCreate", p0.class.getSimpleName());
        }
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            this.f24149c.onDestroy();
        } catch (RemoteException e2) {
            f24148b.b(e2, "Unable to call %s on %s.", "onDestroy", p0.class.getSimpleName());
        }
        super.onDestroy();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i2, int i3) {
        try {
            return this.f24149c.onStartCommand(intent, i2, i3);
        } catch (RemoteException e2) {
            f24148b.b(e2, "Unable to call %s on %s.", "onStartCommand", p0.class.getSimpleName());
            return 1;
        }
    }
}
