package c.f.a.c.k.b;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;

/* JADX INFO: loaded from: classes2.dex */
public final class n9 extends p9 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f14160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m f14161e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f14162f;

    public n9(x9 x9Var) {
        super(x9Var);
        this.f14160d = (AlarmManager) this.f14413a.b().getSystemService("alarm");
        this.f14161e = new m9(this, x9Var.w(), x9Var);
    }

    @Override // c.f.a.c.k.b.p9
    public final boolean k() {
        this.f14160d.cancel(q());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        o();
        return false;
    }

    public final void l(long j2) {
        i();
        this.f14413a.e();
        Context contextB = this.f14413a.b();
        if (!t4.a(contextB)) {
            this.f14413a.c().v().a("Receiver not registered/enabled");
        }
        if (!ea.D(contextB, false)) {
            this.f14413a.c().v().a("Service not registered/enabled");
        }
        m();
        this.f14413a.c().w().b("Scheduling upload, millis", Long.valueOf(j2));
        long jB = this.f14413a.a().b() + j2;
        this.f14413a.z();
        if (j2 < Math.max(0L, m3.y.b(null).longValue()) && !this.f14161e.c()) {
            this.f14161e.b(j2);
        }
        this.f14413a.e();
        if (Build.VERSION.SDK_INT < 24) {
            AlarmManager alarmManager = this.f14160d;
            this.f14413a.z();
            alarmManager.setInexactRepeating(2, jB, Math.max(m3.t.b(null).longValue(), j2), q());
        } else {
            Context contextB2 = this.f14413a.b();
            ComponentName componentName = new ComponentName(contextB2, "com.google.android.gms.measurement.AppMeasurementJobService");
            int iP = p();
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
            c.f.a.c.j.h.r4.a(contextB2, new JobInfo.Builder(iP, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 + j2).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
        }
    }

    public final void m() {
        i();
        this.f14413a.c().w().a("Unscheduling upload");
        this.f14160d.cancel(q());
        this.f14161e.d();
        if (Build.VERSION.SDK_INT >= 24) {
            o();
        }
    }

    @TargetApi(24)
    public final void o() {
        ((JobScheduler) this.f14413a.b().getSystemService("jobscheduler")).cancel(p());
    }

    public final int p() {
        if (this.f14162f == null) {
            String strValueOf = String.valueOf(this.f14413a.b().getPackageName());
            this.f14162f = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.f14162f.intValue();
    }

    public final PendingIntent q() {
        Context contextB = this.f14413a.b();
        return PendingIntent.getBroadcast(contextB, 0, new Intent().setClassName(contextB, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }
}
