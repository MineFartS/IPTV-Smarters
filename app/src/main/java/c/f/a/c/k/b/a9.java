package c.f.a.c.k.b;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import c.f.a.c.k.b.z8;

/* JADX INFO: loaded from: classes2.dex */
public final class a9<T extends Context & z8> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f13729a;

    public a9(T t) {
        c.f.a.c.f.q.o.i(t);
        this.f13729a = t;
    }

    public final void a() {
        c5 c5VarH = c5.h(this.f13729a, null, null);
        y3 y3VarC = c5VarH.c();
        c5VarH.e();
        y3VarC.w().a("Local AppMeasurementService is starting up");
    }

    public final void b() {
        c5 c5VarH = c5.h(this.f13729a, null, null);
        y3 y3VarC = c5VarH.c();
        c5VarH.e();
        y3VarC.w().a("Local AppMeasurementService is shutting down");
    }

    public final int c(final Intent intent, int i2, final int i3) {
        c5 c5VarH = c5.h(this.f13729a, null, null);
        final y3 y3VarC = c5VarH.c();
        if (intent == null) {
            y3VarC.r().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        c5VarH.e();
        y3VarC.w().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            d(new Runnable(this, i3, y3VarC, intent) { // from class: c.f.a.c.k.b.w8

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final a9 f14420b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final int f14421c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final y3 f14422d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final Intent f14423e;

                {
                    this.f14420b = this;
                    this.f14421c = i3;
                    this.f14422d = y3VarC;
                    this.f14423e = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f14420b.j(this.f14421c, this.f14422d, this.f14423e);
                }
            });
        }
        return 2;
    }

    public final void d(Runnable runnable) {
        x9 x9VarF = x9.F(this.f13729a);
        x9VarF.d().r(new y8(this, x9VarF, runnable));
    }

    public final IBinder e(Intent intent) {
        if (intent == null) {
            k().o().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new v5(x9.F(this.f13729a), null);
        }
        k().r().b("onBind received unknown action", action);
        return null;
    }

    public final boolean f(Intent intent) {
        if (intent == null) {
            k().o().a("onUnbind called with null intent");
            return true;
        }
        k().w().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    @TargetApi(24)
    public final boolean g(final JobParameters jobParameters) {
        c5 c5VarH = c5.h(this.f13729a, null, null);
        final y3 y3VarC = c5VarH.c();
        String string = jobParameters.getExtras().getString("action");
        c5VarH.e();
        y3VarC.w().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        d(new Runnable(this, y3VarC, jobParameters) { // from class: c.f.a.c.k.b.x8

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final a9 f14443b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final y3 f14444c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final JobParameters f14445d;

            {
                this.f14443b = this;
                this.f14444c = y3VarC;
                this.f14445d = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f14443b.i(this.f14444c, this.f14445d);
            }
        });
        return true;
    }

    public final void h(Intent intent) {
        if (intent == null) {
            k().o().a("onRebind called with null intent");
        } else {
            k().w().b("onRebind called. action", intent.getAction());
        }
    }

    public final /* synthetic */ void i(y3 y3Var, JobParameters jobParameters) {
        y3Var.w().a("AppMeasurementJobService processed last upload request.");
        this.f13729a.c(jobParameters, false);
    }

    public final /* synthetic */ void j(int i2, y3 y3Var, Intent intent) {
        if (this.f13729a.a(i2)) {
            y3Var.w().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            k().w().a("Completed wakeful intent.");
            this.f13729a.b(intent);
        }
    }

    public final y3 k() {
        return c5.h(this.f13729a, null, null).c();
    }
}
