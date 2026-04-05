package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import androidx.annotation.RecentlyNonNull;
import c.f.a.c.k.b.a9;
import c.f.a.c.k.b.z8;

/* JADX INFO: loaded from: classes2.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements z8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a9<AppMeasurementJobService> f24279b;

    @Override // c.f.a.c.k.b.z8
    public final boolean a(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // c.f.a.c.k.b.z8
    public final void b(@RecentlyNonNull Intent intent) {
    }

    @Override // c.f.a.c.k.b.z8
    @TargetApi(24)
    public final void c(@RecentlyNonNull JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    public final a9<AppMeasurementJobService> d() {
        if (this.f24279b == null) {
            this.f24279b = new a9<>(this);
        }
        return this.f24279b;
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

    @Override // android.app.job.JobService
    public boolean onStartJob(@RecentlyNonNull JobParameters jobParameters) {
        d().g(jobParameters);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(@RecentlyNonNull JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public boolean onUnbind(@RecentlyNonNull Intent intent) {
        d().f(intent);
        return true;
    }
}
