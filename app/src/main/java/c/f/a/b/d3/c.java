package c.f.a.b.d3;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import c.f.a.b.j3.g;
import c.f.a.b.j3.x0;
import c.f.a.b.j3.z;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f6867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f6868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComponentName f6869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final JobScheduler f6870d;

    public static final class a extends JobService {
        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PersistableBundle extras = jobParameters.getExtras();
            int iD = new d(extras.getInt("requirements")).d(this);
            if (iD == 0) {
                x0.X0(this, new Intent((String) g.e(extras.getString("service_action"))).setPackage((String) g.e(extras.getString("service_package"))));
                return false;
            }
            z.i("PlatformScheduler", "Requirements not met: " + iD);
            jobFinished(jobParameters, true);
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    static {
        f6867a = (x0.f9296a >= 26 ? 16 : 0) | 15;
    }

    public c(Context context, int i2) {
        Context applicationContext = context.getApplicationContext();
        this.f6868b = i2;
        this.f6869c = new ComponentName(applicationContext, (Class<?>) a.class);
        this.f6870d = (JobScheduler) g.e((JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    public static JobInfo c(int i2, ComponentName componentName, d dVar, String str, String str2) {
        d dVarB = dVar.b(f6867a);
        if (!dVarB.equals(dVar)) {
            z.i("PlatformScheduler", "Ignoring unsupported requirements: " + (dVarB.e() ^ dVar.e()));
        }
        JobInfo.Builder builder = new JobInfo.Builder(i2, componentName);
        if (dVar.p()) {
            builder.setRequiredNetworkType(2);
        } else if (dVar.m()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(dVar.k());
        builder.setRequiresCharging(dVar.f());
        if (x0.f9296a >= 26 && dVar.o()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("service_action", str);
        persistableBundle.putString("service_package", str2);
        persistableBundle.putInt("requirements", dVar.e());
        builder.setExtras(persistableBundle);
        return builder.build();
    }

    @Override // c.f.a.b.d3.f
    public boolean a(d dVar, String str, String str2) {
        return this.f6870d.schedule(c(this.f6868b, this.f6869c, dVar, str2, str)) == 1;
    }

    @Override // c.f.a.b.d3.f
    public d b(d dVar) {
        return dVar.b(f6867a);
    }

    @Override // c.f.a.b.d3.f
    public boolean cancel() {
        this.f6870d.cancel(this.f6868b);
        return true;
    }
}
