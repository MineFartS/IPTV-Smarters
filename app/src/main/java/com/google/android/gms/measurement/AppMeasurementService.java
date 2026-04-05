package com.google.android.gms.measurement;

import a.o.a.a;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.k.b.a9;
import c.f.a.c.k.b.z8;

/* JADX INFO: loaded from: classes2.dex */
public final class AppMeasurementService extends Service implements z8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a9<AppMeasurementService> f24281b;

    @Override // c.f.a.c.k.b.z8
    public final boolean a(int i2) {
        return stopSelfResult(i2);
    }

    @Override // c.f.a.c.k.b.z8
    public final void b(@RecentlyNonNull Intent intent) {
        a.b(intent);
    }

    @Override // c.f.a.c.k.b.z8
    public final void c(@RecentlyNonNull JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    public final a9<AppMeasurementService> d() {
        if (this.f24281b == null) {
            this.f24281b = new a9<>(this);
        }
        return this.f24281b;
    }

    @Override // android.app.Service
    @RecentlyNonNull
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        return d().e(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        d().a();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d().b();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(@RecentlyNonNull Intent intent) {
        d().h(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(@RecentlyNonNull Intent intent, int i2, int i3) {
        d().c(intent, i2, i3);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(@RecentlyNonNull Intent intent) {
        d().f(intent);
        return true;
    }
}
