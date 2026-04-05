package c.f.a.a.j.y.j;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes.dex */
public class e implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c.f.a.a.j.y.k.c f6270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f6271c;

    public e(Context context, c.f.a.a.j.y.k.c cVar, g gVar) {
        this.f6269a = context;
        this.f6270b = cVar;
        this.f6271c = gVar;
    }

    @Override // c.f.a.a.j.y.j.s
    public void a(c.f.a.a.j.m mVar, int i2) {
        ComponentName componentName = new ComponentName(this.f6269a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f6269a.getSystemService("jobscheduler");
        int iB = b(mVar);
        if (c(jobScheduler, iB, i2)) {
            c.f.a.a.j.w.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", mVar);
            return;
        }
        long jM0 = this.f6270b.m0(mVar);
        JobInfo.Builder builderC = this.f6271c.c(new JobInfo.Builder(iB, componentName), mVar.d(), jM0, i2);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i2);
        persistableBundle.putString("backendName", mVar.b());
        persistableBundle.putInt("priority", c.f.a.a.j.b0.a.a(mVar.d()));
        if (mVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(mVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        c.f.a.a.j.w.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", mVar, Integer.valueOf(iB), Long.valueOf(this.f6271c.g(mVar.d(), jM0, i2)), Long.valueOf(jM0), Integer.valueOf(i2));
        jobScheduler.schedule(builderC.build());
    }

    public int b(c.f.a.a.j.m mVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f6269a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(mVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(c.f.a.a.j.b0.a.a(mVar.d())).array());
        if (mVar.c() != null) {
            adler32.update(mVar.c());
        }
        return (int) adler32.getValue();
    }

    public final boolean c(JobScheduler jobScheduler, int i2, int i3) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i4 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i2) {
                return i4 >= i3;
            }
        }
        return false;
    }
}
